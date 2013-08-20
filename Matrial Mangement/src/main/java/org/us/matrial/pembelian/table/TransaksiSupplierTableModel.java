package org.us.matrial.pembelian.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.pembelian.model.TransaksiSupplier;
import org.us.matrial.pembelian.service.TransaksiSupplierService;

import com.google.common.collect.Lists;

public class TransaksiSupplierTableModel extends AbstractTableModel implements BaseTable<TransaksiSupplier,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	TransaksiSupplierService transaksiSupplierService;
	List<TransaksiSupplier> transaksiSuppliers = null;
	
	public TransaksiSupplierTableModel() {
		// TODO Auto-generated constructor stub
		transaksiSuppliers =Lists.newArrayList(transaksiSupplierService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return transaksiSuppliers.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
	}

	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		switch (column) {
		case 0:
			return "No.";
		case 1:
			return "Kode Barang";
		case 2:
			return "Nama Barang";
		case 3:
			return "Quantity";
		case 4:
			return "Harga Satuan";
		case 5:
			return "Total";
		
			
		default:
			return null;
			
		}
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return rowIndex;
		case 1 : 
			return transaksiSuppliers.get(rowIndex).getBarang().getId();
		case 2 : 
			return transaksiSuppliers.get(rowIndex).getBarang().getNama();
		case 3:
			return transaksiSuppliers.get(rowIndex).getQty();
		case 4:
			return transaksiSuppliers.get(rowIndex).getHargaSatuan();
		case 5:
			return transaksiSuppliers.get(rowIndex).getQty() * transaksiSuppliers.get(rowIndex).getHargaSatuan(); 
			
		default:
			return null;
		}
				
	}

	@Override
	public void save(TransaksiSupplier entity) {
		// TODO Auto-generated method stub
		transaksiSuppliers.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(TransaksiSupplier entity,int index) {
		// TODO Auto-generated method stub
		transaksiSuppliers.set(index, entity);
		fireTableDataChanged();
//		fireTableRowsUpdated(firstRow, lastRow);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		transaksiSuppliers.remove(index);
		fireTableDataChanged();
	}
	

	@Override
	public TransaksiSupplier get(int index){
		return transaksiSuppliers.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<TransaksiSupplier> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
