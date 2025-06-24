/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Text;
import service.TextService;

/**
 *
 * @author Dell
 */
public class TextController {

    private Text text = new Text();
    private TextService service = new TextService();

    //set text content
    public void setText(String content) {
        text.setContent(content);
    }

    //get text content
    public String getText() {
        return text.getContent();
    }

    public void normalizeText() {
        service.setContent(text.getContent());
        service.deleteSpace();
        service.deleteSpaceBeforePeriod();
        service.deleteSpaceQuote();
        service.upperCaseAfterPeriod();
        service.upperCaseFirst();
        service.addPeriod();
        text.setContent(service.getContent());
    }
}
