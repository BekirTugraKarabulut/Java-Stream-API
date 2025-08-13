package com.tugra.controller;

import com.tugra.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/stream")
public class StreamController {

    @Autowired
    private StreamService streamService;

}
