import java.util.Random;
import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] arr = new int[5];
    int b = (int)(Math.random()*1000);
    Random rng = new Random(b);
    for(int i =  0; i < 5; i++ ){
      arr[i] = (rng.nextInt() % 1000);
    }
    Sorts a = new Sorts();
    System.out.println("For seed = " + b + ", Before: " + Arrays.toString(arr));
    a.bubbleSort(arr);
    System.out.println("Result: " +  Arrays.toString(arr));
  }
}
