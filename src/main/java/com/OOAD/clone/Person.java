package com.OOAD.clone;

/**
 * Created by yubraj on 8/1/16.
 */
public class Person implements Cloneable {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

}
