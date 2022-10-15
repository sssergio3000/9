public class UserArray {
    //add size +1 el
    static int[] arrAddOne(int[] array) {
        int[] resArr = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            resArr[i] = array[i];


        }
        return resArr;
    }//arrAddOne

    //insert zero el
    static int[] insZero(int[] array, int num) {
        int[] resArr = new int[array.length + 1];
        resArr[0] = num;
        for (int i = 1; i < resArr.length; i++) {
            resArr[i] = array[i - 1];


        }
        return resArr;
    }//insZero


    public static void main(String[] args) {

        //creating new random array
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int[] arrAddOneRes = arrAddOne(arr);
        for (int i = 0; i < arrAddOneRes.length; i++) {
            System.out.println(arrAddOneRes[i]);
        }
        System.out.println();

        int[] insZeroRes = insZero(arr, 666);
        for (int i = 0; i < insZeroRes.length; i++) {
            System.out.println(insZeroRes[i]);
        }


    }//main
}//class
