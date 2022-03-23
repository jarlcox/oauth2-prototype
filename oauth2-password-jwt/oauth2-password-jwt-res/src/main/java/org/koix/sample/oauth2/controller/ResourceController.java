package org.koix.sample.oauth2.controller;

import org.koix.sample.oauth2.bean.Result;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController
{
    @GetMapping("/echo/{name}")
    public Result echo(@PathVariable String name)
    {
    	Authentication auth=SecurityContextHolder.getContext().getAuthentication();
    	Result rs=new Result();
    	rs.setStatus(200);
    	rs.setMessage("Hello, "+name+" with "+auth.getName());
        return rs;
    }
}
