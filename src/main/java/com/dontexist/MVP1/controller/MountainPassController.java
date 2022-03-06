package com.dontexist.MVP1.controller;

import com.dontexist.MVP1.dto.MountainPassDto;
import com.dontexist.MVP1.services.MountainPassService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class MountainPassController {
    private final MountainPassService mountainPassService;

    @PostMapping("/submitData")
    public MountainPassDto saveMountainPass(@RequestBody MountainPassDto mountainPassDto) {

        return mountainPassService.saveMountainPass(mountainPassDto);
    }
}
