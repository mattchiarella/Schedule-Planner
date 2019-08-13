/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Matthew_PC
 */
/*Do not mess with this class, I was drunk when I made this and I don't remember what I did
It works flawlessly though (Props to drunk me xD)
Also this class aggrigates the Docx to the end of the filename in the file chooser
It also makes sure that you don't overwrite other files, and it prevents you from 
doing illegal things in the file explorer thus corrupting files*/
public class FileTypeFilter extends FileFilter{
    public final String extension;
    public final String description;
    
    public FileTypeFilter(String extension, String description){
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
            return true;
        }
        return file.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
        return description + String.format(" (*%s)", extension);
    }
    
}
