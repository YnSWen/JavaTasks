//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
//переданного не пустого массива.
public class task2 {

    public static void main(String[] args) throws Exception{
        int arr[] = {1, -45, 15, 1, 100, 45};
        System.out.println(maxMinDiff(arr));

    }

    public static int maxMinDiff (int[] arr){
        int minNum = 999999;
        int maxNum = -999999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
            else if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum - minNum;
    }
}
