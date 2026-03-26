package Love;

import java.util.Scanner;

    public class love {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Ask the user for input
            System.out.print("what you want: ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("Love.love")) {
                int size = 10;

                // Upper part of the heart
                for (int i = size / 2; i <= size; i += 2) {
                    for (int j = 1; j < size - i; j += 2) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(".");
                    }
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }

                // Lower part of the heart
                for (int i = size; i >= 1; i--) {
                    for (int j = 0; j < size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("No more heart left my Love.love try next time.");
            }

            sc.close();
        }
    }

