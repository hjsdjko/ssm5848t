package com.dao;

import com.entity.ZhubankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhubankuaiVO;
import com.entity.view.ZhubankuaiView;


/**
 * 主版块
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface ZhubankuaiDao extends BaseMapper<ZhubankuaiEntity> {
	
	List<ZhubankuaiVO> selectListVO(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
	
	ZhubankuaiVO selectVO(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
	
	List<ZhubankuaiView> selectListView(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);

	List<ZhubankuaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
	
	ZhubankuaiView selectView(@Param("ew") Wrapper<ZhubankuaiEntity> wrapper);
	
}
