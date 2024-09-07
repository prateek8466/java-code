import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Name {
   public static void main(String[] args) {
      List<String> aList = new ArrayList<String>();
      aList.add("parteek");
      aList.add("aman");
      aList.add("chirag");
      aList.add("parv");
      aList.add("sachin");
      Iterator i = aList.iterator();
      System.out.println("The ArrayList elements are:");
      while (i.hasNext()) {
         System.out.println(i.next());
      }
   }
}