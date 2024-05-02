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


import com.dao.PinpaiDao;
import com.entity.PinpaiEntity;
import com.service.PinpaiService;
import com.entity.vo.PinpaiVO;
import com.entity.view.PinpaiView;

@Service("pinpaiService")
public class PinpaiServiceImpl extends ServiceImpl<PinpaiDao, PinpaiEntity> implements PinpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinpaiEntity> page = this.selectPage(
                new Query<PinpaiEntity>(params).getPage(),
                new EntityWrapper<PinpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinpaiEntity> wrapper) {
		  Page<PinpaiView> page =new Query<PinpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinpaiVO> selectListVO(Wrapper<PinpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinpaiVO selectVO(Wrapper<PinpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinpaiView> selectListView(Wrapper<PinpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinpaiView selectView(Wrapper<PinpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
