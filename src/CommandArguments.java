import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CommandArguments {
  static Integer sum = 0;

  public static void main(String[] args) {
    int size = args.length;
    List<String> paramList = new ArrayList<String>();
    while (size > 0) {
      paramList.add(args[--size]);
    }
    List<Integer> intParam = paramList.stream().map(Integer::parseInt).collect(Collectors.toList());
    intParam.forEach(val -> {
      sum += val;
    });
    System.out.println(sum);
  }
}
