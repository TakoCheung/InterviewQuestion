import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class March2 {
  public static void main (String[] args) {
    System.out.print(what(new String []{"xxy","abc","cba","bac","dash","shad"}));
  }

  public static String what(String[] yes){
    HashMap<String, String> map = new HashMap<>();
    Arrays.asList(yes).stream().filter(p -> {
      char tempArray[] = p.toCharArray();
      Arrays.sort(tempArray);
      map.put(p, new String(tempArray));
      return true;
    }).collect(Collectors.toList());
    return map.toString();
  }
}
