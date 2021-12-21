package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import ibmtal.com.facebook.business.services.NewsService;
import ibmtal.com.facebook.database.NewsDao;
import ibmtal.com.facebook.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class NewsManager implements NewsService{
	private NewsDao newsDao;
	@Autowired
	public NewsManager(NewsDao newsDao) {
		super();
		this.newsDao = newsDao;
	}
	@Override
	public ArrayList<News> getAll() {
		// TODO Auto-generated method stub
		return new ArrayList<News>(newsDao.findAll());
	}
	
	

}
