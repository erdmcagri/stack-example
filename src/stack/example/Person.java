package stack.example;

import java.util.Arrays;
import java.util.UUID;

/**
 *
 * @author erdmcagri
 */
public class Person {

    private UUID id;
    private String name;
    private String surname;
    private int age;
    private String[] hobbies;

    public Person() {

    }

    public Person(UUID id, String name, String surname, int age, String[] hobbies) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", age=" + age
                + ", hobbies=" + Arrays.toString(hobbies)
                + '}';
    }
}
