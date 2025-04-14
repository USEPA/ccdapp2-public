
package gov.epa.ccte.api.ccdapp2.domain.chemicaldetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import gov.epa.ccte.api.ccdapp2.domain.AbstractAuditingEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document(collection = "chemicalDetails")
@TypeAlias("chemicalDetails")
@SuppressWarnings("unused")
public class ChemicalDetail extends AbstractAuditingEntity {

    @Id
    @JsonProperty("id")
    private  String id;

    @Field(name = "dtxsid")
    @JsonProperty("dsstoxSubstanceId")
    private String dsstoxSubstanceId;

    @Field(name = "dtxcid")
    @JsonProperty("dsstoxCompoundId")
    private String dsstoxCompoundId;

    @Field(name = "casrn")
    @JsonProperty("casrn")
    private String casrn;

    @Field(name = "compoundId")
    @JsonProperty("compoundId")
    private Integer compoundId;

    @Field(name = "genericSubstanceId")
    @JsonProperty("genericSubstanceId")
    private Integer genericSubstanceId;

    @Field(name = "trireleaseIdentifier")
    @JsonProperty("trireleaseIdentifier")
    private String trireleaseIdentifier;

    @Field(name = "pubchemCid")
    @JsonProperty("pubchemCid")
    private Integer pubchemCid;

    @Field(name = "preferredName")
    @JsonProperty("preferredName")
    private String preferredName;

    @Field(name = "acdIupacName")
    @JsonProperty("acdIupacName")
    private String acdIupacName;

    @Field(name = "wikipediaName")
    @JsonProperty("wikipediaName")
    private String wikipediaName;

    @Field(name = "meshName")
    @JsonProperty("meshName")
    private String meshName;

    @Field(name = "label")
    @JsonProperty("label")
    private String label;

    @Field(name = "inchiKeySkeleton")
    @JsonProperty("inchiKeySkeleton")
    private String inchiKeySkeleton;

    @Field(name = "inchiKey")
    @JsonProperty("inchiKey")
    private String inchiKey;

    @Field(name = "inchi")
    @JsonProperty("inchiString")
    private String inchiString;

    @Field(name = "inchiSkeleton")
    @JsonProperty("inchiSkeleton")
    private String inchiSkeleton;

    @Field(name = "mixtures")
    @JsonProperty("mixtures")
    private String mixtures;

    @Field(name = "msReadyMappings")
    @JsonProperty("msReadyMappings")
    private List<MsReadyMapings> msReadyMappings= new ArrayList<>();

    @Field(name = "similarCompounds")
    @JsonProperty("similarCompounds")
    private Integer similarCompounds;

    @Field(name = "tanimoto")
    @JsonProperty("tanimoto")
    private Double  tanimoto;


    @Field(name = "molFormula")
    @JsonProperty("molFormula")
    private String molFormula;

    @Field(name = "smiles")
    @JsonProperty("smiles")
    private String smiles;

    @Field(name = "scrubchemLink")
    @JsonProperty("scrubchemLink")
    private String scrubchemLink;

    @Field(name = "monoisotopicMass")
    @JsonProperty("monoisotopicMass")
    private Double monoisotopicMass;

    @Field(name = "molWeight")
    @JsonProperty("molWeight")
    private Double molWeight;

    @Field(name = "isMarkush")
    @JsonProperty("isMarkush")
    private boolean isMarkush;

    @Field(name = "irisLink")
    @JsonProperty("irisLink")
    private String irisLink;

    @Field(name = "citation")
    @JsonProperty("citation")
    private String citation;

    @Field(name = "qcLevel")
    @JsonProperty("qcLevel")
    private Integer qcLevel;

    @Field(name = "qcLevelDesc")
    @JsonProperty("qcLevelDesc")
    private String qcLevelDesc;

    @Field(name = "qcNotes")
    @JsonProperty("qcNotes")
    private String qcNotes;

    @Field(name = "safetyUrl")
    @JsonProperty("safetyUrl")
    private String safetyUrl;

    @Field(name = "hasStructureImage")
    @JsonProperty("hasStructureImage")
    private Boolean hasStructureImage;

    @Field(name = "relatedSubstanceCount")
    @JsonProperty("relatedSubstanceCount")
    private Integer relatedSubstanceCount;

    @Field(name = "relatedStructureCount")
    @JsonProperty("relatedStructureCount")
    private Integer relatedStructureCount;

    @Field(name = "presenceInLists")
    @JsonProperty("presenceInLists")
    private List<PresenceInList> presenceInLists;

}
