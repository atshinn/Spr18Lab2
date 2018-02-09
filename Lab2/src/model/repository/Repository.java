package model.repository;

import java.util.List;

import controller.querys.criteria.QueryCriteria;

public interface Repository<T> {

	public void add(T arg);
	public void remove(T arg);
	public void update(T arg);
	public List<T> query(QueryCriteria qc);
}
