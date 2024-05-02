package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RementieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RementieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RementieView;


/**
 * 热门贴
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface RementieService extends IService<RementieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RementieVO> selectListVO(Wrapper<RementieEntity> wrapper);
   	
   	RementieVO selectVO(@Param("ew") Wrapper<RementieEntity> wrapper);
   	
   	List<RementieView> selectListView(Wrapper<RementieEntity> wrapper);
   	
   	RementieView selectView(@Param("ew") Wrapper<RementieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RementieEntity> wrapper);
   	
}

