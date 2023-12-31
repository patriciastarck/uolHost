package uol_host_backend.uol_host_backend.model.dtos;

import uol_host_backend.uol_host_backend.model.GroupType;

public record PlayerDto(
    String name,

    String email,

    String phoneNumber,

    GroupType groupType

) {
}
