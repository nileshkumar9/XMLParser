import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

/**
 * TODO: <Add a description for the class here>
 *
 * @author nileshkumar6
 * @since 1.5.0
 */
public class XMLParserForCM {
    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("\\src\\main\\resources\\staff.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            //NodeList nList = doc.getElementsByTagName("staff");
            // 1. NodeList nList = doc.getElementsByTagName("applicationVisibilities");
            // 2. NodeList nList = doc.getElementsByTagName("classAccesses");
            // 3. NodeList nList = doc.getElementsByTagName("customPermissions");
            // 4. NodeList nList = doc.getElementsByTagName("fieldPermissions");
            //5. NodeList nList = doc.getElementsByTagName("objectPermissions");
            //6. NodeList nList = doc.getElementsByTagName("pageAccesses");
            //7. NodeList nList = doc.getElementsByTagName("recordTypeVisibilities");
            NodeList nList = doc.getElementsByTagName("tabSettings");


            getApplicationVisibilities(nList);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getApplicationVisibilities(NodeList nList) {
        System.out.println("----------------------------");

        System.out.println("Total count of variable " + nList.getLength());
        for (int temp = 0; temp < nList.getLength(); temp++) {

            Node nNode = nList.item(temp);

            //System.out.println("\nCurrent Element :" + nNode.getNodeName());

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) nNode;

                //System.out.println("Staff id : " + eElement.getAttribute("id"));
                //System.out.println("application : " + eElement.getElementsByTagName("application").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("application").item(0).getTextContent());
                //System.out.println("visible : " + eElement.getElementsByTagName("visible").item(0).getTextContent());
               // System.out.println(eElement.getElementsByTagName("visible").item(0).getTextContent());
                // System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
                //   System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                // 1. Application visibility
                // System.out.println( eElement.getElementsByTagName("application").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("visible").item(0).getTextContent());
                // 2. Class Access
                // System.out.println( eElement.getElementsByTagName("apexClass").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("enabled").item(0).getTextContent());
                // 3. Custom Permission
                // System.out.println( eElement.getElementsByTagName("name").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("enabled").item(0).getTextContent());
                // 4. fieldPermissions
                // System.out.println( eElement.getElementsByTagName("editable").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("field").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("readable").item(0).getTextContent());

                // 4. objectPermissions
                // System.out.println( eElement.getElementsByTagName("allowCreate").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("allowDelete").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("allowEdit").item(0).getTextContent());
                //System.out.println( eElement.getElementsByTagName("allowRead").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("modifyAllRecords").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("object").item(0).getTextContent());
                //System.out.println( eElement.getElementsByTagName("viewAllRecords").item(0).getTextContent());
                // 5. pageAccesses
                // System.out.println( eElement.getElementsByTagName("apexPage").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("enabled").item(0).getTextContent());
                // 6. recordTypeVisibilities
                // System.out.println( eElement.getElementsByTagName("recordType").item(0).getTextContent());
                // System.out.println( eElement.getElementsByTagName("visible").item(0).getTextContent());
                // 7. tabSettings
                // System.out.println( eElement.getElementsByTagName("tab").item(0).getTextContent());
                 System.out.println( eElement.getElementsByTagName("visibility").item(0).getTextContent());
            }
        }
    }
}
