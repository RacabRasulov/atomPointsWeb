package com.example.atompointsweb.business.concrets;


import com.example.atompointsweb.business.requests.ContactUsRequestDto;
import com.example.atompointsweb.dataAccess.abstracts.ContactUsRepository;
import com.example.atompointsweb.domain.entities.ContactUsEntities;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ContactUsService {

    private final ContactUsRepository contactUsRepository;

    public void add (ContactUsRequestDto requestDto) {

              ContactUsEntities entities= ContactUsEntities.builder()
                      .name(requestDto.getName())
                      .email(requestDto.getEmail())
                      .text(requestDto.getText())
                      .build();


              contactUsRepository.save(entities);
    }


}
