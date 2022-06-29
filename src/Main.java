import java.sql.Timestamp;
import java.util.*;

public class Main {
    public static void quickSort(int[] array,int start, int end){
        int temp = array[end];
        int upPtr = start;
        for (int i = start; i < end; i++) {
            if(array[i] < temp){
                int temp1 = array[i];
                array[i] = array[upPtr];
                array[upPtr] = temp1;
                upPtr++;
            }
        }
        int temp1 = array[upPtr];
        array[upPtr] = temp;
        array[end]  =temp1;
        if (upPtr > start){
            quickSort(array,start,upPtr -1);
        }
        if(upPtr < end) {
            quickSort(array, upPtr + 1, end);
        }
    }

    public static void main(String[] args) {

        //int[] a = new int[]{9,8,7,6,11,5,4,3,2,1};

        int[] a1 = new int[1000000];
        Random rnd = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = rnd.nextInt(100000000);
        }
        int[] a2 = a1.clone();

        System.out.println(Calendar.getInstance().getTimeInMillis());
        Arrays.sort(a2);
        System.out.println(Calendar.getInstance().getTimeInMillis());
        quickSort(a1,0,a1.length - 1);
        System.out.println(Calendar.getInstance().getTimeInMillis());

        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                System.out.println("false " + i);
                break;
            }
        }

        //System.out.println(Arrays.toString(a));

    }
}
