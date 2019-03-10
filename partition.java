public class partition{
  public int partition(int[] data; int start; int end){
    if (start<0 || start>= data.length || end < 0 || end >= data.length){
      throw new IndexOutofBoundsException();
    }
    int[] newData = new int[end-start+1];
    for (int i = start; i< end+1; i++){
      newData[i] = data[i];
    }
    
  }
}
