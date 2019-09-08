package com.lingyun.mapper;

import com.lingyun.pojo.TEmp;
import com.lingyun.pojo.TEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEmpMapper {
    int countByExample(TEmpExample example);

    int deleteByExample(TEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    List<TEmp> selectByExample(TEmpExample example);

    TEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByExample(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
}