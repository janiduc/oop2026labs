package Lab01;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];
        for (int i=0; i<C.length; i++){
            C[i] = A[i] + B[i];
        }
        /*System.out.print("Array C: [");
        for (int i=0; i<C.length-1; i++){
            System.out.print(C[i] + ",");
        }
        System.out.print(C[C.length-1]);
        System.out.print("]");*/
        System.out.print("Array C: ");
        System.out.print(Arrays.toString(C));
    }
}
