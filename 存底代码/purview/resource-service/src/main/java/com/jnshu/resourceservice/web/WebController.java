package com.jnshu.resourceservice.web;

import org.springframework.security.access.prepost.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("/foo")
public class WebController {

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('CompanyManageAdd') AND hasAuthority('CompanyManageAll') ")
    public String getFoo() {
        return "i'm huangWeiBin, " + UUID.randomUUID().toString();
    }


}
