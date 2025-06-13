//add--> r++ % length
//delete---->f++ % length
package DSA.Queue;
class CirQueue{
    int f=-1;
    int r=-1;
    int n=5;
    int q[] = new int[n];
    public void enqueue(int item){//O(1)
        if( f==-1 && r==-1){
            f=0;
            r=0;
            q[r]=item;
        }
        else if((r+1)%n == f){
                System.out.println("Queue is full");
            }
            else{
                r=(r+1)%n;
                q[r]=item;
            }
        }
    public void dequeue(){//0(1)
        
        //empty
        if(f==-1 && r==-1){
            System.out.println("Queue is Empty");
        }
        else if(f==r){
                f=-1;
                r=-1;
            }
            else{
                f=(f+1)%n;
            }
        }
    public void display(){
        int i=f;
        if(f==-1 && r==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue is: ");
            while(i != r){
                System.out.print(q[i]+" ");
                i=(i+1)%n;
            }
            System.out.print(q[i]);
        }
    }
}
public class CircularUsingArray {
    public static void main(String[] args) {
        CirQueue obj=new CirQueue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.display();
        obj.dequeue();
        obj.enqueue(60);
        obj.display();

    }
}        
