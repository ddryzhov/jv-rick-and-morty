package mate.academy.rickandmorty.service;

import java.util.List;
import java.util.Random;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.repository.CharacterRepository;
import org.springframework.stereotype.Service;

@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public CharacterDto getRandomCharacter() {
        List<CharacterDto> characters = characterRepository.findAll();
        Random random = new Random();
        return characters.get(random.nextInt(characters.size()));
    }

    public List<CharacterDto> searchCharactersByName(String name) {
        return characterRepository.findByNameContaining(name);
    }
}
