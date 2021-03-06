/**
 *
 * $Id$
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.validation;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CommandValidator {
  boolean validate();

  boolean validateId(String value);
  boolean validateParameters(EList<Parameter> value);
}
