package lesson2;

public class Multiplication {

    public static void main(String[] args) {

        int product=0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i ;j++){
                product=j*i;
                System.out.println(j+"*"+i+"="+product);
                if(j==i){
                    System.out.println();
                }
            }


        }
    }
}
