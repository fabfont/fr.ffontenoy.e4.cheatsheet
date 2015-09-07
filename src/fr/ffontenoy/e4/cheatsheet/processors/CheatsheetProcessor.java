package fr.ffontenoy.e4.cheatsheet.processors;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;

import javax.inject.Named;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.translation.TranslationService;

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

  /**
   * Cheatsheet file extension 
   */
  private static final String CHEATSHEET_FILE_EXTENSION = ".xml";
  
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

      URL lInternationalizedCheatsheetURL = getInternationalizedCheatsheetFile(lCheatsheetFile, lBundleId);
      
      CheatsheetsPart.setCheatsheet(XMLParserForCheatSheet.getCheatSheets(lInternationalizedCheatsheetURL
          .toString()));

      break;
    default:
      System.err.println("Only one extension of '" + CHEATSHEET_EXTENSION_POINT_ID + "' can be defined");
      break;
    }
  }

  /**
   * Get the internationalized cheatsheet
   * 
   * @param lCheatsheetFile the cheatsheet default file
   * @param pBundleId the bundle id where to look for the file
   * @return the internationalized cheatsheet if exist or the default one otherwise
   */
  private URL getInternationalizedCheatsheetFile(String lCheatsheetFile,
		String pBundleId) {

	  URL lResult = null;
	  
	  // Get the local
	  String lLocal = System.getProperty("osgi.nl");	  
	  
	  if (lLocal != null) {
		  
		  // Extract the language from the locale
		  String lLanguage = lLocal.split("_")[0];
		  
		  int lIndex = lCheatsheetFile.lastIndexOf(CHEATSHEET_FILE_EXTENSION);
		  if ( lIndex != -1) {
			  String lFileInLocale = lCheatsheetFile.substring(0, lIndex) + "_" + lLanguage + CHEATSHEET_FILE_EXTENSION;
			  lResult = CheatsheetActivator.getURL(lFileInLocale, pBundleId);
		  }
	
		  if (lResult != null) {
			  try {
				File lFile = new File(lResult.toURI());
				if (!lFile.exists()) {
					lResult = null;
				}
			} catch (URISyntaxException e) {
				lResult = null;
			}
		  }
	  }
	  if (lResult == null) {
		  lResult = CheatsheetActivator.getURL(lCheatsheetFile, pBundleId);
	  }
	  return lResult;
  }
}
