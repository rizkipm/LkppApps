package superheroku.id.co.lkppapps.newapp;

import com.google.gson.annotations.SerializedName;

public class Size {
    private int id;
    private String name;
    private boolean active;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("updated_at")
    private String updatedAt;
}
