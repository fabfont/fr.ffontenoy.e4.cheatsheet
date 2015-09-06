/**
 *
 * $Id$
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.validation;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CheatSheetValidator {
  boolean validate();

  boolean validateTitle(String value);
  boolean validateDescription(String value);
  boolean validateItems(EList<Item> value);
}
