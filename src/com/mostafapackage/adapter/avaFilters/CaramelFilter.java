package com.mostafapackage.adapter.avaFilters;

import com.mostafapackage.adapter.Filter;
import com.mostafapackage.adapter.Image;

public class CaramelFilter implements Filter {
    private Carmel carmel;

    public CaramelFilter(Carmel carmel) {
        this.carmel = carmel;
    }

    @Override
    public void apply(Image image) {
        carmel.init();
        carmel.render(image);
    }
}
