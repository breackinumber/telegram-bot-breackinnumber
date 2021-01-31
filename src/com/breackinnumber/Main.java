package com.breackinnumber;

public class Main {
    public static void main(String[] args){
        Person artur = new Person();
        {artur.name = "Artur";
        artur.age = 16;
        artur.weight = 66.2;}
        Person pedro = new Person();
        {pedro.name = "Pedro";
        pedro.age = 28;
        pedro.weight = 92.6;}
        printPersonCharacteristics(artur);
        printPersonCharacteristics(pedro);
    }
    public static void  printPersonCharacteristics(Person person){
        System.out.println("Person name is "+person.name);
        System.out.println(person.name+" is "+person.age+" years old");
        System.out.println(person.name+"'s weight is "+person.weight+" kilograms");
    }
}
