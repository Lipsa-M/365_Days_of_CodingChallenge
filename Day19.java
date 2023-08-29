class A {
    void show(){
        System.out.println("A");
    }

}

interface B  {
    void ashow();

}

interface C {
    void cshow();
}

class D extends A implements B, C {
    

    public void ashow() {
        System.out.println("B");
    }

    public void cshow() {
        System.out.println("C");
    }
    void dshow(){
        System.out.println("D");
    }

}

class multipath{

    public static void main(String[] args) {
       D m = new D();
        m.show();
        m.ashow();
        m.cshow();
        m.dshow();
    }
}
