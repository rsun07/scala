package pers.xiaoming.scala.basic_learning.object_oriented.inherit;

public class JavaChild extends JavaParent {
    private final static String CLASS_ID = "JAVA_Child";

    private String type;

    public JavaChild(String name, int id) {
        super(name, id);
        System.out.println(CLASS_ID + " Constructor");
    }

    public JavaChild(String name, int id, String type) {
        super(name, id);
        this.type = type;
        System.out.println(CLASS_ID + " Constructor");
    }

    // Cannot override final method
//    @Override
//    public void setAddress() {
//
//    }

    @Override
    public String getAddress() {
        System.out.println(CLASS_ID + " Get address ");
        // private field not accessible
        // super.address;
        return super.getAddress();
    }

    public int getId() {
        System.out.println(CLASS_ID + " Get id ");
        // non private field accessible
        return this.id;
    }
}
