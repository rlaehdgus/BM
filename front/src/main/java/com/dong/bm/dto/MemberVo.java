package com.dong.bm.dto;

import lombok.Data;

@Data
public class MemberVo {
	private Integer member_code;
	private String id;
	private String password;
	private String name;
	private String age;
	private String sex;
	private String jumin;
	private String phone;
	private String address;
	private String cre_date;
	private String modif_date;
}
