import java.util.ArrayList;

public class lbratry {
    Arraylist<String> lbratry = new Arraylist<String>();
}

        private static int iterativeSearch(int[] intArray, int low, int high, int target) {
            int midpoint;
            while (low<=high){
                midpoint = (high + low) /2;
            }
            if(intArray[midpoint] < target){
                low = midpoint + 1;
            }
            else if(intArray[midpoint] < target){
                low = midpoint - 1;
            }
            else
                return midpoint;

        }
            return -1;