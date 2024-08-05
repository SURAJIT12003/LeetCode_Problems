class MyQueue {
    int front = 0;
    int n = -1;
    int arr[] = new int [10005];
    public MyQueue() {

    }

    public void push(int x) {
        n++;
        arr[n] = x;
    }

    public int pop() {
        
        int t = arr[front];
        front++;
        return t;
    }

    public int peek() {
        int t = arr[front];
       
        return t;
    }

    public boolean empty() {
        if(arr[front]==0){
            return true;
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