package com.kusitms.backend.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kusitms.backend.dto.AuthDto.Request;
import com.kusitms.backend.dto.SignInRequest;
import com.kusitms.backend.dto.TokenDto;
import com.kusitms.backend.dto.TokenRequestDto;

public interface IAuthService {

  TokenDto signIn(SignInRequest request);

  void withdrawal(Long userId);

  boolean checkNicknameDuplication(String nickname);

  void signUp(Request request);

  TokenDto reissue(TokenRequestDto request);

  TokenDto kakaoSignIn(String code) throws JsonProcessingException;
}
