/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1.sales.packag1;

import java.util.ArrayList;

/**
 *
 * @author yasmeen
 */
public class Model_Invoice_data {
    /*invoice_Number , invoice_date , Customer_name ,invoice_total */
    private int I_number ;
    private String I_date ;
    private String customer ;
    private int I_total ;
    private ArrayList<Model_invoices_items> Model_invoices_items ;

    public Model_Invoice_data() {
    }

    public Model_Invoice_data(int I_number, String I_date, String customer, int I_total) {
        this.I_number = I_number;
        this.I_date = I_date;
        this.customer = customer;
        this.I_total = I_total;
    }

    public Model_Invoice_data(int I_number, String I_date, String customer, int I_total, ArrayList<Model_invoices_items> Model_invoices_items) {
        this.I_number = I_number;
        this.I_date = I_date;
        this.customer = customer;
        this.I_total = I_total;
        this.Model_invoices_items = Model_invoices_items;
    }

    public int getI_total() {
        return I_total;
    }

    public void setI_total(int I_total) {
        this.I_total = I_total;
    }

    public int getI_number() {
        return I_number;
    }

    public void setI_number(int I_number) {
        this.I_number = I_number;
    }

    public String getI_date() {
        return I_date;
    }

    public void setI_date(String I_date) {
        this.I_date = I_date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    
    
}
