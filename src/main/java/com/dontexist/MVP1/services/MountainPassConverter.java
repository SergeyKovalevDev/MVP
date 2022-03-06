package com.dontexist.MVP1.services;

import org.springframework.stereotype.Component;
import com.dontexist.MVP1.dto.MountainPassDto;
import com.dontexist.MVP1.entity.MountainPass;

@Component
public class MountainPassConverter {

    public MountainPass fromPassDtoToPass(MountainPassDto mountainPassDto) {
        MountainPass mountainPass = new MountainPass();
        mountainPass.setId(mountainPassDto.getId());
        mountainPass.setDate(mountainPassDto.getDate());
        mountainPass.setRaw_data(mountainPassDto.getRaw_data());
        mountainPass.setImages(mountainPassDto.getImages());
        return mountainPass;
    }

    public MountainPassDto fromPassToPassDto(MountainPass mountainPass) {
        MountainPassDto mountainPassDto = new MountainPassDto();
        mountainPassDto.setId(mountainPass.getId());
        mountainPassDto.setDate(mountainPass.getDate());
        mountainPassDto.setRaw_data(mountainPass.getRaw_data());
        mountainPassDto.setImages(mountainPass.getImages());
        return mountainPassDto;
    }
}
