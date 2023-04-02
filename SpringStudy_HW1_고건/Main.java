package SpringStudy_HW1_고건;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("잡th");
        User user2 = new User("거니");

        user1.buy_samsong_phone();
        user1.turn_on_phone();

        System.out.println();

        user2.buy_apple_phone();
        user2.turn_on_phone();

    }
}
