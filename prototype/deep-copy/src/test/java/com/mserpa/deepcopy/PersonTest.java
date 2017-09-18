package com.mserpa.deepcopy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class PersonTest {

    @Test
    public void shouldCreateCopyOfObject() throws CloneNotSupportedException {
        Person personBase = new Person();
        personBase.setName("Marcelo");
        personBase.setAge(30);
        List<String> emails = new ArrayList<>();
        emails.add("teste@teste.com");
        personBase.setEmails(emails);
        Address address = new Address();
        address.setCity("Guaiba");
        address.setState("RS");
        personBase.setAddress(address);

        Person clone = (Person) personBase.clone();

        assertEquals("Guaiba", clone.getAddress().getCity());
    }

    @Test
    public void shouldntShareReferenceBeetwenOriginalAndClonedObject() throws CloneNotSupportedException {
        Person personBase = new Person();
        personBase.setName("Marcelo");
        personBase.setAge(30);
        List<String> emails = new ArrayList<>();
        emails.add("teste@teste.com");
        personBase.setEmails(emails);
        Address address = new Address();
        address.setCity("Guaiba");
        address.setState("RS");
        personBase.setAddress(address);

        Person clone = (Person) personBase.clone();
        personBase.getAddress().setCity("Porto Alegre");
        personBase.getEmails().add("newemail@teste.com");

        assertEquals("Guaiba", clone.getAddress().getCity());
        assertTrue(1 == clone.getEmails().size());
    }


}