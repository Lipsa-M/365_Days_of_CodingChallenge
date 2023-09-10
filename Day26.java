import java.util.*;

class student {
    String name;
    int Roll_Number,mark1,mark2,mark3,mark4,mark5;

    student(String name,int Roll_Number,int mark1,int mark2,int mark3,int mark4, int mark5)
    {
        this.name=name;
        this.Roll_Number=Roll_Number;
        this.mark1 =mark1;
        this.mark2 =mark2;
        this.mark3 =mark3;
        this.mark4 =mark4;
        this.mark5 =mark5;

    }

    void display()
    {
        System.out.println("name"+"Roll_Number"+"Avg"+(mark1+mark2+ mark3+ mark4+ mark5)/5);
    }

    public static void main(String args[]) {
        try (Scanner ne = new Scanner(System.in)) {
            int n=ne.nextInt();
            student obj[] = new student[n];
            for (int i = 0; i < n; i++) {
            ne.nextLine();
                String na = ne.nextLine();
                int r = ne.nextInt();
                int m1 = ne.nextInt();
                int m2 = ne.nextInt();
                int m3 = ne.nextInt();
                int m4 = ne.nextInt();
                int m5 = ne.nextInt();
                obj[i] = new student(na, r, m1, m2, m3, m4, m5);
                obj[i].display();

            }
        }
    }

}
