// Last updated: 8/2/2025, 3:22:55 PM
class MinStack {
    private Stack<Integer> s1;
    private Stack<Integer> min;
    public MinStack() {
        s1=new Stack<>();
        min=new Stack<>();

    }
    
    public void push(int val) {
        s1.push(val);
        if(min.isEmpty() || val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
       int n=s1.pop();
       if(min.peek()==n){
            min.pop();
       }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */