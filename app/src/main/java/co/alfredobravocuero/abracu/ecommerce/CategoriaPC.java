package co.alfredobravocuero.abracu.ecommerce;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.alfredobravocuero.abracu.ecommerce.R;

import java.util.ArrayList;

public class CategoriaPC extends Fragment {


    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.pc1, R.drawable.pc2, R.drawable.pc3, R.drawable.pc4, R.drawable.pc5, R.drawable.pc6,};
    private String[] TITLeGgrid = {"Portatil Asus X441UA", "Portatil Asus X441UV-FA189", "Portatil Dell 5567",  "Portátil Dell", "MPortátil 2 en 1 Dell Inspiron", "Portátil 2 en 1 Lenovo"};
    private String[] DIscriptiongrid = {"Intel Core i3 14 pulgadas", "Intel Core i7", " Intel Core i7 15.6 Pulgadas Gris"," Intel Core i5 15.6 Pulgadas 3567", "Core i5 15.6 Pulgadas", "Core i5 14 Pulgadas"};
    private String[] Dategrid = {"$949.847","$2.155.00","$2.706.000", "$1.700.000", "$2.650.000","1.650.000"};




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