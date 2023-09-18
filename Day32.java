abstract class bank {
    abstract void roi();
}

class sbi extends bank {
    void roi() {
        int r = 9;
        System.out.println("the rate of intrest is " + r);
    }
}

class icici extends bank {
    void roi() {
        int r = 8;
        System.out.println("the rate of intrest is " + r);
    }
}

class axis extends bank {
    void roi() {
        int r = 10;
        System.out.println("the rate of intrest is " + r);
    }
}

class abstract_test14 {
    public static void main(String args[]) {
        bank s;
        s = new sbi();
        s.roi();
        s = new icici();
        s.roi();
        s = new axis();
        s.roi();

    }
}
