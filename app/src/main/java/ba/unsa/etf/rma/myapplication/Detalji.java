package ba.unsa.etf.rma.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Detalji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalji);

        TextView imetv = (TextView) findViewById(R.id.textView2);
        imetv.setText(getIntent().getStringExtra("imeAutora")+" "+getIntent().getStringExtra("prezimeAutora")+"\n"+getIntent().getStringExtra("zanrAutora"));
    }
}