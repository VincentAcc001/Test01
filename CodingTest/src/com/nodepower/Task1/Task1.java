package com.nodepower.Task1;

/*

        1、自定义AgeException和NameException，在创建学生类对象时进行初始化，
        如果年龄和姓名不符合要求，则抛出自定义异常类

        动力节点夜校2113，郭昊霖
*/
public class Task1 {

    public static void main(String[] args) {
        Student student1 = new Student("张三",10);
        Student student2 = new Student("李四",100);
        //测试姓名长度不在2-4字之间
        Student student3 = new Student("张三张三张三",10);
        Student student4 = new Student("张",10);

        //测试年龄不在1-150之间
        Student student5 = new Student("李四",200);
        Student student6 = new Student("李四",0);

        //测试姓名和年龄都不符合规范
        Student student7 = new Student("李四李四李四",0);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
    }
}
