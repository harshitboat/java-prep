abstract class GeeksHelp {
    abstract void check(String name); 
}

public class abstractMethod extends GeeksHelp {

    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
       abstractMethod  obj = new abstractMethod();
        obj.check("Harshit singh");
    }
}