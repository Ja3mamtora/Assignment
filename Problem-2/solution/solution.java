import java.util.Arrays;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] dsz = new int[n];
        int[] asz = new int[m];

        for (int i = 0; i < n; i++)
            dsz[i] = scanner.nextInt();
        for (int i = 0; i < m; i++)
            asz[i] = scanner.nextInt();

        Arrays.sort(dsz);
        Arrays.sort(asz);

        int count = 0;
        int i = 0, j = 0;
        while (j < n && i < m) {
            if (Math.abs(dsz[j] - asz[i]) <= k) {
                count++;
                i++;
                j++;
            } else if (dsz[j] - asz[i] < k) {
                j++;
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}
