package com.example.aws_image_upload.datastore;

import com.example.aws_image_upload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Faisal", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "Marewan", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
