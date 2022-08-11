public class Task4 {
    public static void main(String[] args) {
        int[] i = new int[]{1, 2, 3};
        for (int a = 0; a <= i.length - 1; a++) {
            if (i[a] % 2 != 0) {
                i[a] += 1;
            }
        }
        for (int n = 0; n <= i.length - 1; n++) {
            System.out.print(i[n] + " ");
        }
    }
}
