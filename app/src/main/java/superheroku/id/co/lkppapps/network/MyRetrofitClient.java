package superheroku.id.co.lkppapps.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import superheroku.id.co.lkppapps.helper.MyConstant;

public class MyRetrofitClient {
    private static Retrofit getRetrofit(){
        Retrofit r = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  r;
    }

    public static RestApi getInstanceRetrofit(){
        return getRetrofit().create(RestApi.class);
    }

    private static Retrofit getRetrofit2(){
        Retrofit r = new Retrofit.Builder()
                .baseUrl(MyConstant.BASE_URL2)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  r;
    }

    public static RestApi getInstanceRetrofit2(){
        return getRetrofit2().create(RestApi.class);
    }
}
