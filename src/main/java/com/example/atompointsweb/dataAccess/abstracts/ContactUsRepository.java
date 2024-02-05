package com.example.atompointsweb.dataAccess.abstracts;

import com.example.atompointsweb.domain.entities.ContactUsEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactUsRepository extends JpaRepository<ContactUsEntities,Long> {
}
