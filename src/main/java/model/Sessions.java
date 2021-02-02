package model;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

    @XmlRootElement(name = "CICLE")
    @XmlAccessorType(XmlAccessType.FIELD)
    @Data
    public class Sessions {
        private String IDFILM, ses_id, CINEID, TITOL, ses_data , CINENOM , LOCALITAT ,COMARCA , CICLEID ,ver , preu , ORDRESESSIO;

        public String getIDFILM() {
            return IDFILM;
        }

        public String getSes_id() {
            return ses_id;
        }

        public String getCINEID() {
            return CINEID;
        }

        public String getTITOL() {
            return TITOL;
        }

        public String getSes_data() {
            return ses_data;
        }

        public String getCINENOM() {
            return CINENOM;
        }

        public String getLOCALITAT() {
            return LOCALITAT;
        }

        public String getCOMARCA() {
            return COMARCA;
        }

        public String getCICLEID() {
            return CICLEID;
        }

        public String getVer() {
            return ver;
        }

        public String getPreu() {
            return preu;
        }

        public String getORDRESESSIO() {
            return ORDRESESSIO;
        }

        public void setIDFILM(String IDFILM) {
            this.IDFILM = IDFILM;
        }

        public void setSes_id(String ses_id) {
            this.ses_id = ses_id;
        }

        public void setCINEID(String CINEID) {
            this.CINEID = CINEID;
        }

        public void setTITOL(String TITOL) {
            this.TITOL = TITOL;
        }

        public void setSes_data(String ses_data) {
            this.ses_data = ses_data;
        }

        public void setCINENOM(String CINENOM) {
            this.CINENOM = CINENOM;
        }

        public void setLOCALITAT(String LOCALITAT) {
            this.LOCALITAT = LOCALITAT;
        }

        public void setCOMARCA(String COMARCA) {
            this.COMARCA = COMARCA;
        }

        public void setCICLEID(String CICLEID) {
            this.CICLEID = CICLEID;
        }

        public void setVer(String ver) {
            this.ver = ver;
        }

        public void setPreu(String preu) {
            this.preu = preu;
        }

        public void setORDRESESSIO(String ORDRESESSIO) {
            this.ORDRESESSIO = ORDRESESSIO;
        }
    }

