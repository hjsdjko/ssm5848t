package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FatiebiaobingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FatiebiaobingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FatiebiaobingView;


/**
 * 发帖标兵
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface FatiebiaobingService extends IService<FatiebiaobingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FatiebiaobingVO> selectListVO(Wrapper<FatiebiaobingEntity> wrapper);
   	
   	FatiebiaobingVO selectVO(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
   	
   	List<FatiebiaobingView> selectListView(Wrapper<FatiebiaobingEntity> wrapper);
   	
   	FatiebiaobingView selectView(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FatiebiaobingEntity> wrapper);
   	
}

