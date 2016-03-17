package com.esri.gw.content.objectstore.swift;

import java.io.File;
import java.io.InputStream;

import com.esri.gw.content.objectstore.IObjectStore;
import com.esri.gw.content.objectstore.ObjectNotFoundException;
import com.esri.gw.content.objectstore.ObjectStoreException;
import com.esri.gw.content.objectstore.ObjectStoreObjectInfo;

public class SwiftObjectStore implements IObjectStore {

	public void cancel(String arg0, String arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public void commit(String arg0, String arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public String create(String arg0) throws ObjectStoreException {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub

	}

	public void deleteTree(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub

	}

	public boolean exists(String arg0) throws ObjectStoreException {
		// TODO Auto-generated method stub
		return false;
	}

	public InputStream getAsInputStream(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getAsObject(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public ObjectStoreObjectInfo getInfo(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] getParts(String arg0, String arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUrl(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] keys(String arg0) throws ObjectStoreException {
		// TODO Auto-generated method stub
		return null;
	}

	public long length(String arg0) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void put(String arg0, Object arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public void put(String arg0, File arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public void put(String arg0, InputStream arg1) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public void putPart(String arg0, String arg1, int arg2, InputStream arg3, long arg4) throws ObjectStoreException {
		// TODO Auto-generated method stub

	}

	public void rename(String arg0, String arg1) throws ObjectStoreException, ObjectNotFoundException {
		// TODO Auto-generated method stub

	}

}
