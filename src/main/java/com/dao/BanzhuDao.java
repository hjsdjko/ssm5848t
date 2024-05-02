package com.dao;

import com.entity.BanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanzhuVO;
import com.entity.view.BanzhuView;


/**
 * 版主
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BanzhuDao extends BaseMapper<BanzhuEntity> {
	
	List<BanzhuVO> selectListVO(@Param("ew") Wrapper<BanzhuEntity> wrapper);
	
	BanzhuVO selectVO(@Param("ew") Wrapper<BanzhuEntity> wrapper);
	
	List<BanzhuView> selectListView(@Param("ew") Wrapper<BanzhuEntity> wrapper);

	List<BanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<BanzhuEntity> wrapper);
	
	BanzhuView selectView(@Param("ew") Wrapper<BanzhuEntity> wrapper);
	
}
