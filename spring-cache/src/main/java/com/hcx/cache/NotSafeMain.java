package com.hcx.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName NotSafeMain
 * @Description TODO 线程不安全arraylist 、 set、hashmap
 * @Author 贺楚翔
 * @Date 2020-01-21 16:33
 * @Version 1.0
 **/
/**
*1、故障现象 java.util.ConcurrentModificationException
*2、解决办法
 * 2.1 new Vector()
 * 2.2 Collections.synchronizedList(new ArrayList<>());
 * 2.3  new CopyOnWriteArrayList<>();
* @return
* @exception
**/
public class NotSafeMain {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();

        for (int i = 0; i <= 30; i++) {
            new Thread(() -> {list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);},String.valueOf(i)).start();
        }
    }
}
