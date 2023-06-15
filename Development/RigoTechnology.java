/*
 *This class runs a GUI of Develoepr, SenioeDeveloper and JuniorDeveloper by creating their objects
 *
 * Class name RigoTechology
 * Author name Manish Gurung
 * Development date 25 Aril 2019
 * Version 1
 */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RigoTechnology{

    private JFrame mainFrame, appointFrame, seniorDevFrame, juniorDevFrame, terminateFrame;
    private ArrayList<Developer> data;

    //this constructor makes main frame and calls mainFrameDesign method.
    public RigoTechnology() {
        mainFrameDesign();
    }

    //Makes main frame design
    public void mainFrameDesign() {
        data = new ArrayList<>();

        mainFrame = new JFrame("Rigo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 300);
        mainFrame.setLocationRelativeTo(null);


        JPanel mainPanel; //one and only panel
        mainPanel = new JPanel();
        mainPanel.setBackground(new Color(192,192,192));
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));//creating border
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Options");
        mainPanel.setBorder(title);
        mainPanel.setSize(300, 300);
        mainFrame.add(mainPanel);

        JButton b1, b2;//declaring 2 buttons

        //adding actions for every button
        b1 = new JButton("Appoint");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appoint();
            }
        });

        b2 = new JButton("Terminate");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terminateFrameDesign();
            }
        });

        GridBagConstraints g;
        mainPanel.setLayout(new GridBagLayout());
        g = new GridBagConstraints();
        g.insets = new Insets(10, 10, 10, 10);

        g.gridx = 0;
        g.gridy = 1;
        mainPanel.add(b1, g);

        g.gridx = 1;
        g.gridy = 1;
        mainPanel.add(b2, g);
        mainFrame.setVisible(true);
    }

    //method that opens after button b1 is clicked. This frame lets user choose senior or junior developer.
    public void appoint() {
        JButton b1, b2;

        //only one panel is required.
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Position");
        p1.setBorder(title);

        appointFrame = new JFrame("Developer Option");
        appointFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        appointFrame.setVisible(true);
        appointFrame.setSize(300, 300);
        appointFrame.setLocationRelativeTo(null);
        appointFrame.add(p1);

        GridBagConstraints g;
        p1.setLayout(new GridBagLayout());
        g = new GridBagConstraints();
        g.insets = new Insets(10, 10, 10, 10);//this makes gap between buttons

        //adding actions to buttons
        b1 = new JButton("Senior Developer");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seniorFrame();
            }
        });
        b2 = new JButton("Junior Developer");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                juniorFrame();
            }
        });

        g.gridx = 0;
        g.gridy = 0;
        p1.add(b1);

        g.gridx = 1;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(b2);
    }

    //this method opens frame to add platform and appoint senior developer.
    public void seniorFrame() {
        //2 panels where first panel adds platform and second panel appoints developer.
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Add Platform");
        p1.setBorder(title);
        p1.setPreferredSize(new Dimension(800, 200));

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(192,192,192));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder("Appoint Senior Developer");
        p2.setBorder(title2);
        p2.setPreferredSize(new Dimension(800, 300));


        //frame is set
        seniorDevFrame = new JFrame("Senior Developer");
        seniorDevFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        seniorDevFrame.setVisible(true);
        seniorDevFrame.setSize(800, 500);
        seniorDevFrame.setLocationRelativeTo(null);
        seniorDevFrame.setLayout(new FlowLayout());
        //flow layout is selected and panel size is adjusted above already. So, it fits in the frame one on the top and another in the bottom
        seniorDevFrame.getContentPane().setBackground(new Color(192,192,192));

        //buttons required in the frame
        JButton add = new JButton("Add Platform");
        JButton clear1 = new JButton("Clear all");
        JButton appoint = new JButton("Appoint Developer");
        JButton clear2 = new JButton("Clear all");
        JButton displayButton = new JButton("Display filled data");


        //adding panel
        seniorDevFrame.add(p1);
        seniorDevFrame.add(p2);

        JLabel l1 = new JLabel("Platform : ");
        JLabel l2 = new JLabel("Interviewer Name : ");
        JLabel l3 = new JLabel("Working Hour : ");
        JLabel l4 = new JLabel("Developer Name : ");
        JLabel l5 = new JLabel("Salary : ");
        JLabel l6 = new JLabel("Advance Salary : ");
        JLabel l7 = new JLabel("Staff room number : ");
        JLabel l8 = new JLabel("Contract period : ");
        JLabel l9 = new JLabel("Joining Date : ");
        JLabel l10 = new JLabel("Developer number : ");


        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(30);
        JTextField t5 = new JTextField(10);
        JTextField t6 = new JTextField(10);
        JTextField t7 = new JTextField(10);
        JTextField t8 = new JTextField(10);
        JTextField t9 = new JTextField(10);
        JTextField t10 = new JTextField(10);

        //adding action and exception handeling in add button.
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    String platform = t1.getText();
                    String interviewerName = t2.getText();
                    int hrs = Integer.parseInt(t3.getText());
                    double salary = Double.parseDouble(t5.getText());
                    Developer obj = new SeniorDeveloper(platform, interviewerName, hrs, salary, 0);
                    data.add(obj);

                    JOptionPane.showMessageDialog(null, "Platform added!");
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"Invalid text/number","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clear1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t5.setText("");
            }
        });

        //adding action in appoint platform button.
        appoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String developerName = t4.getText();
                    double advanceSalary = Double.parseDouble(t6.getText());
                    String staffRoomNumber = t7.getText();
                    int contractPeriod = Integer.parseInt(t8.getText());
                    String joiningDate = t9.getText();
                    int devNumber = Integer.parseInt(t10.getText());
                    if (devNumber > -1 && devNumber <= data.size() && data.get(devNumber) instanceof SeniorDeveloper) {
                        SeniorDeveloper obj = (SeniorDeveloper) data.get(devNumber);
                        obj.newContractPeriod(contractPeriod);
                        obj.hireDeveloper(developerName, joiningDate, advanceSalary, staffRoomNumber);
                        JOptionPane.showMessageDialog(null, "Developer Hired!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid number. PLease try again");
                    }
                }
                catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Please enter the valid number.","Error",JOptionPane.ERROR_MESSAGE);
                }
                catch(IndexOutOfBoundsException nfe){
                    JOptionPane.showMessageDialog(null,"Invalid number. PLease try again","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clear2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t4.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                t10.setText("");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayDetailsSr();
            }
        });

        GridBagConstraints g;
        p1.setLayout(new GridBagLayout());
        p2.setLayout(new GridBagLayout());
        g = new GridBagConstraints();
        g.insets = new Insets(10, 10, 10, 10);

        g.gridx = 0;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l1, g);

        g.gridx = 1;
        g.gridy = 0;
        p1.add(t1, g);

        g.gridx = 0;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l2, g);

        g.gridx = 1;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t2, g);

        g.gridx = 3;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l3, g);

        g.gridx = 4;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t3, g);

        g.gridx = 3;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l5, g);

        g.gridx = 4;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t5, g);

        g.gridx = 3;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(add, g);

        g.gridx = 4;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_END;
        p1.add(clear1, g);

        g.gridx = 0;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l4, g);

        g.gridx = 1;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t4, g);


        g.gridx = 2;
        g.gridy = 1;
        p2.add(l6, g);

        g.gridx = 3;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t6, g);

        g.gridx = 0;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l7, g);

        g.gridx = 1;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t7, g);

        g.gridx = 2;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l8, g);

        g.gridx = 3;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t8, g);

        g.gridx = 0;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l9, g);

        g.gridx = 1;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t9, g);

        g.gridx = 2;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l10, g);

        g.gridx = 3;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t10, g);

        g.gridx = 0;
        g.gridy = 4;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(displayButton, g);

        g.gridx = 2;
        g.gridy = 4;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(appoint, g);

        g.gridx = 3;
        g.gridy = 4;
        g.anchor = GridBagConstraints.LINE_END;
        p2.add(clear2, g);
    }

    //method to make junior frame after appointing junior button is clicked
    public void juniorFrame() {
        //2 panels where first panel adds platform and second panel appoints developer.
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Add Platform");
        p1.setBorder(title);
        p1.setPreferredSize(new Dimension(800, 250));

        JPanel p2 = new JPanel();
        p2.setBackground(new Color(192,192,192));
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title2;
        title2 = BorderFactory.createTitledBorder("Appoint Junior Developer");
        p2.setBorder(title2);
        p2.setPreferredSize(new Dimension(800, 300));


        //frame is set
        juniorDevFrame = new JFrame("Junior Developer");
        juniorDevFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        juniorDevFrame.setVisible(true);
        juniorDevFrame.setSize(800, 550);
        juniorDevFrame.setLocationRelativeTo(null);
        juniorDevFrame.setLayout(new FlowLayout());
        //flow layout is selected and panel size is adjusted above already. So, it fits in the frame one on the top and another in the bottom
        juniorDevFrame.getContentPane().setBackground(new Color(192,192,192));

        //buttons required in the frame
        JButton add = new JButton("Add Platform");
        JButton clear1 = new JButton("Clear all");
        JButton appoint = new JButton("Appoint Developer");
        JButton clear2 = new JButton("Clear all");
        JButton displayButton = new JButton("Display filled data");


        //adding panel
        juniorDevFrame.add(p1);
        juniorDevFrame.add(p2);

        JLabel l1 = new JLabel("Platform : ");
        JLabel l2 = new JLabel("Interviewer Name : ");
        JLabel l3 = new JLabel("Working Hour : ");
        JLabel l4 = new JLabel("Developer Name : ");
        JLabel l5 = new JLabel("Salary : ");
        JLabel l6 = new JLabel("Evaluation Period : ");
        JLabel l7 = new JLabel("Appointed Date : ");
        JLabel l8 = new JLabel("Termination Date : ");
        JLabel l9 = new JLabel("Specialization : ");
        JLabel l10 = new JLabel("Appointed by : ");
        JLabel l11 = new JLabel("Developer number : ");

        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);
        JTextField t3 = new JTextField(10);
        JTextField t4 = new JTextField(30);
        JTextField t5 = new JTextField(10);
        JTextField t6 = new JTextField(10);
        JTextField t7 = new JTextField(10);
        JTextField t8 = new JTextField(10);
        JTextField t9 = new JTextField(30);
        JTextField t10 = new JTextField(20);
        JTextField t11 = new JTextField(10);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String platform = t1.getText();
                    String interviewerName = t2.getText();
                    int hrs = Integer.parseInt(t3.getText());
                    double salary = Double.parseDouble(t5.getText());
                    String appointedBy = t10.getText();
                    Developer obj = new JuniorDeveloper(platform, interviewerName, hrs, salary, appointedBy, "");
                    data.add(obj);

                    JOptionPane.showMessageDialog(null, "Platform added!");
                }
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null,"Invalid text/number","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        clear1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t5.setText("");
                t10.setText("");
            }
        });

        appoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String developerName = t4.getText();
                    String evaluationPeriod = t6.getText();
                    String appointedDate = t7.getText();
                    String terminationDate = t8.getText();
                    String specialization = t9.getText();
                    int devNumber = Integer.parseInt(t11.getText());

                    if (devNumber > -1 && devNumber < data.size() && data.get(devNumber) instanceof JuniorDeveloper) {
                        JuniorDeveloper obj = (JuniorDeveloper) data.get(devNumber);
                        obj.appointDeveloper(developerName, appointedDate, terminationDate, specialization);
                        JOptionPane.showMessageDialog(null, "Developer Hired!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid number. PLease try again");
                    }
                }
                catch(NumberFormatException ex){
                    ex.getMessage();
                    JOptionPane.showMessageDialog(null,"Please enter the valid number");
                }
            }
        });

        clear2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t4.setText("");
                t6.setText("");
                t7.setText("");
                t9.setText("");
                t8.setText("");
                t11.setText("");
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayDetailsJr();
            }
        });

        GridBagConstraints g;
        p1.setLayout(new GridBagLayout());
        p2.setLayout(new GridBagLayout());
        g = new GridBagConstraints();
        g.insets = new Insets(10, 10, 10, 10);

        g.gridx = 0;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l1, g);

        g.gridx = 1;
        g.gridy = 0;
        p1.add(t1, g);

        g.gridx = 0;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l2, g);

        g.gridx = 1;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t2, g);

        g.gridx = 3;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l3, g);

        g.gridx = 4;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t3, g);

        g.gridx = 3;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l5, g);

        g.gridx = 4;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t5, g);

        g.gridx = 3;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(add, g);

        g.gridx = 4;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_END;
        p1.add(clear1, g);

        g.gridx = 0;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(l10, g);

        g.gridx = 1;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(t10, g);

        g.gridx = 0;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l4, g);

        g.gridx = 1;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t4, g);

        g.gridx = 2;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l8, g);

        g.gridx = 3;
        g.gridy = 0;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t8, g);

        g.gridx = 2;
        g.gridy = 1;
        p2.add(l6, g);

        g.gridx = 3;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t6, g);

        g.gridx = 0;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l9, g);

        g.gridx = 1;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t9, g);

        g.gridx = 2;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l11, g);

        g.gridx = 3;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t11, g);

        g.gridx = 0;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(l7, g);

        g.gridx = 1;
        g.gridy = 2;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(t7, g);


        g.gridx = 0;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(displayButton, g);

        g.gridx = 2;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_START;
        p2.add(appoint, g);

        g.gridx = 3;
        g.gridy = 3;
        g.anchor = GridBagConstraints.LINE_END;
        p2.add(clear2, g);
    }

    public void terminateFrameDesign() {
        terminateFrame = new JFrame("Terminate");
        terminateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        terminateFrame.setVisible(true);
        terminateFrame.setSize(500, 300);
        terminateFrame.setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Terminate");
        p1.setBorder(title);
        p1.setPreferredSize(new Dimension(500, 300));

        JButton b1 = new JButton("Terminate");
        JLabel l1 = new JLabel("Developer number");
        JTextField t1 = new JTextField(20);
        JButton clear = new JButton("Clear all");

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                int developerNo = Integer.parseInt(t1.getText());

                if (developerNo > -1 && developerNo < data.size() && data.get(developerNo) instanceof SeniorDeveloper) {
                    SeniorDeveloper obj1 = (SeniorDeveloper) data.get(developerNo);
                    if (obj1.getTerminated()) {
                        JOptionPane.showMessageDialog(null, "The developer is already terminated.");
                    } else {
                        obj1.contractTermination();
                        JOptionPane.showMessageDialog(null, "Developer successfully terminated");
                        t1.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid number. Try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }catch(NumberFormatException exe){
                    JOptionPane.showMessageDialog(null, "Please enter a number.");
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
            }
        });

        terminateFrame.add(p1);
        p1.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(10, 10, 10, 10);

        g.gridx = 0;
        g.gridy = 0;
        p1.add(l1, g);

        g.gridx = 1;
        g.gridy = 0;
        p1.add(t1, g);

        g.gridx = 0;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_START;
        p1.add(clear, g);

        g.gridx = 1;
        g.gridy = 1;
        g.anchor = GridBagConstraints.LINE_END;
        p1.add(b1, g);
    }

    public void displayDetailsSr() {
        JFrame frame = new JFrame("Senior Developer Details");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Senior Developer Detail");
        p1.setBorder(title);
        p1.setPreferredSize(new Dimension(500, 300));

        frame.add(p1);

        JTextArea area2;
        try {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i) instanceof SeniorDeveloper) {
                    SeniorDeveloper seniorObj = (SeniorDeveloper) data.get(i);
                    area2 = new JTextArea("Developer Number: " + i + "\nPlatform: " + seniorObj.getPlatform() + "\nInterviewer name: " +
                            seniorObj.getInterviewerName() + "\nWorking hours: " + seniorObj.getWorkingHour() + "\nSalary: " +
                            seniorObj.getSalary() + "\nContract period: " + seniorObj.getContractPeriod() + "\nDeveloper name: " +
                            seniorObj.getDeveloperName() + "\nJoining date: " + seniorObj.getJoiningDate() + "\nAdvanced salary: " +
                            seniorObj.getAdvanceSalary() + "\nStaff room no.: " + seniorObj.getStaffRoomNumber() +
                            "\nAppointed: " + seniorObj.getAppointed() + "\nTermination date: " + seniorObj.getTerminated()
                    );
                    area2.setEditable(false);
                    area2.setFont(new Font("Courier", Font.ITALIC, 20));
                    area2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
                    area2.repaint();
                    p1.add(area2);
                }
            }
        }
        catch(IndexOutOfBoundsException ibe) {
            JOptionPane.showMessageDialog(null, "Nothing to display.");
        }

    }

    public void displayDetailsJr() {
        JFrame frame = new JFrame("Junior Developer Details");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(192,192,192));
        p1.setBorder(BorderFactory.createLineBorder(Color.black));
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Filled Details");
        p1.setBorder(title);
        p1.setPreferredSize(new Dimension(500, 300));

        frame.add(p1);

        JTextArea area1;
        try {
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i) instanceof JuniorDeveloper) {
                    JuniorDeveloper juniorObj = (JuniorDeveloper) data.get(i);
                    area1 = new JTextArea("Developer Number: " + i +
                            "\nPlatform: " + juniorObj.getPlatform() + "\nInterviewer's Name: " +
                            juniorObj.getInterviewerName() + "\nWorking Hour: " +
                            juniorObj.getWorkingHour() + "\nSalary: " + juniorObj.getSalary() +
                            "\nAppointed by: " + juniorObj.getAppointedBy()
                            + "\nDeveloper Name: " + juniorObj.getDeveloperName() +
                            "\nAppointed Date " + juniorObj.getAppointedDate() + "\nTermination Date: " +
                            juniorObj.getTerminationDate() + "\nSpecialization " +
                            juniorObj.getSpecialization()

                    );
                    area1.setFont(new Font("Courier", Font.ITALIC, 20));
                    area1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
                    area1.repaint();
                    area1.setEditable(false);
                    p1.add(area1);
                }

            }
        }
        catch(IndexOutOfBoundsException ibe) {
            JOptionPane.showMessageDialog(null, "Nothing to display.");
        }

    }
    public static void main (String[]args)
    {
        new RigoTechnology();
    }
}

