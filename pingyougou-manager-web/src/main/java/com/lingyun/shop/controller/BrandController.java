package com.lingyun.shop.controller;

        import com.alibaba.dubbo.config.annotation.Reference;
        import com.lingyun.pojo.TEmp;
        import com.lingyun.pojo.TbBrand;
        import com.lingyun.sellergoods.service.BrandService;

        import entity.PageResult;
        import entity.Result;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
@RequestMapping("/emp")
public class BrandController {

    @Reference(timeout = 60000)
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        List<TbBrand> all = brandService.findAll();
        return all;
    }
   @RequestMapping("/add")
    public Result add(TbBrand tbBrand){
       try {
           brandService.add(tbBrand);
           return new Result(true,"新增成功！");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"新增失败");
   }
   @RequestMapping("/delete")
   public Result delete(long id){
       try {
           brandService.delete(id);
           return  new Result(true,"删除成功！");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除失败！");
   }
   @RequestMapping("/deleteIds")
   public Result deleteIds(long [] ids){
       try {
           brandService.deleteIds(ids);
           return  new Result(true,"删除成功！");
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new Result(false,"删除成功！");
   }
@RequestMapping("/findOne")
 public  TbBrand findOne(long id){
return brandService.findOne(id);
 }
 @RequestMapping("/search")
 public PageResult search(TbBrand tbBrand,int page,int rows){
  return  brandService.findPage(tbBrand,rows,page);
 }

}
