/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import DAOPenitipan.DataPenitipanDAO;
import DAOImplement.DataPenitipanImplement;
import model.*;
import view.MainView;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class DataPenitipanController {
    MainView frame;
    DataPenitipanImplement impDataPenitipan;
    List<DataPenitipan> dataPenitipan;
    
    public DataPenitipanController(MainView frame){
        this.frame = frame;
        impDataPenitipan = new DataPenitipanDAO();
        dataPenitipan = impDataPenitipan.getAll();
    }
    
    public void isiTabel(){
        dataPenitipan = impDataPenitipan.getAll();
        ModelTabelDataPenitipan modelTDP = new ModelTabelDataPenitipan(dataPenitipan);
        frame.getTableDataPenitipan().setModel(modelTDP);
    }
    
    public void insert(){
        try{
            int harga;
            int durasi = Integer.parseInt(frame.getTfDurasiTitip().getText());
            DataPenitipan dataPenitipan = new DataPenitipan();
            dataPenitipan.setNama_pemilik(frame.getTfNamaPemilik().getText());
            dataPenitipan.setNama_hewan(frame.getTfNamaHewan().getText());
            dataPenitipan.setJenis_hewan(frame.getTfNamaHewan().getText());
            dataPenitipan.setNomor_telepon(frame.getTfNomorTelepon().getText());
            dataPenitipan.setDurasi_titip(Integer.parseInt(frame.getTfDurasiTitip().getText()));
            if (durasi <= 2){
                harga = 100000*durasi;
            }else if(durasi>3){
                harga = 100000*durasi + 50000*(durasi-2);
            }else{
                harga = 0;
            }
            dataPenitipan.setTotal_biaya(harga);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Durasi harus berupa angka", "ERROR", JOptionPane.ERROR_MESSAGE);
        
        }
    }
    
    public void update(){
        try{
            int harga;
            int durasi = Integer.parseInt(frame.getTfDurasiTitip().getText());
            DataPenitipan dataPenitipan = new DataPenitipan();
            dataPenitipan.setNama_pemilik(frame.getTfNamaPemilik().getText());
            dataPenitipan.setNama_hewan(frame.getTfNamaHewan().getText());
            dataPenitipan.setJenis_hewan(frame.getTfNamaHewan().getText());
            dataPenitipan.setNomor_telepon(frame.getTfNomorTelepon().getText());
            dataPenitipan.setDurasi_titip(Integer.parseInt(frame.getTfDurasiTitip().getText()));
            if (durasi <= 2){
                harga = 100000*durasi;
            }else if(durasi>3){
                harga = 100000*durasi + 50000*(durasi-2);
            }else{
                harga = 0;
            }
            dataPenitipan.setTotal_biaya(harga);
            dataPenitipan.setId(frame.getSelectedId());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(frame, "Durasi harus berupa angka", "ERROR", JOptionPane.ERROR_MESSAGE);
        
        }
    }
}
