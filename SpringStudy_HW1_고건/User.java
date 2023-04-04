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

    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void turn_on_phone() {
        phone.turn_on();
    }
}
