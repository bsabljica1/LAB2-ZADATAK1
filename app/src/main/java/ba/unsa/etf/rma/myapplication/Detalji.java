package ba.unsa.etf.rma.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class Detalji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalji);

        TextView imetv = (TextView) findViewById(R.id.textView2);
        imetv.setText(getIntent().getStringExtra("imeAutora")+" "+getIntent().getStringExtra("prezimeAutora")+"\n"+getIntent().getStringExtra("zanrAutora"));

         final TextView webtv = (TextView) findViewById(R.id.textView3);
        webtv.setText(getIntent().getStringExtra("webAutora"));

        webtv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String url = webtv.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });
}
}