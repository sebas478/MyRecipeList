package cl.ramces.myrecipelist.data;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by sebas on 21-07-2017.
 */

public class Nodes {
    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference RecipeList() {return root.child("RecipeList");}

    public DatabaseReference Recipes() {return root.child("Recipe");}

}

