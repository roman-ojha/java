package com.company;

/*
    -> Specifier where a property/method is accessible there are four types of access modifier in Java:
        a) Private
        b) Default
            -> we don't have to write to make default it will automatically be in default
        c) Protected
        d) Public
 */

class myEmployee{
    int id1;
    String name1;
    // we can make private property like this
    private int id2;
    private String name2;
    public void setName(String y){
        name2=y;
    }
    public String getName(){
        return name2;
    }
    public void setId(int i){
        id2=i;
    }
    public int getId(){
        return id2;
    }
}

public class Tut_40_Access_modifiers_getters_and_setters_in_Java {
    public static void main(String[] args) {
        myEmployee roman=new myEmployee();
        roman.id1=43;
        roman.name1="Roman";
        // here these two 'name' and 'id' can be able to access through the main class
        // but we can be able to access 'salary' because this property is private
        roman.setId(32);
        roman.setName("Romanojha");
        System.out.println(roman.getName());
        System.out.println(roman.getId());
    }
}
