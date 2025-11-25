package com.spring.jwt.FamilyBackground;

import com.spring.jwt.utils.BaseResponseDTO;

public interface FamilyBackgroundService {

    BaseResponseDTO create(FamilyBackgroundDTO dto);
    FamilyBackgroundDTO getBackground(Integer userId);

}
