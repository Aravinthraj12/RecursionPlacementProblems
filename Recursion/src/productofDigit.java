public class productofDigit {
    public static void main(String[] args) {
        int ans= Prod(223);
        System.out.println(ans);
    }
    static int Prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*Prod(n/10);
    }
}
