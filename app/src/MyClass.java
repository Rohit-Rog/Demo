
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      String s=args[0];
      s=s.replaceAll("\\p{Punct}"," ");
      String[] s_arr=s.split("\\s+");
      int largest=0;
      ArrayList<Integer> intArr= new ArrayList<>();
      for(String sn : s_arr){
          try{
              if(sn.startsWith("9")){
                  continue;
              }
              else{
                intArr.add(Integer.parseInt(sn));  
                }
            }
          catch(Exception e){
              continue;
          }
      }
      System.out.println(intArr);
      for(int i=0;i<intArr.size();i++){
          if(i<intArr.size()-1){
          if(intArr.get(i)<intArr.get(i+1)){
              largest=intArr.get(i+1);
          }
          else{
              largest=intArr.get(i);
          }
          }
      }
      System.out.println(largest);
    }
}
