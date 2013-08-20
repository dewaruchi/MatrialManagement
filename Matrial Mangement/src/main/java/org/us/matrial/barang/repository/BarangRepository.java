package org.us.matrial.barang.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.us.matrial.barang.model.Barang;

public interface BarangRepository extends CrudRepository<Barang, String>  {

}
