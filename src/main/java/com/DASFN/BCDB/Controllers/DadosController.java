package com.DASFN.BCDB.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.DASFN.BCDB.FeingClient.FeingDTO.*;
import com.DASFN.BCDB.Services.DadosService;


@RestController
@RequestMapping("/dados")
public class DadosController {

    @Autowired
    private DadosService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getValue(){
        return ResponseEntity.ok(service.getAllDados());
    }


    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity saveAll(){
        return ResponseEntity.ok(service.insert());
    }
}
