package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BankuaimingchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BankuaimingchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BankuaimingchengView;


/**
 * 版块名称
 *
 * @author 
 * @email 
 * @date 2021-04-10 13:21:45
 */
public interface BankuaimingchengService extends IService<BankuaimingchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BankuaimingchengVO> selectListVO(Wrapper<BankuaimingchengEntity> wrapper);
   	
   	BankuaimingchengVO selectVO(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
   	
   	List<BankuaimingchengView> selectListView(Wrapper<BankuaimingchengEntity> wrapper);
   	
   	BankuaimingchengView selectView(@Param("ew") Wrapper<BankuaimingchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BankuaimingchengEntity> wrapper);
   	
}

