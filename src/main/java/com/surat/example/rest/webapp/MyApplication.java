package com.surat.example.rest.webapp;

import com.surat.example.rest.service.RestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class MyApplication extends ResourceConfig {

    public MyApplication(){
        packages(RestService.class.getPackage().getName());
        register(JspMvcFeature.class);
    }
}
