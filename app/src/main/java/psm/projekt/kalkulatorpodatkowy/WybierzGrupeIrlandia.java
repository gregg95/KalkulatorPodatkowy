package psm.projekt.kalkulatorpodatkowy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by grzeg on 27.05.2017.
 */

public class WybierzGrupeIrlandia extends Activity {

    Button btnGrupaA;
    Button btnGrupaB;
    Button btnGrupaC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wybierz_grupe_irl);

        btnGrupaA = (Button)findViewById(R.id.btnGrupaA);
        btnGrupaB = (Button)findViewById(R.id.btnGrupaB);
        btnGrupaC = (Button)findViewById(R.id.btnGrupaC);

        btnGrupaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WybierzGrupeIrlandia.this, ObliczSpadekDarowizneIrlandia.class);
                intent.putExtra("grupa", "Grupa A");
                startActivity(intent);
            }
        });

        btnGrupaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WybierzGrupeIrlandia.this, ObliczSpadekDarowizneIrlandia.class);
                intent.putExtra("grupa", "Grupa B");
                startActivity(intent);
            }
        });

        btnGrupaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WybierzGrupeIrlandia.this, ObliczSpadekDarowizneIrlandia.class);
                intent.putExtra("grupa", "Grupa C");
                startActivity(intent);
            }
        });
    }
}