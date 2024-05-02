package com.dao;

import com.entity.RexiaoshangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RexiaoshangpinVO;
import com.entity.view.RexiaoshangpinView;


/**
 * 热销商品
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:11:22
 */
public interface RexiaoshangpinDao extends BaseMapper<RexiaoshangpinEntity> {
	
	List<RexiaoshangpinVO> selectListVO(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
	
	RexiaoshangpinVO selectVO(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
	
	List<RexiaoshangpinView> selectListView(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);

	List<RexiaoshangpinView> selectListView(Pagination page,@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
	
	RexiaoshangpinView selectView(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
	
}
