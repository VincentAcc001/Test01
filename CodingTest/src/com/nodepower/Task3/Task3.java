package com.nodepower.Task3;

/*
    3、线程同步，当两个线程thread01和thread02同时倒计时20秒时，保证数据安全，一个线程数一秒。

    动力节点夜校2113，郭昊霖
*/
public class Task3{

    int countDown = 20;

    public void timer1(){
        synchronized (this){
            while(countDown > 0){
                if(countDown % 2 == 0){
                    try{
                        wait();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("线程1:  " + countDown);
                countDown--;
                notify();
            }
        }
    }

    public void timer2(){
        synchronized (this){
            while(countDown > 0){
                if(countDown % 2 == 1){
                    try{
                        wait();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("线程2:  " + countDown);
                countDown--;
                notify();
            }
        }
    }

    public static void main(String[] args) {

        Task3 myTask = new Task3();
        Thread t1 = new Thread(myTask::timer1);
        Thread t2 = new Thread(myTask::timer2);

        t1.start();
        t2.start();
    }
}
