package day_2_polymorphism;
class GrandParent4 {
    void bp() {
        System.out.println("understand bp");
    }
}

class Parent6 extends GrandParent4 {
    void cancer() {
        System.out.println("understand cancer");
    }
}

public class Hierarchical_inheritence1 extends Parent6 {

    public static void main(String[] args) {

        Hierarchical_inheritence1 bb = new Hierarchical_inheritence1();

        bb.bp();
        bb.cancer();
    }
}