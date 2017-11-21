package co.alfredobravocuero.abracu.ecommerce;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CategoriaCS extends Fragment {


    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.cs1, R.drawable.cs2, R.drawable.cs3, R.drawable.cs4, R.drawable.cs5, R.drawable.cs6,};
    private String[] TITLeGgrid = {"Casa en Robledo", "Casa en Poblado", "Casa Finca Santa Fe",  "Casa en LLano Grande", "Casa en Poblado", "Casa en Belen"};
    private String[] DIscriptiongrid = {"120 m2, 4 alcobas", "5 alcobas, 200 m2", "500 m2, 10 alcobas","5 alcobas, 350 m2", "300 m2, 5 habitaciones", "3 alcobas, 180 m2"};
    private String[] Dategrid = {"$120.120.000","$320.000.000","$1.200.000.000", "$700.000.000", "800.000.000","$102.000.000"};




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