package org.us.matrial.pembelian.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.pembelian.model.Supplier;
import org.us.matrial.pembelian.service.SupplierService;

import com.google.common.collect.Lists;

public class SupplierTableModel extends AbstractTableModel implements BaseTable<Supplier,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	SupplierService supplierService;
	List<Supplier> suppliers = null;
	
	public SupplierTableModel() {
		// TODO Auto-generated constructor stub
		suppliers =Lists.newArrayList(supplierService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return suppliers.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		switch (column) {
		case 0:
			return "No.";
		case 1:
			return "Nama";
		case 2:
			return "Keterangan";
	
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
		case 1:
			return suppliers.get(rowIndex).getNama();
		case 2:
			return suppliers.get(rowIndex).getKeterangan();
		default:
			return null;
		}
				
	}

	@Override
	public void save(Supplier entity) {
		// TODO Auto-generated method stub
		suppliers.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(Supplier entity,int index) {
		// TODO Auto-generated method stub
		suppliers.set(index, entity);
		fireTableDataChanged();
//		fireTableRowsUpdated(firstRow, lastRow);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		suppliers.remove(index);
		fireTableDataChanged();
	}
	

	@Override
	public Supplier get(int index){
		return suppliers.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<Supplier> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
