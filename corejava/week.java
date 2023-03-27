import java.util.Scanner;
public class week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
    
        switch(day){
            case 1:
                System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesdsy");
            break;
            case 3: 
                System.out.println("Wednesday");
             break;   
            case 4:
                System.out.println("thursday");
            break;
            case 5:
                System.out.println("Friday");
            break ; 
            
            default:
    
            System.out.println("invalid ");
    
      sc.close();
        }
    
      }
    
    }
    
    

