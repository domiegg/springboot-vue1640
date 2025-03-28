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


import com.dao.DiscussnongjiDao;
import com.entity.DiscussnongjiEntity;
import com.service.DiscussnongjiService;
import com.entity.vo.DiscussnongjiVO;
import com.entity.view.DiscussnongjiView;

@Service("discussnongjiService")
public class DiscussnongjiServiceImpl extends ServiceImpl<DiscussnongjiDao, DiscussnongjiEntity> implements DiscussnongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongjiEntity> page = this.selectPage(
                new Query<DiscussnongjiEntity>(params).getPage(),
                new EntityWrapper<DiscussnongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongjiEntity> wrapper) {
		  Page<DiscussnongjiView> page =new Query<DiscussnongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongjiVO> selectListVO(Wrapper<DiscussnongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongjiVO selectVO(Wrapper<DiscussnongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongjiView> selectListView(Wrapper<DiscussnongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongjiView selectView(Wrapper<DiscussnongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
