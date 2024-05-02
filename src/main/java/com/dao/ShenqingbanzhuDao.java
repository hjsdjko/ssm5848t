package com.dao;

import com.entity.ShenqingbanzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingbanzhuVO;
import com.entity.view.ShenqingbanzhuView;


/**
 * 申请版主
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface ShenqingbanzhuDao extends BaseMapper<ShenqingbanzhuEntity> {
	
	List<ShenqingbanzhuVO> selectListVO(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
	
	ShenqingbanzhuVO selectVO(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
	
	List<ShenqingbanzhuView> selectListView(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);

	List<ShenqingbanzhuView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
	
	ShenqingbanzhuView selectView(@Param("ew") Wrapper<ShenqingbanzhuEntity> wrapper);
	
}
