public class task4_Compact_discs {
    public static void main(String[] args) {
        int n = 120;
        double A = (n/100);
        System.out.println("A="+A);
        double B = ((n%100)/20);
        System.out.println("B=" + B);
        double C = ((n%100)%20);
        System.out.println("C="+C);
        double Price = (A*100 + B*30 + C*2);
        System.out.println("Price="+ Price);
    }
}
