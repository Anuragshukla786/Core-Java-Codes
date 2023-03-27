public class Palindrome2 {
    public static void main(String[] args) {
        String s1=new String("NITIN");
        String s2=new String("");

        for(int i=s1.length()-1;i>=0;i--)
        {
            
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2))
        {
            System.out.println("it is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
    }
    
}
