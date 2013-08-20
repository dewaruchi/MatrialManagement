package org.us.matrial.penjualan.repository;

import org.springframework.data.repository.CrudRepository;
import org.us.matrial.penjualan.model.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long>{

}
