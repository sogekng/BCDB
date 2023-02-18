package com.DASFN.BCDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.DASFN.BCDB.Model.DadosModel;

@Repository
public interface DadosRepository extends JpaRepository<DadosModel, Integer> {
}
