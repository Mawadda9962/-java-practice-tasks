public class Task11 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));


    }
    public static int  dateFashion(int you, int data) {

        if (you <= 2 || data <= 2) {
            return 0;
        } else if (you >= 8 || data >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

}


