package javacollections.set.ordering.listofstudents;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javacollections.Common;

public class ListOfStudents {
  private Set<Student> listOfStudents;
  private String data = "student";

  public ListOfStudents() {
    this.listOfStudents = new HashSet<>();
    
    Common.printAppName("List of " + data + "s");
  }

  public void addStudent(String name, long registration, double grade) {
    Common.printCommonOperationName(1, data);

    try {
      if (name == null || name.isBlank() || registration == 0) {
        throw new IllegalArgumentException();
      }

      Student student = new Student(name, registration, grade);
      listOfStudents.add(student);
      Common.printSuccessfulMessage(student);
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }
  }

  public void removeStudent(long registration) {
    Common.printCommonOperationName(2, data);

    try {
      if (registration == 0) {
        throw new IllegalArgumentException();
      }

      if (listOfStudents.isEmpty()) {
        throw new Exception();
      }

      Student studentToRemove = null;

      for (Student student : listOfStudents) {
        if (student.getRegistration() == registration) {
          studentToRemove = student;
        }
      }

      if (studentToRemove == null) {
        throw new Exception();
      }

      else {
        listOfStudents.remove(studentToRemove);
        Common.printSuccessfulMessage(studentToRemove);
      }
    }
    
    catch (IllegalArgumentException e) {
      Common.printCommonErrorMessage(1);
    }

    catch (Exception e) {
      Common.printCommonErrorMessage(2);
    }
  }

  public void showStudents() {
    Common.printCommonOperationName(4, data);

    try {
      if (listOfStudents.isEmpty()) {
        throw new Exception();
      }

      for (Student student : listOfStudents) {
        System.out.println(student);
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  private void showStudentsBy(String method) {
    Common.printCustomOperationName("Show " + data + "s by " + method);

    try {
      if (listOfStudents.isEmpty()) {
        throw new Exception();
      }

      switch (method) {
        case "name":
          Set<Student> studentsByName = new TreeSet<>(listOfStudents);

          for (Student student : studentsByName) {
            System.out.println(student);
          }
          break;
        
        case "grade":
          Set<Student> studentsByGrade = new TreeSet<>(new ComparatorByGrade());
          studentsByGrade.addAll(listOfStudents);

          for (Student student : studentsByGrade) {
            System.out.println(student);
          }
          break;
      
        default:
          break;
      }
    }
    
    catch (Exception e) {
      Common.printCommonErrorMessage(0);
    }
  }

  public void showStudentsByName() {
    showStudentsBy("name");
  }
  
  public void showStudentsByGrade() {
    showStudentsBy("grade");
  }
}
