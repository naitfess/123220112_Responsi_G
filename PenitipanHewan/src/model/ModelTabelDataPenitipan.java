/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lab Informatika
 */
public class ModelTabelDataPenitipan extends AbstractTableModel{
    List<DataPenitipan> dataPenitipan;
    String kolom[] = {"ID", "Nama Pemilik", "Nama Hewan", "Jenis Hewan", "Nomor HP", "Durasi Titip", "Total"};
    
    public ModelTabelDataPenitipan(List<DataPenitipan>dataPenitipan){
        this.dataPenitipan = dataPenitipan;
    }

    @Override
    public int getRowCount() {
        return dataPenitipan.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return kolom[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dataPenitipan.get(rowIndex).getId();
            case 1:
                return dataPenitipan.get(rowIndex).getNama_pemilik();
            case 2:
                return dataPenitipan.get(rowIndex).getNama_hewan();
            case 3:
                return dataPenitipan.get(rowIndex).getJenis_hewan();
            case 4:
                return dataPenitipan.get(rowIndex).getNomor_telepon();
            case 5:
                return dataPenitipan.get(rowIndex).getDurasi_titip();
            case 6:
                return dataPenitipan.get(rowIndex).getTotal_biaya();
            default:
                return null;
        }
    }
    
   
}
