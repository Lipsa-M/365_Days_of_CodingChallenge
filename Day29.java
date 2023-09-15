class bro{
    static void fun(){
        System.out.println("another class");
    }
}

class statick{
    static void st(){
        System.out.println("static method");
    }
    void sh(){
        System.out.println("logo");
    }
    public static void main(String[] args) {
        // statick s=new statick();
        bro se=new bro();
        st();
        // s.sh();
        se.fun();
    }
}
