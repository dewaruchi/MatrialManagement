package org.us.matrial.penjualan.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.us.matrial.base.iface.BaseTable;
import org.us.matrial.penjualan.model.Transaksi;
import org.us.matrial.penjualan.service.TransaksiService;

import com.google.common.collect.Lists;

public class TransaksiTableModel extends AbstractTableModel implements BaseTable<Transaksi,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	TransaksiService transaksiService;
	List<Transaksi> pengeluarans = null;
	
	public TransaksiTableModel() {
		// TODO Auto-generated constructor stub
		pengeluarans =Lists.newArrayList(transaksiService.findAll()); 
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
			return "Kode Barang";
		case 2:
			return "Nama Barang";
		case 3:
			return "Quantity";
		case 4 :
			return "Harga Satuan";
		case 5 :
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
			return pengeluarans.get(rowIndex).getBarang().getId();
		case 2 : 
			return pengeluarans.get(rowIndex).getBarang().getNama();
		case 3:
			return pengeluarans.get(rowIndex).getQty();	
		case 4:
			return pengeluarans.get(rowIndex).getHargaSatuan();
		case 5:
			return pengeluarans.get(rowIndex).getHargaSatuan() * pengeluarans.get(rowIndex).getQty();	
		
		
		default:
			return null;
		}
				
	}

	@Override
	public void save(Transaksi entity) {
		// TODO Auto-generated method stub
		pengeluarans.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(Transaksi entity,int index) {
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
	public Transaksi get(int index){
		return pengeluarans.get(index);
		
	}

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Iterable<Transaksi> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}
