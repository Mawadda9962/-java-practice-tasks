public class Task6 {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));


    }
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 5 || candy >= 5) {
            return 1;
        } else if (tea >= 2 * candy || candy >= 2 * tea){
            return 2;

        }else{

            return 1;
        }
    }
}

