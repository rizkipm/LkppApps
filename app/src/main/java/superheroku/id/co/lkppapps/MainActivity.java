package superheroku.id.co.lkppapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

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


    @BindView(R.id.txtNamaIndikator)
    TextView txtNamaIndikator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_data);
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
                    Log.d("onResponse", response.body().toString());

//                    for (int i = 0; i < dataItemJ23RiwayatLelangs.size(); i++) {
////                        txtNamaIndikator.setText(dataItemJ23RiwayatLelangs.get(i).getNamaPaket());
//                        Toast.makeText(getApplicationContext(), dataItemJ23RiwayatLelangs.get(i).getAkhirPekerjaan(),
//                                Toast.LENGTH_LONG).show();
//
//                    }


//                    dataItemJ23RiwayatLelangs = Collections.singletonList(response.body());
////
////                    layoutManager = new LinearLayoutManager(getApplicationContext());
//                    AdapterData recyclerViewAdapter =
//                            new AdapterData(dataItemJ23RiwayatLelangs, MainActivity.this);
//                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//
////                    recyclerView.setLayoutManager(layoutManager);
//////                        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
//
//                    recyclerView.setAdapter(recyclerViewAdapter);


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
