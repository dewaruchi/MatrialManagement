package org.us.matrial.pengeluaran.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.pengeluaran.model.PengeluaranSales;
import org.us.matrial.pengeluaran.service.PengeluaranSalesService;

import com.google.common.collect.Lists;

public class PengeluaranSalesTableModel extends AbstractTableModel implements BaseTable<PengeluaranSales,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	PengeluaranSalesService pengeluaranSalesService;
	List<PengeluaranSales> pengeluarans = null;
	
	public PengeluaranSalesTableModel() {
		// TODO Auto-generated constructor stub
		pengeluarans =Lists.newArrayList(pengeluaranSalesService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return pengeluarans.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5;
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
			return "Nama Supplier";
		case 3:
			return "Total";
		case 4 : 
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
		case 1 : 
			return pengeluarans.get(rowIndex).getInvoiceSupplier().getNo();
		case 2 : 
			return pengeluarans.get(rowIndex).getInvoiceSupplier().getSupplier().getNama();
		case 3:
			return pengeluarans.get(rowIndex).getTotal();	
		case 4:
			return pengeluarans.get(rowIndex).getKeterangan();	
		
		default:
			return null;
		}
				
	}

	@Override
	public void save(PengeluaranSales entity) {
		// TODO Auto-generated method stub
		pengeluarans.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(PengeluaranSales entity,int index) {
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
	public PengeluaranSales get(int index){
		return pengeluarans.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<PengeluaranSales> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
