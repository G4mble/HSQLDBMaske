package Controller;

import View.DetailMapView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailMapController implements ActionListener
{
    private DetailMapView detailMapView;
    private ProgramController programController;
    private int[] xPosArray, yPosArray;

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
            this.programController.backToMenu();
            this.detailMapView.dispose();
        }
    }

    public void addElement()
    {
        String name = "detail_" + this.detailMapView.getTxtfName().getText();
        String url = "data//img//map//detail//detailMap_" + this.detailMapView.getTxtfName().getText() + ".png";
        String pos = this.detailMapView.getTxtrPositionen().getText();
        int posCount = Integer.parseInt(this.detailMapView.getSpinnerPosCount().getValue().toString());
        this.programController.getDbController().addDetailMap(name, url,  pos, posCount);
    }

/**
 * Beim auslesen verwenden



    public void trimPositions(String paramPos, int paramPosCount)
    {
        int k = 0;
        int i = 0;
        int posLength = paramPos.length();
        this.xPosArray = new int[paramPosCount];
        this.yPosArray = new int[paramPosCount];

        while(k < posLength)
        {
            String xPos = "";
            String yPos = "";

            while(paramPos.charAt(k) != ',')
            {
                xPos += paramPos.charAt(k);
                k++;
            }
            k++;

            while(paramPos.charAt(k) != ';')
            {
                yPos += paramPos.charAt(k);
                k++;
                if(k >= posLength)
                    break;
            }
            k++;

            this.xPosArray[i] = Integer.parseInt(xPos);
            this.yPosArray[i] = Integer.parseInt(yPos);
        }
    }
*/

    public void resetView()
    {
        this.detailMapView.getTxtfName().setText("");
        this.detailMapView.getTxtrPositionen().setText("");
        this.detailMapView.getTxtrConsole().setText("Reset erfolgreich.");
    }

    public DetailMapView getDetailMapView()
    {
        return this.detailMapView;
    }
}
