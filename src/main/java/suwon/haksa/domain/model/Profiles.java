package suwon.haksa.domain.model;

import jakarta.persistence.*;
import lombok.*;
import suwon.haksa.global.BaseEntity;

import java.awt.*;

@Entity
@Getter
//@Builder
//@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Profiles extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;
    private String profile_nickname;
    private Long created_at; //Date
    private Long update_at; //Date

    @OneToOne(mappedBy = "lawyer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Image profile_image;

    public void setImage(Image profile_image) {
        this.profile_image = profile_image;
    }

    @Builder
    public Profiles(Long id, String profile_nickname, Long created_at, Long update_at){
        this.id = id;
        this.profile_nickname = profile_nickname;
        this.created_at = created_at;
        this.update_at = update_at;
    }

}
