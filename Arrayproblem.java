//Write a Java program to reverse an array
public class Arrayproblem {
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap arr[i] and arr[l - 1 - i]
            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }

        // Print reversed array
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}


//Write a Java program to find whether an array is sorted or not.
public class CheckSortedArray {
    public static void main(String[] args) {
        boolean isSorted = true;
        int[] arr = {1, 12, 3, 4, 5, 34, 67};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }
    }
}


//Create a Java program to add two matrices of size 2x3.
public class AddMatrices {
    public static void main(String[] args) {
        int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] mat2 = {
            {2, 6, 13},
            {3, 7, 1}
        };
        int[][] result = new int[2][3];

        // Adding corresponding elements of mat1 and mat2
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of the resulting matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
