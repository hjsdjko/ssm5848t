package com.dao;

import com.entity.RementieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RementieVO;
import com.entity.view.RementieView;


/**
 * 热门贴
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface RementieDao extends BaseMapper<RementieEntity> {
	
	List<RementieVO> selectListVO(@Param("ew") Wrapper<RementieEntity> wrapper);
	
	RementieVO selectVO(@Param("ew") Wrapper<RementieEntity> wrapper);
	
	List<RementieView> selectListView(@Param("ew") Wrapper<RementieEntity> wrapper);

	List<RementieView> selectListView(Pagination page,@Param("ew") Wrapper<RementieEntity> wrapper);
	
	RementieView selectView(@Param("ew") Wrapper<RementieEntity> wrapper);
	
}
