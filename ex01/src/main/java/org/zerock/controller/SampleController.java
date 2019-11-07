package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basic() {
		log.info("............................................................");
	}

	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("get get get gari get get ....................................");
	}

	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}

	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam int age) {
		log.info("name : " + name);
		log.info("age : " + age);
		return "ex02";
	}

	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids : " + ids);
		return "ex02List";
	}

	@GetMapping("/ex02bean")
	public String ex02bean(SampleDTOList list) {
		log.info("list : " + list);
		return "ex02bean";
	}

	/**
	 * 
	 * @param initBinder는 쿼리스트링에서 날짜와 같은 타입이 들어왔을때 포맷팅 해주는 역할 (하지만, 사용자 자료형을 만들때 해당
	 *                    객체에 @DateTimeFormat(pattern = "yyyy/MM/dd")가 더 편함)
	 */
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}

	@GetMapping("/ex03")
	public String ex03(TodoDTO dto) {
		log.info("dto : " + dto);
		return "ex03";
	}
	
	@GetMapping("/ex04")
	public String ex04(@ModelAttribute("dto") SampleDTO dto, @ModelAttribute("page") int page) {
		log.info("dto : " + dto);
		log.info("page : " + page);
		return "/sample/ex04";
	}
	
	@GetMapping("/ex05")
	public void ex05() {
		log.info("ex05........................");
	}
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		return new SampleDTO("오대근", 19);
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {
		String msg = "{\"name\" : \"홍길동\", \"age\" : 19}";
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type", "application/json;charset=UTF-8");
		
		return new ResponseEntity<>(msg, headers, HttpStatus.OK);
	}

	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("exUpload........................");
	}
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		files.forEach(file -> {
			log.info("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			log.info("name:" + file.getOriginalFilename());
			log.info("size:" + file.getSize());
		});
	}
}
