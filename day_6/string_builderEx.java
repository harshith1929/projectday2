package day_6;

public class string_builderEx {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        builder.append(" ");
        builder.append("world!");

        System.out.println("Created string: " + builder);

        System.out.println("Read string: " + builder.toString());

        builder.replace(6, 11, "Java");
        System.out.println("Updated string: " + builder);

        builder.append(" Programming");
        System.out.println("After adding text: " + builder);
  
        builder.delete(11, builder.length());
        System.out.println("After deleting text: " + builder);

        builder.deleteCharAt(5);
        System.out.println("After deleting one character: " + builder);
    }
}