public class patterns_corrected {

    public static String increasedTri(int n) {
        StringBuilder result = new StringBuilder();

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                result.append("* ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String decreasedTri(int n) {
        StringBuilder result = new StringBuilder();

        for (int row = 1; row <= n; row++) {
            for (int column = row; column <= n; column++) {
                result.append("  "); // Two spaces instead of "* "
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String pyramid(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                result.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                result.append("* ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String invertedPy(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                result.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                result.append("* ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String rightTri(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                result.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                result.append("* ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static String leftTri(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            for (int j = i; j < n; j++) {
                result.append("  ");
            }
            for (int j = 1; j <= i; j++) {
                result.append("* ");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertedPy(5));
    }
}
