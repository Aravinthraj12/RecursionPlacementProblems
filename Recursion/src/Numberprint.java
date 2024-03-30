public class Numberprint {

    public static void main(String[] args) {

        five(5);
        System.out.println("reverse of the that \n");
        fiveRev(5);
    }
    static void five(int n){
        if(n==1){
            System.out.println(1+"\n");
            return;
        }
        System.out.print(n+",");
        five(n-1);
    }
    static void fiveRev(int t){
        if(t==1){
            System.out.print(1+",");
            return;
        }
        fiveRev(t-1);
        System.out.print(t+",");
    }
}