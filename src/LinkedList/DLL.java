/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Nguyen Huy
 */
public class DLL {
    Node head;
    Node tail;
    int size;
    
    public void insertFirst(int value){
        Node node = new Node(value);
        node.nextPoiter = head; 
        node.prevPointer = null;
        if(head!=null){
         head.prevPointer = node; 
        }
        head =node;
        if(tail ==null){
            tail = head;
        }
    }
    
    public void insertLast(int value){
        if(tail==null){
            insertFirst(value);
        }
        Node node = new Node(value);
        node.prevPointer = tail;
        node.nextPoiter = null; 
        tail.nextPoiter = node;
        tail=node;
    }
    
    public void insertLastOptimize(int value){
       Node node = new Node(value);
        if(head ==null){
            head.prevPointer =null;
            head =node;
            return;
       }
        Node last = head;
        while(last.nextPoiter!=null){
             last = last.nextPoiter;
        }
        node.prevPointer = last;
        node.nextPoiter= null;
        last.nextPoiter = node;
    }
    
    public void display(){
        Node node = head; 
        Node last=null;
        while(node!=null){
         System.out.print(node.value + "--> " );
         last =node;
         node=node.nextPoiter;
        }
        System.out.print(" " + "END");
        System.out.println("  ");
//        while(last!=null){
//         System.out.print(last.value + "--> " );
//         last=last.prevPointer;
//        }
//        System.out.print(" " + "START");
    }
    
    
    class Node{
        int value;
        Node nextPoiter;
        Node prevPointer;
        
        Node(int value){
            this.value = value;
        }
    }
}
