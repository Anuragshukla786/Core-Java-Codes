import java.util.Scanner;
public class costprice_sellingprice {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int cp;
        System.out.println("Enter the cost prize");
        cp=sc.nextInt();
        int sp;
        System.out.println("Enter the selling prize");
        sp=sc.nextInt();
        int amt;
        if(cp>sp){

            amt=cp-sp;
            System.out.println( "the loss is"+amt);
        }
         else if(cp<sp){
            amt=sp-cp;
          System.out.println("The profit is"+amt)  ;
         }
          else{
            System.out.println("No profit no loss");

            sc.close();
                  }
         }               
        }

    




