import java.util.Scanner;

public class palendrom {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String x=s.nextLine();
        char a[]=x.toCharArray();
        int flag=0;
        int length=x.length();
        int v=length/2;
        // System.out.println(v);
        for (int i = 0; i < v ; i++) {
            if(a[i]!=a[length-i-1]){
                flag++;
            }
        }
        // System.out.println(flag);
        if (flag==0){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}
