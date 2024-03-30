public class CountZero {
    public static void main(String[] args) {
        System.out.println("The Zero present in number is "+sub(843300));
    }

static int sub(int n){
        return help(n,0);
}
static int help(int n,int c){
        if(n==0){
            return c;
        }
        int r=n%10;
        if(r==0){
            return help(n/10,c+1);
        }
        else{
            return help(n/10,c+0);
        }
}
}
