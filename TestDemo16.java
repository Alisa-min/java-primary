package Lesson7;

public class TestDemo16 {
    public static void main(String[] args) {
        MyLinkdeList5 myLinkdeList5 = new MyLinkdeList5();
        /*myLinkdeList5.addFirst(12);
        myLinkdeList5.addFirst(23);
        myLinkdeList5.addFirst(21);
        myLinkdeList5.addFirst(34);
        myLinkdeList5.addFirst(45);
        myLinkdeList5.display();*/
        myLinkdeList5.addLast(11);
        myLinkdeList5.addLast(22);
        myLinkdeList5.addLast(11);
        myLinkdeList5.addLast(44);
        myLinkdeList5.addLast(11);
        myLinkdeList5.display();
        myLinkdeList5.addIndex(0,99);
        myLinkdeList5.display();
        myLinkdeList5.addIndex(3,199);
        myLinkdeList5.display();
        myLinkdeList5.addIndex(7,999);
        myLinkdeList5.display();
//        System.out.println(myLinkdeList5.contains(33));
//        System.out.println(myLinkdeList5.size());

        myLinkdeList5.remove(33);
        myLinkdeList5.display();
        myLinkdeList5.removeAllKey(11);
        myLinkdeList5.display();
    }
}
