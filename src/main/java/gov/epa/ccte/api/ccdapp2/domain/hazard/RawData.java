package gov.epa.ccte.api.ccdapp2.domain.hazard;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@ToString(callSuper = true)
public class RawData {
    @Field(name = "toxval_id")
    @JsonProperty("toxvalId")
    public Integer toxvalId;

    @Field(name = "chemical_id")
    @JsonProperty("chemicalId")
    public Integer chemicalId;

    @Field(name = "species_id")
    @JsonProperty("speciesId")
    public Integer speciesId;

    @Field(name = "quality_id")
    @JsonProperty("qualityId")
    public Integer qualityId;

    @Field(name = "priority_id")
    @JsonProperty("priorityId")
    public Integer priorityId;

    @Field(name = "source")
    @JsonProperty("source")
    public String source;

    @Field(name = "subsource")
    @JsonProperty("subsource")
    public String subsource;

    @Field(name = "source_url")
    @JsonProperty("sourceUrl")
    public String sourceUrl;

    @Field(name = "subsource_url")
    @JsonProperty("subsourceUrl")
    public String subsourceUrl;

    @Field(name = "source_source_id")
    @JsonProperty("sourceSourceId")
    public Integer sourceSourceId;

    @Field(name = "risk_assessment_class")
    @JsonProperty("riskAssessmentClass")
    public String riskAssessmentClass;

    @Field(name = "toxval_type")
    @JsonProperty("toxvalType")
    public String toxvalType;

    @Field(name = "toxval_subtype")
    @JsonProperty("toxvalSubtype")
    public String toxvalSubtype;

    @Field(name = "toxval_numeric_converted")
    @JsonProperty("toxvalNumericConverted")
    public Integer toxvalNumericConverted;

    @Field(name = "toxval_numeric")
    @JsonProperty("toxvalNumeric")
    public Double toxvalNumeric;

    @Field(name = "toxval_numeric_qualifier")
    @JsonProperty("toxvalNumericQualifier")
    public String toxvalNumericQualifier;

    @Field(name = "toxval_units_converted")
    @JsonProperty("toxvalUnitsConverted")
    public String toxvalUnitsConverted;

    @Field(name = "toxval_units")
    @JsonProperty("toxvalUnits")
    public String toxvalUnits;

    @Field(name = "study_type")
    @JsonProperty("studyType")
    public String studyType;

    @Field(name = "study_duration_class")
    @JsonProperty("studyDurationClass")
    public String studyDurationClass;

    @Field(name = "study_duration_value")
    @JsonProperty("studyDurationValue")
    public Integer studyDurationValue;

    @Field(name = "study_duration_units")
    @JsonProperty("studyDurationUnits")
    public String studyDurationUnits;

    @Field(name = "strain")
    @JsonProperty("strain")
    public String strain;

    @Field(name = "sex")
    @JsonProperty("sex")
    public String sex;

    @Field(name = "population")
    @JsonProperty("population")
    public String population;

    @Field(name = "exposure_route")
    @JsonProperty("exposureRoute")
    public String exposureRoute;

    @Field(name = "exposure_method")
    @JsonProperty("exposureMethod")
    public String exposureMethod;

    @Field(name = "exposure_form")
    @JsonProperty("exposureForm")
    public String exposureForm;

    @Field(name = "media")
    @JsonProperty("media")
    public String media;

    @Field(name = "lifestage")
    @JsonProperty("lifestage")
    public String lifestage;

    @Field(name = "generation")
    @JsonProperty("generation")
    public String generation;

    @Field(name = "year")
    @JsonProperty("year")
    public String year;

    @Field(name = "critical_effect")
    @JsonProperty("criticalEffect")
    public String criticalEffect;

    @Field(name = "detail_text")
    @JsonProperty("detailText")
    public String detailText;

    @Field(name = "datetime")
    @JsonProperty("dateStamp")
    public String dateStamp;

    @Field(name = "supercategory")
    @JsonProperty("supercategory")
    public String supercategory;

    @Field(name = "definition")
    @JsonProperty("definition")
    public String definition;

    @Field(name = "species_common")
    @JsonProperty("speciesCommon")
    public String speciesCommon;


    @Field(name = "toxval_type_original")
    @JsonProperty("toxvalTypeOriginal")
    public String toxvalTypeOriginal;

    @Field(name = "toxval_type_category")
    @JsonProperty("toxvalTypeCategory")
    public String toxvalTypeCategory;

    @Field(name = "toxval_numeric_original")
    @JsonProperty("toxvalNumericOriginal")
    public String toxvalNumericOriginal;

    @Field(name = "toxval_units_original")
    @JsonProperty("toxvalUnitsOriginal")
    public String toxvalUnitsOriginal;

    @Field(name = "study_type_original")
    @JsonProperty("studyTypeOriginal")
    public String studyTypeOriginal;

    @Field(name = "study_duration_class_original")
    @JsonProperty("studyDurationClassOriginal")
    public String studyDurationClassOriginal;

    @Field(name = "study_duration_value_original")
    @JsonProperty("studyDurationValueOriginal")
    public String studyDurationValueOriginal;

    @Field(name = "study_duration_units_original")
    @JsonProperty("studyDurationUnitsOriginal")
    public String studyDurationUnitsOriginal;

    @Field(name = "species_original")
    @JsonProperty("speciesOriginal")
    public String speciesOriginal;

    @Field(name = "species_supercategory")
    @JsonProperty("speciesSupercategory")
    public String speciesSupercategory;

    @Field(name = "habitat")
    @JsonProperty("habitat")
    public String habitat;

    @Field(name = "human_eco")
    @JsonProperty("humanEco")
    public String humanEco;

    @Field(name = "strain_original")
    @JsonProperty("strainOriginal")
    public String strainOriginal;

    @Field(name = "sex_original")
    @JsonProperty("sexOriginal")
    public String sexOriginal;

    @Field(name = "exposure_route_original")
    @JsonProperty("exposureRouteOriginal")
    public String exposureRouteOriginal;

    @Field(name = "exposure_method_original")
    @JsonProperty("exposureMethodOriginal")
    public String exposureMethodOriginal;

    @Field(name = "exposure_form_original")
    @JsonProperty("exposureFormOriginal")
    public String exposureFormOriginal;

    @Field(name = "media_original")
    @JsonProperty("mediaOriginal")
    public String mediaOriginal;

    @Field(name = "critical_effect_original")
    @JsonProperty("criticalEffectOriginal")
    public String criticalEffectOriginal;

    @Field(name = "original_year")
    @JsonProperty("originalYear")
    public String originalYear;

    @Field(name = "qa_status")
    @JsonProperty("qaStatus")
    public boolean qaStatus;

    @Field(name = "details_text")
    @JsonProperty("detailsText")
    public String detailsText;

    @Field(name = "longRef")
    @JsonProperty("longRef")
    public String longRef;

    @Field(name = "title")
    @JsonProperty("title")
    public String title;

    @Field(name = "author")
    @JsonProperty("author")
    public String author;

    @Field(name = "journal")
    @JsonProperty("journal")
    public String journal;

    @Field(name = "volume")
    @JsonProperty("volume")
    public String volume;

    @Field(name = "issue")
    @JsonProperty("issue")
    public String issue;

    @Field(name = "url")
    @JsonProperty("url")
    public String url;

    @Field(name = "pmid")
    @JsonProperty("pmid")
    public int pmid;

    @Field(name = "glp")
    @JsonProperty("glp")
    public String glp;

    @Field(name = "guideline")
    @JsonProperty("guideline")
    public String guideline;

    @Field(name = "quality")
    @JsonProperty("quality")
    public String quality;

    @Field(name = "record_source_level")
    @JsonProperty("recordSourceLevel")
    public String recordSourceLevel;

    @Field(name = "record_source_type")
    @JsonProperty("recordSourceType")
    public String recordSourceType;

    @Field(name = "record_source_note")
    @JsonProperty("recordSourceNote")
    public String recordSourceNote;

    @Field(name = "document_name")
    @JsonProperty("documentName")
    public String documentName;

}
