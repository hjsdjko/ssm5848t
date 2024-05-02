package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghurongyubangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghurongyubangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghurongyubangView;


/**
 * 用户荣誉榜
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface YonghurongyubangService extends IService<YonghurongyubangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghurongyubangVO> selectListVO(Wrapper<YonghurongyubangEntity> wrapper);
   	
   	YonghurongyubangVO selectVO(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
   	
   	List<YonghurongyubangView> selectListView(Wrapper<YonghurongyubangEntity> wrapper);
   	
   	YonghurongyubangView selectView(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghurongyubangEntity> wrapper);
   	
}

