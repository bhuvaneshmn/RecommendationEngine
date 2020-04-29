package com.project.RecommendationController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.RecommendationService.RecommendationService;

@Controller
public class RecommendationController {

	@Autowired
	RecommendationService recservice;

	@RequestMapping("/getDataByLocation")
	public void getControllerPage(HttpServletRequest req, HttpServletResponse resp, String keyword)
			throws ServletException, IOException {
		String location = keyword;
		List<Map<String, Object>> model = new ArrayList<>();
		model = recservice.getDataByLocation(location);
		if (model == null) {
			req.setAttribute("map", model);
			req.getRequestDispatcher("/WEB-INF/jsp/Failed.jsp").forward(req, resp);

		}
		System.out.println("controller list" + model);

		req.setAttribute("map", model);
		req.getRequestDispatcher("/WEB-INF/jsp/getDataByLocation.jsp").forward(req, resp);

	}

	@RequestMapping("/getDataByKeyword")
	public void getControllerPage1(HttpServletRequest req, HttpServletResponse resp, String keyword)
			throws ServletException, IOException {

		List<Map<String, Object>> model = new ArrayList<>();
		model = recservice.getDataByKeyword(keyword);

		if (model == null) {
			req.setAttribute("map", model);
			req.getRequestDispatcher("/WEB-INF/jsp/Failed.jsp").forward(req, resp);

		}
		req.setAttribute("map", model);
		req.getRequestDispatcher("/WEB-INF/jsp/getDataByKeyword.jsp").forward(req, resp);
	}

}
