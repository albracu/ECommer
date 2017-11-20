package co.alfredobravocuero.abracu.ecommerce;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter1 extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter1(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                CategoriaTV tab1 = new CategoriaTV();
                return tab1;
            case 1:
                CategoriaPC tab2 = new CategoriaPC();
                return tab2;
            case 2:
                CategoriaMT tab3 = new CategoriaMT();
                return tab3;
            case 3:
                CategoriaMD tab4 = new CategoriaMD();
                return tab4;
            case 4:
                CategoriaCS tab5 = new CategoriaCS();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}