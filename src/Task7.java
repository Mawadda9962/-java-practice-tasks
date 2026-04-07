public class Task7 {
    public static void main(String[] args) {
        System.out.println(twoAsOne(1, 2, 3));


    }
    public static boolean twoAsOne(int a, int b, int c) {
        if ((a +b == c) || (a + c == b) || (b + c == a) ) {
            return true;
        }else{
            return false;
        }
    }
}


