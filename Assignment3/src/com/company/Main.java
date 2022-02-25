package com.company;

public class Main {

    public static void main(String[] args) {
	SeattlePoliceDepartment s = new SeattlePoliceDepartment();

    Person lydia = new Person("Lydia",29);
    Person helen = new Person("Helen", 28);
    Person frank = new Person("Frank",33);
    Person emily = new Person("Emily",24);
    Person yu= new Person("Yu",22);

    lydia.subscribe(s);
    helen.subscribe(s);
    frank.subscribe(s);
    yu.subscribe(s);

    s.NotifyCitizens("Please wear the mask when you are in public places");

    yu.unsubscribe(s);

    s.NotifyCitizens("Please wear the mask when you are in public places");
    }
}
