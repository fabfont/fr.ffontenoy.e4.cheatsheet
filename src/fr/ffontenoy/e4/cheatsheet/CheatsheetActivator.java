package fr.ffontenoy.e4.cheatsheet;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Activator for cheat sheet plugin
 * 
 * @author Fabrice Fontenoy
 *
 */
public class CheatsheetActivator implements BundleActivator {

	  /**
	   * The bundle context.
	   */
	  private static BundleContext gContext;

	  /**
	   * Gets the context.
	   *
	   * @return the context
	   */
	  public static BundleContext getContext() {
	    return gContext;
	  }

	  /**
	   * Get the URL location of a given file located in a given bundle.
	   *
	   * @param pPath path of the file to search for
	   * @param pBundleId the bundle id of the bundle to look into
	   * @return the first corresponding URL in this bundle. Return null if no URL has been found.
	   */
	  public static URL getURL(final String pPath, final String pBundleId) {
	    Bundle lBundle = null;
	    URL lReturnValue = null;
	    for (final Bundle lCurrentBundle : CheatsheetActivator.gContext.getBundles()) {
	      if (pBundleId.equals(lCurrentBundle.getSymbolicName())) {
	        lBundle = lCurrentBundle;
	        break;
	      }
	    }
	    if (lBundle != null) {
	      final URL[] lUrls = FileLocator.findEntries(lBundle, new Path(pPath));
	      if (lUrls != null && lUrls.length > 0) {
	        try {
	          lReturnValue = FileLocator.resolve(lUrls[0]);
	        } catch (final IOException lE) {
	          lReturnValue = null;
	        }
	      }
	    }

	    return lReturnValue;
	  }

	  /**
	   * Called when this bundle is started
	   *
	   * @param pBundleContext The execution context of the bundle being started
	   * @throws Exception if this plug-in did not start properly
	   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	   */
	  @Override
	  public void start(final BundleContext pBundleContext) throws Exception {
	    CheatsheetActivator.gContext = pBundleContext;
	  }

	  /**
	   * Called when this bundle is stopped
	   *
	   * @param pBundleContext The execution context of the bundle being stopped
	   * @throws Exception if this plug-in did not stop properly
	   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	   */
	  @Override
	  public void stop(final BundleContext pBundleContext) throws Exception {
	    CheatsheetActivator.gContext = null;
	  }

	}