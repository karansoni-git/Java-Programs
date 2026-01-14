package DSA;

public class Patterns {
    public static void main(String[] args) {

        System.out.println("Pattern 1");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nPattern 3");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 4");
        for (int i = 1; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 5");
        for (int i = 1; i <= 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\nPattern 6");
        int n1 = 6;
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i > 2 && j > 1) && (j > 1 && j < i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        int m = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                if ((i < 4 && j < 5) && (j > 1 && j > i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("\nPattern 7");
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 8");
        for (int i = 6; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 9");
        int n2 = 6;
        for (int i = 1; i <= n2; i++) {
            for (int j = 1; j <= n2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            if (i > 1) {
                for (int k = 2; k <= i; k++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }

        System.out.println("\nPattern 10");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 11");
        int n3 = 6;
        for (int i = 1; i <= n3; i++) {
            for (int j = 1; j <= n3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n3 - 1; i >= 1; i--) {
            for (int j = 1; j <= n3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i * 2; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPattern 12");
        int n4 = 4;
        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n4 - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 13");
        int n5 = 5;
        for (int i = 1; i <= n5; i++) {
            for (int j = 1; j <= n5 - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i > 2 && j > 1) && (j > 1 && j < i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= 11; i++) {
            System.out.print("*");
        }

        System.out.println("\n\nPattern 14");
        int n6 = 6;
        for (int i = 1; i <= n6; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 6; i > 1; i--) {
            for (int j = i - 2; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i - 1; j <= n6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
