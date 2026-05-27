public class pattern 
{
    public static void main(String[] args) {
	   {
		   int a=5;
		   for(int i=0;i<a;i++)
		   {
			   for(int j=0;j<=a-i;j++)
			   {
				   System.out.print(" ");
			   }
			   for (int j=1;j<=i*2-1;j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   
	   }
    }   
}

