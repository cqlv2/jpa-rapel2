package dev.interfaces;

import java.util.List;
import java.util.Optional;

import dev.entities.Film;
import dev.exception.RepoException;

public interface ServicesInterface<T, TDtoRep, TDtoQuery> {

	public List<TDtoRep> readAll();
	public T findEntityById(int id) throws RepoException;
	public TDtoRep addUpdate(TDtoQuery dtoQuery);
	public String delete(Integer id) throws RepoException;
	
	
	
	public TDtoRep entityToDto(T entity);
	public T dtoToEntity(TDtoQuery query) throws RepoException;
	
	
}
