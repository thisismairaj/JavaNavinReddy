public class MinHeap {
  private int[] HeapArray;
  private int size;
  private int maxsize;

  private static final int FRONT = 1; 

  public MinHeap(int maxsize){
    this.maxsize = maxsize;
    this.size = 0;
    HeapArray = new int[this.maxsize + 1];
    HeapArray[0] = Integer.MIN_VALUE;
  }

  private int parent(int pos){
    return pos/2;
  }
  private int leftChild(int pos){
    return (pos*2);
  }
  private int rightChild(int pos){
    return (pos*2)+1;
  }
  private boolean isLeaf(int pos){
    if(pos >= (size / 2) && pos <= size){
      return true;
    }
    return false;
  }

  private void swap(int fpos, int spos){
    int tmp;
    tmp = HeapArray[fpos];
    HeapArray[fpos] = HeapArray[spos];
    HeapArray[spos] = tmp;
  }

  private void minHeapify(int pos)  { 
    
    if (!isLeaf(pos)) { 
        if (HeapArray[pos] > HeapArray[leftChild(pos)] 
            || HeapArray[pos] > HeapArray[rightChild(pos)]) { 

            if (HeapArray[leftChild(pos)] < HeapArray[rightChild(pos)]) { 
              swap(pos, leftChild(pos)); 
              minHeapify(leftChild(pos)); 
            } 

            else { 
              swap(pos, rightChild(pos)); 
              minHeapify(rightChild(pos)); 
            } 
        } 
    } 
  } 
   
  
  public void insert(int element)  { 
    if (size >= maxsize) { 
        return; 
    } 
    HeapArray[++size] = element; 
    int current = size; 

    while (HeapArray[current] < HeapArray[parent(current)]) {  
        swap(current, parent(current)); 
        current = parent(current); 
    } 
  }

  
  public void display()  { 
      System.out.println("PARENT NODE" + "\t" + "LEFT NODE" + "\t" + "RIGHT NODE");
      for (int i = 1; i <= size / 2; i++) { 
          System.out.print(" " + HeapArray[i] + "\t\t" + HeapArray[2 * i] 
                            + "\t\t" + HeapArray[2 * i + 1]); 
          System.out.println(); 
      } 
  } 
   
  
  public void minHeap()  { 
      for (int pos = (size / 2); pos >= 1; pos--) { 
          minHeapify(pos); 
      } 
  } 
  
  
  public int remove()  { 
      int popped = HeapArray[FRONT]; 
      HeapArray[FRONT] = HeapArray[size--]; 
      minHeapify(FRONT); 
      return popped; 
  }

  public static void main(String[] arg)  { 
    //construct a min heap from given data
    System.out.println("The Min Heap is "); 
    MinHeap minHeap = new MinHeap(7); 
    minHeap.insert(12); 
    minHeap.insert(15); 
    minHeap.insert(30); 
    minHeap.insert(40); 
    minHeap.insert(50); 
    minHeap.insert(90); 
    minHeap.insert(45); 
    
    minHeap.minHeap(); 
    //display the min heap contents
    minHeap.display(); 
    //display root node of the min heap
    System.out.println("The Min val(root node):" + minHeap.remove()); 
    minHeap.display(); 
  } 
}