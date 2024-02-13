package com.bongsamaru.dona.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class DonaVO {

	// Donation  테이블
		private Integer donId; // 기부번호  - notnull 
		private String facId; // 시설아이디 - 이하 모두 null
		private String title; // 메인제목 (v500) - 
		@DateTimeFormat(pattern="yyyy-MM-dd") 
	    private Date recPeriod; // 모집기간
	    private Date endPeriod; // 종료기간
	    private Date extPeriod; // 연장기간
	    private Integer goalAmt; //목표모금액
	    private String projTarget; //사업대상
	    private Integer recStat; //모집현황(c3)
	    private String intro; //소개 (v2000) : 젤 위에표시되는 애
	    private String introTitle;// 소개글제목
	    private String donRegApp; //기부금등록여부(c1)
	    private String expEffect;  //기대효과(v2000) - 동적으로 처리하지말고 위에다가 처리하기! 

	    private String category; // 유형


	    private String paidCode;
	    private String backName;
	    private String bankAcct;

	    //전체리스트에 필요한 애들
	    private Integer donationCount; //기부인원수
	    private Integer donationRatio; //목표금액대비 기부금비율
	    private String facilityName; //시설명
	    private Integer total;
	    
	    //상세페이지
	    private String dday; //디데이
	    
    
    //Don_Detail(기부상세) 테이블
	    private Integer donDetId; //기부등록상세번호 (notnull)
	    //private Integer donId; 
	    private String usePlan; // 기부금 사용계획 - 구체적사업내용
	    private String link; //관련링크
	    private String link2; //관련링크2
	    private String usePlan2;
	    private String usePlan3;
	    private String usePlanAmt; // 기부금 사용계획 - 구체적사업비
	    private String usePlanAmt2;
	    private String usePlanAmt3;
	    private String addIntroTitle; //추가 소개글 제목
	    private String addIntro; //추가소개글
    
    
    //don_ledger(기부장부) 테이블
	    private Integer donLedId; // 기부장부번호
	    //private Integer donId; 
	    private Integer donAmt; // 기부금액
	    private String payMethod; //결제수단 (notnull)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date payDate; // 결제일자
	    private String payStat; //결제상태 (c3)
	    private String payId; // 결제번호
	    private String anonCheck; // 익명체크 (c3)
	    private String memId; // 회원아이디 
    
    
    //don_review(기부후기) 테이블
	    private Integer donRevId; //기부후기등록번호 (not null)
	    //private Integer donId; 
	    private Integer execAmt; //집행금액  (not null)
	    private Date startPeriod; //사업시작기간
	    //private Date endPeriod; //사업종료기간
	    private String revApp; //후기승인여부 
	    private Integer targetOk;//기부장부에서 총합
    
    //don_review(기부후기사업비) 테이블
	    private Integer donRevExpId; //기부후기사업비상세등록번호 (c18) not null
	    //private Integer donRevId; //기부후기등록번호 
	    private Integer bizCost; //사업비 not null
	    private String bizContent; //사업내용 not null
	    private Integer bizAmt; // 사업금액(구체적) not null
	    
    
    //don_review_table(기부후기제목) 테이블
	    private Integer donRevTitleId; //기부후기등록상세번호 notnull
	    //private String title; //제목
	    private String content; // 내용
	    //private Integer donRevId; // 기부후기등록번호
	    
	//시설테이블
	   // private String facId;
	    private String facName;
	    private String facIntro;
	    private Date facEstDate;
	    private String bizNum;
	    private String facBank;
	    private String donAcct;
	    


	    
	// 댓글 table (comments)
	    private Integer commId;
	    //private String memId;
	    //private String content;
	    private Date commDate;
	    private Integer detailCode;
	    private String code;
	    private String codeName; 
	
	    
	//서브코드
	    private String subCodeName;
	    private String subCode;
	    private String subCodeId;
	    
	    
	    
}
