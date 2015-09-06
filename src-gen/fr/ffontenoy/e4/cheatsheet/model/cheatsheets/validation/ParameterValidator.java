/**
 *
 * $Id$
 */
package fr.ffontenoy.e4.cheatsheet.model.cheatsheets.validation;


/**
 * A sample validator interface for {@link fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParameterValidator {
  boolean validate();

  boolean validateKey(String value);
  boolean validateValue(Object value);
}
