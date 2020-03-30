package com.mostafapackage.adapter.avaFilters;

import com.mostafapackage.adapter.Filter;
import com.mostafapackage.adapter.Image;

//this is not a good approach because of multiple inheritances. (image the Filter was an abstract class)
public class caramelAdapter extends Carmel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
