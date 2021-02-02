package model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "entitats")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class dataroot  {

    @XmlElement(name = "dataroot")
    private List<dataroot> llistadataroot;

    public List<dataroot> getLlistadataroot() {
        return llistadataroot;
    }

    @XmlElement(name = "Sessions")
    private List<Sessions> llistaSessions;

    public List<Sessions> getLlistaSessions() {
        return llistaSessions;
    }
}
