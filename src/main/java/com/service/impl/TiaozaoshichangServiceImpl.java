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


import com.dao.TiaozaoshichangDao;
import com.entity.TiaozaoshichangEntity;
import com.service.TiaozaoshichangService;
import com.entity.vo.TiaozaoshichangVO;
import com.entity.view.TiaozaoshichangView;

@Service("tiaozaoshichangService")
public class TiaozaoshichangServiceImpl extends ServiceImpl<TiaozaoshichangDao, TiaozaoshichangEntity> implements TiaozaoshichangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TiaozaoshichangEntity> page = this.selectPage(
                new Query<TiaozaoshichangEntity>(params).getPage(),
                new EntityWrapper<TiaozaoshichangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TiaozaoshichangEntity> wrapper) {
		  Page<TiaozaoshichangView> page =new Query<TiaozaoshichangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TiaozaoshichangVO> selectListVO(Wrapper<TiaozaoshichangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TiaozaoshichangVO selectVO(Wrapper<TiaozaoshichangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TiaozaoshichangView> selectListView(Wrapper<TiaozaoshichangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TiaozaoshichangView selectView(Wrapper<TiaozaoshichangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
