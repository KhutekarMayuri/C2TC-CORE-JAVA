package Assignment25March2022;

public class DiamondPattern {
	public static void main(String[] args) {
	   int i,j;

	   for(i=0;i<=5;i++) {
	     for(j=1;j<=5-i;j++)
	     System.out.print(" ");
	     for(j=1;j<=2*i-1;j++)
	       System.out.print("*");
	     System.out.print("\n");
	   }
	 
	   for(i=5-1;i>=1;i--) {
	     for(j=1;j<=5-i;j++)
	     System.out.print(" ");
	     for(j=1;j<=2*i-1;j++)
	       System.out.print("*");
	     System.out.print("\n");
	   }
	}
}
