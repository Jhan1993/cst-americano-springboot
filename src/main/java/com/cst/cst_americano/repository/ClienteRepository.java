package com.cst.cst_americano.repository;

import com.cst.cst_americano.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Este es el repositorio que nos permite realizar CRUD en la tabla cliente

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
