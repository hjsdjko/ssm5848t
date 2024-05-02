package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanzhutuijiantieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanzhutuijiantieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzhutuijiantieView;


/**
 * 版主推荐贴
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BanzhutuijiantieService extends IService<BanzhutuijiantieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanzhutuijiantieVO> selectListVO(Wrapper<BanzhutuijiantieEntity> wrapper);
   	
   	BanzhutuijiantieVO selectVO(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
   	
   	List<BanzhutuijiantieView> selectListView(Wrapper<BanzhutuijiantieEntity> wrapper);
   	
   	BanzhutuijiantieView selectView(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanzhutuijiantieEntity> wrapper);
   	
}

