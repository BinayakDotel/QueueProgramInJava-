package pack.queue;

public class Cqueue{
    private int front;
    private int rear;
    private int[] array=new int[5];

    public Cqueue(){
        this.front=-1;
        this.rear=-1;
    }
    public void enQueue(int value){
        int size=array.length;
        if((rear+1)%size==front){
            System.out.println("Queue is full!!!");
        }else{
            rear=(rear+1)%size;
            array[rear]=value;
        }
        if(front==-1){
            front=0;
        }
    }
    public void deQueue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty!!!");
        }else{
            System.out.println(array[front]+" is deleted from array["+front+"]");
            this.front++;
        }
        if(rear==front){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%(array.length);
        }
    }
    public void display(){
       if(this.front==-1 && this.rear==-1){
            System.out.println("Queue is empty!!!");
        }
       if(this.rear>this.front){
            for(int i=front;i<=rear;i++){
                System.out.println(this.array[i]);
            }
       }else{
            for(int i=this.front;i<4;i++){
                System.out.println(this.array[i]);
            }
       }
        for(int i=0;i<this.rear;i++){
            System.out.println(this.array[i]);
        }
    }
}