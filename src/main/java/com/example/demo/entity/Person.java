package com.example.demo.entity;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@Data
@RedisHash("person")		// 이 값이 redis key의 prefix 로 사용됨. ex) key = person:<id> 조합
public class Person {
//	유지시간 설정
	public enum Gender {
		MALE, FEMALE
	}
	
	@Id
	private String id;	// uniqueId 와 같이 id 외에 다른 변수명도 가능
	
	private String name;
	private int age;
	private Gender gender;
	
	private Map<String, String> mapData;
	private List<School> schoolList;
	private Company company;
}