import java.util.Stack;

    class Steck {
        public static void main(String[] args){
        Stack<Integer> stk = new Stack<>();
   
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
            System.out.println(stk);
        
        stk.pop();
        stk.pop();
            System.out.println(stk);
            
        stk.peek();
            System.out.println(stk.peek());
            
        stk.isEmpty();
            if(stk.isEmpty()){
        System.out.println("True");
    }else{
            System.out.println("False");
            stk.size();
        stk.size();    
            System.out.println(stk.size());
        }
    }
}