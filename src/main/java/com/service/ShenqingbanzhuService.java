package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingbanzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingbanzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingbanzhuView;


/**
 * 申请版主
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface ShenqingbanzhuService extends IService<ShenqingbanzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingbanzhuVO> selectListVO(Wrapper<ShenqingbanzhuEntity> wrapper);
   	
   	ShenqingbanzhuVO selectVO(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
   	
   	List<ShenqingbanzhuView> selectListView(Wrapper<ShenqingbanzhuEntity> wrapper);
   	
   	ShenqingbanzhuView selectView(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingbanzhuEntity> wrapper);
   	
}

