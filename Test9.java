public class Test9 {


    public static void main(String[] args) {
        int a = 22;
        int b = 33;
        int c = 11;
        int max = 0;
        int min = 0;
        if(a >= b && a >= c){
           max = a;
        } else if(b >= a && b >= c){
            max = b;
        }else if(c >= a && c >= b){
            max = c;
        }
        if(a <= b && a <= c){
            min = a;
        }else if(b <= a && b <= c){
            min = b;
        }else if(c <= a && c <= b){
            min = c;
        }
        System.out.println("MAX="+max);
        System.out.println("MIN="+min);




    }
}
