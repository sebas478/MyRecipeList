package cl.ramces.myrecipelist.views.login;

import cl.ramces.myrecipelist.data.CurrentUser;

/**
 * Created by sebas on 21-07-2017.
 */

public class LoginValidation {
    private LoginCallback callback;

    public LoginValidation(LoginCallback callback) {
        this.callback = callback;
    }

    public void validate() {
        if (new CurrentUser().getCurrent() != null) {
            callback.logged();
        } else {
            callback.singin();
        }
    }
}
