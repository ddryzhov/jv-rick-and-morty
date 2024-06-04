package mate.academy.rickandmorty.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterResponse {
    @JsonProperty("results")
    private List<CharacterDto> results;

    public List<CharacterDto> getResults() {
        return results;
    }

    public void setResults(List<CharacterDto> results) {
        this.results = results;
    }
}
