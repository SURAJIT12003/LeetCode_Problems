class MyQueue {
    int front = 0 ;
    int rear = -1;
    int arr[] = new int [10004];
    public MyQueue() {
        
    }
    
    public void push(int x) {
        rear++;
        arr[rear] = x;
    }
    
    public int pop() {
        if(rear==-1){
            return -1;
        }
       
        int t = arr[front];
        front++;
        return t;
    }
    
    public int peek() {
         if(rear==-1){
            return -1;
        }
        //front++;
        int t = arr[front];
        return t;
    }
    
    public boolean empty() {
       if(arr[front]==0){
        return true ;
       }
       return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */