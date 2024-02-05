package com.example.atompointsweb.webApi.controllers;

import com.example.atompointsweb.business.concrets.ContactUsService;
import com.example.atompointsweb.business.requests.ContactUsRequestDto;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/contactUs")

public class ContactUsController {
    public final ContactUsService contactUsService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add (@RequestBody @Valid ContactUsRequestDto requestDto){
        contactUsService.add(requestDto);
    }
}
