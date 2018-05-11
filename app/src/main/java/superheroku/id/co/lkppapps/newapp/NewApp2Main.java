package superheroku.id.co.lkppapps.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import superheroku.id.co.lkppapps.R;

public class NewApp2Main extends AppCompatActivity {

    TextView txt1, txt2, txt3;
    String url = "http://www.blueappsoftware.in/";
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



        loadSize();
    }

    private void loadSize() {
        service serviceAPI = RestClient.getClient();
        Call<List<NewLkppResponse>> loadSizeCall = serviceAPI.loadSizes();
        loadSizeCall.enqueue(new Callback<List<NewLkppResponse>>() {
            @Override
            public void onResponse(Call<List<NewLkppResponse>> call, Response<List<NewLkppResponse>> response) {
                for (NewLkppResponse size : response.body()) {
//                    System.out.println(size.toString());
//                    txt1.setText(size.getNamaKpa());
//                    txt2.setText(size.getDetailLokasi());
//                    txt3.setText(size.getJenisPengadaan());
//                    AdapterData recyclerViewAdapter =
//                            new AdapterData(NewLkppResponse, MainActivity.this);
//                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//
////                    recyclerView.setLayoutManager(layoutManager);
//////                        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//
//                    recyclerView.setAdapter(recyclerViewAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<NewLkppResponse>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
