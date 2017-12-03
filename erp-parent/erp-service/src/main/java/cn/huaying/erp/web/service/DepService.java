package cn.huaying.erp.web.service;


import cn.huaying.erp.common.Condition;
import cn.huaying.erp.common.ERPResult;
import cn.huaying.erp.common.EasyUIDataGridResult;
import cn.huaying.erp.dao.entity.Dep;

/**
 * @author admin
 * 部门Service接口
 */
public interface DepService {
	//部门列表+条件+分页
	EasyUIDataGridResult findDepListByCondition(Condition con, Integer page, Integer rows);
	//部门添加
	ERPResult save(Dep dep);
	//部门删除
	ERPResult del(Long uuid);
	//根据id查询部门信息
	Dep findById(Long uuid);
}
