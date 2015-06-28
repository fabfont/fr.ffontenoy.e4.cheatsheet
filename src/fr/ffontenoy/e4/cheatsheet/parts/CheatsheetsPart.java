package fr.ffontenoy.e4.cheatsheet.parts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;

import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheet;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.CheatSheets;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Command;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Item;
import fr.ffontenoy.e4.cheatsheet.model.cheatsheets.Parameter;

/**
 * Help part. This part displays the User manual as an HTML file.
 */
public class CheatsheetsPart {

	/**
	 * Toc title class name.
	 */
	private static final String CHEATSHEET_TOC_TITLE_CLASSNAME = "CheatsheetTocTitle";

	/**
	 * Title class name.
	 */
	private static final String CHEATSHEET_TITLE_CLASSNAME = "CheatsheetTitle";
	
	/**
	 * Description class name.
	 */
	private static final String CHEATSHEET_DESCR_CLASSNAME = "CheatsheetDescription";
	
	/** Table of contents object */
	private static CheatSheets gCheatsheets;

	/** Table Of Contents background color */
	private static final Color CHEATSHEET_BACKGROUND_COLOR = new Color(null,
			255, 255, 255);

	/**
	 * Styling engine.
	 */
	@Inject
	private IStylingEngine mStylingEngine;

	/** Map of cheatsheets */
	private Map<String, CheatSheet> mCheatsheetByTitle = new HashMap<String, CheatSheet>();

	private Composite mCheatsheetComposite;

	private ScrolledComposite mScrolledComposite;

	@Inject
	private EHandlerService mHandlerService;
	
	@Inject
	private ECommandService mCommandService;
	
	/**
	 * Build the part.
	 *
	 * @param pParent
	 *            the parent composite
	 * @param pActivePart
	 *            the active part. The active part. This is used for opening the
	 *            help on the section corresponding to the active part
	 * @param pPartService
	 *            the part service used for registering the online help as a
	 *            part listener for changing page when clicking on a part
	 *
	 */
	@PostConstruct
	public void init(
			final Composite pParent,
			@Optional @Named(IServiceConstants.ACTIVE_PART) final MPart pActivePart,
			final EPartService pPartService) {
		pParent.setData("name", getClass().getSimpleName());

		final SashForm lSashForm = new SashForm(pParent, SWT.HORIZONTAL);

		// Build the table of contents part
		buildTableOfContents(lSashForm);

		// Build the online help part
		buildCheatsheetPage(lSashForm, null);

		// Set the sash proportion
		lSashForm.setWeights(new int[] { 3, 5 });
	}

	/**
	 * Build the online help part of the sash form.
	 *
	 * @param pSashForm
	 *            the sash form into which the help will be included to.
	 */
	private void buildCheatsheetPage(final SashForm pSashForm,
			final String pCheatsheetTitle) {

		mScrolledComposite = new ScrolledComposite(
				pSashForm, SWT.H_SCROLL | SWT.V_SCROLL);
		mScrolledComposite.setLayout(new GridLayout());
		mScrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		mScrolledComposite.setExpandHorizontal(true);
		mScrolledComposite.setExpandVertical(true);
		mScrolledComposite.setBackground(CHEATSHEET_BACKGROUND_COLOR);
		mScrolledComposite.setBackgroundMode(SWT.INHERIT_FORCE);
		

		
		selectCheatsheet(pCheatsheetTitle);

	}

	/**
	 * Change the cheatsheet page on cheatsheet selection
	 * 
	 * @param pCheatsheetTitle
	 *            the cheatsheet title
	 */
	private void selectCheatsheet(final String pCheatsheetTitle) {
		CheatSheet lSelectedCheatSheet = mCheatsheetByTitle
				.get(pCheatsheetTitle);

		mCheatsheetComposite = new Composite(mScrolledComposite, SWT.FILL);
		mCheatsheetComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
				true, true));
		mCheatsheetComposite.setLayout(new GridLayout());
		mCheatsheetComposite.setBackground(CHEATSHEET_BACKGROUND_COLOR);
		
		if (lSelectedCheatSheet == null) {

			final Label lLabel = new Label(mCheatsheetComposite, SWT.CENTER);
			lLabel.setText("No cheatsheet selected");
			lLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
			mStylingEngine.setClassname(lLabel, CHEATSHEET_TITLE_CLASSNAME);
		} else {
			Label lTitleLabel = new Label(mCheatsheetComposite, SWT.CENTER);
			lTitleLabel.setText(lSelectedCheatSheet.getTitle());
			lTitleLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
					false));
			mStylingEngine.setClassname(lTitleLabel, CHEATSHEET_TITLE_CLASSNAME);
			
			Label lDescriptionLabel = new Label(mCheatsheetComposite,
					SWT.CENTER);
			lDescriptionLabel.setText(lSelectedCheatSheet.getDescription());
			lDescriptionLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, false));
			mStylingEngine.setClassname(lDescriptionLabel, CHEATSHEET_DESCR_CLASSNAME);

			ExpandBar lExpandBar = new ExpandBar(mCheatsheetComposite,
					SWT.V_SCROLL | SWT.FILL);
			lExpandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
					true, true));
			lExpandBar.setLayout(new GridLayout(1, true));
			lExpandBar.setBackground(CHEATSHEET_BACKGROUND_COLOR);
			lExpandBar.setBackgroundMode(SWT.INHERIT_FORCE);
			
			int lIndex = 0;
			List<Item> lItems = lSelectedCheatSheet.getItems();
			Map<Integer, ExpandItem> lExpandItems = new HashMap<Integer,ExpandItem>();
			for (Item lItem : lItems) {

				final int lCurrentIndex = lIndex;
				
				Composite lComposite = new Composite(lExpandBar, SWT.NONE);
				lComposite.setBackground(CHEATSHEET_BACKGROUND_COLOR);
				GridData lGridData = new GridData(SWT.FILL,  SWT.FILL, true, false);
				if (lIndex == 0) {
					lGridData.verticalIndent = 20;
				}
				lComposite.setLayoutData(lGridData);
				GridLayout lLayout = new GridLayout();
				lLayout.verticalSpacing = 20;
				lComposite.setLayout(lLayout);

				ExpandItem lExpandItem = new ExpandItem(lExpandBar, SWT.NONE, 0);
				lExpandItem.setText(lItem.getTitle());

				Label lItemDescription = new Label(lComposite, SWT.NONE);
				lItemDescription.setText(lItem.getDescription());
				lItemDescription.setBackground(CHEATSHEET_BACKGROUND_COLOR);
				
				Composite lButtonComposite = new Composite(lComposite, SWT.NONE);
				lButtonComposite.setLayout(new GridLayout(2, true));
				
				Button lNextButton = new Button(lButtonComposite, SWT.PUSH);
				
				String lText = "Go to the next step";
				if (lIndex == lItems.size() - 1) {
					lText = "Terminate";
				}
				lNextButton.setText(lText);
				lNextButton.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseUp(org.eclipse.swt.events.MouseEvent pEvent) {
						// Nothing to do
					}
					
					@Override
					public void mouseDown(org.eclipse.swt.events.MouseEvent pEvent) {
						lExpandItem.setExpanded(false);
						if (lCurrentIndex < lItems.size() - 1) {
							lExpandItems.get(lCurrentIndex+1).setExpanded(true);
						}
					}
					
					@Override
					public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent pEvent) {
						// Nothing to do
					}
				});
				
				Button lExecuteButton = new Button(lButtonComposite, SWT.PUSH);
				lExecuteButton.setText("Execute the action");

				lExecuteButton.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseUp(org.eclipse.swt.events.MouseEvent pEvent) {
						// Nothing to do
					}
					
					@Override
					public void mouseDown(org.eclipse.swt.events.MouseEvent pEvent) {
						Command lCommand = lItem.getCommand();

						Map<String, Object> lParameters = new HashMap<String, Object>();
						for(Parameter lParameter : lCommand.getParameters()) {
							lParameters.put(lParameter.getKey(), lParameter.getValue());
						}
						ParameterizedCommand lParameterizedCommand = mCommandService.createCommand(lCommand.getId(), lParameters);
						mHandlerService.executeHandler(lParameterizedCommand);
						
						lExpandItem.setExpanded(false);
						if (lCurrentIndex < lItems.size() - 1) {
							lExpandItems.get(lCurrentIndex+1).setExpanded(true);
						}
					}
					
					@Override
					public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent pEvent) {
						// Nothing to do
					}
				});
				
				lExpandItem.setExpanded(lIndex == 0);

				lExpandItem.setHeight(lComposite.computeSize(SWT.DEFAULT,
						SWT.DEFAULT).y);
				lExpandItem.setControl(lComposite);
				lExpandItem.getControl().setBackground(CHEATSHEET_BACKGROUND_COLOR);
				lExpandItems.put(lIndex, lExpandItem);
				
				lIndex++;
			}
		}
		mScrolledComposite.setContent(mCheatsheetComposite);
		mScrolledComposite.setMinSize(mCheatsheetComposite.computeSize(
				SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * Build the table of contents of the online help.
	 *
	 * @param pSashForm
	 *            the sash form into which the help will be included to.
	 */
	private void buildTableOfContents(final SashForm pSashForm) {
		final ScrolledComposite lScrolledComposite = new ScrolledComposite(
				pSashForm, SWT.H_SCROLL | SWT.V_SCROLL);
		lScrolledComposite.setLayout(new GridLayout());
		lScrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));

		lScrolledComposite.setExpandHorizontal(true);
		lScrolledComposite.setExpandVertical(true);

		final Composite lTocComposite = new Composite(lScrolledComposite,
				SWT.FILL);
		lTocComposite
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		lTocComposite.setLayout(new GridLayout());
		lTocComposite.setBackground(CHEATSHEET_BACKGROUND_COLOR);

		final Label lTitleLabel = new Label(lTocComposite, SWT.LEFT);
		lTitleLabel.setText("List Of Cheatsheets");
		GridData lGridData = new GridData(SWT.CENTER, SWT.FILL, true, false);
		lTitleLabel.setLayoutData(lGridData);
		lTitleLabel.setBackground(CHEATSHEET_BACKGROUND_COLOR);
		
		int lIndex = 0;
		for (CheatSheet lCheatSheet : gCheatsheets.getCheatSheets()) {
			final Label lLabel = new Label(lTocComposite, SWT.LEFT);
			String lTitle = lCheatSheet.getTitle();
			lLabel.setText(lTitle);
			lLabel.setToolTipText(lCheatSheet.getDescription());
			GridData lItemGridData = new GridData(SWT.FILL, SWT.FILL, true, false);
			if (lIndex == 0) {
				lItemGridData.verticalIndent = 20;
			}
			lLabel.setLayoutData(lItemGridData);
			lLabel.setBackground(CHEATSHEET_BACKGROUND_COLOR);
			lLabel.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseDown(org.eclipse.swt.events.MouseEvent e) {
					selectCheatsheet(lTitle);
				}
			});
			mStylingEngine.setClassname(lLabel, CHEATSHEET_TOC_TITLE_CLASSNAME);

			mCheatsheetByTitle.put(lTitle, lCheatSheet);
			lIndex++;
		}

		lScrolledComposite.setContent(lTocComposite);
		lScrolledComposite.setMinSize(lTocComposite.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
	}

	/**
	 * Method called when the part gets the focus.
	 */
	@Focus
	public void focus() {
	}

	// /**
	// * Build the help table of contents items from a list of TocItem
	// instances.
	// *
	// * @param pItems
	// * the TocItem instances
	// * @param pParent
	// * the parent composite
	// * @param pDepth
	// * The toc item depth. Used for indentation.
	// */
	// private void buildTopics(final EList<TocItem> pItems,
	// final Composite pParent, final int pDepth) {
	// for (final TocItem lTocItem : pItems) {
	// final Label lLabel = new Label(pParent, SWT.LEFT);
	// lLabel.setText(lTocItem.getLabel());
	// final GridData lGridData = new GridData(SWT.FILL, SWT.FILL, true,
	// false);
	// lGridData.horizontalIndent = pDepth * TOPIC_INDENTATION_FACTOR;
	// lLabel.setLayoutData(lGridData);
	// lLabel.setBackground(TOC_BACKGROUND_COLOR);
	// mStylingEngine.setClassname(lLabel, TOC_ITEM_CLASSNAME + pDepth);
	//
	// final String lHref = lTocItem.getHref();
	// final String lAnchor = lHref.substring(lHref
	// .indexOf(HTML_ANCHOR_SEPARATOR) + 1);
	//
	// lLabel.addMouseListener(new MouseAdapter() {
	//
	// /**
	// * Sent when a mouse button is pressed.
	// *
	// * @param pE
	// * an event containing information about the mouse
	// * button press
	// */
	// @Override
	// public void mouseDown(final MouseEvent arg0) {
	// mApplication.getContext().set(
	// HelpConstants.HELP_ANCHOR_CONTEXT_ID, lAnchor);
	// }
	// });
	//
	// // Build sub topics
	// buildTopics(lTocItem.getSubItems(), pParent, pDepth + 1);
	// }
	// }

	/**
	 * Set the cheatsheet instance
	 * 
	 * @param pCheatsheet
	 *            the cheatsheet to set
	 */
	public static void setCheatsheet(CheatSheets pCheatSheets) {
		gCheatsheets = pCheatSheets;
	}

}
