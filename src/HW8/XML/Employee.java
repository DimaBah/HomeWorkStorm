package HW8.XML;

public class Employee {
    String name;
    String surname;
    String position;
    String division;
    String experience;

    public Employee(String name, String surname, String position, String division, String experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.division = division;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getDivision() {
        return division;
    }

    public String getExperience() {
        return experience;
    }
}
