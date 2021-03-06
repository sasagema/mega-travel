package com.megatravel.mainbackend.service;

import java.util.Date;
import java.util.List;

import com.megatravel.mainbackend.dto.SearchAccommodationDTO;
import com.megatravel.mainbackend.model.AccPrice;
import com.megatravel.mainbackend.model.Accommodation;

import javax.transaction.Transactional;


@Transactional
public interface AccommodationService {
	
	List<Accommodation> findAll();
	Accommodation save(Accommodation accommodation);
	void delete(Long id);
	void delete(Accommodation accommodation);
	Accommodation findOne(Long id);
	List<Accommodation> findByAgentId(Long agentId);
	List<AccPrice> getPricePlan(Long accId);
	
	List<Accommodation> search(SearchAccommodationDTO search);

	
	
	List<Accommodation> findByCityAndAccCapacity(String city,Integer accCapacity, String accType, String accCategory);
	List<Accommodation> findByCityAndAccCapacity2(String city,Integer accCapacity, String accType);
	List<Accommodation> findByAccUnavailableDateStartBetweenAndAccUnavailableDateEndBetween(Date startDate, Date endDate,Date startDate1, Date endDate1);
	List<Accommodation> advancedSearch(SearchAccommodationDTO search);
	
	List<Accommodation> sortPriceByAsc();
	List<Accommodation> sortPriceByDesc();

}
