package com.mvcModel.controller;

import com.mvcModel.model.Database;
import com.mvcModel.model.Person;
import com.mvcModel.view.MainFrame;

import java.util.List;


public class Controller {

    private Database database;
    private MainFrame mainFrame;

    public Controller(MainFrame mainFrame){
        this.database = new Database();
        this.mainFrame = mainFrame;
    }

    public void addPerson(String personName, int age){
        Person person = new Person(personName,age);
        this.database.addPerson(person);
    }

    public void removePerson(Person person){
        this.database.removePerson(person);
    }

    public List<Person> getPersonList(){
        return this.database.getPerson();
    }

    public void refreshScreen(){
        List<Person> people = getPersonList();
        this.mainFrame.clearText();
        for(Person person : people){
            this.mainFrame.refreshTextArea(person.getName(), person.getAge());
        }
    }

}


