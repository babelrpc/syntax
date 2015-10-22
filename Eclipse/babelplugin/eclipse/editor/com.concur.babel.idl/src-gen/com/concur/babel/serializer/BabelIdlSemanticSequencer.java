package com.concur.babel.serializer;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelIdl;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.Const;
import com.concur.babel.babelIdl.ConstProperty;
import com.concur.babel.babelIdl.ConstPropertyId;
import com.concur.babel.babelIdl.ConstValueType;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.DefaultNameSpace;
import com.concur.babel.babelIdl.EnumOrdinal;
import com.concur.babel.babelIdl.EnumProperty;
import com.concur.babel.babelIdl.EnumPropertyId;
import com.concur.babel.babelIdl.ImportStatement;
import com.concur.babel.babelIdl.ListType;
import com.concur.babel.babelIdl.MapType;
import com.concur.babel.babelIdl.Namespace;
import com.concur.babel.babelIdl.Property;
import com.concur.babel.babelIdl.PropertyValue;
import com.concur.babel.babelIdl.Service;
import com.concur.babel.babelIdl.ServiceMethod;
import com.concur.babel.babelIdl.ServiceMethodReturnType;
import com.concur.babel.babelIdl.ServiceProperty;
import com.concur.babel.babelIdl.Struct;
import com.concur.babel.services.BabelIdlGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BabelIdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BabelIdlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BabelIdlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BabelIdlPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.BABEL_IDL:
				if(context == grammarAccess.getBabelIdlRule()) {
					sequence_BabelIdl(context, (BabelIdl) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.CONST:
				if(context == grammarAccess.getBabelDefinitionRule() ||
				   context == grammarAccess.getConstRule()) {
					sequence_Const(context, (Const) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.CONST_PROPERTY:
				if(context == grammarAccess.getConstPropertyRule()) {
					sequence_ConstProperty(context, (ConstProperty) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.CONST_PROPERTY_ID:
				if(context == grammarAccess.getConstPropertyIdRule()) {
					sequence_ConstPropertyId(context, (ConstPropertyId) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.CONST_VALUE_TYPE:
				if(context == grammarAccess.getConstValueTypeRule()) {
					sequence_ConstValueType(context, (ConstValueType) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.DATA_TYPE_REFERENCE:
				if(context == grammarAccess.getDataTypeReferenceRule()) {
					sequence_DataTypeReference(context, (DataTypeReference) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.DEFAULT_NAME_SPACE:
				if(context == grammarAccess.getDefaultNameSpaceRule()) {
					sequence_DefaultNameSpace(context, (DefaultNameSpace) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.ENUM:
				if(context == grammarAccess.getBabelDefinitionRule() ||
				   context == grammarAccess.getElementTypeReferenceRule() ||
				   context == grammarAccess.getEnumRule()) {
					sequence_Enum(context, (com.concur.babel.babelIdl.Enum) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.ENUM_ORDINAL:
				if(context == grammarAccess.getEnumOrdinalRule()) {
					sequence_EnumOrdinal(context, (EnumOrdinal) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.ENUM_PROPERTY:
				if(context == grammarAccess.getEnumPropertyRule()) {
					sequence_EnumProperty(context, (EnumProperty) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.ENUM_PROPERTY_ID:
				if(context == grammarAccess.getEnumPropertyIdRule()) {
					sequence_EnumPropertyId(context, (EnumPropertyId) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.LIST_TYPE:
				if(context == grammarAccess.getDataTypeReferenceRule() ||
				   context == grammarAccess.getListTypeRule()) {
					sequence_ListType(context, (ListType) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.MAP_TYPE:
				if(context == grammarAccess.getDataTypeReferenceRule() ||
				   context == grammarAccess.getMapTypeRule()) {
					sequence_MapType(context, (MapType) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.PROPERTY_VALUE:
				if(context == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (PropertyValue) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.SERVICE:
				if(context == grammarAccess.getBabelDefinitionRule() ||
				   context == grammarAccess.getServiceRule()) {
					sequence_Service(context, (Service) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.SERVICE_METHOD:
				if(context == grammarAccess.getServiceMethodRule()) {
					sequence_ServiceMethod(context, (ServiceMethod) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE:
				if(context == grammarAccess.getServiceMethodReturnTypeRule()) {
					sequence_ServiceMethodReturnType(context, (ServiceMethodReturnType) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.SERVICE_PROPERTY:
				if(context == grammarAccess.getServicePropertyRule()) {
					sequence_ServiceProperty(context, (ServiceProperty) semanticObject); 
					return; 
				}
				else break;
			case BabelIdlPackage.STRUCT:
				if(context == grammarAccess.getBabelDefinitionRule() ||
				   context == grammarAccess.getElementTypeReferenceRule() ||
				   context == grammarAccess.getStructRule()) {
					sequence_Struct(context, (Struct) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (scope=ID? attr=ATTR)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* imports+=ImportStatement* defaultNamespace=DefaultNameSpace namespaces+=Namespace* definitions+=BabelDefinition*)
	 */
	protected void sequence_BabelIdl(EObject context, BabelIdl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConstPropertyId(EObject context, ConstPropertyId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.CONST_PROPERTY_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.CONST_PROPERTY_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstPropertyIdAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* name=ConstPropertyId val=ConstValueType)
	 */
	protected void sequence_ConstProperty(EObject context, ConstProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stringVal=STRING | boolVal=BOOL | numVal=ConstNumValue)
	 */
	protected void sequence_ConstValueType(EObject context, ConstValueType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* name=ID properties+=ConstProperty*)
	 */
	protected void sequence_Const(EObject context, Const semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=DataTypeEnum
	 */
	protected void sequence_DataTypeReference(EObject context, DataTypeReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.DATA_TYPE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.DATA_TYPE_REFERENCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumEnumRuleCall_0_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (def=DefaultQualifier ns=QualifiedName)
	 */
	protected void sequence_DefaultNameSpace(EObject context, DefaultNameSpace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.DEFAULT_NAME_SPACE__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.DEFAULT_NAME_SPACE__DEF));
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.DEFAULT_NAME_SPACE__NS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.DEFAULT_NAME_SPACE__NS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefaultNameSpaceAccess().getDefDefaultQualifierParserRuleCall_1_0(), semanticObject.getDef());
		feeder.accept(grammarAccess.getDefaultNameSpaceAccess().getNsQualifiedNameParserRuleCall_2_0(), semanticObject.getNs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=INT
	 */
	protected void sequence_EnumOrdinal(EObject context, EnumOrdinal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.ENUM_ORDINAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.ENUM_ORDINAL__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumOrdinalAccess().getTypeINTTerminalRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumPropertyId(EObject context, EnumPropertyId semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.ENUM_PROPERTY_ID__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.ENUM_PROPERTY_ID__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEnumPropertyIdAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* name=EnumPropertyId type=EnumOrdinal)
	 */
	protected void sequence_EnumProperty(EObject context, EnumProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* name=ID properties+=EnumProperty*)
	 */
	protected void sequence_Enum(EObject context, com.concur.babel.babelIdl.Enum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportStatement(EObject context, ImportStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.IMPORT_STATEMENT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.IMPORT_STATEMENT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (dateType=DataTypeReference | elementType=[ElementTypeReference|ID])
	 */
	protected void sequence_ListType(EObject context, ListType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (keyDataType=DataTypeReference | keyElementType=[ElementTypeReference|ID]) 
	 *         (valDataType=DataTypeReference | valElementType=[ElementTypeReference|ID])
	 *     )
	 */
	protected void sequence_MapType(EObject context, MapType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lang=SupportedLangs ns=STRING)
	 */
	protected void sequence_Namespace(EObject context, Namespace semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.NAMESPACE__LANG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.NAMESPACE__LANG));
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.NAMESPACE__NS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.NAMESPACE__NS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceAccess().getLangSupportedLangsEnumRuleCall_1_0(), semanticObject.getLang());
		feeder.accept(grammarAccess.getNamespaceAccess().getNsSTRINGTerminalRuleCall_2_0(), semanticObject.getNs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PropertyValue(EObject context, PropertyValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.PROPERTY_VALUE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.PROPERTY_VALUE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* attributes+=Attribute* (dateType=DataTypeReference | elementType=[ElementTypeReference|ID]) name=PropertyValue)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (voidType='void' | dataType=DataTypeReference | elementType=[ElementTypeReference|ID])
	 */
	protected void sequence_ServiceMethodReturnType(EObject context, ServiceMethodReturnType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* attributes+=Attribute* return=ServiceMethodReturnType name=ID properties+=ServiceProperty*)
	 */
	protected void sequence_ServiceMethod(EObject context, ServiceMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Property
	 */
	protected void sequence_ServiceProperty(EObject context, ServiceProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BabelIdlPackage.Literals.SERVICE_PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BabelIdlPackage.Literals.SERVICE_PROPERTY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getServicePropertyAccess().getNamePropertyParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* attributes+=Attribute* name=ID serviceMethods+=ServiceMethod*)
	 */
	protected void sequence_Service(EObject context, Service semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comment+=CommentType* attributes+=Attribute* name=ID superType=[Struct|ID]? properties+=Property*)
	 */
	protected void sequence_Struct(EObject context, Struct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
