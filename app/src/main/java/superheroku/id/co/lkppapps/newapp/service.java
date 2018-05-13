package superheroku.id.co.lkppapps.newapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface service {
    @GET("json/17814424/pengumumanruptahunan2018/tipe/4:12/parameter/2018:D444")
    Call<List<ResponNewLkppResponse>> loadSizes();
}
