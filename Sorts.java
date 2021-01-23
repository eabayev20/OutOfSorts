public class Sorts{
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
public static void selectionSort(int[] data) {
   for(int i = 0; i < data.length -1; i++){
     int s = i;

     for(int j = i + 1; j < data.length; j ++){
       if( data[j] < data[s]) {
         s= j;
       }
     }

     int temp = data[s];
     data[s] = data[i];
     data[i] = temp;
   }
  }
public static void insertionSort(int[] data){
   for(int i = 1; i < data.length; i ++){
     int ii = i;
     while(ii > 0 && data[ii-1]>data[ii]){
       int iii = data[ii];
       data[ii]=data[ii-1];
       data[ii-1] = iii;
       ii -=1;
     }
   }
 }

}
