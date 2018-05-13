package superheroku.id.co.lkppapps.newapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static service service;

    public static service getClient() {
        if (service == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();

            // Add logging into retrofit 2.0
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            httpClient.interceptors().add(logging);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://inaproc.lkpp.go.id/isb/api/41528eb9-8bc0-49a7-b4fe-a25c8b7c9c38/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()).build();

            service = retrofit.create(service.class);
        }
        return service;
    }
}
//
//    Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl("https://inaproc.lkpp.go.id/isb/api/41528eb9-8bc0-49a7-b4fe-a25c8b7c9c38/")
//            .addConverterFactory(GsonConverterFactory.create(gson))
//            .client(httpClient.build()).build();
