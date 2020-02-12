package com.kuang.demo01;


public class Proxy {
    private Host host;

    public Proxy(){
    }
    public Proxy(Host host) {
        this.host = host;
    }

    public void rent(){
        host.rent();
        seeHouse();
        hetong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你去看房");
    }

    public void fare(){
        System.out.println("收中介费");
    }

    public void hetong(){
        System.out.println("签租赁合同");
    }
}
