package com.dao;

import com.entity.DiscussrementieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrementieVO;
import com.entity.view.DiscussrementieView;


/**
 * 热门贴评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscussrementieDao extends BaseMapper<DiscussrementieEntity> {
	
	List<DiscussrementieVO> selectListVO(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
	
	DiscussrementieVO selectVO(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
	
	List<DiscussrementieView> selectListView(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);

	List<DiscussrementieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
	
	DiscussrementieView selectView(@Param("ew") Wrapper<DiscussrementieEntity> wrapper);
	
}
