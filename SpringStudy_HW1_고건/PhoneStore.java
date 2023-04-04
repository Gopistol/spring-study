package SpringStudy_HW1_고건;

public class PhoneStore {

    public void phoneSell(String brand, User user) {
        if (brand.equals("삼송")) {
            Phone phone = new SamsongPhone(user);
            user.setPhone(phone);
            System.out.println(user.getName() + "님이 삼송폰을 샀습니다.");
        } else if (brand.equals("사과")) {
            Phone phone = new ApplePhone(user);
            user.setPhone(phone);
            System.out.println(user.getName() + "님이 사과폰을 샀습니다.");
        }
    }
}
