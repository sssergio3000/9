public class ReversedArray {

    static int[] myReverse(int[] array) {
        int[] revArr = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            revArr[j] = array[i];
            j++;

        }
        return revArr;
    }//myReverse

    static int[] subArray(int[] array, int index, int count) {
        int[] subArr = new int[count];
        int j = 0;
        for (int i = index; i < index + count; i++) {

            if (i < array.length) {
                subArr[j] = array[i];
            } else {
                subArr[j] = 1;
            }
            j++;
        }
        return subArr;
    }//subArray

    public static void main(String[] args) {

        //creating new random array
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
        // printing arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        System.out.println();

        //printing reverse arr
        int[] revArrRes = myReverse(arr);
        for (int i = 0; i < revArrRes.length; i++) {
            System.out.println(revArrRes[i]);
        }
        System.out.println();

        //printing subArr
        int[] subArrRes = subArray(arr, 1, 10);
        for (int i = 0; i < subArrRes.length; i++) {
            System.out.println(subArrRes[i]);

        }


    }//main
}//class
