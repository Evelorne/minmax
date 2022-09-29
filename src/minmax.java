import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        int n, a, b;
        int c = 0;
        int z=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? : ");
        n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            Scanner x = new Scanner(System.in);
            System.out.print("number " + i + ": ");
            a = x.nextInt();
            b = a;
            if (b > c) {
                c = b;
            }

            if (z > b) {
                z = b  ;
            }
        }
        System.out.println("Min : " + z);
        System.out.println("Max : " + c);
    }
}

