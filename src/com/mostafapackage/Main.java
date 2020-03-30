package com.mostafapackage;

import com.mostafapackage.adapter.Image;
import com.mostafapackage.adapter.ImageView;
import com.mostafapackage.adapter.VividFilter;
import com.mostafapackage.adapter.avaFilters.CaramelFilter;
import com.mostafapackage.adapter.avaFilters.Carmel;
import com.mostafapackage.adapter.avaFilters.caramelAdapter;
import com.mostafapackage.composite.Group;
import com.mostafapackage.composite.Shape;

public class Main {

    public static void main(String[] args) {

        var imageView = new ImageView(new Image());
        var carmelFilter = new CaramelFilter(new Carmel());
        var vividFilter = new VividFilter();
        imageView.apply(vividFilter);
        imageView.apply(carmelFilter);

        //this is not a good approach because of multiple inheritances. (image the Filter was an abstract class)
        imageView.apply(new caramelAdapter());
    }
}
