package com.DASFN.BCDB.Services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.DASFN.BCDB.FeingClient.FeingClient;
import com.DASFN.BCDB.FeingClient.FeingDTO.*;
import com.DASFN.BCDB.Model.DadosModel;
import com.DASFN.BCDB.Repositories.DadosRepository;

@Service
public class DadosService {

    @Autowired
    private FeingClient client;

    @Autowired
    private DadosRepository repository;

    public List<ValueDTO> getAllDados(){
        return client
        .getAll()
        .getValue();
    }

    public List<DadosModel> insert(){
        return repository.saveAll(client
        .getAll()
        .getValue()
        .stream()
        .map(c -> new DadosModel(c))
        .collect(Collectors
        .toList()));
    }
    
}
