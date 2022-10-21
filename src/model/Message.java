package model;

/**
 * This enum encapsulates the possible result of the Action on the database,
 * thus indicating if an error has ocurred or if everything went alright ("OK").
 *
 * @author Nicolas Rodriguez
 */
public enum Message {
    OK,                                         // No error
    SERVERERROR,                 // ServerException
    USERALREADYEXISTS,    // UserAlreadyExistsException
    EMAILALREADYEXISTS,   // EmailAlreadyExistsException   
    INCORRECTPASSWORD, // IncorrectPasswordException
    USERDOESNOTEXIST;      // UserDoesNotExistException 
}
