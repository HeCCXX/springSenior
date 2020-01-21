package com.hcx.cache;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName JUCMain
 * @Description TODO juc测试
 * @Author 贺楚翔
 * @Date 2020-01-21 16:00
 * @Version 1.0
 **/

class Ticket{
    private int ticketNum = 30;

    Lock lock = new ReentrantLock();
    public void sale(){
        lock.lock();
        try
        {
            if (ticketNum > 0) {
                System.out.println(Thread.currentThread().getName()+"卖出第："+ticketNum--+"张，还剩下："+ticketNum);
            }
        }catch (Exception e){
              e.printStackTrace();
        }finally {
             lock.unlock();
        }
    }
}
public class JUCMain {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for(int i = 0; i < 40; i++) {
                ticket.sale();
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }},"B").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }},"c").start();
    }
}
