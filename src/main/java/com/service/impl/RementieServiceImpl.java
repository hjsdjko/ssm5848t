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


import com.dao.RementieDao;
import com.entity.RementieEntity;
import com.service.RementieService;
import com.entity.vo.RementieVO;
import com.entity.view.RementieView;

@Service("rementieService")
public class RementieServiceImpl extends ServiceImpl<RementieDao, RementieEntity> implements RementieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RementieEntity> page = this.selectPage(
                new Query<RementieEntity>(params).getPage(),
                new EntityWrapper<RementieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RementieEntity> wrapper) {
		  Page<RementieView> page =new Query<RementieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RementieVO> selectListVO(Wrapper<RementieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RementieVO selectVO(Wrapper<RementieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RementieView> selectListView(Wrapper<RementieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RementieView selectView(Wrapper<RementieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
