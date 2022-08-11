public class Main {
    public static void main(String[] args) {
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        float[] f = new float[]{1.57f, 7.654f, 9.986f};
        {String[] s = {"qwe", "rty", "yui"};
        for(int a = 0; a <= i.length - 1;a++) {
            System.out.print(i[a]);
            if (a != i.length - 1) {System.out.print(", ");}
            System.out.println();}
        for (int a = 0; a <= f.length - 1; a++) {
            System.out.print(f[a]);
                if (a != i.length - 1) {System.out.print(", ");}
                System.out.println();}
        for (int a = 0; a <= s.length - 1; a++) {
                    System.out.print(s[a]);
                    if (a != i.length - 1) {System.out.print(", ");}
                }
            }
        }}