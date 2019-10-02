
public class Pattern5 {
	
    public static void main(String[] args){
	int j, l, f=1;
		for(int i=1; i<=5; i++)
		 {
		   for( j=1; j<=(9-f)/2; j++)
		    System.out.print(" ");
		   for(int k=1; k<=f; k++)
		    System.out.print("*");
		   for( l=1; l<=(9-f)/2; l++)
		    System.out.print(" ");
		   System.out.println();
		 f=f+2; 
		 }
		
		 }

}
