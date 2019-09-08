package com.lingyun.sellergoods.service;

import com.lingyun.pojo.TbContentCategory;
import entity.PageResult;

import java.util.List;

public interface ContentCategoryService {
    /**
     * 广告分类
     * @return
     */
    public List<TbContentCategory> findAll();
    /**
     * 新增
     */
    public void add(TbContentCategory contentCategory);
    public void delete(long [] ids);
    public TbContentCategory findOne(long id);
    public  void  uodate(TbContentCategory contentCategory);
    public PageResult findPage(TbContentCategory contentCategory,int pageSize,int pageNum);
}
