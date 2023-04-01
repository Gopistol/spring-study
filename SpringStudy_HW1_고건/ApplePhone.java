package SpringStudy_HW1_고건;

public class ApplePhone implements Phone {
    private String username;
    public ApplePhone(String username) {
        this.username = username;
    }
    @Override
    public void turn_on() {
        System.out.println(username + "님이 사과폰을 켰습니다.");
        loading();
    }
    @Override
    public void loading() {
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
