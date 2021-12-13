//программа удаляет элементы массива, равные введенному пользователем числу
import java.util.Arrays;
import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter X: ");
        int X = in.nextInt();
        in.close();
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                counter += 1;
            }
        }
        int k = 0;
        int[] newArr = new int[arr.length - counter]; //creating a list of the needed length (considering counter)
        for (int j = 0; j < arr.length; j++) { //iterating over the elements of the original array
            if ((arr[j] != X) & k < newArr.length) {
                newArr[k] = arr[j];
                k += 1; //incrementing indices of the elements in the new array
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
