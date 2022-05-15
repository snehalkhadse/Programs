public class RevNo {
    public static void main(String[] args) {

       int n=12345;
       int rev;
        while(n>0)
        {
            rev=n%10;
            System.out.print(rev);
            n=n/10;
        }
    }

}
