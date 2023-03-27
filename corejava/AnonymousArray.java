class Calc{
    public int add(int num[])
    {
        int result=0;
        for(int n:num)
        {
            result=result+n;
        
        }
        return result;
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        Calc c=new Calc();
       // int num[]={2,2,3,4}; give the value anonymous type
        int result= c.add (new int []{2,2,3,4}  );
        System.out.println(result);

        
    }
    
}
