package com.bongsamaru.facility.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bongsamaru.common.VO.FacilityVO;
import com.bongsamaru.common.VO.FundingVO;
import com.bongsamaru.common.VO.VolActVO;
import com.bongsamaru.common.VO.VolunteerVO;
import com.bongsamaru.dona.service.DonaVO;
import com.bongsamaru.facility.Service.FacilityService;
import com.bongsamaru.facility.mapper.FacilityMapper;
@Service
public class FacilityServiceImpl implements FacilityService {

	@Autowired
	FacilityMapper mapper;

	@Override
	public List<FacilityVO> getFacilityList(String facZip2, String facType) {
		return mapper.getFacilityList(facZip2,facType);
	}
	
	
	@Override
	public FacilityVO getFacilityInfo(String facId) {
		return mapper.getFacilityInfo(facId);
	}

	@Override
	public List<FundingVO> getFundingList(String facId) {
		return mapper.getfundingList(facId);
	}

	@Override
	public List<FundingVO> getFundedList(String facId) {
		return mapper.getfundedList(facId);
	}

	@Override
	public List<VolunteerVO> getVolunteerList(String facId) {
		
		return mapper.getVolList(facId);
	}

	@Override
	public List<DonaVO> getDonaList(String facId) {
		return mapper.getDonaList(facId);
	}
	
	
	@Override
	public int InsertFacVol(VolActVO volActVO) {
		int result = mapper.InsertFacVol(volActVO);
		System.out.println(volActVO);
		if(result ==1) {
			return volActVO.getVolActId();
			
		}else {
			return -1;
		}	
	}

	@Override
	public List<VolActVO> getVolunteerJoinList(String facId) {
		return mapper.getVolunteerJoinList(facId);
	}
	

	
}


