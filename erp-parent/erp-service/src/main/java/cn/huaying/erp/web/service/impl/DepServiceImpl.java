package cn.huaying.erp.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.huaying.erp.common.Condition;
import cn.huaying.erp.common.ERPResult;
import cn.huaying.erp.common.EasyUIDataGridResult;
import cn.huaying.erp.dao.entity.Dep;
import cn.huaying.erp.dao.entity.DepExample;
import cn.huaying.erp.dao.entity.DepExample.Criteria;
import cn.huaying.erp.dao.mapper.DepMapper;
import cn.huaying.erp.web.service.DepService;
/**
 * @author admin
 * 部门Service实现类
 */
@Service
public class DepServiceImpl implements DepService {
	private Logger logger = LoggerFactory.getLogger(DepServiceImpl.class);
	@Autowired
	private DepMapper depMapper;
	/**
	 * 部门列表查询+分页+条件
	 */
	public EasyUIDataGridResult findDepListByCondition(Condition con, Integer page, Integer rows) {
		// 设置分页信息
		if (page == null) {
			page = 1;
		}
		PageHelper.startPage(page, rows);
		DepExample example = new DepExample();
		
		Criteria criteria = example.createCriteria();
		if(StringUtils.hasText(con.getCname())){
			criteria.andNameLike(con.getCname());
		}
		if(StringUtils.hasText(con.getCtele())){
			criteria.andNameLike(con.getCtele());
		}
		example.setOrderByClause("uuid desc");
		List<Dep> list = depMapper.selectByExample(example);
		PageInfo<Dep> pageInfo = new PageInfo<Dep>(list);
		EasyUIDataGridResult gridResult = new EasyUIDataGridResult();
		gridResult.setRows(list);
		gridResult.setTotal(pageInfo.getTotal());
		return gridResult;
	}
	/**
	 * 添加部门
	 */
	public ERPResult save(Dep dep) {
		try {
			depMapper.insert(dep);
			return ERPResult.success();
		} catch (Exception e) {
			logger.info("部门新增异常！"+e);
			return ERPResult.error("部门新增异常！");
		}
	}
	/**
	 * 删除部门 
	 */
	public ERPResult del(Long uuid) {
		try {
			depMapper.deleteByPrimaryKey(uuid);
			return ERPResult.success();
		} catch (Exception e) {
			logger.info("部门删除异常！"+e);
			return ERPResult.error("部门删除异常！");
		}
	}
	/**
	 * 根据id查询部门信息
	 */
	public Dep findById(Long uuid){
		return depMapper.selectByPrimaryKey(uuid);
	}
	
}
