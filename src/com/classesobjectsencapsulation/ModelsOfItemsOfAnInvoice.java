package com.classesobjectsencapsulation;
class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	public InvoiceItem() {
		id="TS001";
		desc="Perfume";
	}
	public InvoiceItem(String id, String desc, int qty, double unitPrice) {
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public String getId() {
		return id;
	}
	public String getDesc() {
		return desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getTotal() {
		return unitPrice*qty;	
	}
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}	
}
public class ModelsOfItemsOfAnInvoice {

	public static void main(String[] args) {
		InvoiceItem it=new InvoiceItem("AB1001","Shoes",5,799.99);
		System.out.println(it);
		System.out.println(it.getTotal());
		InvoiceItem it1=new InvoiceItem();
		it1.setQty(3);
		it1.setUnitPrice(299.99);
		System.out.println(it1);
		System.out.println(it1.getTotal());
		

	}

}
