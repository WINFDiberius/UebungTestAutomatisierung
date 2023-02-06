package org.campus02.test;

import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person("Daniel", "Sattler", 'M', 33, "AUT", 4000, "blue", 95, 173);
    }
    @Test
    void testConstructor() {
        Assertions.assertEquals("Daniel", person.getFirstname());
        Assertions.assertEquals("Sattler", person.getLastname());
        Assertions.assertEquals('M', person.getGender());
        Assertions.assertEquals(33, person.getAge());
        Assertions.assertEquals("AUT", person.getCountry());
        Assertions.assertEquals(4000, person.getSalary());
        Assertions.assertEquals("blue", person.getEyeColor());
        Assertions.assertEquals(95, person.getWeight());
        Assertions.assertEquals(173, person.getSize());
    }
    @Test
    void setEyeColor() {
    }
}