package model.docs.maps;

import java.util.concurrent.ConcurrentHashMap;

import model.repository.Queryable;

public class SubscriberMap extends ConcurrentHashMap<String,Queryable> {
	private static class MapCase{
		public static final SubscriberMap MAP = new SubscriberMap();		
	}
	
	private SubscriberMap() {
		
	}
	
	public static SubscriberMap get() {
		return MapCase.MAP;
	}
	
}
