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
        switch(e.getActionCommand())
        {
            case "add":
                this.addElement();
                break;
            case "reset":
                this.reset();
                break;
            case "back":
                this.detailMapView.dispose();
                this.programController.backToMenu();
                break;
        }
    }

    public void addElement()
    {
        String name = "detail_" + this.detailMapView.getName();
        String url = "data//img//map//detail//detailMap_" + this.detailMapView.getName() + ".png";
        this.detailMapView.continueAfterInsert(this.programController.getDbController().addDetailMap(name, url,  this.detailMapView.getPositionen()));
    }

    public void reset()
    {
        this.detailMapView.resetView();
    }
}
