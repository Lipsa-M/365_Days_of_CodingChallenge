import java.util.Scanner;

class buble{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no of elemnts");
        int n = s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        for (int j = n-2; j >= 0; j--) {
            for (int j2 = 0; j2 <= j; j2++) {
                if(a[j2]>a[j2+1]){
                    int t = a[j2];
                    a[j2]=a[j2+1];
                    a[j2+1]=t;
                }
            }
        }
        for (int j2 = 0; j2 < a.length; j2++) {
            System.out.print(a[j2]);
        }
    }
}
