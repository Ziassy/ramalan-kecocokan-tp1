import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner ramalam = new Scanner(System.in);
        DecimalFormat convertDecimal = new DecimalFormat("#0.00");
        // Math.floor(Math.random() * (max - min) + min)
        Double number = Math.floor(Math.random() * (100 - 50) + 50);
        Double generateNumber = number / 1.1;

        String name, partner_name;
        Integer age, partner_age;

        try {
            System.out.println("Selamat Datang Di Program Ramalan Cupu\n+++++++++++++++++++++++++++++++++++ \n \n");
            System.out.println("Data Anda : ");
            printLove(12);
            System.out.print("Masukan Nama Anda: ");
            name = ramalam.nextLine();
            System.out.print("Masukan Umur Anda: ");
            age = ramalam.nextInt();
            System.out.println("\n");
            System.out.println("Data Pasangan Anda : ");
            printLove(20);
            System.out.print("Masukan Nama Pasangan Anda: ");
            partner_name = ramalam.next();
            System.out.print("Masukan Umur Pasangan Anda: ");
            partner_age = ramalam.nextInt();

            System.out.println("\n \n" + name + " [" + age + "] tahun \n");
            printHeart();
            System.out.println("\n");
            System.out.println(partner_name + " [" + partner_age + "] tahun\n");

            System.out.println("Tekan ENTER untuk melihat hasil ramalan.... \n");
            try {
                System.in.read();
                System.out.println("Kecocokan anda dengan pasangan anda adalah : "
                        + convertDecimal.format(generateNumber) + " %"
                        + "\n \nTerimakasih karena anda telah menggunakan jasa Ramalam kami..");
            } catch (Exception e) {
                System.out.println(e);
            }

        } finally {
            ramalam.close();
        }
    }

    static void printHeart() {
        char symbol = '\u2665';

        // Looping firstline love
        for (int i = 1; i <= 1; i++) {
            // Add space
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3 * i; j++) {
                System.out.print(symbol);
            }
            // for space between
            for (int k = 1; k <= 4; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 3 * i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        // Looping secondLine love
        for (int i = 1; i <= 1; i++) {
            // Add space left
            for (int k = 1; k <= 2 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(symbol);
            }
            // add space center
            for (int k = 1; k <= 2; k++) {
                System.out.print(",");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        // Print line 3 & 4
        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (7 - i + 2) - 2; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        for (int i = 1; i <= 1; i++) {
            for (int k = 1; k <= 4 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 8; j++) {
                System.out.print(symbol);
            }
        }
        System.out.println();

        for (int i = 1; i <= 2; i++) {
            for (int k = 1; k <= i + 4; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (2 - i + 2) - 2; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    static void printLove(Integer length) {
        char symbol = '\u2665';
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

}
