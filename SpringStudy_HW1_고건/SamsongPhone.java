package SpringStudy_HW1_고건;

import SpringStudy_HW1_고건.Phone;

public class SamsongPhone implements Phone {
    private String username;
    public SamsongPhone(String username) {
        this.username = username;
    }

    @Override
    public void turn_on() {
        System.out.println(username + "님이 삼송폰을 켰습니다.");
        loading();
    }

    @Override
    public void loading() {
        System.out.println("★★★ 폰 켜지는 중 ★★★");
    }
}
