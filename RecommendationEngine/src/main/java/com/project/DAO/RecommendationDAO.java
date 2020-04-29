package com.project.DAO;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

public interface RecommendationDAO {
	public List<Map<String, Object>> getDataByLocation(String keyword) throws UnknownHostException;

	public List<Map<String, Object>> getDataByKeyword(String keyword) throws UnknownHostException;
}
