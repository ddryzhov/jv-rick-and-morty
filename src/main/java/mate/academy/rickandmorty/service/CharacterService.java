package mate.academy.rickandmorty.service;

import java.util.List;
import java.util.Random;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;
    private final Random random;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
        this.random = new Random();
    }

    public CharacterDto getRandomCharacter() {
        List<CharacterDto> characters = characterRepository.findAll();
        return characters.get(random.nextInt(characters.size()));
    }

    public List<CharacterDto> searchCharactersByName(String name) {
        return characterRepository.findByNameContaining(name);
    }
}
