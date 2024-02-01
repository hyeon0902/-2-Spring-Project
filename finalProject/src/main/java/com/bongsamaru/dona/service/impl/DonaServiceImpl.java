package com.bongsamaru.dona.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bongsamaru.dona.mapper.DonaMapper;
import com.bongsamaru.dona.service.DonaService;
import com.bongsamaru.dona.service.DonaVO;

@Service
public class DonaServiceImpl implements DonaService {
	

	@Autowired
	DonaMapper donaMapper;
	
	
	@Override
	public List<DonaVO> getDonaList() {
		return donaMapper.getDonaList();
	}
	
	
	@Override
	public DonaVO getDonaDetail(Integer donId, String facId) {
		return donaMapper.getDonaDetail(donId, facId);
	}
	
	@Override
	public DonaVO getDoner(Integer donId) {
		return donaMapper.getDoner(donId);
	}
	
	@Override
	public List<DonaVO> getCategoryList() {
		return donaMapper.getCategoryList();
	}
	
	@Override
	public int insertDonation(DonaVO donaVO) {
		int result = donaMapper.insertDonation(donaVO);
		
		if(result == 1) {
			return donaVO.getDonId();
		}else {
			return -1;
		}
		
	}
}
