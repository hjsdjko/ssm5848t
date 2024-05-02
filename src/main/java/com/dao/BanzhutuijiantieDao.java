package com.dao;

import com.entity.BanzhutuijiantieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BanzhutuijiantieVO;
import com.entity.view.BanzhutuijiantieView;


/**
 * 版主推荐贴
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BanzhutuijiantieDao extends BaseMapper<BanzhutuijiantieEntity> {
	
	List<BanzhutuijiantieVO> selectListVO(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
	
	BanzhutuijiantieVO selectVO(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
	
	List<BanzhutuijiantieView> selectListView(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);

	List<BanzhutuijiantieView> selectListView(Pagination page,@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
	
	BanzhutuijiantieView selectView(@Param("ew") Wrapper<BanzhutuijiantieEntity> wrapper);
	
}
