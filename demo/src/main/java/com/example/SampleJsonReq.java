package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleJsonReq {

	@RequestMapping(value = "/list")
	@ResponseBody
	public List<String> list(@RequestBody SampleBean bean) {

		System.out.println("===リクエスト内容 start===");
		System.out.println(bean.getName());
		System.out.println("===リクエスト内容 end===");

		List<String> list = new ArrayList<>();
		list.add("test");
		list.add("aaaaaaaa");
		return list;
	}

	@RequestMapping(value = "/test")
	@ResponseBody
	public List<String> test() {
		List<String> list = new ArrayList<>();
		list.add("aaaaaaaa");
		list.add("bbbbbbbb");
		return list;
	}
}
