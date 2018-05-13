package superheroku.id.co.lkppapps.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import superheroku.id.co.lkppapps.R;

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
        service serviceAPI = RestClient.getClient();
        Call<List<ResponNewLkppResponse>> loadSizeCall = serviceAPI.loadSizes();
        loadSizeCall.enqueue(new Callback<List<ResponNewLkppResponse>>() {
            @Override
            public void onResponse(Call<List<ResponNewLkppResponse>> call, Response<List<ResponNewLkppResponse>> response) {
                Log.d("data",  "Kode :" + response.body());
//                Log.d("Tag","Cek Data :"+new Gson().toJson(data));

                List<ResponNewLkppResponse> data = response.body();
//                Toast.makeText(getApplicationContext(), "Body", Toast.LENGTH_LONG).show();
//                // Set response Books as listed layout
//                DataAdapter booksAdapter = new DataAdapter(getBaseContext(), R.layout.data_layout, (ArrayList<NewLkppResponse>) data);
//                listView.setAdapter(booksAdapter);
            }

            @Override
            public void onFailure(Call<List<ResponNewLkppResponse>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }


}
