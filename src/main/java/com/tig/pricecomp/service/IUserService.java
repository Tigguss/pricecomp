package com.tig.pricecomp.service;

import com.tig.pricecomp.persistence.model.PasswordResetToken;
import com.tig.pricecomp.persistence.model.User;
import com.tig.pricecomp.web.dto.UserDto;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

public interface IUserService {

    User registerNewUserAccount(UserDto accountDto);

    void saveRegisteredUser(User user);

    void deleteUser(User user);


    User findUserByEmail(String email);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String generateQRUrl(User user) throws UnsupportedEncodingException;

    List<String> getUsersFromSessionRegistry();


}
