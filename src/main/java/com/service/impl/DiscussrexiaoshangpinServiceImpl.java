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


import com.dao.DiscussrexiaoshangpinDao;
import com.entity.DiscussrexiaoshangpinEntity;
import com.service.DiscussrexiaoshangpinService;
import com.entity.vo.DiscussrexiaoshangpinVO;
import com.entity.view.DiscussrexiaoshangpinView;

@Service("discussrexiaoshangpinService")
public class DiscussrexiaoshangpinServiceImpl extends ServiceImpl<DiscussrexiaoshangpinDao, DiscussrexiaoshangpinEntity> implements DiscussrexiaoshangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrexiaoshangpinEntity> page = this.selectPage(
                new Query<DiscussrexiaoshangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussrexiaoshangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrexiaoshangpinEntity> wrapper) {
		  Page<DiscussrexiaoshangpinView> page =new Query<DiscussrexiaoshangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrexiaoshangpinVO> selectListVO(Wrapper<DiscussrexiaoshangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrexiaoshangpinVO selectVO(Wrapper<DiscussrexiaoshangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrexiaoshangpinView> selectListView(Wrapper<DiscussrexiaoshangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrexiaoshangpinView selectView(Wrapper<DiscussrexiaoshangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
