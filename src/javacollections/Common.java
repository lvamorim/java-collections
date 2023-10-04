package javacollections;

public class Common {
  private static final int DIVIDER_LENGTH = 100;

  private static void divider() {
    String line = "-".repeat(DIVIDER_LENGTH);

    System.out.println(line);
  }

  public static void printAppName(String name) {
    final int LENGTH = (DIVIDER_LENGTH - name.length()) / 2;
    String spacing = " ".repeat(LENGTH);

    divider();
    System.out.println(spacing + name.toUpperCase() + spacing);
  }

  private static void operationName(String message) {
    divider();
    System.out.println(message.toUpperCase());
    divider();
  }

  private static String commonOperationKeyword(int operationCode) {
    String operationKeyword = "";

    switch (operationCode) {
      case 1:
        operationKeyword = "Add";
        break;
      
      case 2:
        operationKeyword = "Remove";
        break;
      
      case 3:
        operationKeyword = "Update";
        break;
      
      case 4:
        operationKeyword = "Show";
        break;
    
      default:
        break;
    }

    return operationKeyword;
  }

  public static void printCustomOperationName(String name) {
    operationName(name);
  }

  /**
   * 
   * @param operationCode
   *  <table>
   *    <tr>
   *      <td><strong>1:</strong></td>
   *      <td>Represents the string "Add".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>2:</strong></td>
   *      <td>Represents the string "Remove".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>3:</strong></td>
   *      <td>Represents the string "Update".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>4:</strong></td>
   *      <td>Represents the string "Show".</td>
   *    </tr>
   *  </table>
   * @param data
   *  A simple string representing the name of the data.
   *  E.g.: "book", "task".
   */
  public static void printCommonOperationName(int operationCode, String data) {
    String commonOperationName = commonOperationKeyword(operationCode) + " " + data;

    if (operationCode == 4) {
      commonOperationName = commonOperationName + "s";
    }

    operationName(commonOperationName);
  }

  /**
   * 
   * @param <T>
   *  The data's type, which is based on the class model.
   *  E.g.: User.
   * @param operationCode
   *  <table>
   *    <tr>
   *      <td><strong>1:</strong></td>
   *      <td>Represents the string "Add".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>2:</strong></td>
   *      <td>Represents the string "Remove".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>3:</strong></td>
   *      <td>Represents the string "Update".</td>
   *    </tr>
   *    <tr>
   *      <td><strong>4:</strong></td>
   *      <td>Represents the string "Show".</td>
   *    </tr>
   *  </table>
   * @param data
   *  Represents the variable of the data's type, that contains a string version of the data.
   *  E.g.: user, containing "Name: Susan | Age: 26".
   */
  public static <T> void printSuccessfulMessage(T data) {
    System.out.println("[Success] ".toUpperCase() + data);
    return;
  }

  /**
   * 
   * @param errorCode
   *  <table>
   *    <tr>
   *      <td><strong>1:</strong></td>
   *      <td>Represents the string "There are missing data. Please, fill in correctly."</td>
   *    </tr>
   *    <tr>
   *      <td><strong>2:</strong></td>
   *      <td>Represents the string "The data does not exist."</td>
   *    </tr>
   *    <tr>
   *      <td><strong>3:</strong></td>
   *      <td>Represents the string "Zero is not accepted. Please, insert another number."</td>
   *    </tr>
   *    <tr>
   *      <td><strong>default:</strong></td>
   *      <td>Represents the string "There is nothing to show."</td>
   *    </tr>
   *  </table>
   */
  public static void printCommonErrorMessage(int errorCode) {
    String message = "";

    switch (errorCode) {
      case 1:
        message = "There are missing data. Please, fill in correctly.";
        break;
      
      case 2:
        message = "The data does not exist.";
        break;
      
      case 3:
        message = "Zero is not accepted. Please, insert another number.";
        break;
    
      default:
        message = "There is nothing to show.";
        break;
    }

    if (errorCode != 0) {
      message = "[Error] ".toUpperCase() + message;
    }

    System.err.println(message);
  }

  public static void printCustomErrorMessage(String message) {
    System.err.println(message);
  }
}
