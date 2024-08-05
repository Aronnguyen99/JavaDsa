/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Nguyen Huy
 */
public class CLL {
    Node head;
    Node tail;
    int size;
    
    void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail =node;
        }
        tail.nextPointer = node;
        node.nextPointer = head;
        tail = node;
    }
    
    void delete (int value){
        Node node = head;
        if(node == null){
            return;
        }
        
        if(node.value == value){
            head = head.nextPointer;
            tail.nextPointer = head;
            return;
        }
        
        do{
            Node n = node.nextPointer;
            if(n.value == value){
                node.nextPointer = n.nextPointer;
                break;
            }
            node = node.nextPointer;
        
        }while(node!=head);      
    }
    
    
    void display(){
        Node temp = head;
        do{
            System.out.print(temp.value + "--->");
            temp = temp.nextPointer;
        }while(temp!=head);
    }
    
    class Node{
       int value;
       Node nextPointer;
       
       Node(int value){
           this.value=value;
       }
       
       Node(int value, Node nextPointer){
           this.value = value;
           this.nextPointer = nextPointer;
       }
   }
}
