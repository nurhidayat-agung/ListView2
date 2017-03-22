package agung.nurhidayat.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemLongClick extends AppCompatActivity {
    TextView tvLongClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_long_click);
        tvLongClick = (TextView) findViewById(R.id.tv_longClick);

    }
}
