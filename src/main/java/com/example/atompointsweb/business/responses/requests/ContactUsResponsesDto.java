package com.example.atompointsweb.business.responses.requests;

import lombok.*;

@Data
@Builder
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class ContactUsResponsesDto {
    private Long id;
    private String name;
    private String email;
    private String text;

}
