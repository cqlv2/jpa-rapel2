package dev.interfaces;

import java.util.List;

public interface ServicesInterface<T, TDtoRep, TDtoQuery> {

	public List<TDtoRep> readAll();
	public TDtoRep readById(int id);
	public TDtoRep addUpdate(T entity);
	public void delete(T entity);
	
	
	
	public TDtoRep entityToDto(T entity);
	public T dtoToEntity(TDtoQuery query);
	
	
}
