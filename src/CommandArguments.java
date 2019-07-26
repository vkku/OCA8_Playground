import java.util.ArrayList;
import java.util.List;

public class CommandArguments {
  static Integer sum = 0;

  public static void main(String[] args) {
    int size = args.length;
    List<String> paramList = new ArrayList<String>();
    while (size > 0) {
      paramList.add(args[--size]);
    }
    paramList.stream().map(Integer::parseInt).flatMap(s -> {

      sum += s;
      return null;

    });

    System.out.println("Sum = " + sum);
  }
}
