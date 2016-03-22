package net.vincedgy.library.controllers;


import net.vincedgy.library.model.ParameterColumn;
import net.vincedgy.library.model.ParameterColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vincent on 21/03/2016.
 */


@Controller
@RequestMapping("/paramColumns")
public class ParameterColumnController {


    @Autowired
    ParameterColumnRepository parameterColumnRepository;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody List<ParameterColumn> getAllParametersColumns() {
        return parameterColumnRepository.findAll();
    }
}
