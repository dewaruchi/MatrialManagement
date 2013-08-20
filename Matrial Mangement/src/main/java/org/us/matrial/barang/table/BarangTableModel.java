package org.us.matrial.barang.table;

import com.google.common.collect.Lists;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import org.springframework.stereotype.Component;

import org.us.matrial.barang.model.Barang;
import org.us.matrial.base.iface.BaseTable;

@Component(value = "barangTableModel")
public class BarangTableModel extends AbstractTableModel implements BaseTable<Barang,Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Barang> barangs ;
	
        public void setData(List<Barang> barangs){
            this.barangs = barangs;
        }
        

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return barangs.size();
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
			return "Kode Barang";
		case 1:
			return "Nama Barang";
		case 2:
			return "Quantity";

		default:
			return null;
			
		}
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		switch (columnIndex) {
		case 0:
			return barangs.get(rowIndex).getId();
		case 1:
			return barangs.get(rowIndex).getNama();
		case 2:
			return barangs.get(rowIndex).getQty();

		default:
			return null;
		}
				
	}

	@Override
	public void save(Barang entity) {
		// TODO Auto-generated method stub
                barangs.clear();
		barangs.add(entity);
		fireTableDataChanged();
		
	}

	@Override
	public void update(Barang entity,int index) {
		// TODO Auto-generated method stub
		barangs.set(index, entity);
		fireTableDataChanged();
//		fireTableRowsUpdated(firstRow, lastRow);
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		barangs.remove(index);
		fireTableDataChanged();
	}
	

	@Override
	public Barang get(int index){
		return barangs.get(index);
		
	}

    @Override
    public void clear() {
        barangs.clear();
        fireTableDataChanged();
    }

    @Override
    public void save(Iterable<Barang> list) {
        barangs.clear();
        barangs.addAll(Lists.newArrayList(list));
        fireTableDataChanged();
    }
	
}
