package model.docs.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import model.repository.Queryable;

public class GuestMap extends ConcurrentHashMap<String, Queryable> {
	//ensures thread safety through lazy loading DONT MOVE
	private static class MapCase{
		public static final GuestMap MAP = new GuestMap();
	}
	
	private GuestMap() {
		super();
	}
	
	public static GuestMap get() {
		return MapCase.MAP;
	}
	
	
}
