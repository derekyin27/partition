import java.util.Random;
public class partition{
  public int partition(int[] data; int start; int end){
    if (start<0 || start>= data.length || end < 0 || end >= data.length){
      throw new IndexOutofBoundsException();
    }

int random = (int)(Math.random() * (end - start) + start);
int pivot = data[random];
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
}
