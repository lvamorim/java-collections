package javacollections.list.basicoperations.todolist;

public class App {
  public static void main(String[] args) {
    ToDoList toDoList = new ToDoList();
    toDoList.addTask("Buy groceries");
    toDoList.addTask("Go for a jog");
    toDoList.addTask("Call a friend");
    toDoList.addTask("Read a book");
    toDoList.addTask("Clean the house");
    toDoList.addTask("Visit a museum");
    toDoList.removeTask("Visit a museum");
    toDoList.showTasks();
    toDoList.getNumberOfTasks();
  }
}
