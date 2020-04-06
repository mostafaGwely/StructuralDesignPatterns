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

public class Main {

    public static void main(String[] args) {
        var notiService = new NotificationService();
        notiService.send("hello world", "target1");
    }
}
