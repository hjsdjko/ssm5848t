package com.dao;

import com.entity.BankuaimingchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BankuaimingchengVO;
import com.entity.view.BankuaimingchengView;


/**
 * 版块名称
 * 
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BankuaimingchengDao extends BaseMapper<BankuaimingchengEntity> {
	
	List<BankuaimingchengVO> selectListVO(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
	
	BankuaimingchengVO selectVO(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
	
	List<BankuaimingchengView> selectListView(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);

	List<BankuaimingchengView> selectListView(Pagination page,@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
	
	BankuaimingchengView selectView(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
	
}
