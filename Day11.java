class Day11{
  
    public static void main(String[] args) {
      for (int i = 1; i <= 5; i++) {
            for(int col=1;col<=i;col++){
                if(col%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
