package com.spring.jwt.FamilyBackground;

import com.spring.jwt.ContactDetails.ContactDTO;
import com.spring.jwt.ContactDetails.ContactMapper;
import com.spring.jwt.entity.CompleteProfile;
import com.spring.jwt.entity.ContactDetails;
import com.spring.jwt.entity.FamilyBackground;
import com.spring.jwt.utils.BaseResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FamilyBackgroundServiceImpl implements FamilyBackgroundService{

    private final FamilyBackgroundRepository repository;
    private final FamilyBackgroundMapper mapper;

    @Override
    public BaseResponseDTO create(FamilyBackgroundDTO dto) {

        FamilyBackground background= mapper.toEntity(dto);
        repository.save(background);

        BaseResponseDTO response = new BaseResponseDTO();
        response.setCode("200");
        response.setMessage(" Saved Successfully");
        response.setID(background.getUser().getId());  // set userID here

        return response;
    }


    @Override
    public FamilyBackgroundDTO getBackground(Integer userId) {
        return null;
    }
}
