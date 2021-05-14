package com.SonarTest;
import java.util.*;
public class SonarTest {
      public static int largestInAString(String s){
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
      if(intArr.size()==1){
        largest=intArr.get(0);
      }
      else{
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
      }
      return largest;
	}
	public static boolean checkPalindrome(String s){
		String reversed="";
		for(int i=s.length()-1; i>=0; i--){
			reversed+=s.charAt(i);
		}
		if(reversed.equalsIgnoreCase(s)){
			return true;
		}
		return false;
	}
	public static boolean maxSumToALimit(int[] arr,int limit){
		int count=0;
		for(int i: arr){
			count++;
			if(limit>=i){
				limit=limit-1;
				break;
			}
		}
		if(limit==0){
			return true;
		}
		else if(limit!=0 && count==arr.length){
			return false;
		}
		else{
			return maxSumToALimit(arr,limit);
		}
	}
}
