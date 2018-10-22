import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random(1000000);
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt();
        }
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.start();
        selectionSort(arr);
        long endTime = stopWatch.end();
        System.out.println(stopWatch.getElapsedTime(startTime, endTime));
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

}
