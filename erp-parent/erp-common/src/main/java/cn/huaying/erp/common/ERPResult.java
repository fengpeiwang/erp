package cn.huaying.erp.common;

import java.io.Serializable;
/**
 * erp项目 自定义响应结构
 * @author admin
 */
public class ERPResult implements Serializable{
	private static final long serialVersionUID = 1L;
	//定义响应状态
	private Integer status;
	//响应消息
	private String msg;
	//响应中得数据
	private Object data;
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	 public static ERPResult build(Integer status, String msg, Object data) {
        return new ERPResult(status, msg, data);
    }

    public ERPResult() {

    }

    public static ERPResult build(Integer status, String msg) {
        return new ERPResult(status, msg, null);
    }

    public ERPResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

	
    public static ERPResult success(String msg,Object data) {
        return new ERPResult(null,null,data);
    }

    public static ERPResult success() {
        return new ERPResult(1,"操作成功！",null);
    }
    public static ERPResult error(String msg) {
    	return new ERPResult(0,msg,null);
    }

}
