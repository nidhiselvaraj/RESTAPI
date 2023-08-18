package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FavcolorEx3 {
	@Value("${var}")
	private String getName;
	@GetMapping("show")
	public String getMyFav()
	{
		return "My favourite colour is "+getName;
	}

}
