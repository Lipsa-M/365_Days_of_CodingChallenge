
import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int i =s.nextInt();
        int sum=0;
        int dig;
        while(i!=0){
            dig=i%10;
            sum=sum+dig;
            i=i/10;
        }
        System.out.println(sum);
    }
}
