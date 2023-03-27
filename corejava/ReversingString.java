public class ReversingString {
    public static void main(String[] args) {
        //case1 and case3
        // String s1 = "Anurag";
        // String s2 = "";
        // for (int i = s1.length() - 1; i >= 0; i--) {
        //     s2 = s2 + s1.charAt(i);
        // }
        // System.out.println("Before reversing: "+s1);
        // System.out.println("After Reversing: "+s2);

        //Interchange of stirng case2

    //     String s1="Harishankar Shukla";
    //     String s2="";
    //     String arr[]=s1.split(" ");
           
    //     for(int i=arr.length-1;i>=0;i--)
    //     {
    //         s2=s2+arr[i]+" ";
    //     }
    //     System.out.println(s2);

    //case 3
    String s1 = "Anurag Shukla";
    String s2 = "";
    String arr[]=s1.split(" ");
    for(String a:arr )
    {
        for (int i = a.length() - 1; i >= 0; i--) {
            s2 = s2 + a.charAt(i);
        } 
        s2=s2+" ";

    }
    System.out.println("Before reversing: "+s1);
    System.out.println("After Reversing: "+s2);
     }

}
