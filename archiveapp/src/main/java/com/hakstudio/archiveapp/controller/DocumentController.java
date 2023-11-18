package com.hakstudio.archiveapp.controller;

import com.hakstudio.archiveapp.entity.Document;
import com.hakstudio.archiveapp.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("documents")
public class DocumentController {
    @Autowired
    DocumentRepository documentRepository;

    @GetMapping
    public List<Document> getDocuments(){
        return documentRepository.findAll();
    }

    @PostMapping
    public Document addDocumet(@RequestBody Document document){
        return documentRepository.save(document);
    }

    @GetMapping("/{documentId}")
    public Document getDocument(@PathVariable Long documentId){
        return documentRepository.findById(documentId).orElse(null);
    }

    @PutMapping("/{documentId}")
    public Document updateDocument(@PathVariable Long documentId,@RequestBody Document document){
        Optional<Document> documentOptional=documentRepository.findById(documentId);
        if (documentOptional.isPresent()){
            Document presenDocument=documentOptional.get();
            presenDocument.setDocumentName(document.getDocumentName());
            presenDocument.setAccessAuth(document.getAccessAuth());
            return documentRepository.save(presenDocument);
        }
        return null;
    }

    @DeleteMapping("/{documentId}")
    public void deleteUser(@PathVariable Long documentId){
        documentRepository.deleteById(documentId);
    }
}
