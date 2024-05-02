package com.dao;

import com.entity.DiscusstiaozaoshichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstiaozaoshichangVO;
import com.entity.view.DiscusstiaozaoshichangView;


/**
 * 跳蚤市场评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface DiscusstiaozaoshichangDao extends BaseMapper<DiscusstiaozaoshichangEntity> {
	
	List<DiscusstiaozaoshichangVO> selectListVO(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
	
	DiscusstiaozaoshichangVO selectVO(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
	
	List<DiscusstiaozaoshichangView> selectListView(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);

	List<DiscusstiaozaoshichangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
	
	DiscusstiaozaoshichangView selectView(@Param("ew") Wrapper<DiscusstiaozaoshichangEntity> wrapper);
	
}
