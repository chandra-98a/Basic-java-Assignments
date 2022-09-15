package question5;

import java.util.ArrayList;
import java.util.List;

class GFG 
{
   private static StringBuilder charBuffer = new StringBuilder();
   public static String processWords(ArrayList<String> list) 
   {
   /* we are splitting the input based on 

           spaces (s)+ : this regular expression 

           will handle scenarios where we have words 

           separated by multiple spaces */

        
        		
	  
           /* charAt(0) will pick only the first character 

              from the string and append to buffer */
for(String s:list) {
            charBuffer.append(s.charAt(0));

        }
      return charBuffer.toString();

   }

    

   // main function

   public static void main (String[] args) 

   {
ArrayList<String> list=new ArrayList<String>();
list.add("The");
list.add("universe");
list.add("is");
list.add("amazing");

list.stream().forEach(t-> System.out.println("print even:"+t));
System.out.println("First letters of Strings in list :"+processWords(list));

   }
}
 