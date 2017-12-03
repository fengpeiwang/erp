package cn.huaying.erp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cn.huaying.erp.common.Condition;
import cn.huaying.erp.common.ERPResult;
import cn.huaying.erp.common.EasyUIDataGridResult;
import cn.huaying.erp.dao.entity.Dep;
import cn.huaying.erp.web.service.DepService;

/**
 * @author admin
 * 部门Controller
 */
@RestController
public class DepController {

	@Autowired
	private DepService depService;
	
	/**
	 * 部门列表+条件
	 */
	
	@RequestMapping(value="/erp/dep",method=RequestMethod.GET)
	public EasyUIDataGridResult findDepListByCondition(Condition con,Integer page,Integer rows){
		return depService.findDepListByCondition(con,page,rows);
	}
	/**
	 * 添加部门
	 */
	@RequestMapping(value="/erp/dep",method=RequestMethod.POST)
	public ERPResult addDep(Dep dep){
		return depService.save(dep);
	}
	/**
	 * 删除部门
	 */
	@RequestMapping(value="/erp/dep",method=RequestMethod.DELETE)
	public ERPResult delDep(@RequestParam("id")Long uuid) {
		return depService.del(uuid);
	}
	/**
	 * 根据id查询部门信息
	 */
	@RequestMapping(value="/erp/dep/{uuid}",method=RequestMethod.GET)
	public Dep findById(@PathVariable("uuid")Long uuid){
		return depService.findById(uuid);
	}
	
}
