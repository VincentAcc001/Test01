package com.nodepower.Task4;

import java.util.*;

/*
    4、嵌套集合的遍历，当ArrayList集合中嵌套HashMap集合时，将集合内容遍历。

        (1) ArrayList集合中存储的内容是三个HashMap集合

        (2) HashMap集合中存储的内容是

        Map01:STU001->牛群，STU002->冯巩，STU003->郭德纲

        Map02:STU001->于谦，STU002->岳云鹏，STU003->孙越

        Map03:STU001->王宝强，STU002->马蓉，STU003->杨幂

        动力节点夜校2113，郭昊霖
*/
public class Task4 {


    public static void showContentMethod1(ArrayList<HashMap<String,String>> arrayList){
        int count = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            Set<String> keySet = arrayList.get(i).keySet();
            System.out.print("Map0" + count + ": ");
            for(String key : keySet){
                String value = arrayList.get(i).get(key);
                System.out.print(key + "->" + value + "  ");
            }
            System.out.println();
            count++;
        }
        System.out.println("==============================================");
    }

    public static void showContentMethod2(ArrayList<HashMap<String,String>> arrayList){

        int count = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print("Map0" + count + ": ");
            arrayList.get(i)
                    .forEach((k,v) -> System.out.print(k + "->" + v + "  "));
            System.out.println();
            count++;
        }
        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        HashMap<String,String> hp1 = new HashMap<>();
        HashMap<String,String> hp2 = new HashMap<>();
        HashMap<String,String> hp3 = new HashMap<>();
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();

        hp1.put("STU001","牛群");
        hp1.put("STU002","冯巩");
        hp1.put("STU003","郭德纲");
        hp2.put("STU001","于谦");
        hp2.put("STU002","岳云鹏");
        hp2.put("STU003","孙越");
        hp3.put("STU001","王宝强");
        hp3.put("STU002","马蓉");
        hp3.put("STU003","杨幂");

        arrayList.add(hp1);
        arrayList.add(hp2);
        arrayList.add(hp3);

        //调用方法1
        showContentMethod1(arrayList);
        //调用方法2
        showContentMethod2(arrayList);

    }
}
