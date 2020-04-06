package com.mostafapackage;

import com.mostafapackage.adapter.Image;
import com.mostafapackage.adapter.ImageView;
import com.mostafapackage.adapter.VividFilter;
import com.mostafapackage.adapter.avaFilters.CaramelFilter;
import com.mostafapackage.adapter.avaFilters.Carmel;
import com.mostafapackage.adapter.avaFilters.caramelAdapter;
import com.mostafapackage.composite.Group;
import com.mostafapackage.composite.Shape;
import com.mostafapackage.facade.Message;
import com.mostafapackage.facade.NotificationServer;
import com.mostafapackage.facade.NotificationService;
import com.mostafapackage.flyweight.Point;
import com.mostafapackage.flyweight.PointIconFactory;
import com.mostafapackage.flyweight.PointService;

public class Main {

    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for(Point point: service.getPoints())
            point.draw();
    }
}
