import java.util.Arrays;

public class ArraySorting
{
    public static void main(String[] args) {
        int arry [] = {2,3,4,5,8,6,1,0};

        System.out.println("before sorting");
        System.out.println(Arrays.toString(arry));

        System.out.println("Array after sorting");
        Arrays.sort(arry);

        System.out.println(Arrays.toString(arry));
    }
}
