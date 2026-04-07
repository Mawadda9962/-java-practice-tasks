public class Task5 {
    public static void main(String[] args) {
        System.out.println(nearTen(20));


    }
    public static boolean nearTen(int n) {
       int remainder = n % 10;
       return (remainder <= 2 || remainder >= 8);
    }
}



