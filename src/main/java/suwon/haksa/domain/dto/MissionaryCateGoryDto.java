package suwon.haksa.domain.dto;

import lombok.Builder;
import suwon.haksa.domain.model.Departments;
import suwon.haksa.domain.model.MissionaryCateGory;

public class MissionaryCateGoryDto {
    public record MissionaryCateGoryRequest(
            Long id,
            Long code,
            String name,
            Long area
    ){}
    @Builder
    public record MissionaryCateGoryResponse(
            Long id,
            Long code,
            String name,
            Long area
    ){
        public static MissionaryCateGoryResponse of(MissionaryCateGory missionaryCateGory){
            return MissionaryCateGoryResponse.builder()
                    .id(missionaryCateGory.getId())
                    .code(missionaryCateGory.getCode())
                    .name(missionaryCateGory.getName())
                    .area(missionaryCateGory.getArea())
                    .build();
        }
    }
}
