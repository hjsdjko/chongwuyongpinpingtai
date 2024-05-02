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


import com.dao.RexiaoshangpinDao;
import com.entity.RexiaoshangpinEntity;
import com.service.RexiaoshangpinService;
import com.entity.vo.RexiaoshangpinVO;
import com.entity.view.RexiaoshangpinView;

@Service("rexiaoshangpinService")
public class RexiaoshangpinServiceImpl extends ServiceImpl<RexiaoshangpinDao, RexiaoshangpinEntity> implements RexiaoshangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RexiaoshangpinEntity> page = this.selectPage(
                new Query<RexiaoshangpinEntity>(params).getPage(),
                new EntityWrapper<RexiaoshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RexiaoshangpinEntity> wrapper) {
		  Page<RexiaoshangpinView> page =new Query<RexiaoshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RexiaoshangpinVO> selectListVO(Wrapper<RexiaoshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RexiaoshangpinVO selectVO(Wrapper<RexiaoshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RexiaoshangpinView> selectListView(Wrapper<RexiaoshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RexiaoshangpinView selectView(Wrapper<RexiaoshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
