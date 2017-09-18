package com.mserpa.shallowcopy;

import java.util.List;

public class Person extends Prototype{

    private String name;
    private Integer age;
    private Address address;
    private List<String> emails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setEmails(emails);
        person.setAddress(address);
        return person;
    }
}
