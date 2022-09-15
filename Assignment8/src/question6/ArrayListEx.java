package question6;


import java.util.ArrayList;
import java.util.Arrays;
 
public class ArrayListEx 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("abhi", "Bharat", "Chandu", "Dhanu", "Emily"));
         
        System.out.println(alphabets);
         
        alphabets.replaceAll( e -> e.toUpperCase() );  
         
        System.out.println(alphabets);
    }
}