package Day14;

public class Stack {
	private ListNode top;
    private int lenght;
    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public Stack(){
        top = null;
        lenght = 0;
    }

    public  int lenght(){
        return lenght;
    }
    public boolean isEmpty(){
        return lenght == 0;
    }
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        lenght++;
    }
    public int pop(){
        if(isEmpty()){
            
        }
        int result = top.data;
        top = top.next;
        lenght--;
        return result;
    }
    public int peek() {
        if (isEmpty()) {
         
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.print(stack.peek()+"==>");
        stack.pop();
        System.out.print(stack.peek()+"==>");
        stack.pop();
        System.out.print(stack.peek());
    }
}

