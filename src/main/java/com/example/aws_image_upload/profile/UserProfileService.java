package com.example.aws_image_upload.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileService {

    private final UserProfileDBAccessService userProfileDBAccessService;

    @Autowired
    public UserProfileService(UserProfileDBAccessService userProfileDBAccessService) {
        this.userProfileDBAccessService = userProfileDBAccessService;
    }

    List<UserProfile> getUserProfiles(){
        return userProfileDBAccessService.getUserProfiles();
    }
}
