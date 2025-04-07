class check{
    public int value;

    check(){
        value = 0;
    }
    check(int a ){
        value = a ;
    }
    public static void obj_pass(check a){
        System.out.println(a);
        a.value++;
    }

}
public class value_increment {
    public static void main(String[] args) {
        check p1 = new check();
        p1.value =6;
        p1.obj_pass(p1);
        System.out.println("Value before increment: " +  p1.value  + "\n" + "Value after increment: " + p1.value);
    }
}
