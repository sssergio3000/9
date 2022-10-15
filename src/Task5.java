public class Task5 {
    public static void main(String[] args) {
        //first 3x3 array creation
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (int) (Math.random() * 100);

            }

        }
        //second 3x3 array creation
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = (int) (Math.random() * 100);

            }

        }
        //printing first
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
                ;

            }
            System.out.println();

        }
        System.out.println();
        //printing second
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
                ;

            }
            System.out.println();

        }

        //third 3x3 array creation
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];

            }

        }
        System.out.println();

        //printing third
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
                ;

            }
            System.out.println();

        }

    }//main
}//class
