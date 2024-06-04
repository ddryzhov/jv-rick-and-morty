package mate.academy.rickandmorty.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import mate.academy.rickandmorty.dto.CharacterDto;
import mate.academy.rickandmorty.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/characters")
@Tag(name = "Characters", description = "API for Rick and Morty characters")
public class CharacterController {
    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/random")
    @Operation(summary = "Get a random character",
            description = "Returns a random character from the database")
    public CharacterDto getRandomCharacter() {
        return characterService.getRandomCharacter();
    }

    @GetMapping("/search")
    @Operation(summary = "Search characters by name",
            description = "Search and return a list of characters whose "
                    + "name contains the search string")
    public List<CharacterDto> searchCharactersByName(
            @Parameter(description = "Name to search for")
            @RequestParam String name
    ) {
        return characterService.searchCharactersByName(name);
    }
}
