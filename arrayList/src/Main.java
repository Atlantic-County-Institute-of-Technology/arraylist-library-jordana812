public class Main {
    public static void main(String[] args) {

        private static int iterativeSearch(int[] intArray, int low, int high, int target){
            int midpoint;
            while (low <= high) {
                midpoint = (high + low) / 2;

                if (intArray[midpoint] < target) {
                    low = midpoint + 1;
                }
                else if (intArray[midpoint] > target) {
                    high = midpoint - 1;
                }
                else{
                    return midpoint;
                }
            }

        }

        private static int binarySearch(int[] intArray, int  int target){

        }
    }
}