package pkg.entity;

import java.math.BigDecimal;


public class Cart {
	/**
	 * ���ﳵ��Ŀ��ʵ����
	 * 
	 */
	private int foodid;
	private String foodname;
	private String imgp;
	private BigDecimal foodprice;
	private int foodnum;
	
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getImgp() {
		return imgp;
	}
	public void setImgp(String imgp) {
		this.imgp = imgp;
	}
	public BigDecimal getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(BigDecimal foodprice) {
		this.foodprice = foodprice;
	}
	public int getFoodnum() {
		return foodnum;
	}
	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	
	
	
	
}
