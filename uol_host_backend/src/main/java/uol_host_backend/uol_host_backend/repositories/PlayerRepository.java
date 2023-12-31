package uol_host_backend.uol_host_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uol_host_backend.uol_host_backend.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    
}
