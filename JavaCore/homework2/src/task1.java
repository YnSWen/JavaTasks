// Написать метод, возвращающий количество чётных элементов массива.
//countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

public class task1 {
    public static void main(String[] args) throws Exception{
        int arr[] = {2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 | arr[i] == 0){
                count++;
            }

        }
        return count;

    }
}
