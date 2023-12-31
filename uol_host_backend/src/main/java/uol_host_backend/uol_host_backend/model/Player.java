package uol_host_backend.uol_host_backend.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import uol_host_backend.uol_host_backend.model.dtos.PlayerDto;

@Entity(name="players")
@Table(name="players")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Player {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    private String phoneNumber;

    private String codename;

    private GroupType groupType;

    public Player(PlayerDto dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.phoneNumber = dto.phoneNumber();
        this.groupType = dto.groupType();
    }

    
}
