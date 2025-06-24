/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Dell
 */
public class TextService {

    private String content;

    public TextService() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //xoa khoang trang thua
    public void deleteSpace() {
        content = content.replaceAll("\\s+", " ");

    }

    //xoa khoang trang truoc , . ; : !
    public void deleteSpaceBeforePeriod() {
        content = content.replaceAll("\\s+([.,;:!])", "$1");
    }

    //giu lai 1 dau cach sau , . ; : !
    public void addSpaceAfterPeriod() {
        content = content.replaceAll("([,.;:!])(?=[^\\s”])", "$1 ");
    }

    //xoa dau cach truoc va sau ""
    public void deleteSpaceQuote() {
        content = content.replaceAll("\\s*“\\s*", " “");
        content = content.replaceAll("\\s*”\\s*", "” ");

    }

    //upper case chu dau tien
    public void upperCaseFirst() {
        if (!content.isEmpty()) {
            content = content.substring(0, 1).toUpperCase() + content.substring(1);
        }
    }

    //them dau cham cau neu khong co
    public void addPeriod() {
        if (!content.endsWith(".")) {
            content += ".";
        }
    }

    //upper case sau dau .
    public void upperCaseAfterPeriod() {
        String sentences[] = content.split("(?<=[.])\\s+");
        StringBuilder result = new StringBuilder();
        for (String sentence : sentences) {
            if (sentence.length() > 1) {
                result.append(sentence.substring(0, 1).toUpperCase());
                result.append(sentence.substring(1).toLowerCase());
            } else {
                result.append(sentence.toUpperCase());
            }
            result.append(" ");
        }
        content = result.toString().trim();
    }
}
