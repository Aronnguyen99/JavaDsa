/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Nguyen Huy
 */
public class Main {
    public static void main(String[] args) {
        LL linklist1 = new LL();
        LL linklist2 = new LL();
////        linklist.insertFirst(3);
////        linklist.insertFirst(3);
        linklist1.insertLast(1);
        linklist1.insertLast(2);
        linklist1.insertLast(3);
        
        linklist2.insertLast(1);
        linklist2.insertLast(3);
        linklist2.insertLast(4);
        //linklist1.display();
//        
     LL ans =   LL.merge(linklist1, linklist2);
     ans.display();
     
//        linklist.insertLast(10);
//        linklist.insertIndex(19, 3);
//       // linklist.deleteFirst();
//       linklist.deleteLast();
//       linklist.deleteIndex(3);
   //linklist.display();
   //linklist.insertRecursion(99, 2);
  // linklist.deleteDup();
   //linklist.display();

//           DLL doublell = new DLL();
//           doublell.insertFirst(3);
//           doublell.insertFirst(5);
//           doublell.insertFirst(2);
//           doublell.insertFirst(4);
//           doublell.insertFirst(1);
//           //doublell.insertLast(99);
//           doublell.insertLastOptimize(99);
//           doublell.display();

            CLL cll = new CLL();
//           cll.insert(1);
//            cll.insert(2);
//             cll.insert(3);
//              cll.insert(4);
            //  cll.display();
    }
}
