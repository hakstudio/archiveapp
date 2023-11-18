package com.hakstudio.archiveapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Calendar;

@Entity
@Table(name = "document")
@Data
public class Document {
    @Id
    private long id;
    private String documentName;
    private int accessAuth;
    private Calendar uploadedDate;
    private String uploadedBy;
    private int uploadedByTc;
    private String edittedBy;
    private int edittedByTc;
    @Lob
    private String documentText;
    @Lob
    private byte[] document;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public int getAccessAuth() {
        return accessAuth;
    }

    public void setAccessAuth(int accessAuth) {
        this.accessAuth = accessAuth;
    }

    public Calendar getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(Calendar uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public int getUploadedByTc() {
        return uploadedByTc;
    }

    public void setUploadedByTc(int uploadedByTc) {
        this.uploadedByTc = uploadedByTc;
    }

    public String getEdittedBy() {
        return edittedBy;
    }

    public void setEdittedBy(String edittedBy) {
        this.edittedBy = edittedBy;
    }

    public int getEdittedByTc() {
        return edittedByTc;
    }

    public void setEdittedByTc(int edittedByTc) {
        this.edittedByTc = edittedByTc;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }
}
