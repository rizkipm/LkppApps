package superheroku.id.co.lkppapps.newapp;

import retrofit2.Call;
import retrofit2.http.GET;
import superheroku.id.co.lkppapps.model.ResultModel;

public interface service {
    @GET("json/17814424/pengumumanruptahunan2018/tipe/4:12/parameter/2018:D444")
    Call<ResultModel> loadSizes();
}
