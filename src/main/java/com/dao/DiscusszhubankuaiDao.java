package com.dao;

import com.entity.DiscusszhubankuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhubankuaiVO;
import com.entity.view.DiscusszhubankuaiView;


/**
 * 主版块评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscusszhubankuaiDao extends BaseMapper<DiscusszhubankuaiEntity> {
	
	List<DiscusszhubankuaiVO> selectListVO(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
	
	DiscusszhubankuaiVO selectVO(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
	
	List<DiscusszhubankuaiView> selectListView(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);

	List<DiscusszhubankuaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
	
	DiscusszhubankuaiView selectView(@Param("ew") Wrapper<DiscusszhubankuaiEntity> wrapper);
	
}
