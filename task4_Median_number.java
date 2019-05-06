public class task4_Median_number {
    public static void main(String[] args) {
        int a = 99, b = 1000, c = 3, m;
        if (a < 1000 && b < 1000 && c < 1000) {
            if (a < b) {
                if (b < c) {
                    System.out.println(b);
                } else if (a < c) {
                    System.out.println(c);
                } else {
                    System.out.println(a);
                }
            } else if (b < c) {
                System.out.println(c);
            } else {
                System.out.println(b);
            }
        } else {
            System.out.println("none");
        }
    }
}
