package home.service;

import home.model.History;



public interface HistoryService {
	
	public Iterable<History> getAllHistory();
	public void deleteHistory(Integer id);

}
