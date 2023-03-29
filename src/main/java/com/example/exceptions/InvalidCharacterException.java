package com.example.exceptions;

public class InvalidCharacterException extends Exception {

    public InvalidCharacterException(){
        super("Character does not exist");
    }

}
