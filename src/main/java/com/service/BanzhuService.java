package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BanzhuView;


/**
 * 版主
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BanzhuService extends IService<BanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BanzhuVO> selectListVO(Wrapper<BanzhuEntity> wrapper);
   	
   	BanzhuVO selectVO(@Param("ew") Wrapper<BanzhuEntity> wrapper);
   	
   	List<BanzhuView> selectListView(Wrapper<BanzhuEntity> wrapper);
   	
   	BanzhuView selectView(@Param("ew") Wrapper<BanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BanzhuEntity> wrapper);
   	
}

