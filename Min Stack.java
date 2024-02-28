class Solution {
    Stack<Pair> st=new Stack<>();
    int min=Integer.MAX_VALUE;
   
    public void push(int x) {
       min=Math.min(min,x);
       st.add(new Pair(x,min));
     
    }

    public void pop() {
        if(!st.isEmpty())
         {      st.pop();
         if(!st.isEmpty())
             min=st.peek().min;
             else
             min=Integer.MAX_VALUE;
             }
        else{
             
          }
    }

    public int top() {
        if(st.isEmpty())
        return -1;
        return st.peek().ele;
    }

    public int getMin() {
        if(st.isEmpty())
        return -1;
         return st.peek().min;
    }
}
class Pair{
    int ele;
    int min;
    Pair(int ele,int min){
        this.ele=ele;
        this.min=min;
    }
}
