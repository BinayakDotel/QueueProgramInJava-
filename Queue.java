package pack.queue;

public class Queue{
    private int front;
    private int rear;
    private int[] array=new int[5];

    public Queue(){
        this.front=0;
        this.rear=-1;
    }
    public void enQueue(int value){
        if(this.rear>=4){
            System.out.println("Queue is full!!!");
        }else{
            this.rear++;
            this.array[this.rear]=value;
        }
    }
    public void deQueue(){
        if(this.front>this.rear){
            System.out.println("Queue is empty!!!");
        }else{
                System.out.println(array[front]+" deleted from Queue.");
                this.front++;
            }
    }
    public void display(){
        if(this.front>this.rear){
            System.out.println("Queue is empty!!!");
        }else{
            for(int i=rear;i>=front;i--){
                System.out.println(array[i]+" in Queue array["+i+"]");
            }
        }
    }
}