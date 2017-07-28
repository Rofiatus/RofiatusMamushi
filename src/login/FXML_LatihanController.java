/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author DwiAyu
 */
public class FXML_LatihanController implements Initializable {

    @FXML
    private Label lblHargaAyam, lblHargaGurame, lblHargaJus, lblHargaMilk, lblHasil,lblDiskon,lblHitungDiskon,lblDiBayar,lblKembali;
    @FXML
    private CheckBox ckAyam, ckGurame, ckJus, ckMilk;
    @FXML
    private TextField txtAyam, txtSubAyam, txtGurame, txtSubGurame, txtJus, txtSubJus, txtMilk, txtSubMilk, txtTotal,txtCash;
    @FXML
    private ComboBox cmbBayar;
     @FXML
    private Button btnClear;
    @FXML
    ObservableList<String> bayar = FXCollections.observableArrayList("Tunai", "ATM Card", "Credit Card");

    @FXML
    private void handleButtonAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
    }

    @FXML
    private void CheckBoxAyamAction(ActionEvent event) //menu ayam
    {
        if (ckAyam.isSelected()) {
            txtAyam.setEditable(true);
            txtAyam.setText("0");
            lblHargaAyam.setText("7000");
            txtSubAyam.setText("0");
        } else {
            txtAyam.setEditable(false);
            txtAyam.setText("0");
            lblHargaAyam.setText("");
            txtSubAyam.setText("0");           
        }
    }

    @FXML
    private void CheckBoxGurameAction(ActionEvent event)//menu gurame
    {
        if (ckGurame.isSelected()) {
            txtGurame.setEditable(true);
            txtGurame.setText("0");
            lblHargaGurame.setText("10000");
            txtSubGurame.setText("0");
        } else {
            txtGurame.setEditable(false);
            txtGurame.setText("0");
            lblHargaGurame.setText("");
            txtSubGurame.setText("0");

        }
    }

    @FXML
    private void CheckBoxJusAction(ActionEvent event) //menu ayam
    {
        if (ckJus.isSelected()) {
            txtJus.setEditable(true);
            txtJus.setText("0");
            lblHargaJus.setText("5000");
            txtSubJus.setText("0");
        } else {
            txtJus.setEditable(false);
            txtJus.setText("0");
            lblHargaJus.setText("");
            txtSubJus.setText("0");
        }
    }

    @FXML
    private void CheckBoxMilkAction(ActionEvent event) //menu ayam
    {
        if (ckMilk.isSelected()) {
            txtMilk.setEditable(true);
            txtMilk.setText("0");
            lblHargaMilk.setText("6000");
            txtSubMilk.setText("0");
        } else {
            txtMilk.setEditable(false);
            txtMilk.setText("0");
            lblHargaMilk.setText("");
            txtSubMilk.setText("0");
        }
    }

    @FXML
    private void txtAyamAction(KeyEvent event)//total harga ayam
    {
        int a = Integer.parseInt(txtAyam.getText());
        int b = Integer.parseInt(lblHargaAyam.getText());
        int nsubAyam;
        nsubAyam = a * b;
        txtSubAyam.setText("" + nsubAyam);
    }

    @FXML
    private void txtGurameAction(KeyEvent event)//total harga gurame
    {
        int a = Integer.parseInt(txtGurame.getText());
        int b = Integer.parseInt(lblHargaGurame.getText());
        int nsubGurame;
        nsubGurame = a * b;
        txtSubGurame.setText("" + nsubGurame);
    }

    @FXML
    private void txtJusAction(KeyEvent event)//total harga gurame
    {
        int a = Integer.parseInt(txtJus.getText());
        int b = Integer.parseInt(lblHargaJus.getText());
        int nsubJus;
        nsubJus = a * b;
        txtSubJus.setText("" + nsubJus);
    }

    @FXML
    private void txtMilkAction(KeyEvent event)//total harga gurame
    {
        int a = Integer.parseInt(txtMilk.getText());
        int b = Integer.parseInt(lblHargaMilk.getText());
        int nsubMilk;
        nsubMilk = a * b;
        txtSubMilk.setText("" + nsubMilk);
    }

    @FXML
    private void btnTotalAction(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
       boolean lDataOke = true;
        if (ckAyam.isSelected() && " ".equals(txtAyam.getText())) 
        lDataOke = false;
        if (ckGurame.isSelected() && " ".equals(txtGurame.getText())) {
            lDataOke = false;}      
        if (ckJus.isSelected() && " ".equals(txtJus.getText())){
             lDataOke = false;}
        if (ckMilk.isSelected() && " ".equals(txtMilk.getText())){ 
             lDataOke = false;}
      
      if (!lDataOke) {
          lblHasil.setText("Data Dilengkapi Dulu");
      } 
       else
       {      
        int total, a, b, c, d;
        a = Integer.parseInt(txtAyam.getText());
        b = Integer.parseInt(txtGurame.getText());
        c = Integer.parseInt(txtJus.getText());
        d = Integer.parseInt(txtMilk.getText());
        total = (7000*a)+(10000*b)+(5000*c)+(6000*d);
        txtTotal.setText(total+"");
       }
    }
    
    @FXML
    private void btnClearAction (ActionEvent event) {
// some if - else statements
            ckAyam.setSelected(false);
            txtAyam.setText("");
            txtAyam.setEditable(false);
            txtSubAyam.setText("");
            txtSubAyam.setEditable(false);
            ckGurame.setSelected(false);
            txtGurame.setText("");
            txtGurame.setEditable(false);
            txtSubGurame.setEditable(false);
            txtSubGurame.setText("");
            ckJus.setSelected(false);
            txtJus.setText("");
            txtJus.setEditable(false);
            txtSubJus.setEditable(false);
            txtSubJus.setText("");
            ckMilk.setSelected(false);
            txtMilk.setText("");
            txtMilk.setEditable(false);
            txtSubMilk.setEditable(false);
            txtSubMilk.setText("");
            lblHasil.setText("");
            lblDiskon.setText("");
            lblHitungDiskon.setText("");
            lblDiBayar.setText("");
            lblKembali.setText("");
            lblHargaAyam.setText("");
            lblHargaGurame.setText("");
            lblHargaJus.setText("");
            lblHargaMilk.setText("");
            txtTotal.setText("");
            txtTotal.setEditable(false);
            txtCash.setText("");
            txtCash.setEditable(false);
           // txtSubAyam.clear();
           // txtTotal.clear();
            
    }
    
    @FXML
    private void cmbBayar(ActionEvent event) {
        if (cmbBayar.getValue().toString().equalsIgnoreCase("Tunai")) {
            lblHasil.setText("Anda Bayar TUNAI");
            lblDiskon.setText("2%");
            txtCash.setEditable(true);
            int x,y,z;
            y=Integer.parseInt(txtTotal.getText());
            x=(2*y)/100;
            lblHitungDiskon.setText("-"+x);
            z=y-x;
            lblDiBayar.setText(""+z);
            lblKembali.setText("");
            
        }else
        if (cmbBayar.getValue().toString().equalsIgnoreCase("ATM Card")) {
            lblHasil.setText("Anda Bayar Debit Card");
            txtCash.setEditable(false);
            lblDiskon.setText(" 0%");
            lblHitungDiskon.setText(" 0%");
            txtCash.setText("");
            
          
        }else
            if(cmbBayar.getValue().toString().equalsIgnoreCase("Credit Card"))
            {
                lblHasil.setText("Anda Bayar Kartu Kredit");
                txtCash.setEditable(false);
                lblDiskon.setText(" 5%");
                txtCash.setEditable(false);
                txtCash.setText("");
                int x,y,z;
                y=Integer.parseInt(txtTotal.getText());
                x=(5*y)/100;
                lblHitungDiskon.setText("-"+x);
                z=y-x;
                lblDiBayar.setText(""+z);
                lblKembali.setText("");
            }     
    }
    
    @FXML
    private void txtBayarAction(KeyEvent event)//total harga gurame
    {
      int a = Integer.parseInt(txtCash.getText());
        int b = Integer.parseInt(lblDiBayar.getText());
        int kmbli;
        if(a<b){
            kmbli = b - a ;
            lblKembali.setText("Uang Anda Kurang  : "+ kmbli);
        }    
        else if(a>b){
            kmbli = a - b ;
            lblKembali.setText("Kembalian Anda :" + kmbli);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbBayar.getItems().removeAll(cmbBayar.getItems());
        cmbBayar.getItems().addAll("Tunai", "ATM Card", "Credit Card");
    }

    

}
