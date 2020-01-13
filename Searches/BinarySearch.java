public class BinarySearch
{

  //return position of value in array
  public static int BS(int value, int[] arr){
    int minPos= 0;
    int maxPos = arr.length-1;

    while (minPos < maxPos){
      int min = arr[minPos];
      int max = arr[maxPos];
      int midPos = (min+max)/2;
      int mid = arr[midPos];

      if (value < mid){
        maxPos = midPos-1;
      }
      else if (value > mid){
        minPos = midPos + 1;
      }
      else
        return midPos;
    }
    return -1;
  }


  public static void main(String[] args)
  {
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(BS(2, array));
    System.out.println(BS(9, array));
  }

}
