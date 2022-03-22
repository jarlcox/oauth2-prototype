package org.koix.sample.oauth2.controller;

import org.koix.sample.oauth2.bean.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController
{
    @GetMapping("/echo/{name}")
    public Result echo(@PathVariable String name)
    {
    	Result rs=new Result();
    	rs.setStatus(200);
    	rs.setMessage("Hello, "+name);
        return rs;
    }
}
