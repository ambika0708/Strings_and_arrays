import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        largestEven();
        //smallestOdd();
        //reverse();
        // freqOfArrays();
        //deleteValue();
        //insertValue();
        //isFind();
        int[] a = {10, 20, 30, 40, 50};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Array a : " + a[i]);
        }
        int[] b = new int[5];
        b[0] = 5;
        b[1] = 10;
        System.out.println("Array b : " + Arrays.toString(b));

        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of array inputs you want : ");
        int n = in.nextInt();
        int c[] = new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        for (int i = 0; i < c.length; ++i) {
            System.out.println("Array C : " + c[i]);
        }*/
        int[] d = {100, 90, 80, 70, 60};
        Arrays.sort(d);
        for (int element : d) {
            System.out.print(element + " ");
        }
    }

    public static void isFind() {
        //Find MAX Value in an Array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n size ");
        int n = in.nextInt();
        System.out.println("Enter array inputs ");
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum Number: " + max);
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum Number: " + min);
    }

    public static void insertValue() {
        int a[] = new int[]{10, 20, 4, 55, 67};
        int index = 3;
        int value = 100;
        for (int i = a.length - 1; i >= index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = value;
        System.out.println(Arrays.toString(a));
    }

    public static void deleteValue() {
        int a[] = {22, 44, 55, 66, 2, 67, 98, 9};
        System.out.println("Arrays are " + Arrays.toString(a));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element you want to delete");
        int delete = in.nextInt();
        int count = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == delete) {
                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        }

        System.out.println(Arrays.toString(a));

    }

    public static void freqOfArrays() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n array size ");
        int n = in.nextInt();
        System.out.println("enter array inputs");
        int a[] = new int[n];
        for (int i = 0; i < a.length; ++i) {
            a[i] = in.nextInt();
        }
        int count;
        int[] freq = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
        int countOfDups = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                countOfDups++;
            }
        }
        System.out.println("COUNTING DUPLICATE NUMBERS ");
        System.out.println(countOfDups);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != -1) {
                System.out.println(a[i] + " appeared " + freq[i] + " times");
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Duplicate Elements are ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println(a[i]);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Unique Elements are ");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println(a[i]);
            }
        }
    }

    public static void reverse() {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[i] = a[i];
        }

        System.out.println("b value :" + Arrays.toString(b));
        for (int i = a.length - 1; i >= 0; --i) {
            System.out.println(a[i]);
        }
        for (int i = 0, j = a.length - 1; i <= j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void smallestOdd() {
        int a[] = new int[]{10, 36, 21, 79, 96, 6};
        int min = 100000, flag = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                if (a[i] < min) {
                    min = a[i];
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("No odd element is present ");
        } else
            System.out.println("SMALLEST ODD NUMBER IS : " + min);
    }

    public static void largestEven() {
        int max = 0, flag = 0;
        int a[] = {1, 2, 4000, 56, 32};
        for (int i = 0; i < a.length; ++i) {
            if (a[i] % 2 == 0) {
                if (a[i] > max) {
                    max = a[i];
                    flag = 1;
                }
            }
        }
        if (flag == 0) {
            System.out.println("No Even element is present");
        } else {
            System.out.println("Largest even number is " + max);
        }
    }
}
