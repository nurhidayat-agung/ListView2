package agung.nurhidayat.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    String[] array = {"alfa","beta","cupcake","donut","eclair","froyo","gingerbird","honeycomb","icecream sandwich","jellybean","kitkat","lollipop","marsmellow","noougat"};
    ArrayAdapter<String> androidversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView) findViewById(R.id.lv_1);
        androidversion = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, array);
        lv1.setAdapter(androidversion);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "ItemClick " + array [position], Toast.LENGTH_SHORT).show();

                Intent goClick = new Intent(MainActivity.this, ItemClick.class);
                goClick.putExtra("kirim",array[position]);
                startActivity(goClick);
            }
        });
        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, "ItemLongClick " + array [position], Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
