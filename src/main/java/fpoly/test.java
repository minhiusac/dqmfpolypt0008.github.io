package fpoly;

import java.util.Scanner;

public class test {
	public static void soNT(int n) {
        boolean co = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                co = false;
                break;
            }
        }
        if (n != 1 && co) {
            System.out.println(n + " là số nguyên tố.");
        } else {
            System.out.println(n + " không phải là số nguyên tố.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int n = scanner.nextInt();
        soNT(n);
        scanner.close();
    }
}
