package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

/**
 * Created by diwakarsharma on 7/24/18.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("diwakar",45));
        people.add(new Person("ram",32));
        people.add(new Person("hari",34));

        people.sort(Comparator.comparing(Person::getAge));
        


        people.forEach(user->{
            System.out.println("Name: " +user.getName()
            + ", Age : "+user.getAge());
        });

        }
    }

