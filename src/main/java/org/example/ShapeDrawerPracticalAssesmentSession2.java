package org.example;
import java.util.Scanner;

public class ShapeDrawerPracticalAssesmentSession2 {

    public static void main(String[] args) {
       // infinite loop
        while(true){
            menu();
        }
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in); //masukkin user input

        System.out.println("Welcome to Shape Drawer!");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");

        System.out.print("Please select a shape (1/2/3/4): ");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.print("Enter the size of the triangle: ");
                int triangleSize = scanner.nextInt();
                drawTriangle(triangleSize);
                break;
            case 2:
                System.out.print("Enter the size of the square: ");
                int squareSize = scanner.nextInt();
                drawSquare(squareSize);
                break;
            case 3:
                System.out.print("Enter the width of the rectangle: ");
                int rectangleWidth = scanner.nextInt();
                System.out.print("Enter the height of the rectangle: ");
                int rectangleHeight = scanner.nextInt();
                drawRectangle(rectangleWidth, rectangleHeight);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }
        //scanner.close();
    }
    public static void drawTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
