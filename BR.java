public class BR {
    public static void main(String[] args) {
        int y=20;
        int x=3;
        int total= multiNumbers(y, x);
        System.out.println("the total is"+total);

    }
    public static int multiNumbers(int y,int x){
        int sum=x*y;
        return sum;
    }
}
