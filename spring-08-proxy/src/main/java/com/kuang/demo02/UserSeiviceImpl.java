package com.kuang.demo02;

//真实对象
public class UserSeiviceImpl implements UserService{

    @Override
    public void add() {
        //log("add");
        System.out.println("增加了一个用户！");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户！");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户！");
    }

    @Override
    public void query() {
        System.out.println("查询了一个用户！");
    }

    /*public void log(String msg){
        System.out.println("输出"+msg+"东西");
    }*/
}
