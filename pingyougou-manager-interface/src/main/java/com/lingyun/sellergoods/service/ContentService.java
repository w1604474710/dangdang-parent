package com.lingyun.sellergoods.service;

import com.lingyun.pojo.TbContent;
import entity.PageResult;

import java.util.List;

public interface ContentService {
    public List<TbContent> findAll();
    public  void add(TbContent content);
    public  void findOne(long  id);
    public void delete(long [] ids);
    public  void update(TbContent content);
    public PageResult findPage(TbContent content, int pageSize, int pageNum);

}
