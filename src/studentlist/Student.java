/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentlist;

/**
 *
 * @author Megha Patel
 */
public class Student {

    private String studName;
    private String studId;
    private String program;

    public Student() {
    }
    

    public Student(String studName, String studId, String program) {
        this.studName = studName;
        this.studId = studId;
        this.program = program;
    }

  

    
    /**
     * @return the studName
     */
    public String getStudName() {
        return studName;
    }

    /**
     * @param studName the studName to set
     */
    public void setStudName(String studName) {
        this.studName = studName;
    }

    /**
     * @return the studId
     */
    public String getStudId() {
        return studId;
    }

    /**
     * @param studId the studId to set
     */
    public void setStudId(String studId) {
        this.studId = studId;
    }

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    
}
