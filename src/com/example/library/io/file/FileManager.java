package com.example.library.io.file;

import com.example.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}