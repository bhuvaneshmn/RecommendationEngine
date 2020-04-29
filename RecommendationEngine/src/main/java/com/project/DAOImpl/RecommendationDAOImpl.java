package com.project.DAOImpl;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.stereotype.Service;

import com.project.DAO.RecommendationDAO;
import com.project.util.getElasticSearchConnection;

@Service
public class RecommendationDAOImpl implements RecommendationDAO {
	@Override
	public List<Map<String, Object>> getDataByLocation(String keyword) throws UnknownHostException {

		getElasticSearchConnection con = new getElasticSearchConnection();
		List<Map<String, Object>> dataList = new ArrayList<>();
		TransportClient client = con.getElasticSearchConnection();

		SearchResponse resp = client.prepareSearch("college_new").setTypes("details")
				.setSearchType(SearchType.QUERY_THEN_FETCH).setQuery(QueryBuilders.matchQuery("college_city", keyword))
				.execute().actionGet();

		int size = (int) resp.getHits().getTotalHits();
		System.out.println("Total records: " + size);
		if (size == 0) {
			return null;
		}

		for (SearchHit hit : resp.getHits()) {
			Map<String, Object> map = new HashMap<>();
			map = hit.getSourceAsMap();

			dataList.add(map);

			System.out.println("Es Data list : " + dataList);
		}
		return dataList;

	}

	@Override
	public List<Map<String, Object>> getDataByKeyword(String keyword) throws UnknownHostException {
		// TODO Auto-generated method stub
		List<Map<String, Object>> dataList = new ArrayList<>();

		getElasticSearchConnection con = new getElasticSearchConnection();

		TransportClient client = con.getElasticSearchConnection();

		SearchResponse resp = client.prepareSearch("college_new").setTypes("details")
				.setSearchType(SearchType.QUERY_THEN_FETCH)
				.setQuery(QueryBuilders.matchQuery("course.keywords", keyword)).execute().actionGet();

		int size = (int) resp.getHits().getTotalHits();
		System.out.println("Total records: " + size);
		if (size == 0) {
			return null;
		}
		for (SearchHit hit : resp.getHits()) {
			Map<String, Object> map = new HashMap<>();
			map = hit.getSourceAsMap();

			dataList.add(map);

			System.out.println("Es Data list : " + dataList);
		}
		return dataList;
	}
}
