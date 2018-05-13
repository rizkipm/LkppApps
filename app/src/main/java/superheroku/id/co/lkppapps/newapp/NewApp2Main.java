package superheroku.id.co.lkppapps.newapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import superheroku.id.co.lkppapps.R;
import superheroku.id.co.lkppapps.model.ResultModel;

public class NewApp2Main extends AppCompatActivity {

    TextView txt1, txt2, txt3;
    String url = "http://www.blueappsoftware.in/";

    public ListView listView;
    @BindView(R.id.dummyTop)
    TextView dummyTop;
    @BindView(R.id.bookName)
    TextView bookName;
    @BindView(R.id.bookAuthor)
    TextView bookAuthor;
    @BindView(R.id.dummyBottom)
    TextView dummyBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_layout);
        ButterKnife.bind(this);


        loadSize();
    }

    private void loadSize() {
        service serviceAPI = RestClient.getClient();
        Call<ResultModel> loadData = serviceAPI.loadSizes();
        loadData.enqueue(new Callback<ResultModel>() {
            @Override
            public void onResponse(Call<ResultModel> call, Response<ResultModel> response) {
                response.body(); // have your all data
                int id = response.body().getIdSatker();
                String userName = response.body().getNamaKpa();
                String level = response.body().getAkhirPengadaan();

                dummyBottom.setText(userName);
                dummyTop.setText(level);


            }

            @Override
            public void onFailure(Call<ResultModel> call, Throwable t) {

            }
        });

    }


}
