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


import com.dao.ShenqingbanzhuDao;
import com.entity.ShenqingbanzhuEntity;
import com.service.ShenqingbanzhuService;
import com.entity.vo.ShenqingbanzhuVO;
import com.entity.view.ShenqingbanzhuView;

@Service("shenqingbanzhuService")
public class ShenqingbanzhuServiceImpl extends ServiceImpl<ShenqingbanzhuDao, ShenqingbanzhuEntity> implements ShenqingbanzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingbanzhuEntity> page = this.selectPage(
                new Query<ShenqingbanzhuEntity>(params).getPage(),
                new EntityWrapper<ShenqingbanzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingbanzhuEntity> wrapper) {
		  Page<ShenqingbanzhuView> page =new Query<ShenqingbanzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingbanzhuVO> selectListVO(Wrapper<ShenqingbanzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingbanzhuVO selectVO(Wrapper<ShenqingbanzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingbanzhuView> selectListView(Wrapper<ShenqingbanzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingbanzhuView selectView(Wrapper<ShenqingbanzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
