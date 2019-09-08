package com.lingyun.sellergoods.service;


import com.lingyun.pojo.TEmp;
import com.lingyun.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

public interface BrandService {

   public List<TbBrand> findAll();
   public  void add(TbBrand tbBrand);
   public  void delete(long id);
   public void deleteIds(long [] ids);
   public TbBrand findOne(long id);
   public  void update(TbBrand tbBrand);
   public PageResult findPage(int pageSize,int pageNum);
   public  PageResult findPage(TbBrand tbBrand,int pageSize,int pageNum );


}
