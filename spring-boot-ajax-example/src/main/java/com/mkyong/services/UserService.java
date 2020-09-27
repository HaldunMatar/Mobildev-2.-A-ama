package com.mkyong.services;

import com.mkyong.model.User;
import com.mkyong.model.User1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
	
	
	@Autowired  
	UserRepository userRepository;  

    private List<User1> users;
    
    
    public void  add(User user) {
    	userRepository.save(user);
    }
    
    public List<User> findAll() {
    	
    	 return (List<User>) userRepository.findAll();
    }
    
    public List<User> getAll()   
    {  
    List<User> list = new ArrayList<User>();  
    userRepository.findAll().forEach(user -> list.add(user));  
    return list;  
    }   

    // Love Java 8
    public List<User1> findByUserNameOrEmail(String username) {

        List<User1> result = users.stream().filter(x -> x.getUsername().equalsIgnoreCase(username)).collect(Collectors.toList());

        return result;

    }
  
    // Init some users for testing
    @PostConstruct
    private void iniDataForTesting() {

        users = new ArrayList<User1>();

        User1 user1 = new User1("mkyong", "password111", "mkyong@yahoo.com");
        User1 user2 = new User1("yflow", "password222", "yflow@yahoo.com");
        User1 user3 = new User1("laplap", "password333", "mkyong@yahoo.com");
        User1 user4 = new User1("laplap", "password333", "mkyong@yahoo.com");
        User1 user5 = new User1("laplap", "password333", "mkyong@yahoo.com");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

    }

}
