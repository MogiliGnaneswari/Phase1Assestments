package com.Lesson3.FileHandling;

import java.io.IOException; 
import java.nio.file.*; 
 
public class DeleteFileDemo 
{ 
 public static void main(String[] args) 
 { 
 try
 { 
 Files.deleteIfExists(Paths.get("c://temp//testFile2.txt")); 
 } 
 catch(NoSuchFileException e) 
 { 
 System.out.println("No such file/directory exists"); 
 } 
 catch(DirectoryNotEmptyException e) 
 { 
 System.out.println("Directory is not empty."); 
 } 
 catch(IOException e) 
 { 
 System.out.println("Invalid permissions."); 
 } 
 
 System.out.println("Deletion successful."); 
 } 
}

