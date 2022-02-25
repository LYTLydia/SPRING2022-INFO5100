package com.company;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment spd){
        if(!spd.person.contains(this)){
            spd.person.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment spd){
        if(spd.person.contains(this)){
            spd.person.remove(this);
        }
    }

    public void getNotification(SeattlePoliceDepartment spd){
        System.out.println("---------------------------------------------------");
        System.out.println("Citizen: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println(spd.notification);
    }
}
