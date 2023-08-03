package com.yc.biz;

public class OrderBizImpl implements OrderBiz {
    @Override
    public void makeOrder(int pid, int num) {
        System.out.println("makeOrder的方法调用：下订："+pid+"\t"+num);
    }

    @Override
    public int findOrderId(String pname) {
        System.out.println("findOrder根据商品名"+pname+"\t查找商品对应的订单号");
        return 0;
    }
}
