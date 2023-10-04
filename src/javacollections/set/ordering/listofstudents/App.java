package javacollections.set.ordering.listofstudents;

public class App {
  public static void main(String[] args) {
    ListOfStudents listOfStudents = new ListOfStudents();
    listOfStudents.addStudent("Emma", 78912, 7.5);
    listOfStudents.addStudent("Liam", 23456, 9.2);
    listOfStudents.addStudent("Olivia", 98765, 2.8);
    listOfStudents.addStudent("Noah", 12345, 6.7);
    listOfStudents.addStudent("Ava", 54321, 4.1);
    listOfStudents.addStudent("Sophia", 87654, 8.3);
    listOfStudents.addStudent("Jackson", 34567, 5.6);
    listOfStudents.addStudent("Isabella", 65432, 3.4);
    listOfStudents.addStudent("Liam", 56789, 7.9);
    listOfStudents.addStudent("Mia", 67890, 1.2);
    listOfStudents.addStudent("Ethan", 45678, 9.8);
    listOfStudents.removeStudent(67890);
    listOfStudents.showStudents();
    listOfStudents.showStudentsByName();
    listOfStudents.showStudentsByGrade();
  }
}
