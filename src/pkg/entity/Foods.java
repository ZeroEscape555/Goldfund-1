package pkg.entity;

import java.math.BigDecimal;

/**
 * 
 * @author VULCAN
 * 商品实体类
 */

public class Foods {
	private long foodid;
	private String foodname;
	private BigDecimal foodprice;
	private String foodkind;
	private String foodds;
	private String imgp;
	public String getImgp() {
		return imgp;
	}
	public void setImgp(String imgp) {
		this.imgp = imgp;
	}
	public long getFoodid() {
		return foodid;
	}
	public void setFoodid(long foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public BigDecimal getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(BigDecimal foodprice) {
		this.foodprice = foodprice;
	}
	public String getFoodkind() {
		return foodkind;
	}
	public void setFoodkind(String foodkind) {
		this.foodkind = foodkind;
	}
	public String getFoodds() {
		return foodds;
	}
	public void setFoodds(String foodds) {
		this.foodds = foodds;
	}
	
	
	
	
}
