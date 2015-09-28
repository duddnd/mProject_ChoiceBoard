package trick.choice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    mCustomAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new mCustomAdapter(this);

        ListView mListView;
        mListView = (ListView)findViewById(R.id.mlistview);
        mListView.setAdapter(mAdapter);

    }
}