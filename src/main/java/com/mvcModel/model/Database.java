package com.mvcModel.model;


import java.util.ArrayList;
import java.util.List;

public class Database{
    private List<Person> personList;

    public Database(){
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        this.personList.add(person);
    }

    public void removePerson(Person person){
        this.personList.remove(person);
    }

    public List<Person> getPerson(){
        return this.personList;
    }

}
