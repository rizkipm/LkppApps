package superheroku.id.co.lkppapps.model;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import superheroku.id.co.lkppapps.R;

public class NewMainActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3;
    String url = "http://www.blueappsoftware.in/";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_main);

        txt1 =(TextView) findViewById(R.id.text1);
        txt2 =(TextView) findViewById(R.id.text2);
        txt3 =(TextView) findViewById(R.id.text3);

        getRetrofitObject();

        getRetrofitArray();
    }

    public void getRetrofitObject(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueappsoftware.retrofit_json.RetrofitObjectAPI service = retrofit.create(blueappsoftware.retrofit_json.RetrofitObjectAPI.class);
        Call<model> call = service.getJsonObjectData();
        call.enqueue(new Callback<model>() {
            @Override
            public void onResponse(Call<model> call, Response<model> response) {
                Log.e(" mainAction", "  response "+ response.body().toString());
//
//            for(model model: response.body()) {
////                    System.out.println(size.toString());
//                }

                    Log.e(" mainAction", "  rom - "+ response.body().getRom().toString());
                txt1.setText(response.body().getRom().toString());
                Log.e(" mainAction", "  rom - "+ response.body().getScreenSize().toString());
                txt2.setText(response.body().getScreenSize().toString());
                Log.e(" mainAction", "  rom - "+ response.body().getBackCamera().toString());
                txt3.setText(response.body().getBackCamera().toString());
            }

            @Override
            public void onFailure(Call<model> call, Throwable t) {
                Log.e("MainActivity ", "  error "+ t.toString());

            }
        });

    }
    public void getRetrofitArray(){

    }
}
