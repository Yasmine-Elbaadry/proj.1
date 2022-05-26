/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1.sales.packag1;

/**
 *
 * @author yasmeen
 */
public class Model_invoices_items {
    /* no,item name,item price,count,item total */
    private int number ;
    private String iteme_name ;
    private int item_price ;
    private int count ;
    private int total ;
    private Model_Invoice_data Model_invoice_data ;

    public Model_invoices_items() {
    }

    public Model_invoices_items(int number, String iteme_name, int item_price, int count, int total) {
        this.number = number;
        this.iteme_name = iteme_name;
        this.item_price = item_price;
        this.count = count;
        this.total = total;
    }

    public Model_invoices_items(int number, String iteme_name, int item_price, int count, int total, Model_Invoice_data Model_invoice_data) {
        this.number = number;
        this.iteme_name = iteme_name;
        this.item_price = item_price;
        this.count = count;
        this.total = total;
        this.Model_invoice_data = Model_invoice_data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getIteme_name() {
        return iteme_name;
    }

    public void setIteme_name(String iteme_name) {
        this.iteme_name = iteme_name;
    }

    public int getItem_price() {
        return item_price;
    }

    public void setItem_price(int item_price) {
        this.item_price = item_price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
}
