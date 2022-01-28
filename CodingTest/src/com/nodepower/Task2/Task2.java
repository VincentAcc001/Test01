package com.nodepower.Task2;

import java.io.File;

/*
        2、当目录中存在多级目录时，如day01/demo01/Demo01.class,
        将目录day01以及其中的内容一并删除。

        动力节点夜校2113，郭昊霖
*/
public class Task2 {
    //递归删除多级目录及文件
private static void delDir(File file) {
    if(file.exists()){
        File[] files = file.listFiles();
        if(files.length > 0){
            for (File f : files) {
                if(f.isDirectory()){
                    delDir(f);
                }else{
                    f.delete();
                }
            }
        }
        file.delete();
    }else{
        System.out.println("不存在指定目录：" + file);
    }
}


public static void main(String[] args) {

    try{
        //创建多级目录
        File file = new File("./day01/demo01");

        if(file.mkdirs()){
            System.out.println("目录创建成功");
        }else{
            System.out.println("目录已经存在");
        }

        //创建文件
        File file1 = new File("./day01/demo01/Demo01.class");

        if(file1.createNewFile()){
            System.out.println("文件创建成功");
        }else{
            System.out.println("文件已经存在");
        }
    } catch(Exception e){
        e.printStackTrace();
    }

    //递归删除目录及文件
    File file2 = new File("./day01");
    try{
        delDir(file2);
    }catch(Exception e){
        e.printStackTrace();
    }

    }
}
