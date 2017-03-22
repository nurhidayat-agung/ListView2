package agung.nurhidayat.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemClick extends AppCompatActivity {
    TextView tvclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_click);
        tvclick = (TextView) findViewById(R.id.tv_CLick);
        Intent getClick = getIntent();
        tvclick.setText("OnItemClick " + getClick.getStringExtra("kirim"));

    }
}
