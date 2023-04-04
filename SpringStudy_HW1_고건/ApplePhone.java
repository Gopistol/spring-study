package SpringStudy_HW1_고건;

public class ApplePhone implements Phone {
    private static final String loadingMessage = "@@@ 폰 켜지는 중 @@@";
    private static final String turnOnMessage = "님이 사과폰을 켰습니다.";

    private User user;
    public ApplePhone(User user) {
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
