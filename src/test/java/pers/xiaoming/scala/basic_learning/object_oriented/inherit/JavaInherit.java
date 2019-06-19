package pers.xiaoming.scala.basic_learning.object_oriented.inherit;

import org.junit.Test;

public class JavaInherit {

    @Test
    public void test() {
        JavaParent parent = new JavaParent("Name", 1);

        System.out.println();

        JavaChild child = new JavaChild("name", 2);
        child.getAddress();
        child.getId();

        System.out.println();

        System.out.println(child.getId());
        System.out.println(child.getIdChild());
        child.id = 10;
        System.out.println(child.getId());
        System.out.println(child.getIdChild());
    }
}
