package com.concur.babel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.concur.babel.services.BabelIdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBabelIdlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ATTR", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'namespace'", "'.'", "'/'", "'import'", "'enum'", "'{'", "'}'", "'='", "'const'", "'-'", "'struct'", "'abstract'", "'extends'", "'service'", "'('", "')'", "'void'", "'list'", "'<'", "'>'", "'map'", "'@'", "'bool'", "'byte'", "'uint16'", "'uint32'", "'uint64'", "'sbyte'", "'int16'", "'int32'", "'int64'", "'float32'", "'float64'", "'string'", "'datetime'", "'decimal'", "'char'", "'binary'", "'java'", "'csharp'", "'asp'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=7;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int RULE_ATTR=10;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalBabelIdlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBabelIdlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBabelIdlParser.tokenNames; }
    public String getGrammarFileName() { return "../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g"; }



     	private BabelIdlGrammarAccess grammarAccess;
     	
        public InternalBabelIdlParser(TokenStream input, BabelIdlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "BabelIdl";	
       	}
       	
       	@Override
       	protected BabelIdlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleBabelIdl"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:68:1: entryRuleBabelIdl returns [EObject current=null] : iv_ruleBabelIdl= ruleBabelIdl EOF ;
    public final EObject entryRuleBabelIdl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBabelIdl = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:69:2: (iv_ruleBabelIdl= ruleBabelIdl EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:70:2: iv_ruleBabelIdl= ruleBabelIdl EOF
            {
             newCompositeNode(grammarAccess.getBabelIdlRule()); 
            pushFollow(FOLLOW_ruleBabelIdl_in_entryRuleBabelIdl75);
            iv_ruleBabelIdl=ruleBabelIdl();

            state._fsp--;

             current =iv_ruleBabelIdl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBabelIdl85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBabelIdl"


    // $ANTLR start "ruleBabelIdl"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:77:1: ruleBabelIdl returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) ) ( (lv_namespaces_3_0= ruleNamespace ) )* ( (lv_definitions_4_0= ruleBabelDefinition ) )* ) ;
    public final EObject ruleBabelIdl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_defaultNamespace_2_0 = null;

        EObject lv_namespaces_3_0 = null;

        EObject lv_definitions_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:80:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) ) ( (lv_namespaces_3_0= ruleNamespace ) )* ( (lv_definitions_4_0= ruleBabelDefinition ) )* ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:81:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) ) ( (lv_namespaces_3_0= ruleNamespace ) )* ( (lv_definitions_4_0= ruleBabelDefinition ) )* )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:81:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) ) ( (lv_namespaces_3_0= ruleNamespace ) )* ( (lv_definitions_4_0= ruleBabelDefinition ) )* )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:81:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_imports_1_0= ruleImportStatement ) )* ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) ) ( (lv_namespaces_3_0= ruleNamespace ) )* ( (lv_definitions_4_0= ruleBabelDefinition ) )*
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:81:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SL_COMMENT && LA1_0<=RULE_ML_COMMENT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:82:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:82:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:83:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBabelIdlAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleBabelIdl131);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBabelIdlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:99:3: ( (lv_imports_1_0= ruleImportStatement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:100:1: (lv_imports_1_0= ruleImportStatement )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:100:1: (lv_imports_1_0= ruleImportStatement )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:101:3: lv_imports_1_0= ruleImportStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBabelIdlAccess().getImportsImportStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportStatement_in_ruleBabelIdl153);
            	    lv_imports_1_0=ruleImportStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBabelIdlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_1_0, 
            	            		"ImportStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:117:3: ( (lv_defaultNamespace_2_0= ruleDefaultNameSpace ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:118:1: (lv_defaultNamespace_2_0= ruleDefaultNameSpace )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:118:1: (lv_defaultNamespace_2_0= ruleDefaultNameSpace )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:119:3: lv_defaultNamespace_2_0= ruleDefaultNameSpace
            {
             
            	        newCompositeNode(grammarAccess.getBabelIdlAccess().getDefaultNamespaceDefaultNameSpaceParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDefaultNameSpace_in_ruleBabelIdl175);
            lv_defaultNamespace_2_0=ruleDefaultNameSpace();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBabelIdlRule());
            	        }
                   		set(
                   			current, 
                   			"defaultNamespace",
                    		lv_defaultNamespace_2_0, 
                    		"DefaultNameSpace");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:135:2: ( (lv_namespaces_3_0= ruleNamespace ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:136:1: (lv_namespaces_3_0= ruleNamespace )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:136:1: (lv_namespaces_3_0= ruleNamespace )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:137:3: lv_namespaces_3_0= ruleNamespace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBabelIdlAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamespace_in_ruleBabelIdl196);
            	    lv_namespaces_3_0=ruleNamespace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBabelIdlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"namespaces",
            	            		lv_namespaces_3_0, 
            	            		"Namespace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:153:3: ( (lv_definitions_4_0= ruleBabelDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_SL_COMMENT && LA4_0<=RULE_ATTR)||LA4_0==19||LA4_0==23||LA4_0==25||LA4_0==28||LA4_0==36) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:154:1: (lv_definitions_4_0= ruleBabelDefinition )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:154:1: (lv_definitions_4_0= ruleBabelDefinition )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:155:3: lv_definitions_4_0= ruleBabelDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBabelIdlAccess().getDefinitionsBabelDefinitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBabelDefinition_in_ruleBabelIdl218);
            	    lv_definitions_4_0=ruleBabelDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBabelIdlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_4_0, 
            	            		"BabelDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBabelIdl"


    // $ANTLR start "entryRuleBabelDefinition"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:179:1: entryRuleBabelDefinition returns [EObject current=null] : iv_ruleBabelDefinition= ruleBabelDefinition EOF ;
    public final EObject entryRuleBabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBabelDefinition = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:180:2: (iv_ruleBabelDefinition= ruleBabelDefinition EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:181:2: iv_ruleBabelDefinition= ruleBabelDefinition EOF
            {
             newCompositeNode(grammarAccess.getBabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleBabelDefinition_in_entryRuleBabelDefinition255);
            iv_ruleBabelDefinition=ruleBabelDefinition();

            state._fsp--;

             current =iv_ruleBabelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBabelDefinition265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBabelDefinition"


    // $ANTLR start "ruleBabelDefinition"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:188:1: ruleBabelDefinition returns [EObject current=null] : (this_Enum_0= ruleEnum | this_Struct_1= ruleStruct | this_Const_2= ruleConst | this_Service_3= ruleService ) ;
    public final EObject ruleBabelDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_Enum_0 = null;

        EObject this_Struct_1 = null;

        EObject this_Const_2 = null;

        EObject this_Service_3 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:191:28: ( (this_Enum_0= ruleEnum | this_Struct_1= ruleStruct | this_Const_2= ruleConst | this_Service_3= ruleService ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:192:1: (this_Enum_0= ruleEnum | this_Struct_1= ruleStruct | this_Const_2= ruleConst | this_Service_3= ruleService )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:192:1: (this_Enum_0= ruleEnum | this_Struct_1= ruleStruct | this_Const_2= ruleConst | this_Service_3= ruleService )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:193:5: this_Enum_0= ruleEnum
                    {
                     
                            newCompositeNode(grammarAccess.getBabelDefinitionAccess().getEnumParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleEnum_in_ruleBabelDefinition312);
                    this_Enum_0=ruleEnum();

                    state._fsp--;

                     
                            current = this_Enum_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:203:5: this_Struct_1= ruleStruct
                    {
                     
                            newCompositeNode(grammarAccess.getBabelDefinitionAccess().getStructParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStruct_in_ruleBabelDefinition339);
                    this_Struct_1=ruleStruct();

                    state._fsp--;

                     
                            current = this_Struct_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:213:5: this_Const_2= ruleConst
                    {
                     
                            newCompositeNode(grammarAccess.getBabelDefinitionAccess().getConstParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConst_in_ruleBabelDefinition366);
                    this_Const_2=ruleConst();

                    state._fsp--;

                     
                            current = this_Const_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:223:5: this_Service_3= ruleService
                    {
                     
                            newCompositeNode(grammarAccess.getBabelDefinitionAccess().getServiceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleService_in_ruleBabelDefinition393);
                    this_Service_3=ruleService();

                    state._fsp--;

                     
                            current = this_Service_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBabelDefinition"


    // $ANTLR start "entryRuleLineTerm"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:239:1: entryRuleLineTerm returns [String current=null] : iv_ruleLineTerm= ruleLineTerm EOF ;
    public final String entryRuleLineTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLineTerm = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:240:2: (iv_ruleLineTerm= ruleLineTerm EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:241:2: iv_ruleLineTerm= ruleLineTerm EOF
            {
             newCompositeNode(grammarAccess.getLineTermRule()); 
            pushFollow(FOLLOW_ruleLineTerm_in_entryRuleLineTerm429);
            iv_ruleLineTerm=ruleLineTerm();

            state._fsp--;

             current =iv_ruleLineTerm.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineTerm440); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLineTerm"


    // $ANTLR start "ruleLineTerm"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:248:1: ruleLineTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleLineTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:251:28: ( (kw= ',' | kw= ';' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:252:1: (kw= ',' | kw= ';' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:252:1: (kw= ',' | kw= ';' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:253:2: kw= ','
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleLineTerm478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineTermAccess().getCommaKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:260:2: kw= ';'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleLineTerm497); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLineTermAccess().getSemicolonKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLineTerm"


    // $ANTLR start "entryRuleNamespace"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:273:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:274:2: (iv_ruleNamespace= ruleNamespace EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:275:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace537);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace547); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:282:1: ruleNamespace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_lang_1_0= ruleSupportedLangs ) ) ( (lv_ns_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ns_2_0=null;
        Enumerator lv_lang_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:285:28: ( (otherlv_0= 'namespace' ( (lv_lang_1_0= ruleSupportedLangs ) ) ( (lv_ns_2_0= RULE_STRING ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:286:1: (otherlv_0= 'namespace' ( (lv_lang_1_0= ruleSupportedLangs ) ) ( (lv_ns_2_0= RULE_STRING ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:286:1: (otherlv_0= 'namespace' ( (lv_lang_1_0= ruleSupportedLangs ) ) ( (lv_ns_2_0= RULE_STRING ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:286:3: otherlv_0= 'namespace' ( (lv_lang_1_0= ruleSupportedLangs ) ) ( (lv_ns_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNamespace584); 

                	newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:290:1: ( (lv_lang_1_0= ruleSupportedLangs ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:291:1: (lv_lang_1_0= ruleSupportedLangs )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:291:1: (lv_lang_1_0= ruleSupportedLangs )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:292:3: lv_lang_1_0= ruleSupportedLangs
            {
             
            	        newCompositeNode(grammarAccess.getNamespaceAccess().getLangSupportedLangsEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSupportedLangs_in_ruleNamespace605);
            lv_lang_1_0=ruleSupportedLangs();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamespaceRule());
            	        }
                   		set(
                   			current, 
                   			"lang",
                    		lv_lang_1_0, 
                    		"SupportedLangs");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:308:2: ( (lv_ns_2_0= RULE_STRING ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:309:1: (lv_ns_2_0= RULE_STRING )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:309:1: (lv_ns_2_0= RULE_STRING )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:310:3: lv_ns_2_0= RULE_STRING
            {
            lv_ns_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNamespace622); 

            			newLeafNode(lv_ns_2_0, grammarAccess.getNamespaceAccess().getNsSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamespaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ns",
                    		lv_ns_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDefaultNameSpace"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:334:1: entryRuleDefaultNameSpace returns [EObject current=null] : iv_ruleDefaultNameSpace= ruleDefaultNameSpace EOF ;
    public final EObject entryRuleDefaultNameSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultNameSpace = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:335:2: (iv_ruleDefaultNameSpace= ruleDefaultNameSpace EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:336:2: iv_ruleDefaultNameSpace= ruleDefaultNameSpace EOF
            {
             newCompositeNode(grammarAccess.getDefaultNameSpaceRule()); 
            pushFollow(FOLLOW_ruleDefaultNameSpace_in_entryRuleDefaultNameSpace663);
            iv_ruleDefaultNameSpace=ruleDefaultNameSpace();

            state._fsp--;

             current =iv_ruleDefaultNameSpace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultNameSpace673); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultNameSpace"


    // $ANTLR start "ruleDefaultNameSpace"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:343:1: ruleDefaultNameSpace returns [EObject current=null] : (otherlv_0= 'namespace' ( (lv_def_1_0= ruleDefaultQualifier ) ) ( (lv_ns_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleDefaultNameSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_def_1_0 = null;

        AntlrDatatypeRuleToken lv_ns_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:346:28: ( (otherlv_0= 'namespace' ( (lv_def_1_0= ruleDefaultQualifier ) ) ( (lv_ns_2_0= ruleQualifiedName ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:347:1: (otherlv_0= 'namespace' ( (lv_def_1_0= ruleDefaultQualifier ) ) ( (lv_ns_2_0= ruleQualifiedName ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:347:1: (otherlv_0= 'namespace' ( (lv_def_1_0= ruleDefaultQualifier ) ) ( (lv_ns_2_0= ruleQualifiedName ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:347:3: otherlv_0= 'namespace' ( (lv_def_1_0= ruleDefaultQualifier ) ) ( (lv_ns_2_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDefaultNameSpace710); 

                	newLeafNode(otherlv_0, grammarAccess.getDefaultNameSpaceAccess().getNamespaceKeyword_0());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:351:1: ( (lv_def_1_0= ruleDefaultQualifier ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:352:1: (lv_def_1_0= ruleDefaultQualifier )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:352:1: (lv_def_1_0= ruleDefaultQualifier )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:353:3: lv_def_1_0= ruleDefaultQualifier
            {
             
            	        newCompositeNode(grammarAccess.getDefaultNameSpaceAccess().getDefDefaultQualifierParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDefaultQualifier_in_ruleDefaultNameSpace731);
            lv_def_1_0=ruleDefaultQualifier();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefaultNameSpaceRule());
            	        }
                   		set(
                   			current, 
                   			"def",
                    		lv_def_1_0, 
                    		"DefaultQualifier");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:369:2: ( (lv_ns_2_0= ruleQualifiedName ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:370:1: (lv_ns_2_0= ruleQualifiedName )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:370:1: (lv_ns_2_0= ruleQualifiedName )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:371:3: lv_ns_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getDefaultNameSpaceAccess().getNsQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDefaultNameSpace752);
            lv_ns_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefaultNameSpaceRule());
            	        }
                   		set(
                   			current, 
                   			"ns",
                    		lv_ns_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultNameSpace"


    // $ANTLR start "entryRuleDefaultQualifier"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:395:1: entryRuleDefaultQualifier returns [String current=null] : iv_ruleDefaultQualifier= ruleDefaultQualifier EOF ;
    public final String entryRuleDefaultQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefaultQualifier = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:396:2: (iv_ruleDefaultQualifier= ruleDefaultQualifier EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:397:2: iv_ruleDefaultQualifier= ruleDefaultQualifier EOF
            {
             newCompositeNode(grammarAccess.getDefaultQualifierRule()); 
            pushFollow(FOLLOW_ruleDefaultQualifier_in_entryRuleDefaultQualifier789);
            iv_ruleDefaultQualifier=ruleDefaultQualifier();

            state._fsp--;

             current =iv_ruleDefaultQualifier.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultQualifier800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultQualifier"


    // $ANTLR start "ruleDefaultQualifier"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:404:1: ruleDefaultQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDefaultQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:407:28: ( (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:408:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:408:1: (this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:408:6: this_ID_0= RULE_ID kw= '.' this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultQualifier840); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,16,FOLLOW_16_in_ruleDefaultQualifier858); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDefaultQualifierAccess().getFullStopKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDefaultQualifier873); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultQualifier"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:436:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:437:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:438:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName919);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName930); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:445:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '/' this_ID_1= RULE_ID )* ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:448:28: ( (kw= '/' this_ID_1= RULE_ID )* )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:449:1: (kw= '/' this_ID_1= RULE_ID )*
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:449:1: (kw= '/' this_ID_1= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:450:2: kw= '/' this_ID_1= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_17_in_ruleQualifiedName968); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getSolidusKeyword_0()); 
            	        
            	    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName983); 

            	    		current.merge(this_ID_1);
            	        
            	     
            	        newLeafNode(this_ID_1, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImportStatement"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:470:1: entryRuleImportStatement returns [EObject current=null] : iv_ruleImportStatement= ruleImportStatement EOF ;
    public final EObject entryRuleImportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportStatement = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:471:2: (iv_ruleImportStatement= ruleImportStatement EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:472:2: iv_ruleImportStatement= ruleImportStatement EOF
            {
             newCompositeNode(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement1029);
            iv_ruleImportStatement=ruleImportStatement();

            state._fsp--;

             current =iv_ruleImportStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement1039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:479:1: ruleImportStatement returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:482:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:483:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:483:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:483:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleImportStatement1076); 

                	newLeafNode(otherlv_0, grammarAccess.getImportStatementAccess().getImportKeyword_0());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:487:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:488:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:488:1: (lv_importURI_1_0= RULE_STRING )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:489:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImportStatement1093); 

            			newLeafNode(lv_importURI_1_0, grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportStatementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"importURI",
                    		lv_importURI_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleEnum"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:513:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:514:2: (iv_ruleEnum= ruleEnum EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:515:2: iv_ruleEnum= ruleEnum EOF
            {
             newCompositeNode(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1134);
            iv_ruleEnum=ruleEnum();

            state._fsp--;

             current =iv_ruleEnum; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:522:1: ruleEnum returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleEnumProperty ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:525:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleEnumProperty ) )* otherlv_5= '}' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:526:1: ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleEnumProperty ) )* otherlv_5= '}' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:526:1: ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleEnumProperty ) )* otherlv_5= '}' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:526:2: ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'enum' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleEnumProperty ) )* otherlv_5= '}'
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:526:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_SL_COMMENT && LA8_0<=RULE_ML_COMMENT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:527:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:527:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:528:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleEnum1190);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEnum1203); 

                	newLeafNode(otherlv_1, grammarAccess.getEnumAccess().getEnumKeyword_1());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:548:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:549:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:549:1: (lv_name_2_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:550:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1220); 

            			newLeafNode(lv_name_2_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEnum1237); 

                	newLeafNode(otherlv_3, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:570:1: ( (lv_properties_4_0= ruleEnumProperty ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=RULE_SL_COMMENT && LA9_0<=RULE_ML_COMMENT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:571:1: (lv_properties_4_0= ruleEnumProperty )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:571:1: (lv_properties_4_0= ruleEnumProperty )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:572:3: lv_properties_4_0= ruleEnumProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumAccess().getPropertiesEnumPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEnumProperty_in_ruleEnum1258);
            	    lv_properties_4_0=ruleEnumProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"EnumProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleEnum1271); 

                	newLeafNode(otherlv_5, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:600:1: entryRuleEnumProperty returns [EObject current=null] : iv_ruleEnumProperty= ruleEnumProperty EOF ;
    public final EObject entryRuleEnumProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumProperty = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:601:2: (iv_ruleEnumProperty= ruleEnumProperty EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:602:2: iv_ruleEnumProperty= ruleEnumProperty EOF
            {
             newCompositeNode(grammarAccess.getEnumPropertyRule()); 
            pushFollow(FOLLOW_ruleEnumProperty_in_entryRuleEnumProperty1307);
            iv_ruleEnumProperty=ruleEnumProperty();

            state._fsp--;

             current =iv_ruleEnumProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumProperty1317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumProperty"


    // $ANTLR start "ruleEnumProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:609:1: ruleEnumProperty returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleEnumPropertyId ) ) otherlv_2= '=' ( (lv_type_3_0= ruleEnumOrdinal ) ) ( ruleLineTerm )? ) ;
    public final EObject ruleEnumProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:612:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleEnumPropertyId ) ) otherlv_2= '=' ( (lv_type_3_0= ruleEnumOrdinal ) ) ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:613:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleEnumPropertyId ) ) otherlv_2= '=' ( (lv_type_3_0= ruleEnumOrdinal ) ) ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:613:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleEnumPropertyId ) ) otherlv_2= '=' ( (lv_type_3_0= ruleEnumOrdinal ) ) ( ruleLineTerm )? )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:613:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleEnumPropertyId ) ) otherlv_2= '=' ( (lv_type_3_0= ruleEnumOrdinal ) ) ( ruleLineTerm )?
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:613:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_SL_COMMENT && LA10_0<=RULE_ML_COMMENT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:614:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:614:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:615:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleEnumProperty1363);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:631:3: ( (lv_name_1_0= ruleEnumPropertyId ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:632:1: (lv_name_1_0= ruleEnumPropertyId )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:632:1: (lv_name_1_0= ruleEnumPropertyId )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:633:3: lv_name_1_0= ruleEnumPropertyId
            {
             
            	        newCompositeNode(grammarAccess.getEnumPropertyAccess().getNameEnumPropertyIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumPropertyId_in_ruleEnumProperty1385);
            lv_name_1_0=ruleEnumPropertyId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EnumPropertyId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleEnumProperty1397); 

                	newLeafNode(otherlv_2, grammarAccess.getEnumPropertyAccess().getEqualsSignKeyword_2());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:653:1: ( (lv_type_3_0= ruleEnumOrdinal ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:654:1: (lv_type_3_0= ruleEnumOrdinal )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:654:1: (lv_type_3_0= ruleEnumOrdinal )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:655:3: lv_type_3_0= ruleEnumOrdinal
            {
             
            	        newCompositeNode(grammarAccess.getEnumPropertyAccess().getTypeEnumOrdinalParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEnumOrdinal_in_ruleEnumProperty1418);
            lv_type_3_0=ruleEnumOrdinal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"EnumOrdinal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:671:2: ( ruleLineTerm )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:672:5: ruleLineTerm
                    {
                     
                            newCompositeNode(grammarAccess.getEnumPropertyAccess().getLineTermParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineTerm_in_ruleEnumProperty1435);
                    ruleLineTerm();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumProperty"


    // $ANTLR start "entryRuleEnumOrdinal"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:687:1: entryRuleEnumOrdinal returns [EObject current=null] : iv_ruleEnumOrdinal= ruleEnumOrdinal EOF ;
    public final EObject entryRuleEnumOrdinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumOrdinal = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:688:2: (iv_ruleEnumOrdinal= ruleEnumOrdinal EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:689:2: iv_ruleEnumOrdinal= ruleEnumOrdinal EOF
            {
             newCompositeNode(grammarAccess.getEnumOrdinalRule()); 
            pushFollow(FOLLOW_ruleEnumOrdinal_in_entryRuleEnumOrdinal1472);
            iv_ruleEnumOrdinal=ruleEnumOrdinal();

            state._fsp--;

             current =iv_ruleEnumOrdinal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumOrdinal1482); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumOrdinal"


    // $ANTLR start "ruleEnumOrdinal"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:696:1: ruleEnumOrdinal returns [EObject current=null] : ( (lv_type_0_0= RULE_INT ) ) ;
    public final EObject ruleEnumOrdinal() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:699:28: ( ( (lv_type_0_0= RULE_INT ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:700:1: ( (lv_type_0_0= RULE_INT ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:700:1: ( (lv_type_0_0= RULE_INT ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:701:1: (lv_type_0_0= RULE_INT )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:701:1: (lv_type_0_0= RULE_INT )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:702:3: lv_type_0_0= RULE_INT
            {
            lv_type_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEnumOrdinal1523); 

            			newLeafNode(lv_type_0_0, grammarAccess.getEnumOrdinalAccess().getTypeINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumOrdinalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumOrdinal"


    // $ANTLR start "entryRuleEnumPropertyId"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:726:1: entryRuleEnumPropertyId returns [EObject current=null] : iv_ruleEnumPropertyId= ruleEnumPropertyId EOF ;
    public final EObject entryRuleEnumPropertyId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumPropertyId = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:727:2: (iv_ruleEnumPropertyId= ruleEnumPropertyId EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:728:2: iv_ruleEnumPropertyId= ruleEnumPropertyId EOF
            {
             newCompositeNode(grammarAccess.getEnumPropertyIdRule()); 
            pushFollow(FOLLOW_ruleEnumPropertyId_in_entryRuleEnumPropertyId1563);
            iv_ruleEnumPropertyId=ruleEnumPropertyId();

            state._fsp--;

             current =iv_ruleEnumPropertyId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyId1573); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumPropertyId"


    // $ANTLR start "ruleEnumPropertyId"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:735:1: ruleEnumPropertyId returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumPropertyId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:738:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:739:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:739:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:740:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:740:1: (lv_name_0_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:741:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumPropertyId1614); 

            			newLeafNode(lv_name_0_0, grammarAccess.getEnumPropertyIdAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEnumPropertyIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumPropertyId"


    // $ANTLR start "entryRuleConst"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:765:1: entryRuleConst returns [EObject current=null] : iv_ruleConst= ruleConst EOF ;
    public final EObject entryRuleConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConst = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:766:2: (iv_ruleConst= ruleConst EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:767:2: iv_ruleConst= ruleConst EOF
            {
             newCompositeNode(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_ruleConst_in_entryRuleConst1654);
            iv_ruleConst=ruleConst();

            state._fsp--;

             current =iv_ruleConst; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst1664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:774:1: ruleConst returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleConstProperty ) )* otherlv_5= '}' ) ;
    public final EObject ruleConst() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:777:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleConstProperty ) )* otherlv_5= '}' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:778:1: ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleConstProperty ) )* otherlv_5= '}' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:778:1: ( ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleConstProperty ) )* otherlv_5= '}' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:778:2: ( (lv_comment_0_0= ruleCommentType ) )* otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_properties_4_0= ruleConstProperty ) )* otherlv_5= '}'
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:778:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_SL_COMMENT && LA12_0<=RULE_ML_COMMENT)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:779:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:779:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:780:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleConst1710);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleConst1723); 

                	newLeafNode(otherlv_1, grammarAccess.getConstAccess().getConstKeyword_1());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:800:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:801:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:801:1: (lv_name_2_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:802:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConst1740); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleConst1757); 

                	newLeafNode(otherlv_3, grammarAccess.getConstAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:822:1: ( (lv_properties_4_0= ruleConstProperty ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||(LA13_0>=RULE_SL_COMMENT && LA13_0<=RULE_ML_COMMENT)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:823:1: (lv_properties_4_0= ruleConstProperty )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:823:1: (lv_properties_4_0= ruleConstProperty )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:824:3: lv_properties_4_0= ruleConstProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstAccess().getPropertiesConstPropertyParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstProperty_in_ruleConst1778);
            	    lv_properties_4_0=ruleConstProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_4_0, 
            	            		"ConstProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleConst1791); 

                	newLeafNode(otherlv_5, grammarAccess.getConstAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleConstProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:852:1: entryRuleConstProperty returns [EObject current=null] : iv_ruleConstProperty= ruleConstProperty EOF ;
    public final EObject entryRuleConstProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstProperty = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:853:2: (iv_ruleConstProperty= ruleConstProperty EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:854:2: iv_ruleConstProperty= ruleConstProperty EOF
            {
             newCompositeNode(grammarAccess.getConstPropertyRule()); 
            pushFollow(FOLLOW_ruleConstProperty_in_entryRuleConstProperty1827);
            iv_ruleConstProperty=ruleConstProperty();

            state._fsp--;

             current =iv_ruleConstProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstProperty1837); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstProperty"


    // $ANTLR start "ruleConstProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:861:1: ruleConstProperty returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleConstPropertyId ) ) otherlv_2= '=' ( (lv_val_3_0= ruleConstValueType ) ) ( ruleLineTerm )? ) ;
    public final EObject ruleConstProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_name_1_0 = null;

        EObject lv_val_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:864:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleConstPropertyId ) ) otherlv_2= '=' ( (lv_val_3_0= ruleConstValueType ) ) ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:865:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleConstPropertyId ) ) otherlv_2= '=' ( (lv_val_3_0= ruleConstValueType ) ) ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:865:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleConstPropertyId ) ) otherlv_2= '=' ( (lv_val_3_0= ruleConstValueType ) ) ( ruleLineTerm )? )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:865:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_name_1_0= ruleConstPropertyId ) ) otherlv_2= '=' ( (lv_val_3_0= ruleConstValueType ) ) ( ruleLineTerm )?
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:865:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_SL_COMMENT && LA14_0<=RULE_ML_COMMENT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:866:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:866:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:867:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleConstProperty1883);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:883:3: ( (lv_name_1_0= ruleConstPropertyId ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:884:1: (lv_name_1_0= ruleConstPropertyId )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:884:1: (lv_name_1_0= ruleConstPropertyId )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:885:3: lv_name_1_0= ruleConstPropertyId
            {
             
            	        newCompositeNode(grammarAccess.getConstPropertyAccess().getNameConstPropertyIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConstPropertyId_in_ruleConstProperty1905);
            lv_name_1_0=ruleConstPropertyId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ConstPropertyId");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleConstProperty1917); 

                	newLeafNode(otherlv_2, grammarAccess.getConstPropertyAccess().getEqualsSignKeyword_2());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:905:1: ( (lv_val_3_0= ruleConstValueType ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:906:1: (lv_val_3_0= ruleConstValueType )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:906:1: (lv_val_3_0= ruleConstValueType )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:907:3: lv_val_3_0= ruleConstValueType
            {
             
            	        newCompositeNode(grammarAccess.getConstPropertyAccess().getValConstValueTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConstValueType_in_ruleConstProperty1938);
            lv_val_3_0=ruleConstValueType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"val",
                    		lv_val_3_0, 
                    		"ConstValueType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:923:2: ( ruleLineTerm )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=13 && LA15_0<=14)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:924:5: ruleLineTerm
                    {
                     
                            newCompositeNode(grammarAccess.getConstPropertyAccess().getLineTermParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineTerm_in_ruleConstProperty1955);
                    ruleLineTerm();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstProperty"


    // $ANTLR start "entryRuleConstValueType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:939:1: entryRuleConstValueType returns [EObject current=null] : iv_ruleConstValueType= ruleConstValueType EOF ;
    public final EObject entryRuleConstValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstValueType = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:940:2: (iv_ruleConstValueType= ruleConstValueType EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:941:2: iv_ruleConstValueType= ruleConstValueType EOF
            {
             newCompositeNode(grammarAccess.getConstValueTypeRule()); 
            pushFollow(FOLLOW_ruleConstValueType_in_entryRuleConstValueType1992);
            iv_ruleConstValueType=ruleConstValueType();

            state._fsp--;

             current =iv_ruleConstValueType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstValueType2002); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstValueType"


    // $ANTLR start "ruleConstValueType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:948:1: ruleConstValueType returns [EObject current=null] : ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_boolVal_1_0= RULE_BOOL ) ) | ( (lv_numVal_2_0= ruleConstNumValue ) ) ) ;
    public final EObject ruleConstValueType() throws RecognitionException {
        EObject current = null;

        Token lv_stringVal_0_0=null;
        Token lv_boolVal_1_0=null;
        AntlrDatatypeRuleToken lv_numVal_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:951:28: ( ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_boolVal_1_0= RULE_BOOL ) ) | ( (lv_numVal_2_0= ruleConstNumValue ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:952:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_boolVal_1_0= RULE_BOOL ) ) | ( (lv_numVal_2_0= ruleConstNumValue ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:952:1: ( ( (lv_stringVal_0_0= RULE_STRING ) ) | ( (lv_boolVal_1_0= RULE_BOOL ) ) | ( (lv_numVal_2_0= ruleConstNumValue ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_BOOL:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
            case 24:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:952:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:952:2: ( (lv_stringVal_0_0= RULE_STRING ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:953:1: (lv_stringVal_0_0= RULE_STRING )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:953:1: (lv_stringVal_0_0= RULE_STRING )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:954:3: lv_stringVal_0_0= RULE_STRING
                    {
                    lv_stringVal_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstValueType2044); 

                    			newLeafNode(lv_stringVal_0_0, grammarAccess.getConstValueTypeAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstValueTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringVal",
                            		lv_stringVal_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:971:6: ( (lv_boolVal_1_0= RULE_BOOL ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:971:6: ( (lv_boolVal_1_0= RULE_BOOL ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:972:1: (lv_boolVal_1_0= RULE_BOOL )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:972:1: (lv_boolVal_1_0= RULE_BOOL )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:973:3: lv_boolVal_1_0= RULE_BOOL
                    {
                    lv_boolVal_1_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleConstValueType2072); 

                    			newLeafNode(lv_boolVal_1_0, grammarAccess.getConstValueTypeAccess().getBoolValBOOLTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstValueTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"boolVal",
                            		lv_boolVal_1_0, 
                            		"BOOL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:990:6: ( (lv_numVal_2_0= ruleConstNumValue ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:990:6: ( (lv_numVal_2_0= ruleConstNumValue ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:991:1: (lv_numVal_2_0= ruleConstNumValue )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:991:1: (lv_numVal_2_0= ruleConstNumValue )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:992:3: lv_numVal_2_0= ruleConstNumValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstValueTypeAccess().getNumValConstNumValueParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstNumValue_in_ruleConstValueType2104);
                    lv_numVal_2_0=ruleConstNumValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstValueTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"numVal",
                            		lv_numVal_2_0, 
                            		"ConstNumValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstValueType"


    // $ANTLR start "entryRuleConstNumValue"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1016:1: entryRuleConstNumValue returns [String current=null] : iv_ruleConstNumValue= ruleConstNumValue EOF ;
    public final String entryRuleConstNumValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstNumValue = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1017:2: (iv_ruleConstNumValue= ruleConstNumValue EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1018:2: iv_ruleConstNumValue= ruleConstNumValue EOF
            {
             newCompositeNode(grammarAccess.getConstNumValueRule()); 
            pushFollow(FOLLOW_ruleConstNumValue_in_entryRuleConstNumValue2141);
            iv_ruleConstNumValue=ruleConstNumValue();

            state._fsp--;

             current =iv_ruleConstNumValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstNumValue2152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstNumValue"


    // $ANTLR start "ruleConstNumValue"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1025:1: ruleConstNumValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleConstNumValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1028:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1029:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1029:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1029:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1029:2: (kw= '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1030:2: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleConstNumValue2191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstNumValueAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstNumValue2208); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_1()); 
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1042:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==16) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1043:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleConstNumValue2227); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstNumValueAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstNumValue2242); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstNumValue"


    // $ANTLR start "entryRuleConstPropertyId"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1063:1: entryRuleConstPropertyId returns [EObject current=null] : iv_ruleConstPropertyId= ruleConstPropertyId EOF ;
    public final EObject entryRuleConstPropertyId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstPropertyId = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1064:2: (iv_ruleConstPropertyId= ruleConstPropertyId EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1065:2: iv_ruleConstPropertyId= ruleConstPropertyId EOF
            {
             newCompositeNode(grammarAccess.getConstPropertyIdRule()); 
            pushFollow(FOLLOW_ruleConstPropertyId_in_entryRuleConstPropertyId2289);
            iv_ruleConstPropertyId=ruleConstPropertyId();

            state._fsp--;

             current =iv_ruleConstPropertyId; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstPropertyId2299); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstPropertyId"


    // $ANTLR start "ruleConstPropertyId"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1072:1: ruleConstPropertyId returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstPropertyId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1075:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1076:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1076:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1077:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1077:1: (lv_name_0_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1078:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstPropertyId2340); 

            			newLeafNode(lv_name_0_0, grammarAccess.getConstPropertyIdAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstPropertyIdRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstPropertyId"


    // $ANTLR start "entryRuleStruct"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1102:1: entryRuleStruct returns [EObject current=null] : iv_ruleStruct= ruleStruct EOF ;
    public final EObject entryRuleStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStruct = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1103:2: (iv_ruleStruct= ruleStruct EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1104:2: iv_ruleStruct= ruleStruct EOF
            {
             newCompositeNode(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct2380);
            iv_ruleStruct=ruleStruct();

            state._fsp--;

             current =iv_ruleStruct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct2390); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1111:1: ruleStruct returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'struct' (otherlv_3= 'abstract' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* otherlv_9= '}' ) ;
    public final EObject ruleStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_properties_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1114:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'struct' (otherlv_3= 'abstract' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* otherlv_9= '}' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1115:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'struct' (otherlv_3= 'abstract' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* otherlv_9= '}' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1115:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'struct' (otherlv_3= 'abstract' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* otherlv_9= '}' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1115:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'struct' (otherlv_3= 'abstract' )? ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_properties_8_0= ruleProperty ) )* otherlv_9= '}'
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1115:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SL_COMMENT && LA19_0<=RULE_ML_COMMENT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1116:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1116:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1117:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleStruct2436);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1133:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ATTR||LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1134:1: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1134:1: (lv_attributes_1_0= ruleAttribute )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1135:3: lv_attributes_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructAccess().getAttributesAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleStruct2458);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleStruct2471); 

                	newLeafNode(otherlv_2, grammarAccess.getStructAccess().getStructKeyword_2());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1155:1: (otherlv_3= 'abstract' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1155:3: otherlv_3= 'abstract'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleStruct2484); 

                        	newLeafNode(otherlv_3, grammarAccess.getStructAccess().getAbstractKeyword_3());
                        

                    }
                    break;

            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1159:3: ( (lv_name_4_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1160:1: (lv_name_4_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1160:1: (lv_name_4_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1161:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct2503); 

            			newLeafNode(lv_name_4_0, grammarAccess.getStructAccess().getNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"ID");
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1177:2: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1177:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleStruct2521); 

                        	newLeafNode(otherlv_5, grammarAccess.getStructAccess().getExtendsKeyword_5_0());
                        
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1181:1: ( (otherlv_6= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1182:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1182:1: (otherlv_6= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1183:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStruct2541); 

                    		newLeafNode(otherlv_6, grammarAccess.getStructAccess().getSuperTypeStructCrossReference_5_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStruct2555); 

                	newLeafNode(otherlv_7, grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_6());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1198:1: ( (lv_properties_8_0= ruleProperty ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=RULE_SL_COMMENT && LA23_0<=RULE_ATTR)||LA23_0==32||(LA23_0>=35 && LA23_0<=52)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1199:1: (lv_properties_8_0= ruleProperty )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1199:1: (lv_properties_8_0= ruleProperty )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1200:3: lv_properties_8_0= ruleProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructAccess().getPropertiesPropertyParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleProperty_in_ruleStruct2576);
            	    lv_properties_8_0=ruleProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_8_0, 
            	            		"Property");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleStruct2589); 

                	newLeafNode(otherlv_9, grammarAccess.getStructAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1228:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1229:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1230:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty2625);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty2635); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1237:1: ruleProperty returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= rulePropertyValue ) ) ( ruleLineTerm )? ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_dateType_2_0 = null;

        EObject lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1240:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= rulePropertyValue ) ) ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1241:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= rulePropertyValue ) ) ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1241:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= rulePropertyValue ) ) ( ruleLineTerm )? )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1241:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) ( (lv_name_4_0= rulePropertyValue ) ) ( ruleLineTerm )?
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1241:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_SL_COMMENT && LA24_0<=RULE_ML_COMMENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1242:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1242:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1243:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleProperty2681);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1259:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ATTR||LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1260:1: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1260:1: (lv_attributes_1_0= ruleAttribute )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1261:3: lv_attributes_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyAccess().getAttributesAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleProperty2703);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1277:3: ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32||LA26_0==35||(LA26_0>=37 && LA26_0<=52)) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1277:4: ( (lv_dateType_2_0= ruleDataTypeReference ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1277:4: ( (lv_dateType_2_0= ruleDataTypeReference ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1278:1: (lv_dateType_2_0= ruleDataTypeReference )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1278:1: (lv_dateType_2_0= ruleDataTypeReference )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1279:3: lv_dateType_2_0= ruleDataTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeReference_in_ruleProperty2726);
                    lv_dateType_2_0=ruleDataTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"dateType",
                            		lv_dateType_2_0, 
                            		"DataTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1296:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1296:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1297:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1297:1: (otherlv_3= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1298:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty2752); 

                    		newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1309:3: ( (lv_name_4_0= rulePropertyValue ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1310:1: (lv_name_4_0= rulePropertyValue )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1310:1: (lv_name_4_0= rulePropertyValue )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1311:3: lv_name_4_0= rulePropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getNamePropertyValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePropertyValue_in_ruleProperty2774);
            lv_name_4_0=rulePropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"PropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1327:2: ( ruleLineTerm )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=13 && LA27_0<=14)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1328:5: ruleLineTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyAccess().getLineTermParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLineTerm_in_ruleProperty2791);
                    ruleLineTerm();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyValue"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1343:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1344:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1345:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue2828);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue2838); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1352:1: rulePropertyValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1355:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1356:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1356:1: ( (lv_name_0_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1357:1: (lv_name_0_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1357:1: (lv_name_0_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1358:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyValue2879); 

            			newLeafNode(lv_name_0_0, grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleService"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1382:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1383:2: (iv_ruleService= ruleService EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1384:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2919);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2929); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1391:1: ruleService returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'service' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_serviceMethods_5_0= ruleServiceMethod ) )* otherlv_6= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_serviceMethods_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1394:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'service' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_serviceMethods_5_0= ruleServiceMethod ) )* otherlv_6= '}' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1395:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'service' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_serviceMethods_5_0= ruleServiceMethod ) )* otherlv_6= '}' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1395:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'service' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_serviceMethods_5_0= ruleServiceMethod ) )* otherlv_6= '}' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1395:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* otherlv_2= 'service' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_serviceMethods_5_0= ruleServiceMethod ) )* otherlv_6= '}'
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1395:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SL_COMMENT && LA28_0<=RULE_ML_COMMENT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1396:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1396:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1397:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleService2975);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1413:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ATTR||LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1414:1: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1414:1: (lv_attributes_1_0= ruleAttribute )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1415:3: lv_attributes_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getAttributesAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleService2997);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleService3010); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getServiceKeyword_2());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1435:1: ( (lv_name_3_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1436:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1436:1: (lv_name_3_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1437:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService3027); 

            			newLeafNode(lv_name_3_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleService3044); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1457:1: ( (lv_serviceMethods_5_0= ruleServiceMethod ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||(LA30_0>=RULE_SL_COMMENT && LA30_0<=RULE_ATTR)||(LA30_0>=31 && LA30_0<=32)||(LA30_0>=35 && LA30_0<=52)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1458:1: (lv_serviceMethods_5_0= ruleServiceMethod )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1458:1: (lv_serviceMethods_5_0= ruleServiceMethod )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1459:3: lv_serviceMethods_5_0= ruleServiceMethod
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceAccess().getServiceMethodsServiceMethodParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceMethod_in_ruleService3065);
            	    lv_serviceMethods_5_0=ruleServiceMethod();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"serviceMethods",
            	            		lv_serviceMethods_5_0, 
            	            		"ServiceMethod");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleService3078); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceMethod"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1487:1: entryRuleServiceMethod returns [EObject current=null] : iv_ruleServiceMethod= ruleServiceMethod EOF ;
    public final EObject entryRuleServiceMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethod = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1488:2: (iv_ruleServiceMethod= ruleServiceMethod EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1489:2: iv_ruleServiceMethod= ruleServiceMethod EOF
            {
             newCompositeNode(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod3114);
            iv_ruleServiceMethod=ruleServiceMethod();

            state._fsp--;

             current =iv_ruleServiceMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod3124); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1496:1: ruleServiceMethod returns [EObject current=null] : ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( (lv_return_2_0= ruleServiceMethodReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= ')' ( ruleLineTerm )? ) ;
    public final EObject ruleServiceMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_comment_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_return_2_0 = null;

        EObject lv_properties_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1499:28: ( ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( (lv_return_2_0= ruleServiceMethodReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= ')' ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1500:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( (lv_return_2_0= ruleServiceMethodReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= ')' ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1500:1: ( ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( (lv_return_2_0= ruleServiceMethodReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= ')' ( ruleLineTerm )? )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1500:2: ( (lv_comment_0_0= ruleCommentType ) )* ( (lv_attributes_1_0= ruleAttribute ) )* ( (lv_return_2_0= ruleServiceMethodReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_properties_5_0= ruleServiceProperty ) )* otherlv_6= ')' ( ruleLineTerm )?
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1500:2: ( (lv_comment_0_0= ruleCommentType ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_SL_COMMENT && LA31_0<=RULE_ML_COMMENT)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1501:1: (lv_comment_0_0= ruleCommentType )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1501:1: (lv_comment_0_0= ruleCommentType )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1502:3: lv_comment_0_0= ruleCommentType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceMethodAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCommentType_in_ruleServiceMethod3170);
            	    lv_comment_0_0=ruleCommentType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"comment",
            	            		lv_comment_0_0, 
            	            		"CommentType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1518:3: ( (lv_attributes_1_0= ruleAttribute ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ATTR||LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1519:1: (lv_attributes_1_0= ruleAttribute )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1519:1: (lv_attributes_1_0= ruleAttribute )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1520:3: lv_attributes_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceMethodAccess().getAttributesAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleServiceMethod3192);
            	    lv_attributes_1_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1536:3: ( (lv_return_2_0= ruleServiceMethodReturnType ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1537:1: (lv_return_2_0= ruleServiceMethodReturnType )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1537:1: (lv_return_2_0= ruleServiceMethodReturnType )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1538:3: lv_return_2_0= ruleServiceMethodReturnType
            {
             
            	        newCompositeNode(grammarAccess.getServiceMethodAccess().getReturnServiceMethodReturnTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleServiceMethodReturnType_in_ruleServiceMethod3214);
            lv_return_2_0=ruleServiceMethodReturnType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceMethodRule());
            	        }
                   		set(
                   			current, 
                   			"return",
                    		lv_return_2_0, 
                    		"ServiceMethodReturnType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1554:2: ( (lv_name_3_0= RULE_ID ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1555:1: (lv_name_3_0= RULE_ID )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1555:1: (lv_name_3_0= RULE_ID )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1556:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceMethod3231); 

            			newLeafNode(lv_name_3_0, grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleServiceMethod3248); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceMethodAccess().getLeftParenthesisKeyword_4());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1576:1: ( (lv_properties_5_0= ruleServiceProperty ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=RULE_SL_COMMENT && LA33_0<=RULE_ATTR)||LA33_0==32||(LA33_0>=35 && LA33_0<=52)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1577:1: (lv_properties_5_0= ruleServiceProperty )
            	    {
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1577:1: (lv_properties_5_0= ruleServiceProperty )
            	    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1578:3: lv_properties_5_0= ruleServiceProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getServiceMethodAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleServiceProperty_in_ruleServiceMethod3269);
            	    lv_properties_5_0=ruleServiceProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getServiceMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_5_0, 
            	            		"ServiceProperty");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleServiceMethod3282); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceMethodAccess().getRightParenthesisKeyword_6());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1598:1: ( ruleLineTerm )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=13 && LA34_0<=14)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1599:5: ruleLineTerm
                    {
                     
                            newCompositeNode(grammarAccess.getServiceMethodAccess().getLineTermParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleLineTerm_in_ruleServiceMethod3299);
                    ruleLineTerm();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleServiceProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1614:1: entryRuleServiceProperty returns [EObject current=null] : iv_ruleServiceProperty= ruleServiceProperty EOF ;
    public final EObject entryRuleServiceProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceProperty = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1615:2: (iv_ruleServiceProperty= ruleServiceProperty EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1616:2: iv_ruleServiceProperty= ruleServiceProperty EOF
            {
             newCompositeNode(grammarAccess.getServicePropertyRule()); 
            pushFollow(FOLLOW_ruleServiceProperty_in_entryRuleServiceProperty3336);
            iv_ruleServiceProperty=ruleServiceProperty();

            state._fsp--;

             current =iv_ruleServiceProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProperty3346); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceProperty"


    // $ANTLR start "ruleServiceProperty"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1623:1: ruleServiceProperty returns [EObject current=null] : ( (lv_name_0_0= ruleProperty ) ) ;
    public final EObject ruleServiceProperty() throws RecognitionException {
        EObject current = null;

        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1626:28: ( ( (lv_name_0_0= ruleProperty ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1627:1: ( (lv_name_0_0= ruleProperty ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1627:1: ( (lv_name_0_0= ruleProperty ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1628:1: (lv_name_0_0= ruleProperty )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1628:1: (lv_name_0_0= ruleProperty )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1629:3: lv_name_0_0= ruleProperty
            {
             
            	        newCompositeNode(grammarAccess.getServicePropertyAccess().getNamePropertyParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleProperty_in_ruleServiceProperty3391);
            lv_name_0_0=ruleProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServicePropertyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Property");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceProperty"


    // $ANTLR start "entryRuleServiceMethodReturnType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1653:1: entryRuleServiceMethodReturnType returns [EObject current=null] : iv_ruleServiceMethodReturnType= ruleServiceMethodReturnType EOF ;
    public final EObject entryRuleServiceMethodReturnType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceMethodReturnType = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1654:2: (iv_ruleServiceMethodReturnType= ruleServiceMethodReturnType EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1655:2: iv_ruleServiceMethodReturnType= ruleServiceMethodReturnType EOF
            {
             newCompositeNode(grammarAccess.getServiceMethodReturnTypeRule()); 
            pushFollow(FOLLOW_ruleServiceMethodReturnType_in_entryRuleServiceMethodReturnType3426);
            iv_ruleServiceMethodReturnType=ruleServiceMethodReturnType();

            state._fsp--;

             current =iv_ruleServiceMethodReturnType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethodReturnType3436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceMethodReturnType"


    // $ANTLR start "ruleServiceMethodReturnType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1662:1: ruleServiceMethodReturnType returns [EObject current=null] : ( ( (lv_voidType_0_0= 'void' ) ) | ( (lv_dataType_1_0= ruleDataTypeReference ) ) | ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleServiceMethodReturnType() throws RecognitionException {
        EObject current = null;

        Token lv_voidType_0_0=null;
        Token otherlv_2=null;
        EObject lv_dataType_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1665:28: ( ( ( (lv_voidType_0_0= 'void' ) ) | ( (lv_dataType_1_0= ruleDataTypeReference ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1666:1: ( ( (lv_voidType_0_0= 'void' ) ) | ( (lv_dataType_1_0= ruleDataTypeReference ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1666:1: ( ( (lv_voidType_0_0= 'void' ) ) | ( (lv_dataType_1_0= ruleDataTypeReference ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt35=1;
                }
                break;
            case 32:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1666:2: ( (lv_voidType_0_0= 'void' ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1666:2: ( (lv_voidType_0_0= 'void' ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1667:1: (lv_voidType_0_0= 'void' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1667:1: (lv_voidType_0_0= 'void' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1668:3: lv_voidType_0_0= 'void'
                    {
                    lv_voidType_0_0=(Token)match(input,31,FOLLOW_31_in_ruleServiceMethodReturnType3479); 

                            newLeafNode(lv_voidType_0_0, grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeVoidKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceMethodReturnTypeRule());
                    	        }
                           		setWithLastConsumed(current, "voidType", lv_voidType_0_0, "void");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1682:6: ( (lv_dataType_1_0= ruleDataTypeReference ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1682:6: ( (lv_dataType_1_0= ruleDataTypeReference ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1683:1: (lv_dataType_1_0= ruleDataTypeReference )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1683:1: (lv_dataType_1_0= ruleDataTypeReference )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1684:3: lv_dataType_1_0= ruleDataTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getServiceMethodReturnTypeAccess().getDataTypeDataTypeReferenceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeReference_in_ruleServiceMethodReturnType3519);
                    lv_dataType_1_0=ruleDataTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getServiceMethodReturnTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"dataType",
                            		lv_dataType_1_0, 
                            		"DataTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1701:6: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1701:6: ( (otherlv_2= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1702:1: (otherlv_2= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1702:1: (otherlv_2= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1703:3: otherlv_2= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getServiceMethodReturnTypeRule());
                    	        }
                            
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleServiceMethodReturnType3545); 

                    		newLeafNode(otherlv_2, grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceMethodReturnType"


    // $ANTLR start "entryRuleDataTypeReference"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1722:1: entryRuleDataTypeReference returns [EObject current=null] : iv_ruleDataTypeReference= ruleDataTypeReference EOF ;
    public final EObject entryRuleDataTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeReference = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1723:2: (iv_ruleDataTypeReference= ruleDataTypeReference EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1724:2: iv_ruleDataTypeReference= ruleDataTypeReference EOF
            {
             newCompositeNode(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_entryRuleDataTypeReference3581);
            iv_ruleDataTypeReference=ruleDataTypeReference();

            state._fsp--;

             current =iv_ruleDataTypeReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeReference3591); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1731:1: ruleDataTypeReference returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataTypeEnum ) ) | this_ListType_1= ruleListType | this_MapType_2= ruleMapType ) ;
    public final EObject ruleDataTypeReference() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_0_0 = null;

        EObject this_ListType_1 = null;

        EObject this_MapType_2 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1734:28: ( ( ( (lv_type_0_0= ruleDataTypeEnum ) ) | this_ListType_1= ruleListType | this_MapType_2= ruleMapType ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1735:1: ( ( (lv_type_0_0= ruleDataTypeEnum ) ) | this_ListType_1= ruleListType | this_MapType_2= ruleMapType )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1735:1: ( ( (lv_type_0_0= ruleDataTypeEnum ) ) | this_ListType_1= ruleListType | this_MapType_2= ruleMapType )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                {
                alt36=1;
                }
                break;
            case 32:
                {
                alt36=2;
                }
                break;
            case 35:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1735:2: ( (lv_type_0_0= ruleDataTypeEnum ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1735:2: ( (lv_type_0_0= ruleDataTypeEnum ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1736:1: (lv_type_0_0= ruleDataTypeEnum )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1736:1: (lv_type_0_0= ruleDataTypeEnum )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1737:3: lv_type_0_0= ruleDataTypeEnum
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeEnum_in_ruleDataTypeReference3637);
                    lv_type_0_0=ruleDataTypeEnum();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataTypeReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_0, 
                            		"DataTypeEnum");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1755:5: this_ListType_1= ruleListType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeReferenceAccess().getListTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListType_in_ruleDataTypeReference3665);
                    this_ListType_1=ruleListType();

                    state._fsp--;

                     
                            current = this_ListType_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1765:5: this_MapType_2= ruleMapType
                    {
                     
                            newCompositeNode(grammarAccess.getDataTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMapType_in_ruleDataTypeReference3692);
                    this_MapType_2=ruleMapType();

                    state._fsp--;

                     
                            current = this_MapType_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleListType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1783:1: entryRuleListType returns [EObject current=null] : iv_ruleListType= ruleListType EOF ;
    public final EObject entryRuleListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListType = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1784:2: (iv_ruleListType= ruleListType EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1785:2: iv_ruleListType= ruleListType EOF
            {
             newCompositeNode(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType3729);
            iv_ruleListType=ruleListType();

            state._fsp--;

             current =iv_ruleListType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType3739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1792:1: ruleListType returns [EObject current=null] : (otherlv_0= 'list' otherlv_1= '<' ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '>' ) ;
    public final EObject ruleListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_dateType_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1795:28: ( (otherlv_0= 'list' otherlv_1= '<' ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '>' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1796:1: (otherlv_0= 'list' otherlv_1= '<' ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '>' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1796:1: (otherlv_0= 'list' otherlv_1= '<' ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '>' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1796:3: otherlv_0= 'list' otherlv_1= '<' ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleListType3776); 

                	newLeafNode(otherlv_0, grammarAccess.getListTypeAccess().getListKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleListType3788); 

                	newLeafNode(otherlv_1, grammarAccess.getListTypeAccess().getLessThanSignKeyword_1());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1804:1: ( ( (lv_dateType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32||LA37_0==35||(LA37_0>=37 && LA37_0<=52)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1804:2: ( (lv_dateType_2_0= ruleDataTypeReference ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1804:2: ( (lv_dateType_2_0= ruleDataTypeReference ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1805:1: (lv_dateType_2_0= ruleDataTypeReference )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1805:1: (lv_dateType_2_0= ruleDataTypeReference )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1806:3: lv_dateType_2_0= ruleDataTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getListTypeAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeReference_in_ruleListType3810);
                    lv_dateType_2_0=ruleDataTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"dateType",
                            		lv_dateType_2_0, 
                            		"DataTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1823:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1823:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1824:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1824:1: (otherlv_3= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1825:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getListTypeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleListType3836); 

                    		newLeafNode(otherlv_3, grammarAccess.getListTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleListType3849); 

                	newLeafNode(otherlv_4, grammarAccess.getListTypeAccess().getGreaterThanSignKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleMapType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1848:1: entryRuleMapType returns [EObject current=null] : iv_ruleMapType= ruleMapType EOF ;
    public final EObject entryRuleMapType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapType = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1849:2: (iv_ruleMapType= ruleMapType EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1850:2: iv_ruleMapType= ruleMapType EOF
            {
             newCompositeNode(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType3885);
            iv_ruleMapType=ruleMapType();

            state._fsp--;

             current =iv_ruleMapType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType3895); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1857:1: ruleMapType returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '<' ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '>' ) ;
    public final EObject ruleMapType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_keyDataType_2_0 = null;

        EObject lv_valDataType_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1860:28: ( (otherlv_0= 'map' otherlv_1= '<' ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '>' ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1861:1: (otherlv_0= 'map' otherlv_1= '<' ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '>' )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1861:1: (otherlv_0= 'map' otherlv_1= '<' ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '>' )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1861:3: otherlv_0= 'map' otherlv_1= '<' ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= '>'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleMapType3932); 

                	newLeafNode(otherlv_0, grammarAccess.getMapTypeAccess().getMapKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleMapType3944); 

                	newLeafNode(otherlv_1, grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1869:1: ( ( (lv_keyDataType_2_0= ruleDataTypeReference ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32||LA38_0==35||(LA38_0>=37 && LA38_0<=52)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ID) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1869:2: ( (lv_keyDataType_2_0= ruleDataTypeReference ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1869:2: ( (lv_keyDataType_2_0= ruleDataTypeReference ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1870:1: (lv_keyDataType_2_0= ruleDataTypeReference )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1870:1: (lv_keyDataType_2_0= ruleDataTypeReference )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1871:3: lv_keyDataType_2_0= ruleDataTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getKeyDataTypeDataTypeReferenceParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeReference_in_ruleMapType3966);
                    lv_keyDataType_2_0=ruleDataTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"keyDataType",
                            		lv_keyDataType_2_0, 
                            		"DataTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1888:6: ( (otherlv_3= RULE_ID ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1888:6: ( (otherlv_3= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1889:1: (otherlv_3= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1889:1: (otherlv_3= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1890:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapTypeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapType3992); 

                    		newLeafNode(otherlv_3, grammarAccess.getMapTypeAccess().getKeyElementTypeElementTypeReferenceCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleMapType4005); 

                	newLeafNode(otherlv_4, grammarAccess.getMapTypeAccess().getCommaKeyword_3());
                
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1905:1: ( ( (lv_valDataType_5_0= ruleDataTypeReference ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==32||LA39_0==35||(LA39_0>=37 && LA39_0<=52)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1905:2: ( (lv_valDataType_5_0= ruleDataTypeReference ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1905:2: ( (lv_valDataType_5_0= ruleDataTypeReference ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1906:1: (lv_valDataType_5_0= ruleDataTypeReference )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1906:1: (lv_valDataType_5_0= ruleDataTypeReference )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1907:3: lv_valDataType_5_0= ruleDataTypeReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapTypeAccess().getValDataTypeDataTypeReferenceParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataTypeReference_in_ruleMapType4027);
                    lv_valDataType_5_0=ruleDataTypeReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"valDataType",
                            		lv_valDataType_5_0, 
                            		"DataTypeReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1924:6: ( (otherlv_6= RULE_ID ) )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1924:6: ( (otherlv_6= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1925:1: (otherlv_6= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1925:1: (otherlv_6= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1926:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapTypeRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapType4053); 

                    		newLeafNode(otherlv_6, grammarAccess.getMapTypeAccess().getValElementTypeElementTypeReferenceCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_34_in_ruleMapType4066); 

                	newLeafNode(otherlv_7, grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleCommentType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1949:1: entryRuleCommentType returns [String current=null] : iv_ruleCommentType= ruleCommentType EOF ;
    public final String entryRuleCommentType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCommentType = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1950:2: (iv_ruleCommentType= ruleCommentType EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1951:2: iv_ruleCommentType= ruleCommentType EOF
            {
             newCompositeNode(grammarAccess.getCommentTypeRule()); 
            pushFollow(FOLLOW_ruleCommentType_in_entryRuleCommentType4103);
            iv_ruleCommentType=ruleCommentType();

            state._fsp--;

             current =iv_ruleCommentType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentType4114); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentType"


    // $ANTLR start "ruleCommentType"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1958:1: ruleCommentType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SL_COMMENT_0= RULE_SL_COMMENT | this_ML_COMMENT_1= RULE_ML_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleCommentType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SL_COMMENT_0=null;
        Token this_ML_COMMENT_1=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1961:28: ( (this_SL_COMMENT_0= RULE_SL_COMMENT | this_ML_COMMENT_1= RULE_ML_COMMENT ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1962:1: (this_SL_COMMENT_0= RULE_SL_COMMENT | this_ML_COMMENT_1= RULE_ML_COMMENT )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1962:1: (this_SL_COMMENT_0= RULE_SL_COMMENT | this_ML_COMMENT_1= RULE_ML_COMMENT )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_SL_COMMENT) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ML_COMMENT) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1962:6: this_SL_COMMENT_0= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleCommentType4154); 

                    		current.merge(this_SL_COMMENT_0);
                        
                     
                        newLeafNode(this_SL_COMMENT_0, grammarAccess.getCommentTypeAccess().getSL_COMMENTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1970:10: this_ML_COMMENT_1= RULE_ML_COMMENT
                    {
                    this_ML_COMMENT_1=(Token)match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_ruleCommentType4180); 

                    		current.merge(this_ML_COMMENT_1);
                        
                     
                        newLeafNode(this_ML_COMMENT_1, grammarAccess.getCommentTypeAccess().getML_COMMENTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentType"


    // $ANTLR start "entryRuleAttribute"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1985:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1986:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1987:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute4225);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute4235); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1994:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )? ( (lv_attr_2_0= RULE_ATTR ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_scope_1_0=null;
        Token lv_attr_2_0=null;

         enterRule(); 
            
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1997:28: ( ( (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )? ( (lv_attr_2_0= RULE_ATTR ) ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1998:1: ( (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )? ( (lv_attr_2_0= RULE_ATTR ) ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1998:1: ( (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )? ( (lv_attr_2_0= RULE_ATTR ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1998:2: (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )? ( (lv_attr_2_0= RULE_ATTR ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1998:2: (otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==36) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:1998:4: otherlv_0= '@' ( (lv_scope_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAttribute4273); 

                        	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0_0());
                        
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2002:1: ( (lv_scope_1_0= RULE_ID ) )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2003:1: (lv_scope_1_0= RULE_ID )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2003:1: (lv_scope_1_0= RULE_ID )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2004:3: lv_scope_1_0= RULE_ID
                    {
                    lv_scope_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute4290); 

                    			newLeafNode(lv_scope_1_0, grammarAccess.getAttributeAccess().getScopeIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"scope",
                            		lv_scope_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2020:4: ( (lv_attr_2_0= RULE_ATTR ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2021:1: (lv_attr_2_0= RULE_ATTR )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2021:1: (lv_attr_2_0= RULE_ATTR )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2022:3: lv_attr_2_0= RULE_ATTR
            {
            lv_attr_2_0=(Token)match(input,RULE_ATTR,FOLLOW_RULE_ATTR_in_ruleAttribute4314); 

            			newLeafNode(lv_attr_2_0, grammarAccess.getAttributeAccess().getAttrATTRTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attr",
                    		lv_attr_2_0, 
                    		"ATTR");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleDataTypeEnum"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2046:1: ruleDataTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'uint16' ) | (enumLiteral_3= 'uint32' ) | (enumLiteral_4= 'uint64' ) | (enumLiteral_5= 'sbyte' ) | (enumLiteral_6= 'int16' ) | (enumLiteral_7= 'int32' ) | (enumLiteral_8= 'int64' ) | (enumLiteral_9= 'float32' ) | (enumLiteral_10= 'float64' ) | (enumLiteral_11= 'string' ) | (enumLiteral_12= 'datetime' ) | (enumLiteral_13= 'decimal' ) | (enumLiteral_14= 'char' ) | (enumLiteral_15= 'binary' ) ) ;
    public final Enumerator ruleDataTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;

         enterRule(); 
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2048:28: ( ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'uint16' ) | (enumLiteral_3= 'uint32' ) | (enumLiteral_4= 'uint64' ) | (enumLiteral_5= 'sbyte' ) | (enumLiteral_6= 'int16' ) | (enumLiteral_7= 'int32' ) | (enumLiteral_8= 'int64' ) | (enumLiteral_9= 'float32' ) | (enumLiteral_10= 'float64' ) | (enumLiteral_11= 'string' ) | (enumLiteral_12= 'datetime' ) | (enumLiteral_13= 'decimal' ) | (enumLiteral_14= 'char' ) | (enumLiteral_15= 'binary' ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2049:1: ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'uint16' ) | (enumLiteral_3= 'uint32' ) | (enumLiteral_4= 'uint64' ) | (enumLiteral_5= 'sbyte' ) | (enumLiteral_6= 'int16' ) | (enumLiteral_7= 'int32' ) | (enumLiteral_8= 'int64' ) | (enumLiteral_9= 'float32' ) | (enumLiteral_10= 'float64' ) | (enumLiteral_11= 'string' ) | (enumLiteral_12= 'datetime' ) | (enumLiteral_13= 'decimal' ) | (enumLiteral_14= 'char' ) | (enumLiteral_15= 'binary' ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2049:1: ( (enumLiteral_0= 'bool' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'uint16' ) | (enumLiteral_3= 'uint32' ) | (enumLiteral_4= 'uint64' ) | (enumLiteral_5= 'sbyte' ) | (enumLiteral_6= 'int16' ) | (enumLiteral_7= 'int32' ) | (enumLiteral_8= 'int64' ) | (enumLiteral_9= 'float32' ) | (enumLiteral_10= 'float64' ) | (enumLiteral_11= 'string' ) | (enumLiteral_12= 'datetime' ) | (enumLiteral_13= 'decimal' ) | (enumLiteral_14= 'char' ) | (enumLiteral_15= 'binary' ) )
            int alt42=16;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt42=1;
                }
                break;
            case 38:
                {
                alt42=2;
                }
                break;
            case 39:
                {
                alt42=3;
                }
                break;
            case 40:
                {
                alt42=4;
                }
                break;
            case 41:
                {
                alt42=5;
                }
                break;
            case 42:
                {
                alt42=6;
                }
                break;
            case 43:
                {
                alt42=7;
                }
                break;
            case 44:
                {
                alt42=8;
                }
                break;
            case 45:
                {
                alt42=9;
                }
                break;
            case 46:
                {
                alt42=10;
                }
                break;
            case 47:
                {
                alt42=11;
                }
                break;
            case 48:
                {
                alt42=12;
                }
                break;
            case 49:
                {
                alt42=13;
                }
                break;
            case 50:
                {
                alt42=14;
                }
                break;
            case 51:
                {
                alt42=15;
                }
                break;
            case 52:
                {
                alt42=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2049:2: (enumLiteral_0= 'bool' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2049:2: (enumLiteral_0= 'bool' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2049:4: enumLiteral_0= 'bool'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleDataTypeEnum4369); 

                            current = grammarAccess.getDataTypeEnumAccess().getBOOLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeEnumAccess().getBOOLEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2055:6: (enumLiteral_1= 'byte' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2055:6: (enumLiteral_1= 'byte' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2055:8: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleDataTypeEnum4386); 

                            current = grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2061:6: (enumLiteral_2= 'uint16' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2061:6: (enumLiteral_2= 'uint16' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2061:8: enumLiteral_2= 'uint16'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleDataTypeEnum4403); 

                            current = grammarAccess.getDataTypeEnumAccess().getUNIT16EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeEnumAccess().getUNIT16EnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2067:6: (enumLiteral_3= 'uint32' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2067:6: (enumLiteral_3= 'uint32' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2067:8: enumLiteral_3= 'uint32'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleDataTypeEnum4420); 

                            current = grammarAccess.getDataTypeEnumAccess().getUINT32EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeEnumAccess().getUINT32EnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2073:6: (enumLiteral_4= 'uint64' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2073:6: (enumLiteral_4= 'uint64' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2073:8: enumLiteral_4= 'uint64'
                    {
                    enumLiteral_4=(Token)match(input,41,FOLLOW_41_in_ruleDataTypeEnum4437); 

                            current = grammarAccess.getDataTypeEnumAccess().getUNIT64EnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeEnumAccess().getUNIT64EnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2079:6: (enumLiteral_5= 'sbyte' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2079:6: (enumLiteral_5= 'sbyte' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2079:8: enumLiteral_5= 'sbyte'
                    {
                    enumLiteral_5=(Token)match(input,42,FOLLOW_42_in_ruleDataTypeEnum4454); 

                            current = grammarAccess.getDataTypeEnumAccess().getSBYTEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeEnumAccess().getSBYTEEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2085:6: (enumLiteral_6= 'int16' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2085:6: (enumLiteral_6= 'int16' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2085:8: enumLiteral_6= 'int16'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_43_in_ruleDataTypeEnum4471); 

                            current = grammarAccess.getDataTypeEnumAccess().getINT16EnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeEnumAccess().getINT16EnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2091:6: (enumLiteral_7= 'int32' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2091:6: (enumLiteral_7= 'int32' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2091:8: enumLiteral_7= 'int32'
                    {
                    enumLiteral_7=(Token)match(input,44,FOLLOW_44_in_ruleDataTypeEnum4488); 

                            current = grammarAccess.getDataTypeEnumAccess().getINT32EnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeEnumAccess().getINT32EnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2097:6: (enumLiteral_8= 'int64' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2097:6: (enumLiteral_8= 'int64' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2097:8: enumLiteral_8= 'int64'
                    {
                    enumLiteral_8=(Token)match(input,45,FOLLOW_45_in_ruleDataTypeEnum4505); 

                            current = grammarAccess.getDataTypeEnumAccess().getINT64EnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeEnumAccess().getINT64EnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2103:6: (enumLiteral_9= 'float32' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2103:6: (enumLiteral_9= 'float32' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2103:8: enumLiteral_9= 'float32'
                    {
                    enumLiteral_9=(Token)match(input,46,FOLLOW_46_in_ruleDataTypeEnum4522); 

                            current = grammarAccess.getDataTypeEnumAccess().getFLOAT32EnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeEnumAccess().getFLOAT32EnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2109:6: (enumLiteral_10= 'float64' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2109:6: (enumLiteral_10= 'float64' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2109:8: enumLiteral_10= 'float64'
                    {
                    enumLiteral_10=(Token)match(input,47,FOLLOW_47_in_ruleDataTypeEnum4539); 

                            current = grammarAccess.getDataTypeEnumAccess().getFLOAT64EnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDataTypeEnumAccess().getFLOAT64EnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2115:6: (enumLiteral_11= 'string' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2115:6: (enumLiteral_11= 'string' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2115:8: enumLiteral_11= 'string'
                    {
                    enumLiteral_11=(Token)match(input,48,FOLLOW_48_in_ruleDataTypeEnum4556); 

                            current = grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2121:6: (enumLiteral_12= 'datetime' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2121:6: (enumLiteral_12= 'datetime' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2121:8: enumLiteral_12= 'datetime'
                    {
                    enumLiteral_12=(Token)match(input,49,FOLLOW_49_in_ruleDataTypeEnum4573); 

                            current = grammarAccess.getDataTypeEnumAccess().getDATETIMEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDataTypeEnumAccess().getDATETIMEEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2127:6: (enumLiteral_13= 'decimal' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2127:6: (enumLiteral_13= 'decimal' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2127:8: enumLiteral_13= 'decimal'
                    {
                    enumLiteral_13=(Token)match(input,50,FOLLOW_50_in_ruleDataTypeEnum4590); 

                            current = grammarAccess.getDataTypeEnumAccess().getDECIMALEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDataTypeEnumAccess().getDECIMALEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2133:6: (enumLiteral_14= 'char' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2133:6: (enumLiteral_14= 'char' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2133:8: enumLiteral_14= 'char'
                    {
                    enumLiteral_14=(Token)match(input,51,FOLLOW_51_in_ruleDataTypeEnum4607); 

                            current = grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2139:6: (enumLiteral_15= 'binary' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2139:6: (enumLiteral_15= 'binary' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2139:8: enumLiteral_15= 'binary'
                    {
                    enumLiteral_15=(Token)match(input,52,FOLLOW_52_in_ruleDataTypeEnum4624); 

                            current = grammarAccess.getDataTypeEnumAccess().getBINARYEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getDataTypeEnumAccess().getBINARYEnumLiteralDeclaration_15()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeEnum"


    // $ANTLR start "ruleSupportedLangs"
    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2149:1: ruleSupportedLangs returns [Enumerator current=null] : ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'csharp' ) | (enumLiteral_2= 'asp' ) ) ;
    public final Enumerator ruleSupportedLangs() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2151:28: ( ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'csharp' ) | (enumLiteral_2= 'asp' ) ) )
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2152:1: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'csharp' ) | (enumLiteral_2= 'asp' ) )
            {
            // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2152:1: ( (enumLiteral_0= 'java' ) | (enumLiteral_1= 'csharp' ) | (enumLiteral_2= 'asp' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt43=1;
                }
                break;
            case 54:
                {
                alt43=2;
                }
                break;
            case 55:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2152:2: (enumLiteral_0= 'java' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2152:2: (enumLiteral_0= 'java' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2152:4: enumLiteral_0= 'java'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_53_in_ruleSupportedLangs4669); 

                            current = grammarAccess.getSupportedLangsAccess().getJAVAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSupportedLangsAccess().getJAVAEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2158:6: (enumLiteral_1= 'csharp' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2158:6: (enumLiteral_1= 'csharp' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2158:8: enumLiteral_1= 'csharp'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleSupportedLangs4686); 

                            current = grammarAccess.getSupportedLangsAccess().getCSHARPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSupportedLangsAccess().getCSHARPEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2164:6: (enumLiteral_2= 'asp' )
                    {
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2164:6: (enumLiteral_2= 'asp' )
                    // ../com.concur.babel.idl/src-gen/com/concur/babel/parser/antlr/internal/InternalBabelIdl.g:2164:8: enumLiteral_2= 'asp'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_55_in_ruleSupportedLangs4703); 

                            current = grammarAccess.getSupportedLangsAccess().getASPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSupportedLangsAccess().getASPEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupportedLangs"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\12\uffff";
    static final String DFA5_eofS =
        "\12\uffff";
    static final String DFA5_minS =
        "\3\10\1\uffff\1\5\1\12\3\uffff\1\12";
    static final String DFA5_maxS =
        "\3\44\1\uffff\1\5\1\44\3\uffff\1\12";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff";
    static final String DFA5_specialS =
        "\12\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\5\10\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2\uffff\1"+
            "\10\7\uffff\1\4",
            "\1\1\1\2\1\5\10\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2\uffff\1"+
            "\10\7\uffff\1\4",
            "\1\1\1\2\1\5\10\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2\uffff\1"+
            "\10\7\uffff\1\4",
            "",
            "\1\11",
            "\1\5\16\uffff\1\6\2\uffff\1\10\7\uffff\1\4",
            "",
            "",
            "",
            "\1\5"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "192:1: (this_Enum_0= ruleEnum | this_Struct_1= ruleStruct | this_Const_2= ruleConst | this_Service_3= ruleService )";
        }
    }
 

    public static final BitSet FOLLOW_ruleBabelIdl_in_entryRuleBabelIdl75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBabelIdl85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleBabelIdl131 = new BitSet(new long[]{0x0000000000048300L});
    public static final BitSet FOLLOW_ruleImportStatement_in_ruleBabelIdl153 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_ruleDefaultNameSpace_in_ruleBabelIdl175 = new BitSet(new long[]{0x00000010128C8702L});
    public static final BitSet FOLLOW_ruleNamespace_in_ruleBabelIdl196 = new BitSet(new long[]{0x00000010128C8702L});
    public static final BitSet FOLLOW_ruleBabelDefinition_in_ruleBabelIdl218 = new BitSet(new long[]{0x00000010128C8702L});
    public static final BitSet FOLLOW_ruleBabelDefinition_in_entryRuleBabelDefinition255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBabelDefinition265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleBabelDefinition312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_ruleBabelDefinition339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_ruleBabelDefinition366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleBabelDefinition393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_entryRuleLineTerm429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineTerm440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleLineTerm478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLineTerm497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNamespace584 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_ruleSupportedLangs_in_ruleNamespace605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNamespace622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultNameSpace_in_entryRuleDefaultNameSpace663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultNameSpace673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDefaultNameSpace710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDefaultQualifier_in_ruleDefaultNameSpace731 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDefaultNameSpace752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultQualifier_in_entryRuleDefaultQualifier789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultQualifier800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultQualifier840 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDefaultQualifier858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDefaultQualifier873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleQualifiedName968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName983 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleImportStatement1076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImportStatement1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleEnum1190 = new BitSet(new long[]{0x00000000000C8300L});
    public static final BitSet FOLLOW_19_in_ruleEnum1203 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1220 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleEnum1237 = new BitSet(new long[]{0x0000000000248320L});
    public static final BitSet FOLLOW_ruleEnumProperty_in_ruleEnum1258 = new BitSet(new long[]{0x0000000000248320L});
    public static final BitSet FOLLOW_21_in_ruleEnum1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumProperty_in_entryRuleEnumProperty1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumProperty1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleEnumProperty1363 = new BitSet(new long[]{0x0000000000048320L});
    public static final BitSet FOLLOW_ruleEnumPropertyId_in_ruleEnumProperty1385 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEnumProperty1397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleEnumOrdinal_in_ruleEnumProperty1418 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_ruleEnumProperty1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOrdinal_in_entryRuleEnumOrdinal1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumOrdinal1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEnumOrdinal1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyId_in_entryRuleEnumPropertyId1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyId1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumPropertyId1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_entryRuleConst1654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleConst1710 = new BitSet(new long[]{0x0000000000848300L});
    public static final BitSet FOLLOW_23_in_ruleConst1723 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConst1740 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConst1757 = new BitSet(new long[]{0x0000000000248320L});
    public static final BitSet FOLLOW_ruleConstProperty_in_ruleConst1778 = new BitSet(new long[]{0x0000000000248320L});
    public static final BitSet FOLLOW_21_in_ruleConst1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstProperty_in_entryRuleConstProperty1827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstProperty1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleConstProperty1883 = new BitSet(new long[]{0x0000000000048320L});
    public static final BitSet FOLLOW_ruleConstPropertyId_in_ruleConstProperty1905 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstProperty1917 = new BitSet(new long[]{0x00000000010000D0L});
    public static final BitSet FOLLOW_ruleConstValueType_in_ruleConstProperty1938 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_ruleConstProperty1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstValueType_in_entryRuleConstValueType1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstValueType2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstValueType2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleConstValueType2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstNumValue_in_ruleConstValueType2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstNumValue_in_entryRuleConstNumValue2141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstNumValue2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleConstNumValue2191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstNumValue2208 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConstNumValue2227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstNumValue2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstPropertyId_in_entryRuleConstPropertyId2289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstPropertyId2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstPropertyId2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct2380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleStruct2436 = new BitSet(new long[]{0x0000001002048700L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleStruct2458 = new BitSet(new long[]{0x0000001002000400L});
    public static final BitSet FOLLOW_25_in_ruleStruct2471 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_ruleStruct2484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStruct2503 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_27_in_ruleStruct2521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStruct2541 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStruct2555 = new BitSet(new long[]{0x001FFFF900248720L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleStruct2576 = new BitSet(new long[]{0x001FFFF900248720L});
    public static final BitSet FOLLOW_21_in_ruleStruct2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleProperty2681 = new BitSet(new long[]{0x001FFFF900048720L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleProperty2703 = new BitSet(new long[]{0x001FFFF900000420L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_ruleProperty2726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty2752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyValue_in_ruleProperty2774 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_ruleProperty2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyValue2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleService2975 = new BitSet(new long[]{0x0000001010048700L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleService2997 = new BitSet(new long[]{0x0000001010000400L});
    public static final BitSet FOLLOW_28_in_ruleService3010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService3027 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService3044 = new BitSet(new long[]{0x001FFFF980248720L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_ruleService3065 = new BitSet(new long[]{0x001FFFF980248720L});
    public static final BitSet FOLLOW_21_in_ruleService3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_ruleServiceMethod3170 = new BitSet(new long[]{0x001FFFF980048720L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleServiceMethod3192 = new BitSet(new long[]{0x001FFFF980048720L});
    public static final BitSet FOLLOW_ruleServiceMethodReturnType_in_ruleServiceMethod3214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceMethod3231 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleServiceMethod3248 = new BitSet(new long[]{0x001FFFF940048720L});
    public static final BitSet FOLLOW_ruleServiceProperty_in_ruleServiceMethod3269 = new BitSet(new long[]{0x001FFFF940048720L});
    public static final BitSet FOLLOW_30_in_ruleServiceMethod3282 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_ruleServiceMethod3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProperty_in_entryRuleServiceProperty3336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProperty3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleServiceProperty3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethodReturnType_in_entryRuleServiceMethodReturnType3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethodReturnType3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleServiceMethodReturnType3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_ruleServiceMethodReturnType3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleServiceMethodReturnType3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_entryRuleDataTypeReference3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeReference3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeEnum_in_ruleDataTypeReference3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_ruleDataTypeReference3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_ruleDataTypeReference3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType3729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleListType3776 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleListType3788 = new BitSet(new long[]{0x001FFFE900000020L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_ruleListType3810 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleListType3836 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleListType3849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleMapType3932 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMapType3944 = new BitSet(new long[]{0x001FFFE900000020L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_ruleMapType3966 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapType3992 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMapType4005 = new BitSet(new long[]{0x001FFFE900000020L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_ruleMapType4027 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapType4053 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMapType4066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_entryRuleCommentType4103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentType4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleCommentType4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_ruleCommentType4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttribute4273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute4290 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_ATTR_in_ruleAttribute4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataTypeEnum4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataTypeEnum4386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataTypeEnum4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataTypeEnum4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataTypeEnum4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataTypeEnum4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataTypeEnum4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataTypeEnum4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataTypeEnum4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataTypeEnum4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataTypeEnum4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDataTypeEnum4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleDataTypeEnum4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDataTypeEnum4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleDataTypeEnum4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDataTypeEnum4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleSupportedLangs4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleSupportedLangs4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSupportedLangs4703 = new BitSet(new long[]{0x0000000000000002L});

}