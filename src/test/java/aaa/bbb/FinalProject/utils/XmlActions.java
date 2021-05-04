package aaa.bbb.FinalProject.utils;

import java.io.File;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class XmlActions {
	
	public static Document getXmlFile(String filePath) {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			XPath xPath = XPathFactory.newInstance().newXPath();
			
			
			File file = new File(filePath);
			//Document document = documentBuilder.parse(file);
			//return document;
			return null;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	/*public static String getXmlValue(Document document, String xpath) {
		try {
			XPath xpath =XPathFactory.newInstance().newXPath();
			return xpath.compile(xpath).evaluate(document);
		}
		catch(XPathExpressionException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}*/

}
