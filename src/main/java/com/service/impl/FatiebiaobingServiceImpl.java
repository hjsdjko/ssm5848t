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


import com.dao.FatiebiaobingDao;
import com.entity.FatiebiaobingEntity;
import com.service.FatiebiaobingService;
import com.entity.vo.FatiebiaobingVO;
import com.entity.view.FatiebiaobingView;

@Service("fatiebiaobingService")
public class FatiebiaobingServiceImpl extends ServiceImpl<FatiebiaobingDao, FatiebiaobingEntity> implements FatiebiaobingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FatiebiaobingEntity> page = this.selectPage(
                new Query<FatiebiaobingEntity>(params).getPage(),
                new EntityWrapper<FatiebiaobingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FatiebiaobingEntity> wrapper) {
		  Page<FatiebiaobingView> page =new Query<FatiebiaobingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FatiebiaobingVO> selectListVO(Wrapper<FatiebiaobingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FatiebiaobingVO selectVO(Wrapper<FatiebiaobingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FatiebiaobingView> selectListView(Wrapper<FatiebiaobingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FatiebiaobingView selectView(Wrapper<FatiebiaobingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
