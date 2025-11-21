package Dsaclass;

public class Queue {
    Node rear ,front ;
    int size ;

    public Queue(){
        rear = front =null;
        size = 0 ;
    }

    public void enqueue(int value ){
        Node node =new Node(value);
        if (rear == null){
            front = rear = node ;
        }
        else{
            rear.next =node ;
        }

        }

    public int dequeue(){
       if(front == null )
           return -1;
       int value =front.value;
       front =front.next ;
        return value;
    }
    public boolean areEqual(Queue q1 ,Queue q2){
        if (q1.size != q2.size )return false;

        Node temp1 =q1.front;
        Node temp2 = q2.front ;
        while (q1 != null && q2 !=null){
            if (temp1.value != temp2.value){
                return false ;}
            temp1 =temp1.next;
            temp2 =temp2 ;
            }return true;
    }
}

