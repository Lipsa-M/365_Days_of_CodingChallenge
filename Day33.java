import java.util.Scanner;

class quicksort {

    public static int partirion(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high - 1;
        while (low < high) {
            while (a[i] <= pivot && i < high - 1) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                int temp = a[low];
                a[low] = a[j];
                a[j] = temp;
                return j;
            }

        }
        return j;

    }

    public static void quickso(int s[], int start, int end) {
        if (start < end) {
            int j = partirion(s, start, end);
            quickso(s, j + 1, end);
            quickso(s, start, j - 1);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("enter the array element");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        quickso(a, 0, n);
        System.out.println("sorted array");
        for (int i : a) {
            System.out.println(i);

        }

    }
}
