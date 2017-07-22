package cl.ramces.myrecipelist.views.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import cl.ramces.myrecipelist.R;
import cl.ramces.myrecipelist.models.Recipe;

public class MyRecipeActivity extends AppCompatActivity {

    private Recipe recipe;
    private EditText name, dificult, description, duration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recipe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        name = (EditText) findViewById(R.id.name);



    }

}
