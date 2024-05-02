package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstiaozaoshichangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstiaozaoshichangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstiaozaoshichangView;


/**
 * 跳蚤市场评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscusstiaozaoshichangService extends IService<DiscusstiaozaoshichangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstiaozaoshichangVO> selectListVO(Wrapper<DiscusstiaozaoshichangEntity> wrapper);
   	
   	DiscusstiaozaoshichangVO selectVO(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
   	
   	List<DiscusstiaozaoshichangView> selectListView(Wrapper<DiscusstiaozaoshichangEntity> wrapper);
   	
   	DiscusstiaozaoshichangView selectView(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstiaozaoshichangEntity> wrapper);
   	
}

