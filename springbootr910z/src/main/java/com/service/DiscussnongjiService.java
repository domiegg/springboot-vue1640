package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongjiView;


/**
 * 农机评论表
 *
 * @author 
 * @email 
 * @date 2022-04-18 15:38:13
 */
public interface DiscussnongjiService extends IService<DiscussnongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongjiVO> selectListVO(Wrapper<DiscussnongjiEntity> wrapper);
   	
   	DiscussnongjiVO selectVO(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
   	
   	List<DiscussnongjiView> selectListView(Wrapper<DiscussnongjiEntity> wrapper);
   	
   	DiscussnongjiView selectView(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongjiEntity> wrapper);
   	

}

