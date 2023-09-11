class first {
    int a = 0;
}

class second extends first {
    int b = 13;
    void run(){
        System.out.println(b);
    }
}

class test13 {
    public static void main(String args[]) {
        first s = new second();// upcasting

        System.out.println(s.a);
        s.run();
    }
}
