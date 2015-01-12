package Controller;

import View.AttributeTooltipView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttributeTooltipController implements ActionListener
{
    private ProgramController programController;
    private AttributeTooltipView attributeTooltipView;

    public AttributeTooltipController(ProgramController paramProgramController)
    {
        this.programController = paramProgramController;
        this.attributeTooltipView = new AttributeTooltipView(this);
    }

    public void addNewTooltip()
    {
        String tmpAttributeTooltipText = this.attributeTooltipView.getTooltipText();
        String tmpAttributeTooltipName = this.attributeTooltipView.geTooltipName();
        if((tmpAttributeTooltipName.length() <= 40) && (tmpAttributeTooltipName.length() > 0) && (tmpAttributeTooltipText.length() <= 1000) && (tmpAttributeTooltipText.length() > 0))
                this.attributeTooltipView.continueAfterInsert(this.programController.getDbController().addAttributeTooltip(tmpAttributeTooltipName, tmpAttributeTooltipText));
        else
            this.attributeTooltipView.printLengthError();
    }

    public void resetView()
    {
        this.attributeTooltipView.resetView();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch(e.getActionCommand())
        {
            case "add":
                this.addNewTooltip();
                break;
            case "reset":
                this.resetView();
                break;
            case "back":
                this.attributeTooltipView.dispose();
                this.programController.backToMenu();
                break;
        }
    }
}