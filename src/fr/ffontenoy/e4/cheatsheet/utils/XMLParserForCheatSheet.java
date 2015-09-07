package fr.ffontenoy.e4.cheatsheet.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.common.util.EList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatsheetsFactory;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter;

/**
 * This class is used for parsing the cheat sheet xml file.
 */
public final class XMLParserForCheatSheet {

  /**
   * Root element name (for "cheatsheets").
   */
  private static final String CHEATSHEETS_ELEMENT_NAME = "cheatsheets";

  /**
   * Cheatsheet element name (for "cheatsheet").
   */
  private static final String CHEATSHEET_ELEMENT_NAME = "cheatsheet";

  /**
   * Item element name (for "item").
   */
  private static final String ITEM_ELEMENT_NAME = "item";

  /**
   * Description element name (for "description").
   */
  private static final String DESCRIPTION_ELEMENT_NAME = "description";
  
  /**
   * Command element name (for "command").
   */
  private static final String COMMAND_ELEMENT_NAME = "command";

  /**
   * Parameter item element name (for "parameter").
   */
  private static final String PARAMETER_ELEMENT_NAME = "parameter";

  /**
   * Title attribute name (for "title").
   */
  private static final String TITLE_ATTRIBUTE_NAME = "title";

  /**
   * Description attribute name (for "description").
   */
  private static final String DESCRIPTION_ATTRIBUTE_NAME = "description";

  /**
   * Id attribute name (for "id").
   */
  private static final String ID_ATTRIBUTE_NAME = "id";

  /**
   * Key attribute name (for "key").
   */
  private static final String KEY_ATTRIBUTE_NAME = "key";

  /**
   * Value attribute name (for "value").
   */
  private static final String VALUE_ATTRIBUTE_NAME = "value";

  /**
   * Utility class ==> private constructor
   */
  private XMLParserForCheatSheet() {
    // Nothing to do
  }

  /**
   * From the path to the cheatsheets xml file, this methods extracts attributes and build the Cheatsheets object.
   *
   * @param pXmlFile The xml file corresponding to the cheatsheets file
   * @return the Cheatsheets element filled with attributes of the xml file
   */
  public static CheatSheets getCheatSheets(final String pXmlFile) {

    final CheatSheets lCheatsheets = CheatsheetsFactory.eINSTANCE.createCheatSheets();

    final DocumentBuilderFactory lFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder lBuilder;
    try {
      lBuilder = lFactory.newDocumentBuilder();

      // Load the input XML document, parse it and return an instance of
      // the
      // Document class.
      final Document lDocument = lBuilder.parse(new File(new URL(pXmlFile).getFile()));

      // Get the root element
      final Element lCheatsheetsElement = lDocument.getDocumentElement();

      if (lCheatsheetsElement.getNodeName().equals(CHEATSHEETS_ELEMENT_NAME)) {

        final Element lElement = lCheatsheetsElement;

        final NodeList lChildren = lElement.getChildNodes();
        final List<CheatSheet> lTocItems = lCheatsheets.getCheatSheets();

        fillCheatsheets(lChildren, lTocItems);

      }

    } catch (IOException | ParserConfigurationException | SAXException lException) {
      System.err.println("Error occurred while building the cheatsheets: " + lException.getMessage());
    }
    return lCheatsheets;
  }

  /**
   * Create Cheatsheet objects corresponding to the given DOM element.
   *
   * @param pNodeList The DOM elements
   * @param pCheatsheets The list of cheatsheets to fill
   */
  private static void fillCheatsheets(final NodeList pNodeList, final List<CheatSheet> pCheatsheets) {
    for (int lIndex = 0; lIndex < pNodeList.getLength(); lIndex++) {

      final Node lNode = pNodeList.item(lIndex);

      if (lNode.getNodeType() == Node.ELEMENT_NODE && lNode.getNodeName().equals(CHEATSHEET_ELEMENT_NAME)) {

        final Element lElement = (Element) lNode;

        final CheatSheet lCheatsheet = CheatsheetsFactory.eINSTANCE.createCheatSheet();

        fillCheatsheet(lElement, lCheatsheet);

        pCheatsheets.add(lCheatsheet);
      }

    }
  }

  /**
   * Fill the given Cheatsheet element from the dom element
   * 
   * @param pElement the source dom element
   * @param pCheatsheet the cheatsheet object to fill
   */
  private static void fillCheatsheet(Element pElement, CheatSheet pCheatsheet) {
    final String lTitle = pElement.getAttributes().getNamedItem(TITLE_ATTRIBUTE_NAME).getNodeValue();
    pCheatsheet.setTitle(lTitle);

    final String lDescription = pElement.getAttributes().getNamedItem(DESCRIPTION_ATTRIBUTE_NAME).getNodeValue();
    pCheatsheet.setDescription(lDescription);

    NodeList lNodeList = pElement.getChildNodes();

    for (int lIndex = 0; lIndex < lNodeList.getLength(); lIndex++) {

      final Node lNode = lNodeList.item(lIndex);

      if (lNode.getNodeType() == Node.ELEMENT_NODE && lNode.getNodeName().equals(ITEM_ELEMENT_NAME)) {

        fillCheatsheetItem(lNode, pCheatsheet.getItems());
      }
    }
  }

  /**
   * From an dom item element, create an fill the EMF Item element and add it to the given list
   * 
   * @param pNode the dom item element
   * @param pItems the list of Item element to fill
   */
  private static void fillCheatsheetItem(Node pNode, EList<Item> pItems) {
    Item lItem = CheatsheetsFactory.eINSTANCE.createItem();

    Element lElement = (Element) pNode;
    final String lTitle = lElement.getAttributes().getNamedItem(TITLE_ATTRIBUTE_NAME).getNodeValue();
    lItem.setTitle(lTitle);

    NodeList lNodeList = lElement.getChildNodes();

    boolean lCommandAlreadyFound = false;
    for (int lIndex = 0; lIndex < lNodeList.getLength(); lIndex++) {

      final Node lChildNode = lNodeList.item(lIndex);

      if (lChildNode.getNodeType() == Node.ELEMENT_NODE) {
	      switch (lChildNode.getNodeName()) {
		      case DESCRIPTION_ELEMENT_NAME:
		    	  String lHtmlDescription = lChildNode.getTextContent();
		    	  lItem.setDescription(lHtmlDescription);
		    	  break;
		      case COMMAND_ELEMENT_NAME:
		      
					if (!lCommandAlreadyFound) {
					
					  Command lCommand = CheatsheetsFactory.eINSTANCE.createCommand();
					
					  Element lCommandElement = (Element) lChildNode;
					  final String lId = lCommandElement.getAttributes().getNamedItem(ID_ATTRIBUTE_NAME).getNodeValue();
					  lCommand.setId(lId);
					  lItem.setCommand(lCommand);
					
					  NodeList lParameterNodeList = lCommandElement.getChildNodes();
					
					  for (int lParameterIndex = 0; lParameterIndex < lParameterNodeList.getLength(); lParameterIndex++) {
					
					    final Node lParameterNode = lParameterNodeList.item(lParameterIndex);
					
					    if (lParameterNode.getNodeType() == Node.ELEMENT_NODE && lParameterNode.getNodeName().equals(PARAMETER_ELEMENT_NAME)) {
					
					      Parameter lParameter = CheatsheetsFactory.eINSTANCE.createParameter();
					
					      final String lKey = lParameterNode.getAttributes().getNamedItem(KEY_ATTRIBUTE_NAME).getNodeValue();
					      lParameter.setKey(lKey);
					
					      final String lValue = lParameterNode.getAttributes().getNamedItem(VALUE_ATTRIBUTE_NAME).getNodeValue();
					      lParameter.setValue(lValue);
					
					      lCommand.getParameters().add(lParameter);
					
					    }
					  }
					} else {
					  System.err.println("Command element already found");
					}
					break;
		        default:
		        	System.out.println("Element not handled: " + lChildNode.getNodeName());
		        	break;
		      }
      }
    }

    pItems.add(lItem);
  }

}
