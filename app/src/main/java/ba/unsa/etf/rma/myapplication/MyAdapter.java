package ba.unsa.etf.rma.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MyAdapter extends ArrayAdapter<Muzicar> {

    ArrayList<Muzicar> lista = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Muzicar> objects) {
        super(context, textViewResourceId, objects);
        lista = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.element_liste, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        if (lista.get(position).getZanr().equals(Muzicar.Zanr.FOLK)) imageView.setImageResource(R.drawable.folk);
        if (lista.get(position).getZanr().equals(Muzicar.Zanr.ROCK)) imageView.setImageResource(R.drawable.rock);
        if (lista.get(position).getZanr().equals(Muzicar.Zanr.RAP)) imageView.setImageResource(R.drawable.rap);
        if (lista.get(position).getZanr().equals(Muzicar.Zanr.POP)) imageView.setImageResource(R.drawable.pop);
        if (lista.get(position).getZanr().equals(Muzicar.Zanr.JAZZ)) imageView.setImageResource(R.drawable.jazz);
        textView.setText(lista.get(position).getIme()+" "+lista.get(position).getPrezime()+"\n"+lista.get(position).getZanr().getImeZanra());
        return v;

    }

}