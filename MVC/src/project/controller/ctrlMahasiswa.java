/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.controller;

import javax.swing.JOptionPane;
import project.model.Mahasiswa;
import project.view.frmMahasiswa;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class ctrlMahasiswa {
    private frmMahasiswa frm; //view
    private Mahasiswa mhs; //model
    
    public ctrlMahasiswa(frmMahasiswa frm) {
        this.frm = frm;
    }
    
    public void simpan() { //untuk menyimpan data
        mhs = new Mahasiswa();
        mhs.setNim(frm.getNim().getText());
        mhs.setNama(frm.getNama().getText());
        mhs.setUmur(Integer.parseInt(frm.getUmur().getText()));
        if(frm.getPria().isSelected() && !frm.getWanita().isSelected()){
            mhs.setJk("Pria");
        } else if (!frm.getPria().isSelected() && frm.getWanita().isSelected()) {
            mhs.setJk("Wanita");
        }
        mhs.setAlamat(frm.getAlama().getText());
        JOptionPane.showMessageDialog(frm, mhs.getNim()+"\n"+mhs.getNama()+"\n"+mhs.getUmur()+"\n"+mhs.getJk()+"\n"+mhs.getAlamat());
        
    }
}
