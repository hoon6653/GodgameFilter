package com.poothrow;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("Test")
	public List<String> Test(){
		return Arrays.asList("테스트합니다","TEST");
	}
}
