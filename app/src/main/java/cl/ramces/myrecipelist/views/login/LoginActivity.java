package cl.ramces.myrecipelist.views.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.ResultCodes;

import java.util.Arrays;

import cl.ramces.myrecipelist.R;
import cl.ramces.myrecipelist.views.main.RecipeActivity;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class LoginActivity extends AppCompatActivity implements LoginCallback {

    private static final int RC_SIGN_IN = 478;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        new LoginValidation(this).validate();
    }

    @Override
    public void singin() {
        startActivityForResult(
                AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setProviders(Arrays.asList(new AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build()//,
                            //    new AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build(),
        //                        new AuthUI.IdpConfig.Builder(AuthUI.FACEBOOK_PROVIDER).build()
        ))
                     // .setIsSmartLockEnabled(!BuildConfig.DEBUG)
                        .setTheme(R.style.FullscreenTheme)
                        .build(),
                RC_SIGN_IN);

    }

    @Override
    public void logged(){
        startActivity(new Intent(this, RecipeActivity.class));
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (RC_SIGN_IN == requestCode) {
            if (ResultCodes.OK == resultCode) {
                logged();
            } else {
                singin();
            }
        }
    }
}