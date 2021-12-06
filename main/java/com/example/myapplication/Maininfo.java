package com.example.myapplication;

import android.widget.BaseAdapter;

import java.util.Date;

public class Maininfo {
    private String id;
    private String name;
    private int age;
    private String species;

    public Maininfo(String id, String name, int age, String species) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.species = species;

    }
        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getSpecies() {
            return this.species;
        }
    
}