package cl.ramces.myrecipelist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

import cl.ramces.myrecipelist.R;
import cl.ramces.myrecipelist.data.CurrentUser;
import cl.ramces.myrecipelist.data.Nodes;
import cl.ramces.myrecipelist.models.Recipe;

/**
 * Created by sebas on 21-07-2017.
 */

public class RecipeAdapter extends FirebaseRecyclerAdapter<Recipe ,RecipeAdapter.RecipeHolder>{
    private RecipeListener listener;

    public RecipeAdapter(RecipeListener listener){
        super(Recipe.class, R.layout.list_item_recipe,RecipeHolder.class,new Nodes().Recipes().child(new CurrentUser().uid()));
        this.listener = listener;
    }

    @Override
    protected void populateViewHolder(RecipeHolder viewHolder, Recipe model, int position) {

    }

    public static class RecipeHolder extends RecyclerView.ViewHolder {

        public RecipeHolder(View itemView) {
            super(itemView);

        }
    }

}
