package org.us.matrial.penjualan.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.penjualan.model.Customer;
import org.us.matrial.penjualan.service.CustomerService;

import com.google.common.collect.Lists;

public class CustomerTableModel extends AbstractTableModel implements BaseTable<Customer,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	CustomerService customerService;
	List<Customer> pengeluarans = null;
	
	public CustomerTableModel() {
		// TODO Auto-generated constructor stub
		pengeluarans =Lists.newArrayList(customerService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return pengeluarans.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
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
			return "Alamat";
		
		case 3:
			return "No Hp";
		
		
			
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
			return pengeluarans.get(rowIndex).getNama();
		case 2 : 
			return pengeluarans.get(rowIndex).getAlamat();
		case 3:
			return pengeluarans.get(rowIndex).getNoHp();	
		default:
			return null;
		}
				
	}

	@Override
	public void save(Customer entity) {
		// TODO Auto-generated method stub
		pengeluarans.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(Customer entity,int index) {
		// TODO Auto-generated method stub
		pengeluarans.set(index, entity);
		fireTableDataChanged();
//		fireTableRowsUpdated(firstRow, lastRow);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		pengeluarans.remove(index);
		fireTableDataChanged();
	}
	

	@Override
	public Customer get(int index){
		return pengeluarans.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<Customer> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
