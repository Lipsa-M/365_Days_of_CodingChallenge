class nthrows {
    public static int divdenum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    public static void main(String args[]) {
        nthrows t = new nthrows();
        try {
            System.out.println(t.divdenum(5, 0));
        } catch (ArithmeticException e) {
            System.out.println("num cannot be devided");
        }
        System.out.println("rest of the code");
    }
}
