//fuction calling itself

//print the number till 100




public class Main {
    public static void main(String[] args) {
       print(1);
    }
    static void print(int n){
        if(n==100){
            System.out.println(100); // base condition
        return;
        }


        System.out.println(n); //body

        print(n+1); // function calling
    }
}