package org.openmrs;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Concept 
 */
public class Concept implements java.io.Serializable {

	public static final long serialVersionUID = 1L;

	// Fields

	private Integer conceptId;
	private Boolean retired;
	private String name;
	private String shortName;
	private String description;
	private ConceptDatatype conceptDatatype;
	private ConceptClass conceptClass;
	private String units;
	private String icd10;
	private String loinc;
	private String version;
	private User creator;
	private Date dateCreated;
	private User changedBy;
	private Date dateChanged;
	private List<ConceptName> names;
	private List<ConceptAnswer> answers;
	private List<ConceptSynonym> synonyms;

	// Constructors

	/** default constructor */
	public Concept() {
	}

	/** constructor with id */
	public Concept(Integer conceptId) {
		this.conceptId = conceptId;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Concept) {
			Concept c = (Concept)obj;
			return (this.conceptId.equals(c.getConceptId()));
		}
		return false;
	}
	
	public int hashCode() {
		if (this.getConceptId() == null) return super.hashCode();
		return this.getConceptId().hashCode();
	}
	
	/**
	 * @return Returns the answers.
	 */
	public List<ConceptAnswer> getAnswers() {
		return answers;
	}

	/**
	 * @param answers The answers to set.
	 */
	public void setAnswers(List<ConceptAnswer> answers) {
		this.answers = answers;
	}
	
	/**
	 * Add the given ConceptAnswer to the list of answers for this Concept
	 * @param conceptAnswer
	 */
	public void addAnswer(ConceptAnswer conceptAnswer) {
		conceptAnswer.setConcept(this);
		if (answers == null)
			answers = new LinkedList<ConceptAnswer>();
		if (!answers.contains(conceptAnswer) && conceptAnswer != null)
			answers.add(conceptAnswer);
	}

	/**
	 * Remove the given answer from the list of answers for this Concept
	 * @param conceptAnswer
	 */
	public void removeAnswer(ConceptAnswer conceptAnswer) {
		if (answers != null)
			answers.remove(conceptAnswer);
	}

	/**
	 * @return Returns the changedBy.
	 */
	public User getChangedBy() {
		return changedBy;
	}

	/**
	 * @param changedBy The changedBy to set.
	 */
	public void setChangedBy(User changedBy) {
		this.changedBy = changedBy;
	}

	/**
	 * @return Returns the conceptClass.
	 */
	public ConceptClass getConceptClass() {
		return conceptClass;
	}

	/**
	 * @param conceptClass The conceptClass to set.
	 */
	public void setConceptClass(ConceptClass conceptClass) {
		this.conceptClass = conceptClass;
	}

	/**
	 * @return Returns the conceptDatatype.
	 */
	public ConceptDatatype getConceptDatatype() {
		return conceptDatatype;
	}

	/**
	 * @param conceptDatatype The conceptDatatype to set.
	 */
	public void setConceptDatatype(ConceptDatatype conceptDatatype) {
		this.conceptDatatype = conceptDatatype;
	}

	/**
	 * @return Returns the conceptId.
	 */
	public Integer getConceptId() {
		return conceptId;
	}

	/**
	 * @param conceptId The conceptId to set.
	 */
	public void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateChanged.
	 */
	public Date getDateChanged() {
		return dateChanged;
	}

	/**
	 * @param dateChanged The dateChanged to set.
	 */
	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns the icd10.
	 */
	public String getIcd10() {
		return icd10;
	}

	/**
	 * @param icd10 The icd10 to set.
	 */
	public void setIcd10(String icd10) {
		this.icd10 = icd10;
	}

	/**
	 * @return Returns the loinc.
	 */
	public String getLoinc() {
		return loinc;
	}

	/**
	 * @param loinc The loinc to set.
	 */
	public void setLoinc(String loinc) {
		this.loinc = loinc;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the names.
	 */
	public List<ConceptName> getNames() {
		return names;
	}

	/**
	 * @param names The names to set.
	 */
	public void setNames(List<ConceptName> names) {
		this.names = names;
	}

	/**
	 * Add the given ConceptName to the list of names for this Concept
	 * @param conceptName
	 */
	public void addName(ConceptName conceptName) {
		conceptName.setConcept(this);
		if (names == null)
			names = new LinkedList<ConceptName>();
		if (!names.contains(conceptName) && conceptName != null)
			names.add(conceptName);
	}

	/**
	 * Remove the given name from the list of names for this Concept
	 * @param conceptName
	 */
	public void removeName(ConceptName conceptName) {
		if (names != null)
			names.remove(conceptName);
	}
	
	/**
	 * @return Returns the retired.
	 */
	public Boolean isRetired() {
		return retired;
	}

	/**
	 * @param retired The retired to set.
	 */
	public void setRetired(Boolean retired) {
		this.retired = retired;
	}

	/**
	 * @return Returns the shortName.
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName The shortName to set.
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return Returns the synonyms.
	 */
	public List<ConceptSynonym> getSynonyms() {
		return synonyms;
	}

	/**
	 * @param synonyms The synonyms to set.
	 */
	public void setSynonyms(List<ConceptSynonym> synonyms) {
		this.synonyms = synonyms;
	}

	/**
	 * Add the given ConceptSynonym to the list of synonyms for this Concept
	 * @param conceptSynonym
	 */
	public void addSynonym(ConceptSynonym conceptSynonym) {
		conceptSynonym.setConcept(this);
		if (synonyms == null)
			synonyms = new LinkedList<ConceptSynonym>();
		if (!synonyms.contains(conceptSynonym) && conceptSynonym != null)
			synonyms.add(conceptSynonym);
	}

	/**
	 * Remove the given synonym from the list of synonyms for this Concept
	 * @param conceptSynonym
	 */
	public void removeSynonym(ConceptSynonym conceptSynonym) {
		if (synonyms != null)
			synonyms.remove(conceptSynonym);
	}
	
	/**
	 * @return Returns the units.
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * @param units The units to set.
	 */
	public void setUnits(String units) {
		this.units = units;
	}

	/**
	 * @return Returns the version.
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version The version to set.
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	// Property accessors

}