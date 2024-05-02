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


import com.dao.YonghurongyubangDao;
import com.entity.YonghurongyubangEntity;
import com.service.YonghurongyubangService;
import com.entity.vo.YonghurongyubangVO;
import com.entity.view.YonghurongyubangView;

@Service("yonghurongyubangService")
public class YonghurongyubangServiceImpl extends ServiceImpl<YonghurongyubangDao, YonghurongyubangEntity> implements YonghurongyubangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghurongyubangEntity> page = this.selectPage(
                new Query<YonghurongyubangEntity>(params).getPage(),
                new EntityWrapper<YonghurongyubangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghurongyubangEntity> wrapper) {
		  Page<YonghurongyubangView> page =new Query<YonghurongyubangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghurongyubangVO> selectListVO(Wrapper<YonghurongyubangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghurongyubangVO selectVO(Wrapper<YonghurongyubangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghurongyubangView> selectListView(Wrapper<YonghurongyubangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghurongyubangView selectView(Wrapper<YonghurongyubangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
