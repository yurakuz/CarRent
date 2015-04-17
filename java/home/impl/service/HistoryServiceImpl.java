package home.impl.service;

import javax.transaction.Transactional;

import home.dao.HistoryDAO;
import home.model.History;
import home.service.HistoryService;

import org.springframework.stereotype.Service;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

	private HistoryDAO dao;
	
	
	public Iterable<History> getAllHistory() {
		return dao.findAll();
	}
	@Transactional
	public void deleteHistory(Integer id) {
		dao.deleteAll();
		
	}

}
