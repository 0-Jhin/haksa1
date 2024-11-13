package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Profiles;

public class ProfilesDto {
    public record ProfilesRequest(
            Long id,
            String profile_nickname,
            Long created_at,
            Long update_at
    ){}
    @Builder
    public record ProfilesResponse(
            Long id,
            String profile_nickname,
            Long created_at,
            Long update_at
    ){
        public static ProfilesResponse of(Profiles profiles){
            return ProfilesResponse.builder()
                    .id(profiles.getId())
                    .profile_nickname(profiles.getProfile_nickname())
                    .created_at(profiles.getCreated_at())
                    .update_at(profiles.getUpdate_at())
                    .build();
        }
    }
}
