package blueappsoftware.retrofit_json;

import retrofit2.Call;
import retrofit2.http.GET;
import superheroku.id.co.lkppapps.model.model;

/**
 * Created by Jaink on 24-08-2017.
 */

public interface RetrofitObjectAPI {

    @GET("android/downloadcode/objectfile.json")
    Call<model> getJsonObjectData();
}
