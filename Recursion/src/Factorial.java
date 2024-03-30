import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int ans=fact(t);
        System.out.println(ans);
    }
    static int fact(int t){
        if(t==1){
            return 1;
        }
        return t*fact(t-1);
    }
}
