package StacksandQueue;

public class dynamicqueue extends circularQueue{
        public dynamicqueue(){
            super();
        }

        public dynamicqueue(int size){
            super(size);
        }

        public boolean insert(int item){
            if(this.isFull()){

                int[] temp = new int[data.length * 2];

                for(int i = 0; i < data.length; i++){
                    temp[i] = data[(front + i) % data.length];
                }
                front = 0;
                end = data.length;
                data = temp;
            }
            //insert the value
            return super.insert(item);
        }

}
