public class SumofDigit {
    public static void main(String[] args) {
        int an=Sum(142);
        System.out.println(an);
    }
    static int Sum(int n){
        if(n==1){
            return 1;
        }
        return (n%10)+Sum(n/10);
    }
}
