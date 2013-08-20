package org.us.matrial.pembelian.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.pembelian.model.InvoiceSupplier;
import org.us.matrial.pembelian.service.InvoiceSupplierService;

import com.google.common.collect.Lists;

public class InvoiceSupplierTableModel extends AbstractTableModel implements BaseTable<InvoiceSupplier,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	InvoiceSupplierService invoiceSupplierService;
	List<InvoiceSupplier> invoiceSuppliers = null;
	
	public InvoiceSupplierTableModel() {
		// TODO Auto-generated constructor stub
		invoiceSuppliers =Lists.newArrayList(invoiceSupplierService.findAll()); 
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return invoiceSuppliers.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
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
			return "Quantity";
		case 3:
			return "Nama Supplier ";
		case 4:
			return "Total";
		case 5:
			return "Bayar";
		case 6:
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
		case 1:
			return invoiceSuppliers.get(rowIndex).getNo();
		case 2:
			return invoiceSuppliers.get(rowIndex).getSupplier().getNama();
		case 3:
			return invoiceSuppliers.get(rowIndex).getTotal();
		case 4:
			return invoiceSuppliers.get(rowIndex).getBayar();
		case 5:
			return invoiceSuppliers.get(rowIndex).getSisa();
		case 6:
			return invoiceSuppliers.get(rowIndex).getLunas().getStatus();
		default:
			return null;
		}
				
	}

	@Override
	public void save(InvoiceSupplier entity) {
		// TODO Auto-generated method stub
		invoiceSuppliers.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(InvoiceSupplier entity,int index) {
		// TODO Auto-generated method stub
		invoiceSuppliers.set(index, entity);
		fireTableDataChanged();
//		fireTableRowsUpdated(firstRow, lastRow);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		invoiceSuppliers.remove(index);
		fireTableDataChanged();
	}
	

	@Override
	public InvoiceSupplier get(int index){
		return invoiceSuppliers.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<InvoiceSupplier> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
