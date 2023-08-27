import java.util.ArrayList;
import java.util.Collections;

public class game {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        ArrayList<Integer> l1[] = new ArrayList[6];
        for (int i = 0; i < 6; i++) {
            l1[i] = new ArrayList<Integer>();

        }

        for (int i = 1; i < 64; i++) {
            String j = reverseString(Integer.toBinaryString(i));
            for (int index = 0; index < j.length(); index++) {
                if (j.charAt(index) == '1') {
                    l1[index].add(i);
                }
            }
           
        }
        for (int i = 0; i < l1.length; i++) {
            Collections.shuffle(l1[i]);

            String s="";
           for (int j = 0; j < l1[i].size(); j++) {
            if(Integer.parseInt(l1[i].get(j).toString())<10){
                s=s+" "+'0'+l1[i].get(j);    
            }
            else{
                s=s+" "+l1[i].get(j);

            }            
           }
           list2.add(s);
           System.out.println(s);
            
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
            
        }
    }
}
