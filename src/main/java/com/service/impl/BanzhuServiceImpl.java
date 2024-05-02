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


import com.dao.BanzhuDao;
import com.entity.BanzhuEntity;
import com.service.BanzhuService;
import com.entity.vo.BanzhuVO;
import com.entity.view.BanzhuView;

@Service("banzhuService")
public class BanzhuServiceImpl extends ServiceImpl<BanzhuDao, BanzhuEntity> implements BanzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BanzhuEntity> page = this.selectPage(
                new Query<BanzhuEntity>(params).getPage(),
                new EntityWrapper<BanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BanzhuEntity> wrapper) {
		  Page<BanzhuView> page =new Query<BanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BanzhuVO> selectListVO(Wrapper<BanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BanzhuVO selectVO(Wrapper<BanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BanzhuView> selectListView(Wrapper<BanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BanzhuView selectView(Wrapper<BanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
