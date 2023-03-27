public class JaggedArray {
    public static void main(String[] args) {

        int num[][]=new int [3][];
//We are give the value of array help of index number
        num[0]=new int[4];
        num[1]=new int[2];
        num[2]=new int[3];

        num[0][0]=6;

        
       
        //jagged array in which number of rows are fixed and coloumns are not
        //fixed
    //     int num[][]={

    //                 {2,3,4,5},
    //                 {5,6},
    //                 {7,8,9}
    //     };
        
        for(int i=0;i<=2;i++){
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
    }
    
}
}