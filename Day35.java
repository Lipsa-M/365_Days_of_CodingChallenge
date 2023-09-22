import java.util.Scanner;

public class lenear_21_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elemnet");
        int x = s.nextInt();
        int a[]=new int[x];
        System.out.println("enter the element");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("enter the element you want to search");
        int item = s.nextInt();
        int element =0 ;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==item){
                element=i ;
                break;    
            }
            
        }
        if(element!=0){
            element++;
            System.out.println("elemnt found in "+element);
        }
        else{
            System.out.println("elemnt not found");
        }
    }
}
