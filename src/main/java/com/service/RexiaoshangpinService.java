package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RexiaoshangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RexiaoshangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RexiaoshangpinView;


/**
 * 热销商品
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:11:22
 */
public interface RexiaoshangpinService extends IService<RexiaoshangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RexiaoshangpinVO> selectListVO(Wrapper<RexiaoshangpinEntity> wrapper);
   	
   	RexiaoshangpinVO selectVO(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
   	
   	List<RexiaoshangpinView> selectListView(Wrapper<RexiaoshangpinEntity> wrapper);
   	
   	RexiaoshangpinView selectView(@Param("ew") Wrapper<RexiaoshangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RexiaoshangpinEntity> wrapper);
   	
}

