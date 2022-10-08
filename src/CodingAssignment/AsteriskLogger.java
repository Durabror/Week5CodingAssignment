package CodingAssignment;
import java.util.Arrays;

public class AsteriskLogger implements Logger {

  @Override
  public void log(String log) {
    System.out.println("***" + log + "***");    
  }

  @Override
  public void error(String error) {
    int width = error.length() + 12;
    System.out.println(repeat('*', width + 1));
    System.out.println("***" + "ERROR: " + error + "***");
    System.out.println(repeat('*', width + 1));
    
  }

  private static String repeat(char ch, int count) {
    char[] buf = new char[count];
    Arrays.fill(buf, ch);
    return new String(buf);
}

}
