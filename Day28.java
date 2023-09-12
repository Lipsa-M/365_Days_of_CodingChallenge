final class branch{
String bname="cse";
void display(){
System.out.println("class name branch");
}
}
class student extends branch{
String sname="sabbir alam";
void show(){
System.out.println("class name student");
}
}
class test10{
public static void main(String args[]){
student s=new student();
s.show();
s.display();
}
}
