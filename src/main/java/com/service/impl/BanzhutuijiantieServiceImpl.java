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


import com.dao.BanzhutuijiantieDao;
import com.entity.BanzhutuijiantieEntity;
import com.service.BanzhutuijiantieService;
import com.entity.vo.BanzhutuijiantieVO;
import com.entity.view.BanzhutuijiantieView;

@Service("banzhutuijiantieService")
public class BanzhutuijiantieServiceImpl extends ServiceImpl<BanzhutuijiantieDao, BanzhutuijiantieEntity> implements BanzhutuijiantieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanzhutuijiantieEntity> page = this.selectPage(
                new Query<BanzhutuijiantieEntity>(params).getPage(),
                new EntityWrapper<BanzhutuijiantieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanzhutuijiantieEntity> wrapper) {
		  Page<BanzhutuijiantieView> page =new Query<BanzhutuijiantieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanzhutuijiantieVO> selectListVO(Wrapper<BanzhutuijiantieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanzhutuijiantieVO selectVO(Wrapper<BanzhutuijiantieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanzhutuijiantieView> selectListView(Wrapper<BanzhutuijiantieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanzhutuijiantieView selectView(Wrapper<BanzhutuijiantieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
