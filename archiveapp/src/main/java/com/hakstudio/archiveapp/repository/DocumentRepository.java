package com.hakstudio.archiveapp.repository;

import com.hakstudio.archiveapp.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
