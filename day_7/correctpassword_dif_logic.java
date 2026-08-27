package day_7;

public class correctpassword_dif_logic {

    static String correctPassword = "231";

    static void tryPassword(String password, int count) {

        if (password.equals(correctPassword)) {
            System.out.println("Password found: " + password);
            return;
        }

        if (count == 5) {
            System.out.println("Password not found");
            return;
        }

        System.out.println("Wrong password: " + password);

        if (count == 1) {
            tryPassword("345", 2);
        } else if (count == 2) {
            tryPassword("213", 3);
        } else if (count == 3) {
            tryPassword("365", 4);
        } else {
            tryPassword("231", 5);
        }
    }

    public static void main(String[] args) {
        tryPassword("123", 1);
    }
}