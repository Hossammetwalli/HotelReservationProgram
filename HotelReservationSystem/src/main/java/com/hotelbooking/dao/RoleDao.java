package com.hotelbooking.dao;

import com.hotelbooking.models.Role;

//DAO Pattern for Role
public interface RoleDao {

	public Role findRoleByName(String roleName);
	
}
