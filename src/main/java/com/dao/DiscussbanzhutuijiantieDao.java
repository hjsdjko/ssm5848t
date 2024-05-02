package com.dao;

import com.entity.DiscussbanzhutuijiantieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussbanzhutuijiantieVO;
import com.entity.view.DiscussbanzhutuijiantieView;


/**
 * 版主推荐贴评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscussbanzhutuijiantieDao extends BaseMapper<DiscussbanzhutuijiantieEntity> {
	
	List<DiscussbanzhutuijiantieVO> selectListVO(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
	
	DiscussbanzhutuijiantieVO selectVO(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
	
	List<DiscussbanzhutuijiantieView> selectListView(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);

	List<DiscussbanzhutuijiantieView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
	
	DiscussbanzhutuijiantieView selectView(@Param("ew") Wrapper<DiscussbanzhutuijiantieEntity> wrapper);
	
}
