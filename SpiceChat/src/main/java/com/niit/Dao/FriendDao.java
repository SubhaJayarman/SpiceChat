package com.niit.Dao;

import java.util.List;

import com.niit.models.Friends;
import com.niit.models.User;

public interface FriendDao {
	List<User> getSuggestedUsers(String email);
	void addFriendRequest(Friends friend);
	List<Friends> getPendingRequests(String email);
	void acceptFriendRequest(Friends friend);
	void deleteFriendRequest(Friends friend);
	List<User> listOfFriends(String email);
}