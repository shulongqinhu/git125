package com.ycframework.context;

public class YcBeanDefinition {
    private boolean isLazy;
    private String scope="singleton";
    private boolean isPrimary;
    //....

    private String classInfo;

    public boolean isLazy(){
        return isLazy;
    }
    public void setLazy(boolean lazy){
        isLazy=lazy;
    }

}
