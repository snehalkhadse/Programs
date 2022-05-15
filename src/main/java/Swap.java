public class Swap {
    public static void main(String[] args) {
        int x=10;
        int y=20,temp;
        System.out.println("before swap");
        System.out.println("x="+x);
        System.out.println("y="+y);

        temp=x;
        x=y;
        y=temp;
        System.out.println("after swap");
        System.out.println("x="+x);
        System.out.println("y="+y);


    }
}
