package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TiaozaoshichangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TiaozaoshichangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TiaozaoshichangView;


/**
 * 跳蚤市场
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface TiaozaoshichangService extends IService<TiaozaoshichangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TiaozaoshichangVO> selectListVO(Wrapper<TiaozaoshichangEntity> wrapper);
   	
   	TiaozaoshichangVO selectVO(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
   	
   	List<TiaozaoshichangView> selectListView(Wrapper<TiaozaoshichangEntity> wrapper);
   	
   	TiaozaoshichangView selectView(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TiaozaoshichangEntity> wrapper);
   	
}

