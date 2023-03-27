public class TwoDArray {
    public static void main(String[] args) {
        int num[][]=new int [3][2];
//We are give the value of array help of index number
        num[0][0]=5;
        num[0][1]=3;
        num[1][0]=6;
        num[1][1]=4;
        num[2][0]=7;
        num[2][1]=8;
        
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=1;j++)
            {
                System.out.print(num[i][j]+" ");
            }

            System.out.println();
        }
    }
    
}
