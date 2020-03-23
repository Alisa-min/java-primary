package lesson2;

public class Sum2 {
    public static void main(String[] args) {
        int i,j;
        int sum=0;

        for(i=1;i<=5;i++){
            int tmp=1;

            for(j=1;j<=i;j++){
                tmp*=j;
            }
            sum+=tmp;

        }

        System.out.println("sum="+sum);
    }

}
