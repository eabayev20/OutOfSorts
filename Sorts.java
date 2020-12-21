public class Sorts{}
public static void bubbleSort (int[] data) {
  for (int i = 0; i<data.length; i++ ) {
         for (int j = 0; j<data.length-1-i; j++) {
             if (data[j]>data[j+1]) {
                 int x = data[j];
                 data[j] = data[j+1];
                 data[j+1] = x;
               }
           }
       }
}
public static void selectionSort(int[] data){

  for (int i = 0; i != data.length; i++) {
    for (int j = 0; j != data.length-1; j++) {
    int temp = 0;
    int temp2 = arr[i];
    int tempdex = i;
    if (arr[i] > arr[j+1]) {
      temp = arr[j+1];
      tempdex = j+1;

    }
    }
    arr[i] = temp;
    arr[tempdex] = temp2
  }

}
}
