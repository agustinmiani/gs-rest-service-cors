package hello;

/**
 * Created by amiani on 2019-07-03
 */
public class LoginForm {
    private String userName;

    public LoginForm() {
    }

    public LoginForm(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
