package com.dao;

import com.entity.NongjiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjiyuyueVO;
import com.entity.view.NongjiyuyueView;


/**
 * 农机预约
 * 
 * @author 
 * @email 
 * @date 2022-04-18 15:38:13
 */
public interface NongjiyuyueDao extends BaseMapper<NongjiyuyueEntity> {
	
	List<NongjiyuyueVO> selectListVO(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
	
	NongjiyuyueVO selectVO(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
	
	List<NongjiyuyueView> selectListView(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);

	List<NongjiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
	
	NongjiyuyueView selectView(@Param("ew") Wrapper<NongjiyuyueEntity> wrapper);
	

}
