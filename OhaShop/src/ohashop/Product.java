/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohashop;

public class Product {
    private int id;
    private String name;
    private int qty;
    private float cost;
    private float mrp;
    private String bname;
    private String bemail;
    private String bmobil;
    private String addDate;
    
    public Product(int pid, String pname, int pqty, float pcost, float pmrp, String bname, String bemail, String bmobil, String pbname, String pbemail, String pbmobil, String pbaddDate){
    
        this.id = pid;
        this.name=pname;
        this.qty=pqty;
        this.cost=pcost;
        this.mrp=pmrp;
        this.bname=pbname;
        this.bemail=pbemail;
        this.bmobil=pbmobil;
        this.addDate=pbaddDate;
    
    /**
     *
     * @return
     */
    public int getId()
        {
        return id;   
        }
    public String getName()
        {
        return name;   
        }
    public int getQty()
            {
            return qty;   
            }
    public float getcost()
            {
            return cost;   
            }
    public float getmrp()
            {
            return mrp;   
            }
    public String getBname()
            {
            return bname;   
            }
    public String getBemail()
            {
            return bemail;   
            }
    public String getBmobile()
            {
            return bmobil;   
            }
    public String getAdddate()
            {
            return addDate;   
            }

    
}
