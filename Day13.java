class testouter{
    private int data=19;
    class inner{
        void show(){
            System.out.println("data is "+ data);
        }
    }
    public static void main(String[] args) {
        testouter t1=new testouter();
        testouter.inner in=t1.new inner();
        in.show();
    }
}
