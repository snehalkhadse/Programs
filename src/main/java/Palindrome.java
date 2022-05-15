public class Palindrome {
    public static void main(String[] args) {

        int n = 3553;
        int remainder, revno = 0;
        int originalno = n;
        while (n > 0) {
            remainder = n % 10;
            revno= revno * 10 + remainder;
            n = n / 10;
        }
        if (originalno == revno) {
            System.out.println("palindrome number");
        } else {
            System.out.println(" not palindrome number");
        }




    }

}