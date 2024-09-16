package com.ahmed.tets.photoz;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Component
@Service
class PhotozService {
    private Map<String, Photo> db = new HashMap<>(){{
        put("1", new Photo(new byte[]{1, 2, 3, 4}));
    }};


}
