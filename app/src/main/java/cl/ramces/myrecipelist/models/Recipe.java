package cl.ramces.myrecipelist.models;

/**
 * Created by sebas on 21-07-2017.
 */

public class Recipe {

    private String Name , Description, Dificult, Duration, key;

    public Recipe() {
    }

    public String getName() {
        return Name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDificult() {
        return Dificult;
    }

    public void setDificult(String dificult) {
        Dificult = dificult;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }
}