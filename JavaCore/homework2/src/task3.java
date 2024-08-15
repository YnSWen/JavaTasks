//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
//с нулевым значением.

public class task3 {
    public static void main (String[] args) throws Exception{
        int arr[] = {1, 3, 32, 0, 12, 2, 0, 21, 0};
        System.out.println(numBoundedZeros(arr));

    }

    public static boolean numBoundedZeros(int[] arr){
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i-1] == 0 && arr[i+1] == 0){
                flag = true;
            }


        }
        return flag;
    }

}
