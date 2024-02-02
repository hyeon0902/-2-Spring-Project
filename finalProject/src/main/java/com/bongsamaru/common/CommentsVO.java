package com.bongsamaru.common;

import java.util.Date;

import lombok.Data;

@Data
public class CommentsVO {
	private Integer commId;
	private String memId;
	private String content;
	private Date commDate;
	private Date modDate;
	private Integer parentId;
	private String code;
	private Integer detailCate;
}
