package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

@Entity
@Getter
@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MissionaryCateGory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private Long code;
    private String name;
    private Long area;

    @Builder
    public MissionaryCateGory(Long id, Long code, String name, Long area){
        this.id = id;
        this.code = this.code;
        this.name = name;
        this.area = area;
    }
}
