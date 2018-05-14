package superheroku.id.co.lkppapps.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import superheroku.id.co.lkppapps.R;
import superheroku.id.co.lkppapps.adapter.DataAdapter;

public class NewApp2Main extends AppCompatActivity {

    TextView txt1, txt2, txt3;
    String url = "http://www.blueappsoftware.in/";

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.bookList);




        loadSize();
    }

    private void loadSize() {
        service sr = RestClient.getClient();
        Call<ResponNewLkppResponse> call = sr.loadSizes();
        call.enqueue(new Callback<ResponNewLkppResponse>() {
            @Override
            public void onResponse(Call<ResponNewLkppResponse> call, Response<ResponNewLkppResponse> response) {
                List<NewLkppResponse> data = response.body().getList();
                Log.d("cek data","data"+new Gson().toJson(data));

                DataAdapter booksAdapter = new DataAdapter(getBaseContext(), R.layout.data_layout, data);
                listView.setAdapter(booksAdapter);

            }

            @Override
            public void onFailure(Call<ResponNewLkppResponse> call, Throwable t) {

            }
        });
    }


}
