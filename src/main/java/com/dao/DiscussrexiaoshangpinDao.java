package com.dao;

import com.entity.DiscussrexiaoshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrexiaoshangpinVO;
import com.entity.view.DiscussrexiaoshangpinView;


/**
 * 热销商品评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:11:23
 */
public interface DiscussrexiaoshangpinDao extends BaseMapper<DiscussrexiaoshangpinEntity> {
	
	List<DiscussrexiaoshangpinVO> selectListVO(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
	
	DiscussrexiaoshangpinVO selectVO(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
	
	List<DiscussrexiaoshangpinView> selectListView(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);

	List<DiscussrexiaoshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
	
	DiscussrexiaoshangpinView selectView(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
	
}
