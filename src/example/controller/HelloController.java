package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("start.do")
	public ModelAndView start() {
		System.out.println("start.do 요청이 들어왔을 때 ");
		// 페이지 지정과 데이타를 넘기기
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("message", "오늘도 즐겁게");
		mv.addObject("greeting", "맛점합시다");
		return mv;
	}
}
