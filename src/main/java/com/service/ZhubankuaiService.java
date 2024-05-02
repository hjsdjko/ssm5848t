package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhubankuaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhubankuaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhubankuaiView;


/**
 * 主版块
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface ZhubankuaiService extends IService<ZhubankuaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhubankuaiVO> selectListVO(Wrapper<ZhubankuaiEntity> wrapper);
   	
   	ZhubankuaiVO selectVO(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
   	
   	List<ZhubankuaiView> selectListView(Wrapper<ZhubankuaiEntity> wrapper);
   	
   	ZhubankuaiView selectView(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhubankuaiEntity> wrapper);
   	
}

