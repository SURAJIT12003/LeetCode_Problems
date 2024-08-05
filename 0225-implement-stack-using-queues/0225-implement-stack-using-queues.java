class MyStack {
    int rear = -1;
    int arr[] = new int[20004];

    public MyStack() {
        
    }
    
    public void push(int x) {
        rear++;
        arr[rear]  = x;
    }
    
    public int pop() {
        int t = arr[rear];
        rear--;
        return t;
    }
    
    public int top() {
        int t = arr[rear];
      
        return t;
    }
    
    public boolean empty() {
        if(rear==-1){
            return true ;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */