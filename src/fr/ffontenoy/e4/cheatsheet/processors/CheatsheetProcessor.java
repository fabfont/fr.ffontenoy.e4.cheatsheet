package fr.ffontenoy.e4.cheatsheet.processors;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.di.annotations.Execute;

import fr.ffontenoy.e4.cheatsheet.CheatsheetActivator;
import fr.ffontenoy.e4.cheatsheet.extensionpoint.CheatsheetExtensionAttribute;
import fr.ffontenoy.e4.cheatsheet.parts.CheatsheetsPart;
import fr.ffontenoy.e4.cheatsheet.utils.XMLParserForCheatSheet;

/**
 * Cheat sheet Processor
 * 
 * @author Fabrice Fontenoy
 *
 */
public class CheatsheetProcessor {

  /***
   * Cheatsheet extension point id
   */
  public static final String CHEATSHEET_EXTENSION_POINT_ID = "fr.ffontenoy.e4.cheatsheet.cheatsheetExtensionPoint";

  @Execute
  public void process(IExtensionRegistry pExtensionRegistry) {
    IConfigurationElement[] lConfigurationElements =
        pExtensionRegistry.getConfigurationElementsFor(CHEATSHEET_EXTENSION_POINT_ID);

    switch (lConfigurationElements.length) {
    case 0:
      System.out.println("No extension of '" + CHEATSHEET_EXTENSION_POINT_ID + "' has been found");
      break;
    case 1:
      IConfigurationElement lConfigurationElement = lConfigurationElements[0];
      String lCheatsheetFile = lConfigurationElement.getAttribute(CheatsheetExtensionAttribute.CHEATSHEET_FILE.getName());

      String lShortcut = lConfigurationElement.getAttribute(CheatsheetExtensionAttribute.SHORTCUT.getName());

      String lBundleId = lConfigurationElement.getContributor().getName();

      CheatsheetsPart.setCheatsheet(XMLParserForCheatSheet.getCheatSheets(CheatsheetActivator.getURL(lCheatsheetFile, lBundleId)
          .toString()));

      break;
    default:
      System.err.println("Only one extension of '" + CHEATSHEET_EXTENSION_POINT_ID + "' can be defined");
      break;
    }
  }
}
