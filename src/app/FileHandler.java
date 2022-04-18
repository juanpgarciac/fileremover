/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

/**
 *
 * @author Juan Pablo
 */
import java.io.*;
import java.io.IOException; 
import javax.swing.JOptionPane;

public class FileHandler{

    private static boolean remove(File f){
	try {	    
	    if(!f.isDirectory()){
		InputStream in; 
		try {		    
		    in = new FileInputStream(f);
		    in.close(); 
		    } catch (IOException ex) {
			try{		

			    //File file = new File(f.getName());
			    //file.createNewFile();
			    RandomAccessFile raf = new RandomAccessFile(f, "rw");
			    raf.seek(0);
			    raf.write(1);
			    raf.close();
			}catch(IOException ex2){
			    System.err.println(ex2);
			    
			}
		    }
	    }
            return f.delete();
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null,e,"Error",0);
	    return false;
	}
    }
    
    
    static public boolean delete(File f){ 
        if (f.isDirectory()){           
            String[] children = f.list();
            for (int i=0; i<children.length; i++)
                delete(new File(f,children[i]));
	    return remove(f);
        }else
            return remove(f);
    }
    
    static public void copyDirectory(File srcDir, File dstDir,int pb) throws IOException { 
        if (srcDir.isDirectory()) {  
            if (!dstDir.exists()) { 
                dstDir.mkdir(); 
            } 
            String[] children = srcDir.list(); 
            for (int i=0; i<children.length; i++) { 
                copyDirectory(new File(srcDir, children[i]),new File(dstDir, children[i]),pb+10); 
            }
            
        } else { 
            copy(srcDir, dstDir); 
        } 
    } 
     
    static public void copy(File src, File dst) throws IOException { 

	File file = new File(dst.getName()); //linea que acomoda el programa !!! by Juan Pablo
	file.createNewFile();	
	
        InputStream in = new FileInputStream(file); 

        OutputStream out = new FileOutputStream(file); 
        byte[] buf = new byte[1024]; 
        int len; 
        while ((len = in.read(buf)) > 0) { 
            out.write(buf, 0, len); 
        } 
        in.close(); 
        out.close(); 
    }
    
    
    static public boolean rename(File src,File dst){
        return src.renameTo(dst);
    }


}  
