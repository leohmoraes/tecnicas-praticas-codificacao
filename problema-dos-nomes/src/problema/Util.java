package problema;

public class Util {

  public static String cotoiso(String s) {
    return s.split("/")[2] + "-" + s.split("/")[1] + "-" + s.split("/")[0];
  }
}