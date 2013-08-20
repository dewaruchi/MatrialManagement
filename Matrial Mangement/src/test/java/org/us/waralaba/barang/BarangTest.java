/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.us.waralaba.barang;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.us.matrial.barang.model.Barang;
import org.us.matrial.barang.service.BarangService;

/**
 *
 * @author adilramdan
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/app-context.xml" })
public class BarangTest {
    @Autowired
    BarangService barangService;
//    
//    @Ignore
//    @Before
    public void insert(){
        Barang barang = new Barang();
        barang.setId("001");
        barang.setHargaPokok(1000000000L);
        barang.setNama("semen");
        barang.setQty(4);
        barangService.saveOrUpdate(barang);
        
        Barang barang1 = new Barang();
        barang1.setId("002");
        barang1.setHargaPokok(2000000000L);
        barang1.setNama("paralon");
        barang1.setQty(2);
        
        
        barangService.saveOrUpdate(barang1);
    }
    @Test
    public void crud(){
        
        Assert.assertEquals(1, barangService.findByName("sem").size());
        
    }
}
