package pers.xiaoming.scala.basic_learning.object_oriented.inherit;

public class JavaParent {
    private final static String CLASS_ID = "JAVA_PARENT";

    private final String name;
    int id;
    private String address;

    public JavaParent(String name, int id) {
        System.out.println(CLASS_ID + " Constructor");
        this.name = name;
        this.id = id;
    }

    public final void setAddress(String address) {
        System.out.println(CLASS_ID + " Set address to: " + address);
        this.address = address;
    }

    private int getId() {
        System.out.println(CLASS_ID + " Get id ");
        // non private field accessible
        return this.id;
    }

    public int getIdParent() {
        System.out.println(CLASS_ID + " Get id Parent");
        return this.id;
    }

    public String getAddress() {
        System.out.println(CLASS_ID + " Get address ");
        return address;
    }
}
