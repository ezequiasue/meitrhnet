package pt.ual.meit.dao.impl;

/**
 * Author: dell
 */

import org.springframework.stereotype.Repository;
import pt.ual.meit.dao.AbstractDao;
import pt.ual.meit.dao.CargoDao;
import pt.ual.meit.domain.Cargo;


@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao {

}
