
package gov.epa.ccte.api.ccdapp2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
public abstract class AbstractChemicalInformationWithAudit extends AbstractAuditingEntity {

    @Field(name = "dtxsid")
    @JsonProperty("dtxsid")
    private String dtxsid;
//Only for mongo use
    @NonNull
    @JsonIgnore
    private String name;

    @Id
    @JsonProperty(value = "id")
    @JsonIgnore
    private String id;

    // UI needed this for aggrid selection suppot
    @JsonProperty("selected")
    private  Boolean selected=false;

    @Field(name = "casrn")
    @JsonProperty("casrn")
    private String casrn;

    @Field(name = "compoundId")
    @JsonProperty("compoundId")
    private Integer compoundId;

    @Field(name = "genericSubstanceId")
    @JsonProperty("genericSubstanceId")
    private Integer genericSubstanceId;

    @Field(name = "preferredName")
    @JsonProperty("preferredName")
    private String preferredName;

    @Field(name = "activeAssays")
    @JsonProperty("activeAssays")
    private Integer activeAssays;

    @Field(name = "cpdataCount")
    @JsonProperty("cpdataCount")
    private Integer cpdataCount;

    @Field(name = "isotope")
    @JsonProperty("isotope")
    private Integer isotope;

    @Field(name = "molFormula")
    @JsonProperty("molFormula")
    private String molFormula;

    @Field(name = "molWeight")
    @JsonProperty("averageMass")
    private String averageMass;

    @Field(name = "monoisotopicMass")
    @JsonProperty("monoisotopicMass")
    private Double monoisotopicMass;

    @Field(name = "multicomponent")
    @JsonProperty("multicomponent")
    private Integer multicomponent;

    @Field(name = "percentAssays")
    @JsonProperty("percentAssays")
    private String percentAssays;

    @Field(name = "pubchemCount")
    @JsonProperty("pubchemCount")
    private Integer pubchemCount;

    @Field(name = "pubmedCount")
    @JsonProperty("pubmedCount")
    private Double pubmedCount;

    @Field(name = "qcLevel")
    @JsonProperty("qcLevel")
    private Integer qcLevel;

    @Field(name = "qcLevelDesc")
    @JsonProperty("qcLevelDesc")
    private String qcLevelDesc;

    @Field(name = "sourcesCount")
    @JsonProperty("sourcesCount")
    private Integer sourcesCount;

    @Field(name = "stereo")
    @JsonProperty("stereo")
    private Integer stereo;

    @Field(name = "totalAssays")
    @JsonProperty("totalAssays")
    private Integer totalAssays;

    @Field(name = "toxcastSelect")
    @JsonProperty("toxcastSelect")
    private String toxcastSelect;

    @Field(name = "iupacName")
    @JsonProperty("iupacName")
    private String iupacName;

    @Field(name = "smiles")
    @JsonProperty("smiles")
    private String smiles;

    @Field(name = "inchi")
    @JsonProperty("inchiString")
    private String inchiString;

    @Field(name = "inchiKey")
    @JsonProperty("inchiKey")
    private String inchiKey;


    @Field(name = "hasStructureImage")
    @JsonProperty("hasStructureImage")
    private Boolean hasStructureImage;

    @Field(name = "relatedSubstanceCount")
    @JsonProperty("relatedSubstanceCount")
    private Integer relatedSubstanceCount;

    @Field(name = "relatedStructureCount")
    @JsonProperty("relatedStructureCount")
    private Integer relatedStructureCount;
}
