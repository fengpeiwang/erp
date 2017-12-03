package cn.huaying.erp.dao.mapper;

import cn.huaying.erp.dao.entity.Storedetail;
import cn.huaying.erp.dao.entity.StoredetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StoredetailMapper {
    int countByExample(StoredetailExample example);

    int deleteByExample(StoredetailExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(Storedetail record);

    int insertSelective(Storedetail record);

    List<Storedetail> selectByExample(StoredetailExample example);

    Storedetail selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") Storedetail record, @Param("example") StoredetailExample example);

    int updateByExample(@Param("record") Storedetail record, @Param("example") StoredetailExample example);

    int updateByPrimaryKeySelective(Storedetail record);

    int updateByPrimaryKey(Storedetail record);
}