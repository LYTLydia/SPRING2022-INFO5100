package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment {
    String notification;
    ArrayList<Person> person;

    public SeattlePoliceDepartment(){
        this.person= new ArrayList<Person>();
    }

    public void NotifyCitizens(String notification){
        this.notification=notification;
        for(Person p : person){
            p.getNotification(this);
        }
    }
}
