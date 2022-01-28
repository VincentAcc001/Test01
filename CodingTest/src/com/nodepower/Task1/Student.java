package com.nodepower.Task1;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        try{
            setName(name);
        } catch (NameException e){
            e.printStackTrace();
        }

        try{
            setAge(age);
        } catch (AgeException e){
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException{
        if(name.length() < 2 || name.length() > 4){
            throw new NameException("输入的姓名不合理，姓名长度在2~4字之间");
        }else{
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if(age < 1 || age > 150){
           throw new AgeException("输入的年龄不合理，请输入大于1、小于150的整数");
        }else{
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
