package Lesson7;



public class TestDemo14 {

    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        /*myArrayList1.add(0,12);
        myArrayList1.add(1,23);
        myArrayList1.add(2,34);
        myArrayList1.add(3,45);*/
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i+1);

        }
        myArrayList1.display();

        myArrayList1.add(10,112);
        myArrayList1.display();
        //System.out.println(myArrayList1.contains(10));
        //System.out.println(myArrayList1.search(7));
        //System.out.println(myArrayList1.getPos(10));
        myArrayList1.display();
        myArrayList1.remove(9);
        myArrayList1.display();
        System.out.println("clear()");
        myArrayList1.clear();
        myArrayList1.display();
    }

}
