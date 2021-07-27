package mulcam.com.a.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mulcam.com.a.dto.MemberDto;

@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String hello() {
		System.out.println("HelloController hello() " + new Date());
		
		return "헬로우";
	}
	
	@RequestMapping(value = "/member")
	public MemberDto member() {
		System.out.println("HelloController member() " + new Date());
		
		MemberDto dto = new MemberDto("aaa", "111", "seoul");
		
		return dto;
	}
	
	@RequestMapping(value = "/memberlist")
	public List<MemberDto> memberlist() {
		System.out.println("HelloController memberlist() " + new Date());
		
		List<MemberDto> list = new ArrayList<>();
		list.add(new MemberDto("aaa", "111", "seoul"));
		list.add(new MemberDto("bbb", "222", "pusan"));
		list.add(new MemberDto("ccc", "333", "daegu"));
		
		return list;
	}
	
}









