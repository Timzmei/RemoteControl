import stations.Station;
import stations.StationRepository;

import javax.swing.*;


public class RemoteControl extends JFrame {
    private JTextField getValue;
    private JButton getButton;
    private JTextField setValue;
    private JTextArea description;
    private JButton setButton;
    private JLabel currentLabel;
    private JLabel newLabel;
    private JScrollPane params;
    private JScrollPane devices;
    private JList object_list;
    private JPanel mainWindow;
    private JList device_list;
    private JScrollPane objects;
    private JList param_list;

    public RemoteControl() {
        this.setContentPane(mainWindow);
        this.setTitle("Remote Control");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DefaultListModel<String> stationDefaultListModel = new DefaultListModel<>();
        stationDefaultListModel.addAll(StationRepository.getInstance().getStations().stream().map(Station::getRusName).toList());
        object_list.setModel(stationDefaultListModel);
    }


    public static void main(String[] args) {
        JFrame frame = new RemoteControl();

    }


}
