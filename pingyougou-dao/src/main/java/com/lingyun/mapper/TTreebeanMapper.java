package com.lingyun.mapper;

import com.lingyun.pojo.TTreebean;
import com.lingyun.pojo.TTreebeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTreebeanMapper {
    int countByExample(TTreebeanExample example);

    int deleteByExample(TTreebeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTreebean record);

    int insertSelective(TTreebean record);

    List<TTreebean> selectByExample(TTreebeanExample example);

    TTreebean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTreebean record, @Param("example") TTreebeanExample example);

    int updateByExample(@Param("record") TTreebean record, @Param("example") TTreebeanExample example);

    int updateByPrimaryKeySelective(TTreebean record);

    int updateByPrimaryKey(TTreebean record);
}