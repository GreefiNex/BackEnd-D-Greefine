import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        int alas = input.nextInt();

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas segitiga adalah: " + luas);

        input.close();
    }
}
