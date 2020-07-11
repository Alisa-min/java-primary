package Lesson7;


class Node1{
    public int data;
    public Node1 next;
    public Node1 prev;

    public Node1(int data){
        this.data = data;
    }
}
public class MyLinkdeList5 {
    public Node1 head;
    public Node1 tail;

    //头插法
    public void addFirst(int data){
        Node1 node = new Node1(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node1 node = new Node1(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }


    private void cheekIndex(int index){
        if(index < 0 || index > this.size()){
            throw new RuntimeException("index不合法！");
        }
    }

    private Node1 searchIndex(int index){

        Node1 cur = this.head;
        while(index != 0){
            cur  = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){

        cheekIndex(index);
        if(index == 0){
            this.addFirst(data);
            return;
        }
        if(index == this.size()){
            this.addLast(data);
            return;
        }

        Node1 cur = searchIndex(index);
        Node1 node = new Node1(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){

        Node1 cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public int remove(int key){
        Node1 cur = this.head;
        while(cur != null){
            if(cur.data == key){
                int oldData = cur.data;
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node1 cur = this.head;
        while(cur != null){
            if(cur.data == key){
                int oldData = cur.data;
                if(cur == this.head){
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                }else{
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        this.tail = cur.prev;
                    }
                }

            }
            cur = cur.next;
        }

    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node1 cur = this.head;
        while(cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        Node1 cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        //this.head = null;
        //一个一个节点进行释放
        while(this.head != null){
            Node1 cur = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = cur;
        }
        this.tail = null;
    }

}
