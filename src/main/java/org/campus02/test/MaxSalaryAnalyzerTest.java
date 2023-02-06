package org.campus02.test;

import org.campus02.MaxSalaryAnalyzer;
import org.campus02.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MaxSalaryAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person1 = new Person("Daniel", "Sattler", 'M', 33, "AUT", 5000, "blue", 95, 173);
        person2 = new Person("Daniela", "Stelzer", 'W', 32, "AUT", 3000, "brown", 78, 180);
        person3 = new Person("Danielo", "Stitzer", 'W', 32, "AUT", 5000, "brown", 78, 180);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    }
    /**
     * check personsWithHighestSalary
     */
    @Test
    void analyze() {
        MaxSalaryAnalyzer maxSalaryAnalyzer = new MaxSalaryAnalyzer();
        maxSalaryAnalyzer.setPersons(persons);
        maxSalaryAnalyzer.analyze();

        HashSet<Person> personsWithHighestSalary = maxSalaryAnalyzer.getPersonsWithHighestSalary();

        Assertions.assertEquals(2,personsWithHighestSalary.size());
        Assertions.assertTrue(personsWithHighestSalary.contains(person1));
        Assertions.assertTrue(personsWithHighestSalary.contains(person3));
    }
}