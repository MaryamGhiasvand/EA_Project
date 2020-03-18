package edu.miu.cs.cs544.domain;


import javax.persistence.*;

@Entity
public class Student extends Person{

    private int studentId;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_home_id")
    private Address homeAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_mail_id")
    private Address mailingAddress;

    @ManyToOne
    private Entry entry;

    @ManyToOne
    private EnrollmentRecord enrollmentRecords;

    public Student() {

    }
    public Student(String firstName, String lastName, String userName, String password, String role, int studentId, String email){
        super(firstName, lastName, userName, password, "STUDENT_ROLE");
        this.studentId = studentId;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    public EnrollmentRecord getEnrollmentRecords() {
        return enrollmentRecords;
    }

    public void setEnrollmentRecords(EnrollmentRecord enrollmentRecords) {
        this.enrollmentRecords = enrollmentRecords;
    }
}
