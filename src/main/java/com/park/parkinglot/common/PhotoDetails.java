/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.park.parkinglot.common;

import java.io.Serializable;

/**
 *
 * @author GI
 */
public class PhotoDetails implements Serializable{
    private Integer id;
    private String filename;
    private String fileType;
    private byte[] fileContent;
    
    public PhotoDetails(Integer id,String filename,String fileType,byte[] fileContent){
        this.id=id;
        this.filename=filename;
        this.fileType=fileType;
        this.fileContent=fileContent;
    }

    public Integer getId() {
        return id;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileType() {
        return fileType;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }
    
}
