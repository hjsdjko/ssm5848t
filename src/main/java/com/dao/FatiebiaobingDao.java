package com.dao;

import com.entity.FatiebiaobingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FatiebiaobingVO;
import com.entity.view.FatiebiaobingView;


/**
 * 发帖标兵
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface FatiebiaobingDao extends BaseMapper<FatiebiaobingEntity> {
	
	List<FatiebiaobingVO> selectListVO(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
	
	FatiebiaobingVO selectVO(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
	
	List<FatiebiaobingView> selectListView(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);

	List<FatiebiaobingView> selectListView(Pagination page,@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
	
	FatiebiaobingView selectView(@Param("ew") Wrapper<FatiebiaobingEntity> wrapper);
	
}
