
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Generics {
      static List<Number> numbers = new ArrayList<>(Arrays.asList(5,3,9,6));
      static List<Double> number = new ArrayList<>(Arrays.asList(7.55,98.43));
      static List<String> numbe = new ArrayList<>(Arrays.asList("Kamal","jamal"));


//<?> Denotes to Unbounded Generics that can take any type of data
    public static String process(List<?> list){
        return null;
 }
    
  static public List<?> list = Arrays.asList("Mahbub",12,5.6,LocalDate.now());
    
   public static List<String> oldList = Arrays.asList("Kamal","Jamal","Mahbub","Sajnin","Riaj","Ashraf","Mitu");
   public static List<String> newList = new ArrayList<>();
    
   public static void filter(){
     Iterator<String> iterate = oldList.iterator();
     while(iterate.hasNext()){
       String ite = iterate.next();
         
     if(ite.equals("Sajnin")){
     newList.add(ite);
         System.out.println("Exists");
     }else{       System.out.println("Does Not exists");
}
     } 
     System.out.println(newList);
   }
    
    
  public static void main(String[] args) {
        process(numbers);
        process(number);
        process(numbe);
        System.out.println(list);
        filter();
    }
}
