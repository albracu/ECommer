package co.alfredobravocuero.abracu.ecommerce;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.alfredobravocuero.abracu.ecommerce.R;

import java.util.ArrayList;

public class CategoriaTV extends Fragment {


    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.tv1, R.drawable.tv2, R.drawable.tv3, R.drawable.tv4, R.drawable.tv5, R.drawable.tv6,};
    private String[] TITLeGgrid = {"TV LED 24 Pulgadas", "Televisor LG 49", "TV LED 32 Pulgadas HD",  "TV LED 82 Pulgadas", "TV LED 43 Pulgadas", "TV 32 Pulgadas"};
    private String[] DIscriptiongrid = {"HD con TDT", "Smart Tv 4K", "Con TDT, wi-fi, HMI","Ultra H", "HD con TDY", "Ultra Hd Smart tv"};
    private String[] Dategrid = {"$350.000", "$2.299.999", "$459.999", "$5.999.999","$8999.999","$999.999"};




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttab1, container, false);

        gridview = (ExpandableHeightGridView)view.findViewById(R.id.gridview);
        beanclassArrayList= new ArrayList<Beanclass>();

        for (int i= 0; i< IMAGEgrid.length; i++) {

            Beanclass beanclass = new Beanclass(IMAGEgrid[i], TITLeGgrid[i], DIscriptiongrid[i], Dategrid[i]);
            beanclassArrayList.add(beanclass);

        }
        gridviewAdapter = new GridviewAdapter(getActivity(), beanclassArrayList);
        gridview.setExpanded(true);

        gridview.setAdapter(gridviewAdapter);
     return view;

    }
}