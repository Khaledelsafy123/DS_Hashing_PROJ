package separate_chaining;


import java.util.Scanner;
import java.util.Stack;

public class Separate_chaining {
//    separate_chaining means linked list
    static class Node {
        int data;
        Node next;
        
        Node (int data){
            this.data=data;
            this.next=null;
        }
    }

    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        // elements of array
        System.out.println("insert the number of elements in array");
        int n = s.nextInt(); // size of array
        int[] array = new int [n] ;
        for (int i = 0; i < n; i++) {
            array[i]=s.nextInt();
        }
        
        // Hash function
        System.out.println("insert the divisor");
        int divisor = s.nextInt();
        
        
        
        
        // hash table to store the index and the values, size = divisor
        Stack<Node>[] hashtable = new Stack[divisor];

        // initial setting for elements , each element has empty stack
        for (int i = 0; i < divisor; i++) {
             hashtable[i] = new Stack<>();        
        }
        // apply the hash function
        for (int i=0;i<n;i++){
            int index = array[i]%divisor;
            
            Node newNode = new Node (array[i]); // store the value of element in data of node
            
            if (!hashtable[index].isEmpty()) // if index isn't empty
            {
                Node top = hashtable[index].peek();// first element
                while (top.next!=null){
                    top=top.next;// move to next node
                }
                top.next=newNode;
            }
            else // if index is empty just push
            {hashtable[index].push(newNode);}
                    
        }
        for (int i = 0; i < divisor; i++) {
            System.out.print("index("+i+") : ");
            Node current; // inform the state of index
            if (hashtable[i].isEmpty()) {
                current = null;
            } else {
                current = hashtable[i].peek();
            }
            while (current!=null){ // while the index isn't empty Do this
                System.out.print(current.data+" "); // to print in same line
                current=current.next;
            }
            System.out.println(); // new line
        }
         
    }
    
}
