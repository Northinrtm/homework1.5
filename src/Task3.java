public class Task3 {
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3};
        float[] f = new float[]{1.57f, 7.654f, 9.986f};

            String[] s = {"qwe", "rty", "yui"};
            for (int a = i.length - 1; a >= 0; a--) {
                System.out.print(i[a]);
                if (a != 0) System.out.print(", ");
            }
            System.out.println();
            for (int a = f.length - 1; a >= 0; a--) {
                System.out.print(f[a]);
                if (a != 0) System.out.print(", ");
            }
            System.out.println();
            for (int a = s.length - 1; a >= 0; a--) {
                System.out.print(s[a]);
                if (a != 0) System.out.print(", ");
            }

    }}