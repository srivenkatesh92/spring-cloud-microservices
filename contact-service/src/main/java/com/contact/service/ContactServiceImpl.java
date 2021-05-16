package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact> list = List.of(
			new Contact(1L,"srivenkatesh123@gmail.com","Srivenkatesh",1311L),
			new Contact(2L,"venkatkiruthika24@gmail.com","Kiruthika",1312L),
			new Contact(3L,"hello@gmail.com","hello",1313L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long UserId) {
		// TODO Auto-generated method stub
		return list.stream().filter(Contact -> Contact.getUserId().equals(UserId)).collect(Collectors.toList());
	}
	
	

}
