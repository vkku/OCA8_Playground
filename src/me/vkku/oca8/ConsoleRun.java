package me.vkku.oca8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsoleRun extends ConsoleOreoRun implements Console3000Run {



  public static String fromConsoleDoubleRun() {
    return "I'm Java, here for 20 years. (sic)";
  }

  public static void main(String args[]) {
    int ₹just_a_long_identifier;
    int _____another_weird_$_identifier;
    final ConsoleDoubleRun consoleDoubleRun = new ConsoleDoubleRun();

    ₹just_a_long_identifier = 10;
    _____another_weird_$_identifier = 50;

    List<Integer> keyList = new ArrayList<Integer>();
    keyList.add(₹just_a_long_identifier);
    keyList.add(_____another_weird_$_identifier);
    System.out.println(keyList.stream().collect(Collectors.toList()));
    System.out.println(consoleDoubleRun.fromConsoleDoubleRun());
    System.out.println(ConsoleOreoRun.fromConsoleOreoRun());
    System.out.println(fromConsoleDoubleRun());
  }

}


final class ConsoleDoubleRun {
  public String fromConsoleDoubleRun() {
    return "This String dosen't matter";
  }
}


abstract class ConsoleOreoRun {
  protected static String fromConsoleOreoRun() {
    return "I follow Twist, __derogatory_word__, Dip";
  }

}


interface Console3000Run {
  public static String fromConsoleDoubleRun() {
    return "I'm Java, here for 20 years. (sic)";
  }
}
