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


import com.dao.DiscussrementieDao;
import com.entity.DiscussrementieEntity;
import com.service.DiscussrementieService;
import com.entity.vo.DiscussrementieVO;
import com.entity.view.DiscussrementieView;

@Service("discussrementieService")
public class DiscussrementieServiceImpl extends ServiceImpl<DiscussrementieDao, DiscussrementieEntity> implements DiscussrementieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrementieEntity> page = this.selectPage(
                new Query<DiscussrementieEntity>(params).getPage(),
                new EntityWrapper<DiscussrementieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrementieEntity> wrapper) {
		  Page<DiscussrementieView> page =new Query<DiscussrementieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrementieVO> selectListVO(Wrapper<DiscussrementieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrementieVO selectVO(Wrapper<DiscussrementieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrementieView> selectListView(Wrapper<DiscussrementieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrementieView selectView(Wrapper<DiscussrementieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
