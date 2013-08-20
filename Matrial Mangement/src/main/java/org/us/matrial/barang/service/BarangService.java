package org.us.matrial.barang.service;

import java.util.List;
import org.us.matrial.barang.model.Barang;
import org.us.matrial.base.iface.BaseService;

public interface BarangService extends BaseService<Barang, String> {
    public List<Barang> findByName(String name);
}
