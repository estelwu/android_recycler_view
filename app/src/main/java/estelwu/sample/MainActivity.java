package estelwu.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.simple_recyclerview)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        SimpleAdapter adapter = new SimpleAdapter(generateSampleList());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<SimpleItemEntity> generateSampleList() {
        List<SimpleItemEntity> list = new ArrayList<>();
        for(int i=0; i < 100; i++) {
            list.add(new SimpleItemEntity("This is " + i));
        }
        return list;
    }

}
