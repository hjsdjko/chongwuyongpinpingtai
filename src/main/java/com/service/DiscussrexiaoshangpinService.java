package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrexiaoshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrexiaoshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrexiaoshangpinView;


/**
 * 热销商品评论表
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:11:23
 */
public interface DiscussrexiaoshangpinService extends IService<DiscussrexiaoshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrexiaoshangpinVO> selectListVO(Wrapper<DiscussrexiaoshangpinEntity> wrapper);
   	
   	DiscussrexiaoshangpinVO selectVO(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
   	
   	List<DiscussrexiaoshangpinView> selectListView(Wrapper<DiscussrexiaoshangpinEntity> wrapper);
   	
   	DiscussrexiaoshangpinView selectView(@Param("ew") Wrapper<DiscussrexiaoshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrexiaoshangpinEntity> wrapper);
   	
}

