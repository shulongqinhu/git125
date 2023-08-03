package com.yc.staticproxy;

public class StaticProxy implements OrderBiz{
    private OrderBiz orderBiz;

    public StaticProxy(OrderBiz orderBiz){
        this.orderBiz=orderBiz;
    }

    @Override
    public void addOrder(int pid, int num) {
        showHello();
        this.orderBiz.addOrder(pid, num);
        showBye();
    }
    public void showHello(){
        System.out.println("hello");
    }
    public void showBye(){
        System.out.println("bye");
    }
}
