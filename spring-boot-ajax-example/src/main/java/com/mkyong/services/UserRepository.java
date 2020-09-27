package com.mkyong.services;


import org.springframework.data.repository.CrudRepository;

import com.mkyong.model.User;
import com.mkyong.model.User1;  


public interface UserRepository extends CrudRepository<User, Integer>  
{  
} 

