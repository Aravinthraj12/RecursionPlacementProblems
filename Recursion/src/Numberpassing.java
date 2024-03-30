public class Numberpassing {
    public static void main(String[] args) {
        pass(5);
    }
    static void pass(int n){
        if(n<0){
            return;
        }
        pass(--n);
        System.out.println(n);
    }
}
