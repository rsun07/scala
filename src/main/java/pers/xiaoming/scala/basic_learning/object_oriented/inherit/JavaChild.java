package pers.xiaoming.scala.basic_learning.object_oriented.inherit;

public class JavaChild extends JavaParent {
    private final static String CLASS_ID = "JAVA_Child";

    // Override parent param
    private String name;
    int id;

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

    public int getIdChild() {
        System.out.println(CLASS_ID + " Get id ");
        System.out.println(String.format("This id = %d, Super id = %d", this.id, super.id));
        return this.id;
    }
}
