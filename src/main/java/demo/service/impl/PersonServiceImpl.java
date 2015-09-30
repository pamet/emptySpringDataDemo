package demo.service.impl;

import org.springframework.stereotype.Service;

import demo.domain.Person;
import demo.model.GridRequest;
import demo.model.GridResponse;
import demo.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public GridResponse findAll(GridRequest gridRequest) {
		GridResponse gridResponse = new GridResponse();

		// 1. Implement simple paging functionality

		// 2. Implement paging and sorting functionality
		// Direction dir = "asc".equalsIgnoreCase(gridRequest.getSortOrder()) ? Direction.ASC : Direction.DESC;

		// 3. Implement search functionality

		//gridResponse.setCurrentPage(page.getContent());
		//gridResponse.setTotalRows(page.getTotalElements());
		return gridResponse;
	}

	@Override
	public Person findById(Long id) {
		// Implement FETCH BY ID functionality

		return null;
	}

	@Override
	public Person create(Person person) {
		// Implement CREATE PERSON functionality
		
		return null;
	}

	@Override
	public void delete(Long id) {
		// Implement DELETE functionality
	}
	
}
