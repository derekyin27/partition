import java.util.Random;
public class partition{
  public static int partition(int[] data, int start, int end){
    if (start<0 || start>= data.length || end < 0 || end >= data.length){
      throw new IndexOutOfBoundsException();
    }

int random = (int)(Math.random() * (end - start) + start);
int pivot = data[random];
System.out.println(pivot);
while (start <end){
  while (data[start] < pivot){
    start++;
  }
  while (data[end] > pivot){
    end--;
  }
  if (start < end){
    int temp = data[start];
    data[start] = data[end];
    data[end] = temp;
  }
}
return end;
  }
  public static void main(String[] args) {
    int[] data = new int[] {23, 14, 1, 0, 99};
    System.out.println(partition(data, 0, 4));
  }
}
