

/* First created by JCasGen Mon Aug 04 11:44:10 EDT 2014 */
package edu.cmu.lti.ntcir.qalab.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 04 11:44:10 EDT 2014
 * XML source: /home/diwang/Dropbox/oaqa-workspace/ntcir-qalab-cmu-baseline/src/main/resources/WorldHistoryTypesDescriptor.xml
 * @generated */
public class Instruction extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Instruction.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Instruction() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Instruction(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Instruction(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Instruction(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets 
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Instruction_Type.featOkTst && ((Instruction_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.ntcir.qalab.types.Instruction");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Instruction_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Instruction_Type.featOkTst && ((Instruction_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.ntcir.qalab.types.Instruction");
    jcasType.ll_cas.ll_setStringValue(addr, ((Instruction_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: refList

  /** getter for refList - gets 
   * @generated
   * @return value of the feature 
   */
  public FSList getRefList() {
    if (Instruction_Type.featOkTst && ((Instruction_Type)jcasType).casFeat_refList == null)
      jcasType.jcas.throwFeatMissing("refList", "edu.cmu.lti.ntcir.qalab.types.Instruction");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Instruction_Type)jcasType).casFeatCode_refList)));}
    
  /** setter for refList - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRefList(FSList v) {
    if (Instruction_Type.featOkTst && ((Instruction_Type)jcasType).casFeat_refList == null)
      jcasType.jcas.throwFeatMissing("refList", "edu.cmu.lti.ntcir.qalab.types.Instruction");
    jcasType.ll_cas.ll_setRefValue(addr, ((Instruction_Type)jcasType).casFeatCode_refList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    