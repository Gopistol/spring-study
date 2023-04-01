package SpringStudy_HW1_고건;

import SpringStudy_HW1_고건.ApplePhone;
import SpringStudy_HW1_고건.Phone;
import SpringStudy_HW1_고건.SamsongPhone;

public class User {
    private String name;
    private Phone phone;
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy_samsong_phone() {
        Phone samsong = new SamsongPhone(getName());
        System.out.println(getName() + "님이 삼송폰을 샀습니다.");
        this.phone = samsong;
    }
    public void buy_apple_phone() {
        Phone apple = new ApplePhone(getName());
        System.out.println(getName() + "님이 사과폰을 샀습니다.");
        this.phone = apple;
    }
    public void turn_on_phone() {
        phone.turn_on();
    }
}
