public class Patterns {

        public static void increasedTri(int n) {

            for(int row = 1; row <= n; row++) {
                for(int column = 1; column <= row; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public void decreasedTri(int n) {

            for(int row = 1; row <= n; row++) {
                for(int column = row; column <= n; column++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void pyramid(int n) {

            for(int i = 1; i <= n; i++) {
                for (int j =i; j <= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void invertedPy(int n) {

            for(int i = n; i > 0; i--) {
                for(int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void rightTri(int n) {

            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= 2*(n - i); j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void leftTri(int n) {

            for(int i = n; i > 0; i--) {
                for(int j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for(int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        
public class test{
    public static void main(String[] args) {
    System.out.println(Patterns.invertedPy(5));
    }
}
    }

