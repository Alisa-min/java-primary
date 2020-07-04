package Lesson7;



public class TestDemo15 {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        //myLinkedList.addFirst(10);
        //myLinkedList.addFirst(11);
        //myLinkedList.addFirst(12);
        //myLinkedList.addFirst(13);
        //myLinkedList.addFirst(14);
        myLinkedList.addLast(12);
        myLinkedList.addLast(23);
        myLinkedList.addLast(34);
        myLinkedList.addLast(12);
        myLinkedList.addLast(45);
        myLinkedList.addLast(56);
        myLinkedList.addLast(12);
        myLinkedList.display();
        boolean flg = myLinkedList.contains(34);
        System.out.println(flg);
        System.out.println(myLinkedList.size());
        myLinkedList.addIndex(3,44);
        myLinkedList.display();

        System.out.println("开始删除：");
        /*myLinkedList.remove(12);
        myLinkedList.display();
        myLinkedList.remove(44);
        myLinkedList.display();
        myLinkedList.remove(56);
        myLinkedList.display();*/
        myLinkedList.removeAllKey(12);
        myLinkedList.display();


    }
}
