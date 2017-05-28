package psm.projekt.kalkulatorpodatkowy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by grzeg on 22.05.2017.
 */

public class WybierzKraj extends Activity {

    private ListView listKraje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wybierz_kraj);

        listKraje = (ListView)findViewById(R.id.listKraje);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(WybierzKraj.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.kraje));

        listKraje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String name = listKraje.getItemAtPosition(position).toString();

                switch (name) {
                    case "Polska":
                        Intent intent = new Intent(WybierzKraj.this, PodatkiPolska.class);
                        startActivity(intent);
                        break;
                    case "Anglia":
                        Intent intent1 = new Intent(WybierzKraj.this, PodatkiAnglia.class);
                        startActivity(intent1);
                        break;
                    case "Irlandia":
                        Intent intent2 = new Intent(WybierzKraj.this, PodatkiIrlandia.class);
                        startActivity(intent2);
                        break;
                }


            }
        });

        listKraje.setAdapter(arrayAdapter);

    }
}
