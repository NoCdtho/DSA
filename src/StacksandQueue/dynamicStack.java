package StacksandQueue;

public class dynamicStack extends customStack{

    public dynamicStack(){
        super();
    }

    public dynamicStack(int size){
        super(size);
    }

    public boolean push(int val){
        if(this.isFull()){

            int[] temp = new int[data.length * 2];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        //insert the value
        return super.push(val);
    }


}
