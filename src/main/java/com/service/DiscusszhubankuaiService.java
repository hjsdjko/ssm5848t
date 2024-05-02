package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhubankuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhubankuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhubankuaiView;


/**
 * 主版块评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscusszhubankuaiService extends IService<DiscusszhubankuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhubankuaiVO> selectListVO(Wrapper<DiscusszhubankuaiEntity> wrapper);
   	
   	DiscusszhubankuaiVO selectVO(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
   	
   	List<DiscusszhubankuaiView> selectListView(Wrapper<DiscusszhubankuaiEntity> wrapper);
   	
   	DiscusszhubankuaiView selectView(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhubankuaiEntity> wrapper);
   	
}

