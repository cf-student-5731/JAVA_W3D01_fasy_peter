public class DebugDemo5 {

  public static void main(String[] args) {

      int[] a = {10,16,20,6,1,3,5,25,31,34,7,8,22};
      int[] sorted = sort(a);
      for(int element : sorted) {
          System.out.print(element + " ");
      }


  }

  public static int[] sort(int[] array) {
      int temp = 0;
      for(int i = 0; i < array.length; i++) {
          for(int j = 0; j < array.length-1; j++) {
              if(array[j] > array[i]) {
                  temp = array[j];
                  array[j] =  array[i];
                  array[i] = temp;
              }

          }
      }
      return array;
  }
}