package com.dao;

import com.entity.TiaozaoshichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TiaozaoshichangVO;
import com.entity.view.TiaozaoshichangView;


/**
 * 跳蚤市场
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface TiaozaoshichangDao extends BaseMapper<TiaozaoshichangEntity> {
	
	List<TiaozaoshichangVO> selectListVO(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	TiaozaoshichangVO selectVO(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	List<TiaozaoshichangView> selectListView(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);

	List<TiaozaoshichangView> selectListView(Pagination page,@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
	TiaozaoshichangView selectView(@Param("ew") Wrapper<TiaozaoshichangEntity> wrapper);
	
}
