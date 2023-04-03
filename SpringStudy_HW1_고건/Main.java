package SpringStudy_HW1_고건;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("잡th");
        User user2 = new User("거니");

        PhoneStore ps = new PhoneStore();

        ps.phoneSell("삼송", user1);
        user1.turn_on_phone();

        System.out.println();

        ps.phoneSell("사과", user2);
        user2.turn_on_phone();
    }
}
