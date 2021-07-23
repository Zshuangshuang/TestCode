package com.zss.多线程.线程同步问题;

class Account{
    public int money;//账户余额
    public String name;//账户名称

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
class BankTake extends Thread{
    public Account account;//账户
    public int needMoney;//需要取的钱
    public int nowMoney;//手头的钱
    public BankTake(Account account,int needMoney,String name){
        super(name);
        this.account = account;
        this.needMoney = needMoney;
    }
    @Override
    public void run() {
        if (account.money - needMoney <= 0){
            System.out.println(Thread.currentThread().getName()+"无法取钱，账户余额不足");
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -= needMoney;
        nowMoney += needMoney;
        System.out.println(account.name+"余额为："+account.money);
        System.out.println(this.getName()+"手头的钱为："+nowMoney);
    }
}
public class UnSafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"旅游基金");
        BankTake a = new BankTake(account,50,"双双");
        BankTake b = new BankTake(account,100,"小短腿");
        a.start();
        b.start();
    }
}
