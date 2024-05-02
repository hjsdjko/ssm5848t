package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RementieEntity;
import com.entity.view.RementieView;

import com.service.RementieService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 热门贴
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
@RestController
@RequestMapping("/rementie")
public class RementieController {
    @Autowired
    private RementieService rementieService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RementieEntity rementie, 
		HttpServletRequest request){

        EntityWrapper<RementieEntity> ew = new EntityWrapper<RementieEntity>();
		PageUtils page = rementieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rementie), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RementieEntity rementie, HttpServletRequest request){
        EntityWrapper<RementieEntity> ew = new EntityWrapper<RementieEntity>();
		PageUtils page = rementieService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, rementie), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RementieEntity rementie){
       	EntityWrapper<RementieEntity> ew = new EntityWrapper<RementieEntity>();
      	ew.allEq(MPUtil.allEQMapPre( rementie, "rementie")); 
        return R.ok().put("data", rementieService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RementieEntity rementie){
        EntityWrapper< RementieEntity> ew = new EntityWrapper< RementieEntity>();
 		ew.allEq(MPUtil.allEQMapPre( rementie, "rementie")); 
		RementieView rementieView =  rementieService.selectView(ew);
		return R.ok("查询热门贴成功").put("data", rementieView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RementieEntity rementie = rementieService.selectById(id);
        return R.ok().put("data", rementie);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RementieEntity rementie = rementieService.selectById(id);
        return R.ok().put("data", rementie);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        RementieEntity rementie = rementieService.selectById(id);
        if(type.equals("1")) {
        	rementie.setThumbsupnum(rementie.getThumbsupnum()+1);
        } else {
        	rementie.setCrazilynum(rementie.getCrazilynum()+1);
        }
        rementieService.updateById(rementie);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RementieEntity rementie, HttpServletRequest request){
    	rementie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rementie);

        rementieService.insert(rementie);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RementieEntity rementie, HttpServletRequest request){
    	rementie.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(rementie);

        rementieService.insert(rementie);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RementieEntity rementie, HttpServletRequest request){
        //ValidatorUtils.validateEntity(rementie);
        rementieService.updateById(rementie);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        rementieService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RementieEntity> wrapper = new EntityWrapper<RementieEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = rementieService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
