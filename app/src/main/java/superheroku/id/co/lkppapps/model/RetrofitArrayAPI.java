package superheroku.id.co.lkppapps.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jaink on 24-08-2017.
 */

public interface RetrofitArrayAPI {

@GET("android/downloadcode/arrayfile.json")
Call<List<model>> getJsonArrayData();
}
