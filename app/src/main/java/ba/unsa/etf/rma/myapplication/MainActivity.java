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

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.simpleListView);

        final ArrayList<Muzicar> unosi = new ArrayList<>();
        unosi.add(new Muzicar("Bakir","Sabljica", Muzicar.Zanr.ROCK));
        unosi.add(new Muzicar("Keba","Sabljica", Muzicar.Zanr.POP));
        unosi.add(new Muzicar("Bake","Sabljica", Muzicar.Zanr.FOLK));
        unosi.add(new Muzicar("Kirba","Sabljica", Muzicar.Zanr.RAP));
        unosi.add(new Muzicar("Kebinjo","Sabljica", Muzicar.Zanr.JAZZ));

        MyAdapter myAdapter=new MyAdapter(this,R.layout.element_liste,unosi);
        lista.setAdapter(myAdapter);

    }

}
