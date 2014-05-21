package Controller;

import View.DetailMapView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailMapController implements ActionListener
{
    private DetailMapView detailMapView;
    private ProgramController programController;

    public DetailMapController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;
        this.detailMapView = new DetailMapView(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("add"))
            this.addElement();
        else if(e.getActionCommand().equals("reset"))
            this.resetView();
        else if(e.getActionCommand().equals("back"))
        {
            this.detailMapView.dispose();
            this.programController.backToMenu();
        }
    }

    public void addElement()
    {
        String name = this.detailMapView.getTxtfName().getText();
        String url = "data//img//detail//" + this.detailMapView.getTxtfUrl().getText();
        String pos = this.detailMapView.getTxtrPositionen().getText();
        this.programController.getXmlWriter().addDetailMap(name, url, pos);
    }

    public void resetView()
    {
        this.detailMapView.getTxtfName().setText("");
        this.detailMapView.getTxtfUrl().setText("");
        this.detailMapView.getTxtrConsole().setText("");
        this.detailMapView.getTxtrPositionen().setText("");
    }

    public DetailMapView getDetailMapView()
    {
        return this.detailMapView;
    }
}
