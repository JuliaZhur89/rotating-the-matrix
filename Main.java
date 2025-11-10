import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] colors = new int[SIZE][SIZE];
        int[][] rotatedColors = new int[SIZE][SIZE];
        int[][] doubleRotatedColors = new int[SIZE][SIZE];
        int[][] tripleRotatedColors = new int[SIZE][SIZE];


        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        findRotatedColours(colors, rotatedColors);
        findDoubleRotatedColours(rotatedColors, doubleRotatedColors);
        findTripleRotatedColours(doubleRotatedColors, tripleRotatedColors);

        Scanner scanner = new Scanner(System.in);
        printColours(colors);

        System.out.println("Введите угол поворота: 90, 180 или 270");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            int operation = Integer.parseInt(input);
            switch (operation) {
                case 90:
                    printRotatedColours(rotatedColors);
                    break;
                case 180:
                    printDoubleRotatedColours(doubleRotatedColors);
                    break;
                case 270:
                    printTripleRotatedColours(tripleRotatedColors);
            }

        }
    }

    public static void printColours(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }

    }

    public static void findRotatedColours(int[][] colors, int[][] rotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                rotatedColors[j][SIZE - i - 1] = colors[i][j];

            }
        }
    }

    public static void printRotatedColours(int[][] rotatedColors) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", rotatedColors[i][j]);
            }
            System.out.println();
        }
    }

    public static void findDoubleRotatedColours(int[][] rotatedColors, int[][] doubleRotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                doubleRotatedColors[j][SIZE - i - 1] = rotatedColors[i][j];

            }
        }
    }

    public static void printDoubleRotatedColours(int[][] doubleRotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", doubleRotatedColors[i][j]);
            }
            System.out.println();
        }

    }

    public static void findTripleRotatedColours(int[][] doubleRotatedColors, int[][] tripleRotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tripleRotatedColors[j][SIZE - i - 1] = doubleRotatedColors[i][j];

            }
        }
    }

    public static void printTripleRotatedColours(int[][] tripleRotatedColors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", tripleRotatedColors[i][j]);
            }
            System.out.println();
        }

    }
}