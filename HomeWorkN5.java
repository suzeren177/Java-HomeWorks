/**
 * GeekBrains. Java 1. HomeWork#5
 *
 * @author Mikhail Orlov
 * @version 23.02.2022
 */

package ru.geekbrains.lesson5;

class HomeWorkN5 {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231256", 30000, 30),
                new Person("Petrov Petr", "Manager", "papetrov@mailbox.com", "89311284533", 100000, 35),
                new Person("Sidorov Sergey", "CEO", "svsidorov@mailbox.com", "89034215676", 300000, 38),
                new Person("Lukov Pavel", "CFO", "pelukov@mailbox.com", "89259780654", 250000, 41),
                new Person("Grobachev Dmitry", "CAO", "dygorbachev@mailbox.com", "89074532166",  150000, 42)
        };

        for (Person person : persons) {
            if (person.getAge() > 40) {
                System.out.println(person);
            }
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return (name + position + email + phone + salary + age);
    }
}