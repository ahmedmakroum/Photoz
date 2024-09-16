package com.ahmed.tets.photoz;


public class Photo {

    public String id;
    private byte[] data;
    public String FileName;

    public Photo() {
        this.id = id;
        String fileName = id + ".jpg";
        this.FileName = fileName;
    }



    //raw data


    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Photo(byte[] data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }
    public String getOriginalFilename() {
            return FileName;
        }

    public byte[] getBytes() {
        return data;
    }
}
