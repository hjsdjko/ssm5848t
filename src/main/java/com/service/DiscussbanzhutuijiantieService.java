package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussbanzhutuijiantieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussbanzhutuijiantieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussbanzhutuijiantieView;


/**
 * 版主推荐贴评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscussbanzhutuijiantieService extends IService<DiscussbanzhutuijiantieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussbanzhutuijiantieVO> selectListVO(Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
   	
   	DiscussbanzhutuijiantieVO selectVO(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
   	
   	List<DiscussbanzhutuijiantieView> selectListView(Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
   	
   	DiscussbanzhutuijiantieView selectView(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
   	
}

