package springtest4.jdbcTemplate;

import org.springframework.stereotype.Repository;
import springtest4.dataSource.MyDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public abstract class JdbcTemplate<T> {
    private DataSource dataSource;   //数据源

    public JdbcTemplate(DataSource dataSource){
        this.dataSource=dataSource;
    }

    //查询的模板方法
    public List<T> executeQuery(String sql,RowMapper<?> rowMapper,Object... params){
        List<T> list=new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try{
            con=dataSource.getConnection();
            pstmt=con.prepareStatement(sql);
            setParams(pstmt,params);
            rs=pstmt.executeQuery();
            int i=0;
            while(rs.next()){
                T t= (T) rowMapper.mapper(rs,i);
                i++;
                list.add(t);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            ((MyDataSource)dataSource).returnConnection(con);
        }
        return list;
    }

    private void setParams(PreparedStatement stmt,Object... params) throws SQLException {
        if(null==params || params.length<=0){
            return;
        }
        for(int i=0;i<params.length;i++){
            stmt.setObject(i+1,params[i]);
        }
    }

}












