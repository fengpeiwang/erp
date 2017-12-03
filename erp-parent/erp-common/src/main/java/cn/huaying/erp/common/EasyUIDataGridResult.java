package cn.huaying.erp.common;

import java.util.List;

/**
 * @author admin
 * EasyUI dataGrid返回
 */
public class EasyUIDataGridResult {
	Long total;
	List<?> rows;
	
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
	
}
