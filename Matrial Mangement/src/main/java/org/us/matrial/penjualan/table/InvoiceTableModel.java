package org.us.matrial.penjualan.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.penjualan.model.Invoice;
import org.us.matrial.penjualan.service.InvoiceService;

import com.google.common.collect.Lists;

public class InvoiceTableModel extends AbstractTableModel implements BaseTable<Invoice,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	InvoiceService invoiceService;
	List<Invoice> pengeluarans = null;
	
	public InvoiceTableModel() {
		// TODO Auto-generated constructor stub
		pengeluarans =Lists.newArrayList(invoiceService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return pengeluarans.size();
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
			return "Invoice No.";
		case 2:
			return "Total";
		
		case 3:
			return "Lunas?";
		
		case 4 :
			return "Bayar";
		case 5 : 
			return "Sisa";
			
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
			return pengeluarans.get(rowIndex).getNo();
		case 2 : 
			return pengeluarans.get(rowIndex).getTotal();
		case 3:
			return pengeluarans.get(rowIndex).getLunas().getStatus();	
		case 4:
			return pengeluarans.get(rowIndex).getBayar();	
		case 5:
			return pengeluarans.get(rowIndex).getSisa();	
		
		
		default:
			return null;
		}
				
	}

	@Override
	public void save(Invoice entity) {
		// TODO Auto-generated method stub
		pengeluarans.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(Invoice entity,int index) {
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
	public Invoice get(int index){
		return pengeluarans.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<Invoice> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
