package july13;

public class Pattern4 {
public static void main(String[] args) {
	int n=4;
	for(int i=1;i<n*2;i++)
	{
		for(int j=1;j<n*2;j++)
		{
			if((i>=j && i+j<=n*2)||(i+j>=n*2 && j>=i ))
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

}
}
/*
 

*           * 
* *       * * 
* * *   * * * 
* * * * * * * 
* * *   * * * 
* *       * * 
*           * 
 
 
 */