import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        if(n>=0 && n<=50)
        {
            int i=1;
            while(i<=n)
            {
                
                int j=1;
                while(j<=n)
                {
                    System.out.print(n);
                    j++;
                }
                
                    System.out.println();
                
                i++;
            }
        }
		
		
	}

}
