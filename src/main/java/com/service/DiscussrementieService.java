package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrementieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrementieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrementieView;


/**
 * 热门贴评论表
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscussrementieService extends IService<DiscussrementieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrementieVO> selectListVO(Wrapper<DiscussrementieEntity> wrapper);
   	
   	DiscussrementieVO selectVO(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
   	
   	List<DiscussrementieView> selectListView(Wrapper<DiscussrementieEntity> wrapper);
   	
   	DiscussrementieView selectView(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrementieEntity> wrapper);
   	
}

