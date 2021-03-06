package psm.projekt.kalkulatorpodatkowy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/**
 * Created by grzeg on 23.05.2017.
 */

public class WybierzStatus extends Activity {

    Button btnStudent;
    Button btnNieStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wybierz_status);

        btnStudent = (Button)findViewById(R.id.btnStudent);
        btnNieStudent = (Button)findViewById(R.id.btnNieStudent);

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WybierzStatus.this, ObliczPodatki.class);
                intent.putExtra("umowaO", "Zlecenie ze studentem");
                startActivity(intent);
            }
        });

        btnNieStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WybierzStatus.this, ObliczPodatki.class);
                intent.putExtra("umowaO", "Zlecenie z dorosłym");
                startActivity(intent);
            }
        });
    }

}
