package StacksandQueue;

public class customStack {
        protected int[] data;
        private static final int DEFAULT_SIZE = 10;

        int ptr = -1;

        public customStack(){
            this(DEFAULT_SIZE);

        }

        public customStack(int size){
            this.data = new int[size];
        }

        public boolean push(int val){
            if(isFull()){
                System.out.println("Stack is full");
                return false;
            }

            ptr++;
            data[ptr] = val;
            return true;
        }

        public boolean isFull(){
            return ptr == data.length - 1;
        }

        public boolean isEmpty(){
            return ptr == -1;
        }

         public int pop() throws stackException{
            if(isEmpty()){
                throw new stackException("the stack is empty");
            }
            return data[ptr--];
         }

          public int peak() throws stackException{
              if(isFull()){
                  throw new stackException("the stack is full");
              }
            return data[ptr];
          }
}
