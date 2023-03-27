public class CompareOfString {
    public static void main(String[] args) {
        String s1="Anurag";
        String s2="Anurag";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3=new String("Anurag");
        String s4=new String("Anurag");
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);
        



    }
    
}
