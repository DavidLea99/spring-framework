package com.example.spring.placeholder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Lea on 2020/3/11.
 */
@Service
public class PlaceholderService {

	@Value("${test.name}")
	private String name;

	public String getName(){
		return this.name;
	}
}
