package com.example.aws_image_upload.profile;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/user-profile")
public class UserProfileController {

    private final UserProfileService userProfileService;

    public UserProfileController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @GetMapping
    public List<UserProfile> getUserProfile(){
        return userProfileService.getUserProfiles();
    }

    @PostMapping(
            path = "{userProfile}/image/download",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void uploadUserProfileImage(@PathVariable("userProfileId") UUID userProfileId,
                                       @RequestParam("file")MultipartFile file) {
        userProfileService.uploadUserProfileImage(userProfileId, file);
    }
}
