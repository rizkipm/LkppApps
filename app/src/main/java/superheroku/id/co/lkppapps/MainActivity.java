package superheroku.id.co.lkppapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import superheroku.id.co.lkppapps.model.LkppResponse;

public class MainActivity extends AppCompatActivity {

    public static List<LkppResponse> dataItemJ23RiwayatLelangs;


    @BindView(R.id.txtNamaIndikator)
    TextView txtNamaIndikator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dataItemJ23RiwayatLelangs = new ArrayList<>();




    }



}
