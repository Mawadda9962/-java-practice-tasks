public class Task3 {
        public static void main(String[] args) {
            System.out.println(love6(6, 6));


        }
        public static boolean love6(int a, int b) {
            if (a == 6 || b == 6) {
               return true;
            } else if ( a + b == 6) {
                return true;
            } else if (Math.abs(a - b) == 6){
                return true;

            }else{

                return false;
        }
    }
}
