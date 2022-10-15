public class Task6 {
    //3x3 array creation
    static int[][] arrCreation() {
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr1;
    }

    //array addition
    static int[][] arrAddition(int[][] arr, int[][] arr1) {
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];

            }

        }
        return arr2;
    }

    public static void main(String[] args) {
        int[][] myFirstArr = arrCreation();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myFirstArr[i][j] + " ");
                ;

            }
            System.out.println();

        }
        System.out.println();

        int[][] mySecondArr = arrCreation();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mySecondArr[i][j] + " ");
                ;

            }
            System.out.println();

        }
        System.out.println();

        int[][] myAdditionArray = arrAddition(myFirstArr, mySecondArr);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myAdditionArray[i][j] + " ");
                ;

            }
            System.out.println();

        }


    }
}
