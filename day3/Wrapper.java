package day_3;


class Box<T> {

private T value;


Box(T value) {

this.value = value;

}


T get() {

return value;

}

}


public class Wrapper {

public static void main(String[] args) {

Box<Integer> b1 = new Box<>(10); // <> infers Integer

Box<String> b2 = new Box<>("Hi"); // <> infers String


System.out.println(b1.get());

System.out.println(b2.get());

}

}