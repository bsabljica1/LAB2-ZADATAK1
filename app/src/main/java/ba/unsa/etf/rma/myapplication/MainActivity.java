package ba.unsa.etf.rma.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button dugme;
    private EditText tekst;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dugme = (Button)findViewById(R.id.button);
        tekst = (EditText) findViewById(R.id.editText);
        lista = (ListView)findViewById(R.id.listView);

        final ArrayList<String> unosi = new ArrayList<String>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.element_liste,R.id.Itemname,unosi);

        lista.setAdapter(adapter);

        dugme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                unosi.add(0,tekst.getText().toString());
                adapter.notifyDataSetChanged();
                tekst.setText("");
            }
        });

    }

}
