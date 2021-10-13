package ch6Project;

import java.util.Scanner;

class Person1 {
    private String name;
    private int age;

    public Person1() {
        this.name = "No name yet";
        this.age = 0;
    }

    public Person1(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String first, String last) {
        // string fullName = "Adrian Rules";
        var names = this.name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        firstName = first;
        lastName = last;
        String newName = firstName + " " + lastName;
        this.name = newName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person1 createToddler() {
        this.name = "A Toddler";
        this.age = 2;
        return this;
    }

    public Person1 createPreschooler() {
        this.name = "A preschooler";
        this.age = 5;
        return this;

    }

    public Person1 createAdolescent() {
        this.name = "A Adolescent";
        this.age = 9;
        return this;
    }

    public Person1 createTeenager() {
        this.name = "A teenager";
        this.age = 15;
        return this;
    }

    public Person1 createAdult() {
        this.name = "A teenager";
        this.age = 21;
        return this;
    }
}

public class Exercise9 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name=input.next();
//        System.out.println("Enter your age");
//        int age=input.nextInt();
        Person1 person1 = new Person1("Saw Mya", 4);
        //person1.setName("Jue Jue");
        person1.setName("Myat", "Thet");
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        person1.createAdult();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

    }
}
