package com.dao;

import com.entity.DiscussnongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongjiVO;
import com.entity.view.DiscussnongjiView;


/**
 * 农机评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-18 15:38:13
 */
public interface DiscussnongjiDao extends BaseMapper<DiscussnongjiEntity> {
	
	List<DiscussnongjiVO> selectListVO(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
	
	DiscussnongjiVO selectVO(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
	
	List<DiscussnongjiView> selectListView(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);

	List<DiscussnongjiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
	
	DiscussnongjiView selectView(@Param("ew") Wrapper<DiscussnongjiEntity> wrapper);
	

}
