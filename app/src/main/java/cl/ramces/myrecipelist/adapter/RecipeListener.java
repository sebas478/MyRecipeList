package cl.ramces.myrecipelist.adapter;

import cl.ramces.myrecipelist.models.Recipe;

/**
 * Created by sebas on 21-07-2017.
 */

public interface RecipeListener {
    void clicked(Recipe recipe);
    void ready();
}
