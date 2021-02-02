package model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "dataroot")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class dataroot  {
    private Sessions sessions;
    @XmlElement(name = "SESSIONS")
    private List<Sessions> llistaSessions;

    public List<Sessions> getLlistaSessions() {
        return llistaSessions;
    }

}
