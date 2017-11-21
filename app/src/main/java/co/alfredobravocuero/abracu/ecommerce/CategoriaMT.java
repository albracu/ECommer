package co.alfredobravocuero.abracu.ecommerce;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.alfredobravocuero.abracu.ecommerce.R;

import java.util.ArrayList;

public class CategoriaMT extends Fragment {


    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.mt1, R.drawable.mt2, R.drawable.mt3, R.drawable.mt4, R.drawable.mt5, R.drawable.mt6,};
    private String[] TITLeGgrid = {"Bws x 2018", "CRYPTON FI", "FZ 2.0",  "XT 660R", "Viking VI ", "YZ 450F"};
    private String[] DIscriptiongrid = {"Cilindraje: 125 cc", "Semiautomatica 115 cc", "5 velocidades, 200 cc","600 cc", "Modelo 2017", "Cilindraje 449cm3"};
    private String[] Dategrid = {"$7.448.200 ","$4.990.000","$6.590.000", "$26.700.000", " $69.000.000","$27.990.000"};




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