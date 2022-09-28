import java.util.Scanner;
public class dp {
    public static void main(String []argv){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int a,b,c;
        a=b=c=1;
        int dp[]=new int[k+4];
        dp[0]=1;
        int j=0;
        for(int i=1;i<k;){
            if(dp[j]*3>dp[i-(3*j)-1])dp[i++]=dp[j]*3;
            if(dp[j]*5>dp[i-(3*j)-1])dp[i++]=dp[j]*5;
            if(dp[j]*7>dp[i-(3*j)-1])dp[i++]=dp[j]*7;
            j++;
        }
        for(int i=0;i<k;i++) System.out.println(dp[i]);

        //System.out.println(dp[k-1]);

    }
}
