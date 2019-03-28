package ba.unsa.etf.rma.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.simpleListView);

        final ArrayList<Muzicar> unosi = new ArrayList<>();
        unosi.add(new Muzicar("Bijelo","Dugme", Muzicar.Zanr.ROCK,"AAAA","https://hr.wikipedia.org/wiki/Bijelo_dugme"));
        unosi.add(new Muzicar("Lana","Jurcevic", Muzicar.Zanr.POP,"AAAA","https://hr.wikipedia.org/wiki/Lana_Jurčević"));
        unosi.add(new Muzicar("Himzo","Polovina", Muzicar.Zanr.FOLK,"AAAA","https://bs.wikipedia.org/wiki/Himzo_Polovina"));
        unosi.add(new Muzicar("Buba","Corelli", Muzicar.Zanr.RAP,"AAAA","https://hr.wikipedia.org/wiki/Buba_Corelli"));
        unosi.add(new Muzicar("Ray","Charles", Muzicar.Zanr.JAZZ,"AAAA","https://hr.wikipedia.org/wiki/Ray_Charles"));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.element_liste,unosi);
        lista.setAdapter(myAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this, Detalji.class);
                myIntent.putExtra("imeAutora", unosi.get(position).getIme());
                myIntent.putExtra("prezimeAutora", unosi.get(position).getPrezime());
                myIntent.putExtra("zanrAutora", unosi.get(position).getZanr().getImeZanra());
                myIntent.putExtra("webAutora", unosi.get(position).getWebStranica());
                  MainActivity.this.startActivity(myIntent);}});
        }

    }

