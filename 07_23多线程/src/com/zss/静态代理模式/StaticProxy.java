package com.zss.静态代理模式;

interface Search{
    void searchHouse();
}
class Customer implements Search{
    @Override
    public void searchHouse() {
        System.out.println("双双要找一个套间");
    }
}
class Agent implements Search{
    //真实对象
    private Customer target;

    public Agent(Customer target) {
        this.target = target;
    }

    @Override
    public void searchHouse() {
        before();
        target.searchHouse();
        end();
    }

    private void end() {
        System.out.println("促成交易，拿到尾款");
    }

    private void before() {
        System.out.println("四处扫楼，发现房源，联系客户");
    }
}
public class StaticProxy {
    public static void main(String[] args) {
        Agent agent = new Agent(new Customer());
        agent.searchHouse();
    }
}
