package com.DASFN.BCDB.FeingClient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DASFN.BCDB.FeingClient.FeingDTO.*;

@FeignClient(name="Client",
url = "https://olinda.bcb.gov.br/olinda/servico/taxaJuros/versao/v2/odata/TaxasJurosMensalPorMes?$format=json")
public interface FeingClient {

    @RequestMapping(method = RequestMethod.GET)
    FeingDTO getAll();
}
