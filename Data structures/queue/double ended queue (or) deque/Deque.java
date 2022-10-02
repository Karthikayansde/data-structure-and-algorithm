class Deque {
// methods in Deque  
// isFull
// isEmpty
// insertfront
// insertrear
// deletefront
// deleterear
// getFront
// getRear

  private int arr[];
  int front ,rear,size;
  Deque(int size){
    front = -1;rear = -1;
    this.size = size;
    arr = new int[size];
  }
  boolean isFull(){
      return rear == front-1 || front==0 && rear==size-1;
  }
  boolean isEmpty(){
    return front == -1;
  }
  void addfront(int val){
    if(isFull()){
      System.out.println("its full");
      return;
    }
    if(front == -1){
      front = 0;rear = 0;
    }
    else if(front == 0){
      front = size-1;
    }
    else{
      front--;
    }
    arr[front] = val;
  }
  void addrear(int val){
    if(isFull()){
      System.out.println("its full");
      return;
    }
    if(front == -1){
      front = 0;rear = 0;
    }
    else if(rear == size-1){
      rear = 0;
    }
    else{
      rear++;
    }
    arr[rear] = val;
  }
  void deletefront(){
    System.out.println(arr[front]);
    if(isEmpty())
    {
      System.out.println("its empty");
      return;
    }
    if(front == rear){
      front = -1;
      rear = -1;
      return;
    }
    else if(front == size-1){
      front = 0;
      return;
    }
    else{
      front++;
    }
  }
  void deleterear(){
    System.out.println(arr[rear]);
    if(isEmpty()){
      System.out.println("its empty");
      return;
    }
    if(front == rear){
      front = -1;rear = -1;
    }
    else if(rear == 0){
      rear = size-1;
    }
    else{
      rear--;
    }
  }
  int getFront(){
    if(isEmpty()){
      System.out.println("its empty");
      return -1;
    }
    return arr[front];
  }
  int getRear(){
    if(isEmpty()){
      System.out.println("its empty");
      return -1;
    }
    return arr[rear];
  }
}