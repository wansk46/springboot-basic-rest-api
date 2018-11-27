package com.tw.apistackbase.controller;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Integer salary;

    public Employee(){

    }



    public Employee(String name, Integer age, String gender, Integer salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public Integer getSalary() {
        return salary;
    }



    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }



}
