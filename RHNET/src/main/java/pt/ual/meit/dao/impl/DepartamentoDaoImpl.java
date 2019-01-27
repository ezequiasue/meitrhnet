package pt.ual.meit.dao.impl;

/**
 * Author: dell
 */

import org.springframework.stereotype.Repository;
import pt.ual.meit.dao.AbstractDao;
import pt.ual.meit.dao.DepartamentoDao;
import pt.ual.meit.domain.Departamento;


@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

}
