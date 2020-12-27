package com.hotelbooking.services;



import org.springframework.security.core.userdetails.UserDetailsService;

import com.hotelbooking.models.User;
import com.hotelbooking.temp.CurrentUser;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();
}
