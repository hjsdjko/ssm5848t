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


import com.dao.DiscusstiaozaoshichangDao;
import com.entity.DiscusstiaozaoshichangEntity;
import com.service.DiscusstiaozaoshichangService;
import com.entity.vo.DiscusstiaozaoshichangVO;
import com.entity.view.DiscusstiaozaoshichangView;

@Service("discusstiaozaoshichangService")
public class DiscusstiaozaoshichangServiceImpl extends ServiceImpl<DiscusstiaozaoshichangDao, DiscusstiaozaoshichangEntity> implements DiscusstiaozaoshichangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstiaozaoshichangEntity> page = this.selectPage(
                new Query<DiscusstiaozaoshichangEntity>(params).getPage(),
                new EntityWrapper<DiscusstiaozaoshichangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstiaozaoshichangEntity> wrapper) {
		  Page<DiscusstiaozaoshichangView> page =new Query<DiscusstiaozaoshichangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstiaozaoshichangVO> selectListVO(Wrapper<DiscusstiaozaoshichangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstiaozaoshichangVO selectVO(Wrapper<DiscusstiaozaoshichangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstiaozaoshichangView> selectListView(Wrapper<DiscusstiaozaoshichangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstiaozaoshichangView selectView(Wrapper<DiscusstiaozaoshichangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
