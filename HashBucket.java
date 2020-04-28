package MapTest;

public class HashBucket {
    public static class Node{
        int key;
        int value;
        Node next;
        Node(int key,int value){
            this.key=key;
            this.value=value;
            next=null;
        }
    }
    Node[] table;
    int capacity;
    int size;
    double loadFact=0.75;
    public HashBucket(int initCap){

        //保证哈希桶初始容量至少为10个
        capacity=initCap;
        if(initCap<10)
            capacity=10;

        table=new Node[capacity];
        size=0;
    }

    public int put(int key,int value){
        resize();
        //1.通过哈希函数，计算key所在的桶号

        int bucketNo=hashFunc(key);

        //2.在bucket桶中检测key是否存在
        //   检测方式：遍历链表
        Node cur=table[bucketNo];
        while(null!=cur){
            if(cur.key==key){
                int oldvalue=cur.value;
                cur.value=value;
                return oldvalue;
            }

            cur=cur.next;
        }

        //3.key不存在，将key-value插入到哈希桶中
        cur=new Node(key, value);
        cur.next=table[bucketNo];
        table[bucketNo]=cur;
        size++;
        return value;
    }

    //将哈希桶中值为key的键值对删除
    public boolean remove(int key){
        //1.通过哈希函数计算key的桶号
        int bucketNo=hashFunc(key);


        //2.在bucketNo桶中找出key所对应的节点
        //  找到后将该节点删除

        Node cur=table[bucketNo];
        Node prev=null;
        while(null!=cur){
            if(cur.key==key){

                if (null==prev){
                    table[bucketNo]=cur.next;
                }
                else{
                    prev.next=cur.next;
                }
                --size;
                return true;
            }
            else{
                prev=cur;
                cur=cur.next;
            }
        }
        return false;
    }

    //O(1)
    boolean containsKey(int key){
        //1.计算key所在的桶号

        int buckeyNo=hashFunc(key);

        //2.在bucketNo桶中找key

        Node cur=table[buckeyNo];
        while(null!=cur){
            if (cur.key==key){
                return true;
            }
            cur=cur.next;
        }
        return false;

    }

    //O(n)
    public boolean containsValue(int value){
        //哈希桶是根据key在计算哈希地址的
        //找value不能计算出value在哪个桶中
        //
        for (int bucketNo=0;bucketNo<capacity;bucketNo++){
            Node cur=table[bucketNo];
            while(null!=cur){
                if (cur.value==value){
                    return true;
                }
                cur=cur.next;
            }

        }
        return false;
    }



    public int size(){
        return size;
    }

    public boolean enpty(){
        return 0==size;
    }




    private void resize(){
        //装载因子超过0.75时进行扩容   按照2倍的方式进行扩容
        if(size*10/capacity>loadFact*10){
           int newCap=capacity*2;
            Node[] newTable=new Node[capacity*2];

            //将table中的节点板一道newTable中
            for(int i=0;i<capacity;++i){
                Node cur=table[i];


                while(null!=cur){
                    table[i]=cur.next;

                    int bucketNo=cur.key%newCap;

                    cur.next=newTable [bucketNo];
                    newTable [bucketNo]=cur;

                    //取Table中i
                    cur=table[i];
                }
            }
            table=newTable;
            capacity=newCap;
        }
    }

    private int hashFunc(int key){
        return key%capacity;
    }
    public void printHashBucket(){
        for (int bucketNo=0;bucketNo<capacity;bucketNo++){
            System.out.printf("table[%d]--->",bucketNo);


            Node cur=table[bucketNo];

            while(null!=cur){
                System.out.print("["+cur.key+","+cur.value+"]--->");
                cur=cur.next;


            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        HashBucket ht=new HashBucket(5);
        ht.put(1,1);
        ht.put(11,11);
        ht.put(2,2);
        ht.put(22,22);
        ht.put(6,6);
        ht.put(5,5);
        ht.put(51,51);
        ht.put(8,8);


        System.out.println(ht.size());
        ht.printHashBucket();


        ht.put(3,3);
        ht.printHashBucket();


        System.out.println(ht.containsKey(5) );
        System.out.println(ht.containsValue(15));

        ht.remove(5);
        System.out.println(ht.containsKey(5) );
        ht.printHashBucket();

    }
}
