package javacollections.set.ordering.listofstudents;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Student implements Comparable<Student> {
  String name;
  long registration;
  double grade;

  public Student(String name, long registration, double grade) {
    this.name = name;
    this.registration = registration;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public long getRegistration() {
    return registration;
  }

  public double getGrade() {
    return grade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if(!(o instanceof Student student)) return false;
    return getRegistration() == student.getRegistration();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getRegistration());
  }

  @Override
  public int compareTo(Student student) {
    return name.compareToIgnoreCase(student.getName());
  }
  
  @Override
  public String toString() {
    Locale.setDefault(Locale.US);
    
    return "Name: " + name + " | Registration: " + registration + " | Grade: " + grade;
  }
}

class ComparatorByGrade implements Comparator<Student> {
  @Override
  public int compare(Student student1, Student student2) {
    return Double.compare(student1.getGrade(), student2.getGrade());
  }
}
