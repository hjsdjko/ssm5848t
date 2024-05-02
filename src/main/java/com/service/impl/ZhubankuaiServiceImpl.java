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


import com.dao.ZhubankuaiDao;
import com.entity.ZhubankuaiEntity;
import com.service.ZhubankuaiService;
import com.entity.vo.ZhubankuaiVO;
import com.entity.view.ZhubankuaiView;

@Service("zhubankuaiService")
public class ZhubankuaiServiceImpl extends ServiceImpl<ZhubankuaiDao, ZhubankuaiEntity> implements ZhubankuaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhubankuaiEntity> page = this.selectPage(
                new Query<ZhubankuaiEntity>(params).getPage(),
                new EntityWrapper<ZhubankuaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhubankuaiEntity> wrapper) {
		  Page<ZhubankuaiView> page =new Query<ZhubankuaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhubankuaiVO> selectListVO(Wrapper<ZhubankuaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhubankuaiVO selectVO(Wrapper<ZhubankuaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhubankuaiView> selectListView(Wrapper<ZhubankuaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhubankuaiView selectView(Wrapper<ZhubankuaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
