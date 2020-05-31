package HW8.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Parsing {
    private static ArrayList<Employee> saxEmployees = new ArrayList<>();
    private static ArrayList<Employee> domEmployees = new ArrayList<>();

    private static class XMLHandler extends DefaultHandler{
        String name, surname, position, division, experience, el = "";
        @Override
        public void startDocument() {
            System.out.println("Start SAXparse...");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            el = qName;
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            String info = new String(ch, start, length);
            info = info.replace("\n", "").trim();
            if(!info.isEmpty()) {
                if (el.equals("name")) {
                    name = info;
                }
                if (el.equals("surname")) {
                    surname = info;
                }
                if (el.equals("position")) {
                    position = info;
                }
                if (el.equals("division")) {
                    division = info;
                }
                if (el.equals("experience")) {
                    experience = info;
                }
            }

        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if(el.equals("experience") && !name.equals("")){
                saxEmployees.add(new Employee(name, surname, position, division, experience));
                name = "";
//                surname = "";
//                position = "";
//                division = "";
//                experience = "";
            }
        }

        @Override
        public void endDocument() {
            System.out.println("Stop SAXparse...");
        }
    }

    static void find (String surname) throws IOException, SAXException, ParserConfigurationException {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document doc = builder.parse(new File("hospital.xml"));

        NodeList elements =  doc.getDocumentElement().getElementsByTagName("staff");
        boolean isMatch = false;
        for (int i = 0; i < elements.getLength(); i++){
            Node tags = elements.item(i);
            Element el = (Element)tags;
            if (el.getElementsByTagName("surname").item(0).getTextContent().equals(surname)){
                System.out.printf("Name: %s\nSurname: %s\nPosition: %s\nDivision: %s\nExperiense: %s years\n",
                        el.getElementsByTagName("name").item(0).getTextContent(),
                        el.getElementsByTagName("surname").item(0).getTextContent(),
                        el.getElementsByTagName("position").item(0).getTextContent(),
                        el.getElementsByTagName("division").item(0).getTextContent(),
                        el.getElementsByTagName("experience").item(0).getTextContent());
                isMatch = true;
            }
        }
        if (!isMatch){
            System.out.println("There`s no " + surname);
        }
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxFactory.newSAXParser();
        XMLHandler handler = new XMLHandler();
        saxParser.parse(new File("hospital.xml"), handler);

        for (Employee item : saxEmployees){
            System.out.printf("Name: %s   Surname: %s  Position: %s  Division: %s  Experiense: %s years.\n",
                    item.getName(), item.getSurname(), item.getPosition(), item.getDivision(), item.getExperience());
        }

        System.out.println();
        System.out.println("DOM Parsing...");
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document document = builder.parse(new File("hospital.xml"));

        NodeList empElements = document.getDocumentElement().getElementsByTagName("staff");
        for (int i = 0; i < empElements.getLength(); i++){
            Node node = empElements.item(i);
            Element el = (Element) node;
            domEmployees.add(new Employee(el.getElementsByTagName("name").item(0).getTextContent(),
                    el.getElementsByTagName("surname").item(0).getTextContent(),
                    el.getElementsByTagName("position").item(0).getTextContent(),
                    el.getElementsByTagName("division").item(0).getTextContent(),
                    el.getElementsByTagName("experience").item(0).getTextContent()));
        }

        for (Employee item : domEmployees){
            System.out.printf("Name: %s   Surname: %s  Position: %s  Division: %s  Experiense: %s years.\n",
                    item.getName(), item.getSurname(), item.getPosition(), item.getDivision(), item.getExperience());
        }
        System.out.println();

        find("Evanson");
        find("Ivanov");
    }
}
