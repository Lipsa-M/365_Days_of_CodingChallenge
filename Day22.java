abstract class shap{
    abstract void run();
}
class rect extends shap{
    void run(){
        System.out.println("rect");
    }
}
class circle extends shap{
    void run(){
        System.out.println("circle");
    }
}
public class Day22 {
    public static void main(String[] args) {
        shap s;
        s= new rect();
        s.run();
        s=new circle();
        s.run();
    }
}
