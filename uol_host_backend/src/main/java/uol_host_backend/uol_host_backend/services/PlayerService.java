package uol_host_backend.uol_host_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uol_host_backend.uol_host_backend.model.Player;
import uol_host_backend.uol_host_backend.model.dtos.PlayerDto;
import uol_host_backend.uol_host_backend.repositories.PlayerRepository;

@Service
public class PlayerService {
    
    @Autowired
    private PlayerRepository repository;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
    }
}
