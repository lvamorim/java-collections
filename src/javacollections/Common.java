package javacollections;

public class Common {
  public static void divider() {
    String line = "";

    for (int i = 0; i < 70; i++) {
      line += "-";
    }

    System.out.println(line);
  }

  public static void appName(String name) {
    divider();
    System.out.println(name.toUpperCase());
  }

  public static void operationName(String name) {
    divider();
    System.out.println(name.toUpperCase());
    divider();
  }

  public static void missingDataMessage(String data) {
    System.out.println("There are missing data. Please, fill in correctly to add a new " + data + ".");
  }

  public static void emptyDataMessage(String data) {
    System.out.println("There are no " + data + "s to show.");
  }

  public static void noZeroAcceptedMessage() {
    System.out.println("The number zero is not accepted. Please, insert another number.");
  }

  public static void notFoundToRemoveMessage(String data) {
    System.out.println("The " + data + " you tried to remove does not exist.");
  }
}
