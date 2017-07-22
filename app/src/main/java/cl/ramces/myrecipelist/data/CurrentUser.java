package cl.ramces.myrecipelist.data;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by sebas on 21-07-2017.
 */
public class CurrentUser {
    private FirebaseUser current = FirebaseAuth.getInstance().getCurrentUser();

    public FirebaseUser getCurrent() {
        return current;
    }

    public String email() {
        return current.getEmail();
    }

    public String uid() {
        return current.getUid();
    }
}
