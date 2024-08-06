package com.simple.basic.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper { // 첫글자 대문자 중요
	public String getTime();
}
