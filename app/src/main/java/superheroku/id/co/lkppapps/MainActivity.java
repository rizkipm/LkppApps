package superheroku.id.co.lkppapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import superheroku.id.co.lkppapps.model.LkppResponse;
import superheroku.id.co.lkppapps.network.MyRetrofitClient;
import superheroku.id.co.lkppapps.network.RestApi;

public class MainActivity extends AppCompatActivity {

    public static List<LkppResponse> dataItemJ23RiwayatLelangs;

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dataItemJ23RiwayatLelangs = new ArrayList<>();



        getListData();

    }

    private void getListData() {
        try {
            RestApi api = MyRetrofitClient.getInstanceRetrofit2();


            Call<LkppResponse> call = api.getData();
            call.enqueue(new Callback<LkppResponse>() {
                @Override
                public void onResponse(Call<LkppResponse> call, Response<LkppResponse> response) {
//                    Log.d("onResponse", response.body().toString());




//                    layoutManager = new LinearLayoutManager(getApplicationContext());
//                        AdapterMenuKategoriPimpinan recyclerViewAdapter =
//                                new AdapterMenuKategoriPimpinan(dataItemJ23RiwayatLelangs, MenuKategoriPimpinan.this);
//                        recyclerView.setLayoutManager(new LinearLayoutManager(MenuKategoriPimpinan.this));
//
////                    recyclerView.setLayoutManager(layoutManager);
//////                        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//
//                        recyclerView.setAdapter(recyclerViewAdapter);




                }

                @Override
                public void onFailure(Call<LkppResponse> call, Throwable t) {

                }
            });

//
        } catch (Exception e) {
        }
    }

}
