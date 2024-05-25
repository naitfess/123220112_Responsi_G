/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOPenitipan;
import java.sql.*;
import java.util.*;
import connection.Connector;
import model.*;
import DAOImplement.DataPenitipanImplement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab Informatika
 */
public class DataPenitipanDAO implements DataPenitipanImplement{
    Connection connection;
    
    //query untuk database mysql
    final String getAllData = "SELECT * from `titip_hewan`;";
    final String insert = "INSERT INTO `titip_hewan` (`nama_pemilik`, `nama_hewan`, `jenis_hewan`, `nomor_telepon`, `durasi_titip`, `total_biaya`) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "update titip_hewan set nama_pemilik=?, nama_hewan=?, jenis_hewan=?, nomor_telepon=?, durasi_titip=?, total_biaya=?;";
    final String delete = "delete from titip_hewan where id=?;";

    @Override
    public void insert(DataPenitipan dp) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, dp.getNama_pemilik());
            statement.setString(2, dp.getNama_hewan());
            statement.setString(3, dp.getJenis_hewan());
            statement.setString(4, dp.getNomor_telepon());
            statement.setInt(5, dp.getDurasi_titip());
            statement.setInt(6, dp.getTotal_biaya());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                dp.setId(rs.getInt(1));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(DataPenitipan dp) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, dp.getNama_pemilik());
            statement.setString(2, dp.getNama_hewan());
            statement.setString(3, dp.getJenis_hewan());
            statement.setString(4, dp.getNomor_telepon());
            statement.setInt(5, dp.getDurasi_titip());
            statement.setInt(6, dp.getTotal_biaya());
            statement.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DataPenitipan> getAll() {
        List<DataPenitipan> dataPenitipan = null;
        try{
            dataPenitipan = new ArrayList<DataPenitipan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(getAllData);
            while(rs.next()){
                DataPenitipan data = new DataPenitipan();
                data.setId(rs.getInt("id"));
                data.setNama_pemilik(rs.getString("nama_pemilik"));
                data.setNama_hewan(rs.getString("nama_hewan"));
                data.setJenis_hewan(rs.getString("jenis_hewan"));
                data.setNomor_telepon(rs.getString("nomor_telepon"));
                data.setDurasi_titip(rs.getInt("durasi_titip"));
                data.setTotal_biaya(rs.getInt("total_biaya"));
            }
        }catch(SQLException ex){
            Logger.getLogger(DataPenitipanDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return dataPenitipan;
    }
}
