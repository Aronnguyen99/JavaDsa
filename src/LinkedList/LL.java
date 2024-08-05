/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Nguyen Huy
 */
public class LL {
    Node head;
    Node tail;
    int size;
    
    LL(){
       
    }
   
    public void insertFirst(int value){
        Node node = new Node(value);
        node.nextPointer = head;
        head = node;
        if(tail == null){
              tail = head;// ==> khi insertFirst --> tail se xuong cuoi 
        }
        size+=1;
    }
    
     public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
         Node node = new Node(value);
        tail.nextPointer = node;
        tail = node;
        size+=1;
    }
     
    public void insertIndex(int value, int index){
        Node temp = head; 
        if(index==0){
            insertFirst(value);
        }
        if(index == size){
            insertLast(value);
        }
        for (int i = 1; i <index; i++) {
            temp = temp.nextPointer;
        }
        Node node = new Node(value, temp.nextPointer);
        temp.nextPointer = node;
        size+=1;
    }
    
    public void deleteFirst(){
       // int val = head.value;
        head = head.nextPointer;
        size-=1;
//        return val;
    }
    
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.nextPointer;
        }
        return node;
    }
    
    public void deleteLast(){
        if(size<1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        tail = secondLast;
        tail.nextPointer=null;
    }
    
    public void deleteIndex(int index){
       if(index==0){
           deleteFirst();
        }
       if(index==size-1){
           deleteLast();
       }
        Node deleteNode = get(index);
        Node prev = get(index-1);
        prev.nextPointer = deleteNode.nextPointer;  
    }
    
    public Node findNode(int value){
        Node node =head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.nextPointer;
        }
        return null;
    }
    
    public void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.value + "--> " );
            temp = temp.nextPointer;
        }
        System.out.print("END");
    }
   // Insert Recursion
   public void insertRecursion(int value, int index){
        head = insertRecursion(value, index, head);
    }
    
  Node insertRecursion(int value,int index,Node node){
        if(index == 0){
            Node newNode = new Node(value,node); 
           size++;
            return newNode;
        }
        
        node.nextPointer = insertRecursion(value, --index, node.nextPointer);
        //==> dung --index hoac index -1 =>>  index moi giam
        return node; // ==> node.nextPointer tra ve tri sau 
    }
  
  //Delete Duplicate Values
  void deleteDup(){
      Node temp = head;
      while(temp.nextPointer!=null){
          if(temp.value == temp.nextPointer.value){
              temp.nextPointer = temp.nextPointer.nextPointer;
              size--;
          }else{
              temp = temp.nextPointer;
          }
      }
      tail =temp;
  }
  
    static LL merge (LL list1, LL list2){
          Node l1 = list1.head;
          Node l2 = list2.head;
          LL ans = new LL();
          while(l1!=null && l2!=null ){
              if(l1.value<l2.value ){
                  ans.insertLast(l1.value);
                  l1 = l1.nextPointer;
              } else{
                  ans.insertLast(l2.value);
                  l2 = l2.nextPointer;
              }
             
          }
          
          while(l1!=null){
              ans.insertLast(l1.value);
              l1= l1.nextPointer;
          }
          while(l2!=null){
              ans.insertLast(l2.value);
              l2= l2.nextPointer;
          }
          //ans.display();
          return ans;
      }
    
    class Node{
        int value;
        Node nextPointer;
        Node(int value){
            this.value = value;
        }
        
        Node(int value, Node nextPointer){
            this.value=value;
            this.nextPointer = nextPointer;
        }
    }
    
}
