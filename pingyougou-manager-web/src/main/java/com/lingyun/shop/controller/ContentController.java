package com.lingyun.shop.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lingyun.pojo.TbContent;
import com.lingyun.sellergoods.service.ContentService;
import entity.PageResult;
import entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/content")
public class ContentController {
    @Reference(timeout = 60000)
    private ContentService contentService;
    @RequestMapping("/findAll")
    public List<TbContent> findAll(){
        return  contentService.findAll();
    }
    @RequestMapping("/add")
    public Result add(TbContent content){
        try {
            contentService.add(content);
            return new Result(true,"新增成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"新增失败");
    }
    @RequestMapping("/delete")
    public  Result delete(long [] ids){
        try {
            contentService.delete(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false,"删除失败");
    }
    @RequestMapping("/search")
    public PageResult search(TbContent content, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int rows){
        return contentService.findPage(content,rows,page);

    }
    @RequestMapping("/findOne")
    public  void findOne(long id){
        contentService.findOne(id);
    }

}
