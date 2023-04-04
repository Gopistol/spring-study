package SpringStudy_HW1_고건;

import SpringStudy_HW1_고건.Phone;

public class SamsongPhone implements Phone {
    private static final String loadingMessage = "*** 폰 켜지는 중 ***";
    private static final String turnOnMessage = "님이 삼송폰을 켰습니다.";
    private User user;
    public SamsongPhone(User user) {
        this.user = user;
    }
    @Override
    public void turn_on() {
        System.out.println(user.getName() + turnOnMessage);
        loading();
    }
    @Override
    public void loading() {
        System.out.println(loadingMessage);
    }
}
