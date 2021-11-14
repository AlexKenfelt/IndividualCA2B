package dtos;

import entities.Member;

public class MemberDTO {
    private Integer id;
    private String name;
    private String email;
    private int memberNr;
    private boolean isMemberActive;

    public MemberDTO(Integer id, String name, String email, int memberNr, boolean isMemberActive) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.memberNr = memberNr;
        this.isMemberActive = isMemberActive;
    }

    public MemberDTO(Member member) {
        this.id = member.getId();
        this.name = member.getName();
        this.email = member.getEmail();
        this.memberNr = member.getMemberNr();
        this.isMemberActive = member.getMember().isMemberActive();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMemberNr() {
        return memberNr;
    }

    public void setMemberNr(int memberNr) {
        this.memberNr = memberNr;
    }

    public boolean isMemberActive() {
        return isMemberActive;
    }

    public void setMemberActive(boolean memberActive) {
        isMemberActive = memberActive;
    }
}
