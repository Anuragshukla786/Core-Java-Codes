public class EnhanceLoop {
    public static void main(String[] args) {

        // one dimensional array using Enhance for loop
        // int num[]={1,2,3,4,};
        // for(int n:num)
        // {
        // System.out.println(n);
        // }
        //Two Dimensional Array
        int num[][] = {

                { 2, 3, 4, 5 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        for (int a[] : num) {
            {
                for (int b : a) {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }

    }
}
