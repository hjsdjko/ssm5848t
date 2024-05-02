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


import com.dao.DiscussbanzhutuijiantieDao;
import com.entity.DiscussbanzhutuijiantieEntity;
import com.service.DiscussbanzhutuijiantieService;
import com.entity.vo.DiscussbanzhutuijiantieVO;
import com.entity.view.DiscussbanzhutuijiantieView;

@Service("discussbanzhutuijiantieService")
public class DiscussbanzhutuijiantieServiceImpl extends ServiceImpl<DiscussbanzhutuijiantieDao, DiscussbanzhutuijiantieEntity> implements DiscussbanzhutuijiantieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussbanzhutuijiantieEntity> page = this.selectPage(
                new Query<DiscussbanzhutuijiantieEntity>(params).getPage(),
                new EntityWrapper<DiscussbanzhutuijiantieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussbanzhutuijiantieEntity> wrapper) {
		  Page<DiscussbanzhutuijiantieView> page =new Query<DiscussbanzhutuijiantieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussbanzhutuijiantieVO> selectListVO(Wrapper<DiscussbanzhutuijiantieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussbanzhutuijiantieVO selectVO(Wrapper<DiscussbanzhutuijiantieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussbanzhutuijiantieView> selectListView(Wrapper<DiscussbanzhutuijiantieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussbanzhutuijiantieView selectView(Wrapper<DiscussbanzhutuijiantieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
