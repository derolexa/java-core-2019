public class task4_Which_quarter {
    public static void main(String[] args) {
        int x = 11;
        int y = -2;
        if ((x==0)|(y==0)|(x>100)|(y>100)) {
            System.out.println("0");
        } else if (x > 0) {
                if (y > 0) {
                    System.out.println("Quarter 1");
                } else System.out.println("Quarter 2");
            } else if (y > 0) {
            System.out.println("Quarter 4");
            } else if (y < 0){
            System.out.println("Quarter 3");
        }
    }
}


