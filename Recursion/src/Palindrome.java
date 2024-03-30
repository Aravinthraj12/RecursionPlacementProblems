public class Palindrome {
    public static void main(String[] args) {
        rev(2112);
        System.out.println(sum);

    }

    static int sum=0;
    static void rev(int n) {
        if (n == 0) {
            return;
        }
        int rever = n % 10;
        sum = sum * 10 + rever;
        rev(n / 10);
    }
}
