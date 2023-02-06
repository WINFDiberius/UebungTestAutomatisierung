package org.campus02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BMIAnalyzerTest {

    Person person1;
    Person person2;
    Person person3;

    ArrayList<Person> persons = new ArrayList<>();

    @BeforeEach
    void setUp() {
        person1 = new Person("Daniel", "Sattler", 'M', 33, "AUT", 5000, "blue", 80, 160);
        person2 = new Person("Daniela", "Stelzer", 'W', 32, "AUT", 3000, "brown", 78, 180);
        person3 = new Person("Danielo", "Stitzer", 'W', 32, "AUT", 5000, "brown", 78, 180);

    }


    /**
     * check result
     */
    @Test
    void analyze() {
        BMIAnalyzer bmiAnalyzer = new BMIAnalyzer();

        Assertions.assertEquals(31.25, bmiAnalyzer.calcBmi(person1), 0.01);
    }
}