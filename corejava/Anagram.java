import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "School Master";
        String s2="The classroom java";

          s1=s1.replace(" ", "");
          s2=s2.replace(" ", "");

          s1=s1.toUpperCase();
          s2=s2.toUpperCase();

         char ar1[]= s1.toCharArray();
         char ar2[]= s2.toCharArray();
 
         Arrays.sort(ar1);
         Arrays.sort(ar2);

         if(Arrays.equals(ar1, ar2))
         {
            System.out.println("it is anagram");
         }
         else{
            System.out.println("it is not anagram ");
         }

    }
    
}
