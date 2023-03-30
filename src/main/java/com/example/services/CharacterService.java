package com.example.services;

import com.example.exceptions.InvalidCharacterException;
import com.example.models.Characters;
import com.example.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class CharacterService {

    private final CharacterRepository characterRepo;

    @Autowired
    public CharacterService(CharacterRepository characterRepo){
        this.characterRepo = characterRepo;
    }

    public Characters getCharacter(String nickname) throws InvalidCharacterException{
        return characterRepo.getByNickName(nickname).orElseThrow(InvalidCharacterException::new);
    }

    public List<Characters> getCharacters(){
        return characterRepo.findAll();
    }

}
