package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BankuaimingchengDao;
import com.entity.BankuaimingchengEntity;
import com.service.BankuaimingchengService;
import com.entity.vo.BankuaimingchengVO;
import com.entity.view.BankuaimingchengView;

@Service("bankuaimingchengService")
public class BankuaimingchengServiceImpl extends ServiceImpl<BankuaimingchengDao, BankuaimingchengEntity> implements BankuaimingchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BankuaimingchengEntity> page = this.selectPage(
                new Query<BankuaimingchengEntity>(params).getPage(),
                new EntityWrapper<BankuaimingchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BankuaimingchengEntity> wrapper) {
		  Page<BankuaimingchengView> page =new Query<BankuaimingchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BankuaimingchengVO> selectListVO(Wrapper<BankuaimingchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BankuaimingchengVO selectVO(Wrapper<BankuaimingchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BankuaimingchengView> selectListView(Wrapper<BankuaimingchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BankuaimingchengView selectView(Wrapper<BankuaimingchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
