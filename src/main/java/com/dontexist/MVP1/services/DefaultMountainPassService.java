package com.dontexist.MVP1.services;

import com.dontexist.MVP1.dto.MountainPassDto;
import com.dontexist.MVP1.repository.MountainPassRepository;
import com.dontexist.MVP1.entity.MountainPass;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DefaultMountainPassService implements MountainPassService{
    private final MountainPassRepository mountainPassRepository;
    private final MountainPassConverter mountainPassConverter;

    @Override
    public MountainPassDto saveMountainPass(MountainPassDto mountainPassDto) {
        MountainPass mountainPass = mountainPassConverter.fromPassDtoToPass(mountainPassDto);
        MountainPass savedMountainPass = mountainPassRepository.save(mountainPass);
        return mountainPassConverter.fromPassToPassDto(savedMountainPass);
    }
}
