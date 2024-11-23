package HomeWork;

import java.util.Arrays;

import static HomeWork.Methods.cornerValuesArray;

public class ClassWork {
    public static void main(String[] Args) {

        int[] nums2 = new int[]{4, 2, 42, 5, 4, 3, 1, 7};
        System.out.println("Исходный массив" + Arrays.toString(nums2));
        changeArray(nums2);
        System.out.println("После изменения массив" + Arrays.toString(nums2));
        changeCopyArray(nums2);
        System.out.println("После изменения копии" + Arrays.toString(nums2));

    }

    static void changeArray(int[] nums2) {
        Arrays.sort(nums2);
    }

    static void changeCopyArray(int[] nums2) {
        int[] numsCopy = Arrays.copyOf(nums2, nums2.length);
        Arrays.fill(numsCopy, 0);
        System.out.println(Arrays.toString(numsCopy));
    }
}
