package com.adobe.aem.guides.wkndspa.react.core.models;

import com.adobe.cq.export.json.ComponentExporter;

public interface OpenWeatherModel extends ComponentExporter {

    String getLabel();

    double getLat();

    double getLon();
}
