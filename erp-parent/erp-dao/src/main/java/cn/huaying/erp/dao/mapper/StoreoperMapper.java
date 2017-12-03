package cn.huaying.erp.dao.mapper;

import cn.huaying.erp.dao.entity.Storeoper;
import cn.huaying.erp.dao.entity.StoreoperExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StoreoperMapper {
    int countByExample(StoreoperExample example);

    int deleteByExample(StoreoperExample example);

    int deleteByPrimaryKey(Long uuid);

    int insert(Storeoper record);

    int insertSelective(Storeoper record);

    List<Storeoper> selectByExample(StoreoperExample example);

    Storeoper selectByPrimaryKey(Long uuid);

    int updateByExampleSelective(@Param("record") Storeoper record, @Param("example") StoreoperExample example);

    int updateByExample(@Param("record") Storeoper record, @Param("example") StoreoperExample example);

    int updateByPrimaryKeySelective(Storeoper record);

    int updateByPrimaryKey(Storeoper record);
}