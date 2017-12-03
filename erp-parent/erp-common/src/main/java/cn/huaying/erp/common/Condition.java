package cn.huaying.erp.common;

import java.util.Date;

/**
 * 条件扩展类
 * @author admin
 *
 */
public class Condition {
	//名称
	private String cname;
	//电话
	private String ctele;
	//日期
	private Date  cdate;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtele() {
		return ctele;
	}
	public void setCtele(String ctele) {
		this.ctele = ctele;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

}
