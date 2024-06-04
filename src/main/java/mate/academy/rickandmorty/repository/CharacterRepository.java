package mate.academy.rickandmorty.repository;

import java.util.List;
import mate.academy.rickandmorty.dto.CharacterDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterDto, Long> {
    List<CharacterDto> findByNameContaining(String name);
}
