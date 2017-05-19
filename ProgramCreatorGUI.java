package com.directory.creator;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import javax.swing.*;

/**
 * ProgramCreatorGUI.java 
 * Purpose: Creates a program directory and includes
 * template files.
 * 
 * @author Anthony A. Taylor (J59613)
 * @version 1.0 5/19/2017
 */

public class ProgramCreatorGUI {
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;

	public ProgramCreatorGUI() {
		prepareGUI();
	}

	public static void main(String[] args) {
		ProgramCreatorGUI swingControlDemo = new ProgramCreatorGUI();
		swingControlDemo.showTextFieldDemo();
	}

	private void prepareGUI() {
		mainFrame = new JFrame("Program Directory Generator");
		mainFrame.setSize(400, 400);
		mainFrame.setLayout(new GridLayout(3, 1));
		mainFrame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		headerLabel = new JLabel("", SwingConstants.CENTER);
		statusLabel = new JLabel("", SwingConstants.CENTER);
		statusLabel.setSize(150, 100);
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);
	}

	private void showTextFieldDemo() {
		headerLabel.setText("PDG v1.0");
		JLabel namelabel = new JLabel("Program Name: ", SwingConstants.RIGHT);
		final JTextField programtext = new JTextField(25);
		JButton genButton = new JButton("Generate");
		genButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String bName = programtext.getText();
				if (programtext.getText().equals("")) {
					statusLabel.setText("Please enter a program name.");
				} else {

					String currentUsersHomeDir = System
							.getProperty("user.home");
					String otherFolder = currentUsersHomeDir + File.separator
							+ "Documents" + File.separator + "Programs"
							+ File.separator;
					System.out.println(otherFolder);
					try {
						statusLabel.setText("Program Name: " + bName
								+ " Created in: " + otherFolder);
						String programName = bName;
						File file = new File(otherFolder + programName);
						if (!file.exists()) {
							if (file.mkdir()) {
								System.out.println(otherFolder + programName
										+ " Directory is created!");
								System.out
										.println("The following directories were created: \n");
							} else {
								System.out
										.println("Failed to create directory!");
							}
						}
						File softwareRequest = new File(otherFolder
								+ programName + File.separator
								+ "Software Request");
						if (!softwareRequest.exists()) {
							if (softwareRequest.mkdirs()) {
								System.out
										.println("Software Request directories are created!");
								System.out
										.println("Checking For Software Request Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] Software Request.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Software Request"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("Template Doesn't Exist!");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File securityImpactAnalysis = new File(otherFolder
								+ programName + File.separator
								+ "Security Impact Analysis");
						if (!securityImpactAnalysis.exists()) {
							if (securityImpactAnalysis.mkdirs()) {
								System.out
										.println("Security Impact Analysis directories are created!");
								System.out
										.println("Checking For Security Impact Analysis Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] Security Impact Analysis.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Security Impact Analysis"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("Template Doesn't Exist!");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File hardwareEntry = new File(otherFolder + programName
								+ File.separator + "Hardware Entry");
						if (!hardwareEntry.exists()) {
							if (hardwareEntry.mkdirs()) {
								System.out
										.println("Hardware Entry directories are created!");
								System.out
										.println("Checking For Hardware Entry Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] IS HW Entry (rev1).pdf");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Hardware Entry"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File hardwareExit = new File(otherFolder + programName
								+ File.separator + "Hardware Exit");
						if (!hardwareExit.exists()) {
							if (hardwareExit.mkdirs()) {
								System.out
										.println("Hardware Exit directories are created!");
								System.out
										.println("Checking For Hardware Exit Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] IS HW Exit (rev1).pdf");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Hardware Exit"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File hardwareBaseline = new File(otherFolder
								+ programName + File.separator
								+ "Hardware Baseline");
						if (!hardwareBaseline.exists()) {
							if (hardwareBaseline.mkdirs()) {
								System.out
										.println("Hardware Baseline directories are created!");
								System.out
										.println("Checking For Hardware Baseline Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] Hardware Baseline.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Hardware Baseline"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File softwareBaseline = new File(otherFolder
								+ programName + File.separator
								+ "Software Baseline");
						if (!softwareBaseline.exists()) {
							if (softwareBaseline.mkdirs()) {
								System.out
										.println("Software Baseline directories are created!");
								System.out
										.println("Checking For Software Baseline Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] Software Baseline.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Software Baseline"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File complianceAndVulnerability = new File(otherFolder
								+ programName + File.separator
								+ "Compliance And Vulnerability");
						if (!complianceAndVulnerability.exists()) {
							if (complianceAndVulnerability.mkdirs()) {
								System.out
										.println("Compliance And Vulnerability directories are created!");
								File complianceScans = new File(otherFolder
										+ programName + File.separator
										+ "Compliance And Vulnerability"
										+ File.separator + "Compliance Scans");
								File vulnerabilityScans = new File(otherFolder
										+ programName + File.separator
										+ "Compliance And Vulnerability"
										+ File.separator
										+ "Vulnerability Scans");
								if (!complianceScans.exists()
										&& !vulnerabilityScans.exists()) {
									if (complianceScans.mkdirs()
											&& vulnerabilityScans.mkdirs()) {
										System.out
												.println("[sub]----> Compliance directories are created!");
										System.out
												.println("[sub]----> Vulnerability directories are created!");
									} else {
										System.out
												.println("Failed to create multiple directories!");
									}
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File userLibrary = new File(otherFolder + programName
								+ File.separator + "User Library");
						if (!userLibrary.exists()) {
							if (userLibrary.mkdirs()) {
								System.out
										.println("User Library directories are created!");
								System.out
										.println("Checking For User Library Template(s).");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Example Software Request Form.docx");
								Path source2 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] 2016 Refresher General User Briefing (September 2016).pptx");
								Path source3 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Media Creation Points of Contact.pptx");
								Path source4 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] NGC Balt Facility SOP for SAPs - Approval 20151228.pdf");
								Path source5 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Security POCs.docx");
								Path source6 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Security Relevenacy Determination Chart.pdf");
								Path source7 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Unattended Processing.pptx");
								Path source8 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] User Library Table of Contents.docx");
								Path source9 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] User Title Page.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "User Library"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source2, newdir.resolve(source2
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source3, newdir.resolve(source3
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source4, newdir.resolve(source4
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source5, newdir.resolve(source5
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source6, newdir.resolve(source6
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source7, newdir.resolve(source7
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source8, newdir.resolve(source8
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source9, newdir.resolve(source9
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File authorizationBinder = new File(otherFolder
								+ programName + File.separator
								+ "Authorization Binder");
						if (!authorizationBinder.exists()) {
							if (authorizationBinder.mkdirs()) {
								System.out
										.println("User Library directories are created!");
								System.out
										.println("Checking For Authorization Binder Template(s).");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "Authorization Binder"
														+ File.separator
														+ "[Template] Table of Contents.docx");
								Path source2 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "Authorization Binder"
														+ File.separator
														+ "[Template] Title Page.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Authorization Binder"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source2, newdir.resolve(source2
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File certifications = new File(otherFolder
								+ programName + File.separator
								+ "Certifications");
						if (!certifications.exists()) {
							if (certifications.mkdirs()) {
								System.out
										.println("Certifications directories are created!");
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File appointmentLetters = new File(otherFolder
								+ programName + File.separator
								+ "Appointment Letters");
						if (!appointmentLetters.exists()) {
							if (appointmentLetters.mkdirs()) {
								System.out
										.println("Appointment Letters directories are created!");
								System.out
										.println("Checking For Appointment Letter Template(s).");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] ISSM-ISSO Appointment Letter (53Rev4) 2016Jan22.docx");
								Path source2 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] ISSO Appointment Letter (JSIG4).docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Appointment Letters"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source2, newdir.resolve(source2
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File mediaControl = new File(otherFolder + programName
								+ File.separator + "Media Control");
						if (!mediaControl.exists()) {
							if (mediaControl.mkdirs()) {
								System.out
										.println("Media Control directories are created!");
								System.out
										.println("Checking For Media Control Template(s).");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "[Template] Data Transfer Agent Agreement Form.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Media Control"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File auditFolder = new File(otherFolder + programName
								+ File.separator + "Audit");
						if (!auditFolder.exists()) {
							if (auditFolder.mkdirs()) {
								System.out
										.println("Audit directories are created!");
								System.out
										.println("Checking For Log Template(s).");
								Path source = FileSystems.getDefault().getPath(
										"Templates" + File.separator
												+ "[Template] Log.xlsx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator + "Audit"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File floorPlan = new File(otherFolder + programName
								+ File.separator + "Floor Plan");
						if (!floorPlan.exists()) {
							if (floorPlan.mkdirs()) {
								System.out
										.println("Floor Plan directories are created!");
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File patchesFolder = new File(otherFolder + programName
								+ File.separator + "Patches");
						if (!patchesFolder.exists()) {
							if (patchesFolder.mkdirs()) {
								System.out
										.println("Patches directories are created!");
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File pointOC = new File(otherFolder + programName
								+ File.separator + "Point of Contact");
						if (!pointOC.exists()) {
							if (pointOC.mkdirs()) {
								System.out
										.println("Point of Contact directories are created!");
								System.out
										.println("Checking For Point of Contact Template.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "User Library"
														+ File.separator
														+ "[Template] Security POCs.docx");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "Point of Contact"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
						File jsigRev4 = new File(otherFolder + programName
								+ File.separator + "[JSIG] Rev4");
						if (!jsigRev4.exists()) {
							if (jsigRev4.mkdirs()) {
								System.out
										.println("JSIG Rev4 directories are created!");
								System.out
										.println("Checking For JSIG Rev4 Template Files.");
								Path source = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Authorization Package Cover Letter (53Rev3-Rev4) 2015Dec17.docx");
								Path source2 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Authorization to Connect (53Rev3-Rev4) 2016Jan21.docx");
								Path source3 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Authorization to Operate (53Rev4) 2016Jan22.docx");
								Path source4 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Deny Authorization to Operate (53Rev4)_2016Jan22.docx");
								Path source5 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Interconnection Security Agreement (53Rev3-Rev4) 20151217.docx");
								Path source6 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Interim Authorization to Test (53Rev4) 2016Jan22.docx");
								Path source7 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] ISSM-ISSO Appointment Letter (53Rev4) 2016Jan22.docx");
								Path source8 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] POAM (53Rev3-Rev4) 2016Jan19.xlsx");
								Path source9 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] System Security Plan (53Rev4) 2016Jan14.docx");
								Path source10 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] User Agreement (Gen_and_Priv) 2016Jan22.docx");
								Path source11 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Security Assessment Report (53Rev3-Rev4) 2015Dec17.docx");
								Path source12 = FileSystems
										.getDefault()
										.getPath(
												"Templates"
														+ File.separator
														+ "JSIG"
														+ File.separator
														+ "[Template] Program SOP AFT Suggestions.doc");
								Path newdir = FileSystems.getDefault().getPath(
										otherFolder + programName
												+ File.separator
												+ "[JSIG] Rev4"
												+ File.separator);
								try {
									Files.copy(source, newdir.resolve(source
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source2, newdir.resolve(source2
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source3, newdir.resolve(source3
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source4, newdir.resolve(source4
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source5, newdir.resolve(source5
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source6, newdir.resolve(source6
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source7, newdir.resolve(source7
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source8, newdir.resolve(source8
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source9, newdir.resolve(source9
											.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source10, newdir
											.resolve(source10.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source11, newdir
											.resolve(source11.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									Files.copy(source12, newdir
											.resolve(source12.getFileName()),
											StandardCopyOption.REPLACE_EXISTING);
									System.out.println("[Template Copied!]");
								} catch (IOException e1) {
									// System.err.println(e); Prints error, may
									// remove.
									System.out
											.println("[Template Doesn't Exist!]");
								}
							} else {
								System.out
										.println("Failed to create multiple directories!");
							}
						}
					} finally {
						try {
							Desktop.getDesktop().open(
									new File(otherFolder + bName)); // Opens the
																	// location
																	// of the
																	// program
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}// if statement to check for null value
			}
		});
		controlPanel.add(namelabel);
		controlPanel.add(programtext);
		controlPanel.add(genButton);
		mainFrame.setVisible(true);
	}
}
