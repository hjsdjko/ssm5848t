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


import com.dao.DiscusszhubankuaiDao;
import com.entity.DiscusszhubankuaiEntity;
import com.service.DiscusszhubankuaiService;
import com.entity.vo.DiscusszhubankuaiVO;
import com.entity.view.DiscusszhubankuaiView;

@Service("discusszhubankuaiService")
public class DiscusszhubankuaiServiceImpl extends ServiceImpl<DiscusszhubankuaiDao, DiscusszhubankuaiEntity> implements DiscusszhubankuaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhubankuaiEntity> page = this.selectPage(
                new Query<DiscusszhubankuaiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhubankuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhubankuaiEntity> wrapper) {
		  Page<DiscusszhubankuaiView> page =new Query<DiscusszhubankuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhubankuaiVO> selectListVO(Wrapper<DiscusszhubankuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhubankuaiVO selectVO(Wrapper<DiscusszhubankuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhubankuaiView> selectListView(Wrapper<DiscusszhubankuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhubankuaiView selectView(Wrapper<DiscusszhubankuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
