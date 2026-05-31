public class GeometricTriplet {

    public static void findGeometricTriplets(int[] arr) {
        int n = arr.length;
        boolean found = false;

        System.out.println("Checking array: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[j] * arr[j] == arr[i] * arr[k]) {
                        System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        found = true;
                    }

                }
            }
        }

        if (!found) {
            System.out.println("No geometric triplet found.");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16};
        findGeometricTriplets(arr1);
       
        System.out.println();

        int[] arr3 = {1, 2, 3, 4};
        findGeometricTriplets(arr3);


    }
}