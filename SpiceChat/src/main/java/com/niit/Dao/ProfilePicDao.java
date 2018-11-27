package com.niit.Dao;

import com.niit.models.ProfilePic;

public interface ProfilePicDao {
	void uploadProfilePicture(ProfilePic profilePicture);
	ProfilePic getProfilePicture(String email);
}