public class Coutnthesteps {
    public static void main(String[] args) {
        System.out.println(sub(14));
    }

    static int sub(int n){
        return help(n,0);
    }
    static int help(int n,int step){
        if(n==0){
            return step;
        }
        if (n % 2 == 0) {

            return help(n/2,step+1);
        }
        else{
            return help(n-1,step+1);
        }
    }
}
