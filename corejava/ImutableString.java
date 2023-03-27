public class ImutableString {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Virat");
        s1.append("Kohli");
        s1=new StringBuffer("Sachin");
        System.out.println(s1);

    }
    
}
