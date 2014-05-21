package Controller;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLWriter
{
    private DocumentBuilderFactory docFactory;
    private TransformerFactory transformerFactory;
    private Transformer transformer;
    private DocumentBuilder docBuilder;
    private DOMSource source;
    private StreamResult result;
    private Document doc;
    private ProgramController programController;

    public XMLWriter(ProgramController paramProgramController, String paramFileName)
    {
        this.programController = paramProgramController;
        this.verifyXml(paramFileName);
    }

    public void addDetailMap(String paramName, String paramUrl, String paramPos)
    {
        NodeList rootList = doc.getElementsByTagName("list");
        Node root = rootList.item(0);

        Element map = doc.createElement("map");
        root.appendChild(map);

        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode(paramName));
        map.appendChild(name);

        Element url = doc.createElement("url");
        url.appendChild(doc.createTextNode(paramUrl));
        map.appendChild(url);

        Element position = doc.createElement("position");
        map.appendChild(position);

        int i = 0;
        int posLength = paramPos.length();

        while(i < posLength)
        {
            String xPos = "";
            String yPos = "";

            while(paramPos.charAt(i) != ',')
            {
                xPos += paramPos.charAt(i);
                i++;
            }
            i++;

            outerloop:
            while(paramPos.charAt(i) != '\n')
            {
                yPos += paramPos.charAt(i);
                i++;
                if(i >= posLength)
                    break outerloop;
            }
            i++;

            Element koordinate = doc.createElement("koordinate");
            Element x = doc.createElement("xPos");
            Element y = doc.createElement("yPos");
            x.appendChild(doc.createTextNode(xPos));
            y.appendChild(doc.createTextNode(yPos));
            koordinate.appendChild(x);
            koordinate.appendChild(y);
            position.appendChild(koordinate);
        }

        try
        {
            this.transformerFactory = TransformerFactory.newInstance();
            this.transformer = this.transformerFactory.newTransformer();
            this.source = new DOMSource(this.doc);
            this.result = new StreamResult(new File("data//detailMap.xml"));
            this.transformer.transform(this.source, this.result);

            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Neue map hinzugefügt.\n");
        }
        catch(Exception e)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler bei hinzufügen von map.\n");
        }
    }

    public void verifyXml(String url)
    {
        File xmlFile = new File(url);

        this.docFactory = DocumentBuilderFactory.newInstance();

        try
        {
            this.docBuilder = this.docFactory.newDocumentBuilder();

            if(!xmlFile.exists())
            {
                this.doc = this.docBuilder.newDocument();

                Element root = doc.createElement("list");
                this.doc.appendChild(root);

                this.transformerFactory = TransformerFactory.newInstance();
                this.transformer = this.transformerFactory.newTransformer();
                this.source = new DOMSource(this.doc);
                this.result = new StreamResult(new File(url));
                this.transformer.transform(this.source, this.result);

                this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Neues XML erzeugt.\n");
            }
            else
            {
                this.doc = this.docBuilder.parse(xmlFile);
                this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("XML eingelesen.\n");
            }
        }
        catch(Exception e)
        {
            this.programController.getDetailMapController().getDetailMapView().getTxtrConsole().append("Fehler beim lesen oder erzeugen des XML.\n");
        }
    }
}
