package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.entity.Page;

import ibmtal.com.facebook.core.result.*;
public interface PageService {
	ArrayList<Page> getAll();
	 Page addPage(Page page);
	 Result newPage(Page page);
}
