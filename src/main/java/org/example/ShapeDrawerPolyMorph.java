package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;

//Define s shape interface
interface Shape{ // One of implementation of Polymorphism
    void draw(int height, int side);
}
class drawTriangleSS implements Shape {
    @Override
    public void draw(int height, int Shape) {
        //Nested loop
        //outer loop (Rownya)
        for (int i = 1; i <= height; i++) {
            //inner loop (coulumnya)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static class drawTriangleSK implements Shape {
        @Override
        public void draw(int height2, int side) {
            for (int i = 1; i <= height2; i++) {
                // Print spaces to center the triangle
                for (int j = height2 - i; j > 0; j--) {
                    System.out.print(" ");
                }
                // Print stars for the triangle
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }

    public static class ShapeDrawerPolyMorph {
        Scanner scanner = new Scanner(System.in); //masukkin user input

        public void displayMenu() {
            System.out.println("Selamat datang di ASCII draw!");
            System.out.println("Pilih bentuk yg mau digambar");
            System.out.println("1. Segitiga Siku-Siku");
            System.out.println("2. Segitiga sama kaki");
            System.out.println("3. Exit\n");
        }

        public void drawShape(int choice) {
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Masukkan panjang segitiga siku-suku: ");
                        int height = scanner.nextInt();
                        new drawTriangleSS().draw(height, 1); //Fungsi untuk menggambar Segitiganya
                        break;
                    case 2:
                        System.out.println("Masukkan panjang segitiga sama kaki: ");
                        int height2 = scanner.nextInt();
                        new drawTriangleSK().draw(height2, 1); //Fungsi untuk menggambar Segitiganya
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid integer");
                scanner.next();
            }
        }

        public void run() {
            //Loop untuk terus menampilkan menu
            while (true) {
                displayMenu();
                System.out.println("Masukkan pilihan anda: ");
                try {
                    int choice = scanner.nextInt(); // Input yang jenisnya integer
                    drawShape(choice);
                    System.out.println();
                } catch (InputMismatchException ime) {
                    System.out.println("Please enter a valid integer.");
                    scanner.next(); // to consume the invalid token
                }
            }
        }
    }

    public static void main(String[] args) {
        //display menu/runner
        ShapeDrawerPolyMorph drawer = new ShapeDrawerPolyMorph();
        drawer.run();

    }
}


