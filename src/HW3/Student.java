package HW3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student{
    String name;
    String surname;
    String dateOfBirthday;
    int course;
    Student(String name, String surname, String dateOfBirthday, int course){
        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.course = course;
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
    public String getDateOfBirthday() {
        return dateOfBirthday;
    }
    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void printStudents(Student student, int course){
        if (student.getCourse() == course){
            System.out.printf("Student: %s  %s \tCourse: %d\n", name, surname, course);
        }
    }
    public void display(){    //это метод для тренировки
        System.out.printf("Name: %s  Surname: %s \tBirthday: %s \tCourse: %d", name, surname, dateOfBirthday, course);
    }
    public static void main(String[] args) {
        Student Petr = new Student("Petr", "Petrov", "01.01.20", 2);
        Student Ivan = new Student("Ivan", "Ivanov", "09.11.21", 1);
        Student Lena = new Student("Lena", "Galkina", "11.11.21", 1);
        ArrayList <Student> students = new ArrayList<>();
        students.add(Petr);
        students.add(Ivan);
        students.add(Lena);
        System.out.print("Введи номер курса для отображения студентов: ");
        Scanner scan = new Scanner(System.in);
        int course = scan.nextInt();
        for (Student person:students) {
            person.printStudents(person, course);
        }
        Ivan.display();
    }
}
