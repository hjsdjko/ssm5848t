package com.dao;

import com.entity.YonghurongyubangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghurongyubangVO;
import com.entity.view.YonghurongyubangView;


/**
 * 用户荣誉榜
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface YonghurongyubangDao extends BaseMapper<YonghurongyubangEntity> {
	
	List<YonghurongyubangVO> selectListVO(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
	
	YonghurongyubangVO selectVO(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
	
	List<YonghurongyubangView> selectListView(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);

	List<YonghurongyubangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
	
	YonghurongyubangView selectView(@Param("ew") Wrapper<YonghurongyubangEntity> wrapper);
	
}
