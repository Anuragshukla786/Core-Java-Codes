import java.util.Scanner;

public  class patren2{

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int n=5;
	int m=4;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(i==1||j==1||i==n||j==m)
			 System.out.print("*");
			 System.out.print(" ");
		}
		 System.out.println();
		 sc.close();
	}


}}