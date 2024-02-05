package com.example.atompointsweb.business.requests;

import lombok.*;

@Data
@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ContactUsRequestDto {
    private Long id;
    private String name;
    private String email;
    private String text;

}
