package com.mserpa.application;

import com.mserpa.application.builder.PersonBuilder;
import com.mserpa.application.model.Person;


public class Main {

    public static void main(String[] args) {

        Person person = PersonBuilder.builder()
                .withName("Marcelo Serpa")
                .withAge(27)
                .withAddress(436, "Florida Street", "Porto Alegre", "BR")
                .build();

        System.out.println(person);

    }

}
