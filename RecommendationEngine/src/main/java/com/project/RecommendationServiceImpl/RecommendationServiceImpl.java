package com.project.RecommendationServiceImpl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.RecommendationDAO;
import com.project.RecommendationService.RecommendationService;

@Service
public class RecommendationServiceImpl implements RecommendationService {
	@Autowired
	RecommendationDAO query;

	@Override
	public List<Map<String, Object>> getDataByLocation(String keyword) throws UnknownHostException {

		List<Map<String, Object>> map = new ArrayList<>();
		List<Map<String, Object>> Newmap = new ArrayList<>();
		try {

			map = query.getDataByLocation(keyword);

			if (map == null) {
				return null;
			}

			for (Map<String, Object> item : map) {

				String colCourse = item.get("course").toString();
				String colName = item.get("colleg_name").toString();
				String colCity = item.get("college_city").toString();
				String colCode = item.get("college_code").toString();
				String colRating = item.get("rating").toString();
				Map<String, Object> map1 = new HashMap<String, Object>();

				map1.put("college_name", colName);
				map1.put("college_city", colCity);
				map1.put("college_code", colCode);
				map1.put("college_rating", colRating);
				map1.put("college_Course", colCourse);
				Newmap.add(map1);
			}
			System.out.println("new list" + Newmap);

		} catch (Exception e) {

			System.out.println("Exception occured in getDataByLocation " + e.getMessage());
		}
		return Newmap;

		/*
		 * finally { System.out.println("hi"); }
		 */
	}

	@Override
	public List<Map<String, Object>> getDataByKeyword(String keyword) throws UnknownHostException {
		List<Map<String, Object>> map = new ArrayList<>();
		List<Map<String, Object>> Newmap = new ArrayList<>();

		map = query.getDataByKeyword(keyword);

		try {

			map = query.getDataByKeyword(keyword);

			if (map == null) {
				return null;
			}

			for (Map<String, Object> item : map) {

				String colCourse = item.get("course").toString();
				String colName = item.get("colleg_name").toString();
				String colCity = item.get("college_city").toString();
				String colCode = item.get("college_code").toString();
				String colRating = item.get("rating").toString();
				Map<String, Object> map1 = new HashMap<String, Object>();

				map1.put("college_name", colName);
				map1.put("college_city", colCity);
				map1.put("college_code", colCode);
				map1.put("college_rating", colRating);
				map1.put("college_Course", colCourse);
				Newmap.add(map1);
			}
			System.out.println("new list" + Newmap);

		} catch (Exception e) {

			System.out.println("Exception occured in getDataByLocation " + e.getMessage());
		}
		return Newmap;

	}

}
