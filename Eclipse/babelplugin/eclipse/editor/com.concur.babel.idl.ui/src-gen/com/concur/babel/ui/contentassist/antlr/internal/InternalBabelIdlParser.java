package com.concur.babel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.concur.babel.services.BabelIdlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBabelIdlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL", "RULE_ATTR", "RULE_WS", "RULE_ANY_OTHER", "','", "';'", "'bool'", "'byte'", "'uint16'", "'uint32'", "'uint64'", "'sbyte'", "'int16'", "'int32'", "'int64'", "'float32'", "'float64'", "'string'", "'datetime'", "'decimal'", "'char'", "'binary'", "'java'", "'csharp'", "'asp'", "'namespace'", "'.'", "'/'", "'import'", "'enum'", "'{'", "'}'", "'='", "'const'", "'-'", "'struct'", "'abstract'", "'extends'", "'service'", "'('", "')'", "'list'", "'<'", "'>'", "'map'", "'@'", "'void'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_BOOL=9;
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
    public static final int RULE_INT=7;
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
    public static final int RULE_SL_COMMENT=4;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
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
    public String getGrammarFileName() { return "../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g"; }


     
     	private BabelIdlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BabelIdlGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleBabelIdl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:60:1: entryRuleBabelIdl : ruleBabelIdl EOF ;
    public final void entryRuleBabelIdl() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:61:1: ( ruleBabelIdl EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:62:1: ruleBabelIdl EOF
            {
             before(grammarAccess.getBabelIdlRule()); 
            pushFollow(FOLLOW_ruleBabelIdl_in_entryRuleBabelIdl61);
            ruleBabelIdl();

            state._fsp--;

             after(grammarAccess.getBabelIdlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBabelIdl68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBabelIdl"


    // $ANTLR start "ruleBabelIdl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:69:1: ruleBabelIdl : ( ( rule__BabelIdl__Group__0 ) ) ;
    public final void ruleBabelIdl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:73:2: ( ( ( rule__BabelIdl__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:74:1: ( ( rule__BabelIdl__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:74:1: ( ( rule__BabelIdl__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:75:1: ( rule__BabelIdl__Group__0 )
            {
             before(grammarAccess.getBabelIdlAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:76:1: ( rule__BabelIdl__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:76:2: rule__BabelIdl__Group__0
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__0_in_ruleBabelIdl94);
            rule__BabelIdl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBabelIdlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBabelIdl"


    // $ANTLR start "entryRuleBabelDefinition"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:88:1: entryRuleBabelDefinition : ruleBabelDefinition EOF ;
    public final void entryRuleBabelDefinition() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:89:1: ( ruleBabelDefinition EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:90:1: ruleBabelDefinition EOF
            {
             before(grammarAccess.getBabelDefinitionRule()); 
            pushFollow(FOLLOW_ruleBabelDefinition_in_entryRuleBabelDefinition121);
            ruleBabelDefinition();

            state._fsp--;

             after(grammarAccess.getBabelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBabelDefinition128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBabelDefinition"


    // $ANTLR start "ruleBabelDefinition"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:97:1: ruleBabelDefinition : ( ( rule__BabelDefinition__Alternatives ) ) ;
    public final void ruleBabelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:101:2: ( ( ( rule__BabelDefinition__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:102:1: ( ( rule__BabelDefinition__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:102:1: ( ( rule__BabelDefinition__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:103:1: ( rule__BabelDefinition__Alternatives )
            {
             before(grammarAccess.getBabelDefinitionAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:104:1: ( rule__BabelDefinition__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:104:2: rule__BabelDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__BabelDefinition__Alternatives_in_ruleBabelDefinition154);
            rule__BabelDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBabelDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBabelDefinition"


    // $ANTLR start "entryRuleLineTerm"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:116:1: entryRuleLineTerm : ruleLineTerm EOF ;
    public final void entryRuleLineTerm() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:117:1: ( ruleLineTerm EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:118:1: ruleLineTerm EOF
            {
             before(grammarAccess.getLineTermRule()); 
            pushFollow(FOLLOW_ruleLineTerm_in_entryRuleLineTerm181);
            ruleLineTerm();

            state._fsp--;

             after(grammarAccess.getLineTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLineTerm188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineTerm"


    // $ANTLR start "ruleLineTerm"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:125:1: ruleLineTerm : ( ( rule__LineTerm__Alternatives ) ) ;
    public final void ruleLineTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:129:2: ( ( ( rule__LineTerm__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:130:1: ( ( rule__LineTerm__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:130:1: ( ( rule__LineTerm__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:131:1: ( rule__LineTerm__Alternatives )
            {
             before(grammarAccess.getLineTermAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:132:1: ( rule__LineTerm__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:132:2: rule__LineTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__LineTerm__Alternatives_in_ruleLineTerm214);
            rule__LineTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLineTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineTerm"


    // $ANTLR start "entryRuleNamespace"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:144:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:145:1: ( ruleNamespace EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:146:1: ruleNamespace EOF
            {
             before(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_ruleNamespace_in_entryRuleNamespace241);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getNamespaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespace248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:153:1: ruleNamespace : ( ( rule__Namespace__Group__0 ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:157:2: ( ( ( rule__Namespace__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:158:1: ( ( rule__Namespace__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:158:1: ( ( rule__Namespace__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:159:1: ( rule__Namespace__Group__0 )
            {
             before(grammarAccess.getNamespaceAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:160:1: ( rule__Namespace__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:160:2: rule__Namespace__Group__0
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0_in_ruleNamespace274);
            rule__Namespace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleDefaultNameSpace"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:172:1: entryRuleDefaultNameSpace : ruleDefaultNameSpace EOF ;
    public final void entryRuleDefaultNameSpace() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:173:1: ( ruleDefaultNameSpace EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:174:1: ruleDefaultNameSpace EOF
            {
             before(grammarAccess.getDefaultNameSpaceRule()); 
            pushFollow(FOLLOW_ruleDefaultNameSpace_in_entryRuleDefaultNameSpace301);
            ruleDefaultNameSpace();

            state._fsp--;

             after(grammarAccess.getDefaultNameSpaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultNameSpace308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultNameSpace"


    // $ANTLR start "ruleDefaultNameSpace"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:181:1: ruleDefaultNameSpace : ( ( rule__DefaultNameSpace__Group__0 ) ) ;
    public final void ruleDefaultNameSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:185:2: ( ( ( rule__DefaultNameSpace__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:186:1: ( ( rule__DefaultNameSpace__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:186:1: ( ( rule__DefaultNameSpace__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:187:1: ( rule__DefaultNameSpace__Group__0 )
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:188:1: ( rule__DefaultNameSpace__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:188:2: rule__DefaultNameSpace__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__0_in_ruleDefaultNameSpace334);
            rule__DefaultNameSpace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultNameSpaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultNameSpace"


    // $ANTLR start "entryRuleDefaultQualifier"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:200:1: entryRuleDefaultQualifier : ruleDefaultQualifier EOF ;
    public final void entryRuleDefaultQualifier() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:201:1: ( ruleDefaultQualifier EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:202:1: ruleDefaultQualifier EOF
            {
             before(grammarAccess.getDefaultQualifierRule()); 
            pushFollow(FOLLOW_ruleDefaultQualifier_in_entryRuleDefaultQualifier361);
            ruleDefaultQualifier();

            state._fsp--;

             after(grammarAccess.getDefaultQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefaultQualifier368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefaultQualifier"


    // $ANTLR start "ruleDefaultQualifier"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:209:1: ruleDefaultQualifier : ( ( rule__DefaultQualifier__Group__0 ) ) ;
    public final void ruleDefaultQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:213:2: ( ( ( rule__DefaultQualifier__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:214:1: ( ( rule__DefaultQualifier__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:214:1: ( ( rule__DefaultQualifier__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:215:1: ( rule__DefaultQualifier__Group__0 )
            {
             before(grammarAccess.getDefaultQualifierAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:216:1: ( rule__DefaultQualifier__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:216:2: rule__DefaultQualifier__Group__0
            {
            pushFollow(FOLLOW_rule__DefaultQualifier__Group__0_in_ruleDefaultQualifier394);
            rule__DefaultQualifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultQualifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultQualifier"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:228:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:229:1: ( ruleQualifiedName EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:230:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:237:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 )* ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:241:2: ( ( ( rule__QualifiedName__Group__0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:242:1: ( ( rule__QualifiedName__Group__0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:242:1: ( ( rule__QualifiedName__Group__0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:243:1: ( rule__QualifiedName__Group__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:244:1: ( rule__QualifiedName__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:244:2: rule__QualifiedName__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName454);
            	    rule__QualifiedName__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImportStatement"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:256:1: entryRuleImportStatement : ruleImportStatement EOF ;
    public final void entryRuleImportStatement() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:257:1: ( ruleImportStatement EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:258:1: ruleImportStatement EOF
            {
             before(grammarAccess.getImportStatementRule()); 
            pushFollow(FOLLOW_ruleImportStatement_in_entryRuleImportStatement482);
            ruleImportStatement();

            state._fsp--;

             after(grammarAccess.getImportStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportStatement489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportStatement"


    // $ANTLR start "ruleImportStatement"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:265:1: ruleImportStatement : ( ( rule__ImportStatement__Group__0 ) ) ;
    public final void ruleImportStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:269:2: ( ( ( rule__ImportStatement__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:270:1: ( ( rule__ImportStatement__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:270:1: ( ( rule__ImportStatement__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:271:1: ( rule__ImportStatement__Group__0 )
            {
             before(grammarAccess.getImportStatementAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:272:1: ( rule__ImportStatement__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:272:2: rule__ImportStatement__Group__0
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__0_in_ruleImportStatement515);
            rule__ImportStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportStatement"


    // $ANTLR start "entryRuleEnum"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:284:1: entryRuleEnum : ruleEnum EOF ;
    public final void entryRuleEnum() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:285:1: ( ruleEnum EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:286:1: ruleEnum EOF
            {
             before(grammarAccess.getEnumRule()); 
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum542);
            ruleEnum();

            state._fsp--;

             after(grammarAccess.getEnumRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:293:1: ruleEnum : ( ( rule__Enum__Group__0 ) ) ;
    public final void ruleEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:297:2: ( ( ( rule__Enum__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:298:1: ( ( rule__Enum__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:298:1: ( ( rule__Enum__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:299:1: ( rule__Enum__Group__0 )
            {
             before(grammarAccess.getEnumAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:300:1: ( rule__Enum__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:300:2: rule__Enum__Group__0
            {
            pushFollow(FOLLOW_rule__Enum__Group__0_in_ruleEnum575);
            rule__Enum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:312:1: entryRuleEnumProperty : ruleEnumProperty EOF ;
    public final void entryRuleEnumProperty() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:313:1: ( ruleEnumProperty EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:314:1: ruleEnumProperty EOF
            {
             before(grammarAccess.getEnumPropertyRule()); 
            pushFollow(FOLLOW_ruleEnumProperty_in_entryRuleEnumProperty602);
            ruleEnumProperty();

            state._fsp--;

             after(grammarAccess.getEnumPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumProperty609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumProperty"


    // $ANTLR start "ruleEnumProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:321:1: ruleEnumProperty : ( ( rule__EnumProperty__Group__0 ) ) ;
    public final void ruleEnumProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:325:2: ( ( ( rule__EnumProperty__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:326:1: ( ( rule__EnumProperty__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:326:1: ( ( rule__EnumProperty__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:327:1: ( rule__EnumProperty__Group__0 )
            {
             before(grammarAccess.getEnumPropertyAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:328:1: ( rule__EnumProperty__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:328:2: rule__EnumProperty__Group__0
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__0_in_ruleEnumProperty635);
            rule__EnumProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumProperty"


    // $ANTLR start "entryRuleEnumOrdinal"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:340:1: entryRuleEnumOrdinal : ruleEnumOrdinal EOF ;
    public final void entryRuleEnumOrdinal() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:341:1: ( ruleEnumOrdinal EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:342:1: ruleEnumOrdinal EOF
            {
             before(grammarAccess.getEnumOrdinalRule()); 
            pushFollow(FOLLOW_ruleEnumOrdinal_in_entryRuleEnumOrdinal662);
            ruleEnumOrdinal();

            state._fsp--;

             after(grammarAccess.getEnumOrdinalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumOrdinal669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumOrdinal"


    // $ANTLR start "ruleEnumOrdinal"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:349:1: ruleEnumOrdinal : ( ( rule__EnumOrdinal__TypeAssignment ) ) ;
    public final void ruleEnumOrdinal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:353:2: ( ( ( rule__EnumOrdinal__TypeAssignment ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:354:1: ( ( rule__EnumOrdinal__TypeAssignment ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:354:1: ( ( rule__EnumOrdinal__TypeAssignment ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:355:1: ( rule__EnumOrdinal__TypeAssignment )
            {
             before(grammarAccess.getEnumOrdinalAccess().getTypeAssignment()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:356:1: ( rule__EnumOrdinal__TypeAssignment )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:356:2: rule__EnumOrdinal__TypeAssignment
            {
            pushFollow(FOLLOW_rule__EnumOrdinal__TypeAssignment_in_ruleEnumOrdinal695);
            rule__EnumOrdinal__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumOrdinalAccess().getTypeAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumOrdinal"


    // $ANTLR start "entryRuleEnumPropertyId"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:368:1: entryRuleEnumPropertyId : ruleEnumPropertyId EOF ;
    public final void entryRuleEnumPropertyId() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:369:1: ( ruleEnumPropertyId EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:370:1: ruleEnumPropertyId EOF
            {
             before(grammarAccess.getEnumPropertyIdRule()); 
            pushFollow(FOLLOW_ruleEnumPropertyId_in_entryRuleEnumPropertyId722);
            ruleEnumPropertyId();

            state._fsp--;

             after(grammarAccess.getEnumPropertyIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumPropertyId729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumPropertyId"


    // $ANTLR start "ruleEnumPropertyId"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:377:1: ruleEnumPropertyId : ( ( rule__EnumPropertyId__NameAssignment ) ) ;
    public final void ruleEnumPropertyId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:381:2: ( ( ( rule__EnumPropertyId__NameAssignment ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:382:1: ( ( rule__EnumPropertyId__NameAssignment ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:382:1: ( ( rule__EnumPropertyId__NameAssignment ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:383:1: ( rule__EnumPropertyId__NameAssignment )
            {
             before(grammarAccess.getEnumPropertyIdAccess().getNameAssignment()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:384:1: ( rule__EnumPropertyId__NameAssignment )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:384:2: rule__EnumPropertyId__NameAssignment
            {
            pushFollow(FOLLOW_rule__EnumPropertyId__NameAssignment_in_ruleEnumPropertyId755);
            rule__EnumPropertyId__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumPropertyIdAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumPropertyId"


    // $ANTLR start "entryRuleConst"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:396:1: entryRuleConst : ruleConst EOF ;
    public final void entryRuleConst() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:397:1: ( ruleConst EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:398:1: ruleConst EOF
            {
             before(grammarAccess.getConstRule()); 
            pushFollow(FOLLOW_ruleConst_in_entryRuleConst782);
            ruleConst();

            state._fsp--;

             after(grammarAccess.getConstRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConst"


    // $ANTLR start "ruleConst"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:405:1: ruleConst : ( ( rule__Const__Group__0 ) ) ;
    public final void ruleConst() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:409:2: ( ( ( rule__Const__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:410:1: ( ( rule__Const__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:410:1: ( ( rule__Const__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:411:1: ( rule__Const__Group__0 )
            {
             before(grammarAccess.getConstAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:412:1: ( rule__Const__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:412:2: rule__Const__Group__0
            {
            pushFollow(FOLLOW_rule__Const__Group__0_in_ruleConst815);
            rule__Const__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst"


    // $ANTLR start "entryRuleConstProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:424:1: entryRuleConstProperty : ruleConstProperty EOF ;
    public final void entryRuleConstProperty() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:425:1: ( ruleConstProperty EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:426:1: ruleConstProperty EOF
            {
             before(grammarAccess.getConstPropertyRule()); 
            pushFollow(FOLLOW_ruleConstProperty_in_entryRuleConstProperty842);
            ruleConstProperty();

            state._fsp--;

             after(grammarAccess.getConstPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstProperty849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstProperty"


    // $ANTLR start "ruleConstProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:433:1: ruleConstProperty : ( ( rule__ConstProperty__Group__0 ) ) ;
    public final void ruleConstProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:437:2: ( ( ( rule__ConstProperty__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:438:1: ( ( rule__ConstProperty__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:438:1: ( ( rule__ConstProperty__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:439:1: ( rule__ConstProperty__Group__0 )
            {
             before(grammarAccess.getConstPropertyAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:440:1: ( rule__ConstProperty__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:440:2: rule__ConstProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__0_in_ruleConstProperty875);
            rule__ConstProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstProperty"


    // $ANTLR start "entryRuleConstValueType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:452:1: entryRuleConstValueType : ruleConstValueType EOF ;
    public final void entryRuleConstValueType() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:453:1: ( ruleConstValueType EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:454:1: ruleConstValueType EOF
            {
             before(grammarAccess.getConstValueTypeRule()); 
            pushFollow(FOLLOW_ruleConstValueType_in_entryRuleConstValueType902);
            ruleConstValueType();

            state._fsp--;

             after(grammarAccess.getConstValueTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstValueType909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstValueType"


    // $ANTLR start "ruleConstValueType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:461:1: ruleConstValueType : ( ( rule__ConstValueType__Alternatives ) ) ;
    public final void ruleConstValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:465:2: ( ( ( rule__ConstValueType__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:466:1: ( ( rule__ConstValueType__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:466:1: ( ( rule__ConstValueType__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:467:1: ( rule__ConstValueType__Alternatives )
            {
             before(grammarAccess.getConstValueTypeAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:468:1: ( rule__ConstValueType__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:468:2: rule__ConstValueType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstValueType__Alternatives_in_ruleConstValueType935);
            rule__ConstValueType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstValueTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstValueType"


    // $ANTLR start "entryRuleConstNumValue"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:480:1: entryRuleConstNumValue : ruleConstNumValue EOF ;
    public final void entryRuleConstNumValue() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:481:1: ( ruleConstNumValue EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:482:1: ruleConstNumValue EOF
            {
             before(grammarAccess.getConstNumValueRule()); 
            pushFollow(FOLLOW_ruleConstNumValue_in_entryRuleConstNumValue962);
            ruleConstNumValue();

            state._fsp--;

             after(grammarAccess.getConstNumValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstNumValue969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstNumValue"


    // $ANTLR start "ruleConstNumValue"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:489:1: ruleConstNumValue : ( ( rule__ConstNumValue__Group__0 ) ) ;
    public final void ruleConstNumValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:493:2: ( ( ( rule__ConstNumValue__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:494:1: ( ( rule__ConstNumValue__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:494:1: ( ( rule__ConstNumValue__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:495:1: ( rule__ConstNumValue__Group__0 )
            {
             before(grammarAccess.getConstNumValueAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:496:1: ( rule__ConstNumValue__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:496:2: rule__ConstNumValue__Group__0
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group__0_in_ruleConstNumValue995);
            rule__ConstNumValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstNumValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstNumValue"


    // $ANTLR start "entryRuleConstPropertyId"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:508:1: entryRuleConstPropertyId : ruleConstPropertyId EOF ;
    public final void entryRuleConstPropertyId() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:509:1: ( ruleConstPropertyId EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:510:1: ruleConstPropertyId EOF
            {
             before(grammarAccess.getConstPropertyIdRule()); 
            pushFollow(FOLLOW_ruleConstPropertyId_in_entryRuleConstPropertyId1022);
            ruleConstPropertyId();

            state._fsp--;

             after(grammarAccess.getConstPropertyIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstPropertyId1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstPropertyId"


    // $ANTLR start "ruleConstPropertyId"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:517:1: ruleConstPropertyId : ( ( rule__ConstPropertyId__NameAssignment ) ) ;
    public final void ruleConstPropertyId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:521:2: ( ( ( rule__ConstPropertyId__NameAssignment ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:522:1: ( ( rule__ConstPropertyId__NameAssignment ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:522:1: ( ( rule__ConstPropertyId__NameAssignment ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:523:1: ( rule__ConstPropertyId__NameAssignment )
            {
             before(grammarAccess.getConstPropertyIdAccess().getNameAssignment()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:524:1: ( rule__ConstPropertyId__NameAssignment )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:524:2: rule__ConstPropertyId__NameAssignment
            {
            pushFollow(FOLLOW_rule__ConstPropertyId__NameAssignment_in_ruleConstPropertyId1055);
            rule__ConstPropertyId__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getConstPropertyIdAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstPropertyId"


    // $ANTLR start "entryRuleStruct"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:536:1: entryRuleStruct : ruleStruct EOF ;
    public final void entryRuleStruct() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:537:1: ( ruleStruct EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:538:1: ruleStruct EOF
            {
             before(grammarAccess.getStructRule()); 
            pushFollow(FOLLOW_ruleStruct_in_entryRuleStruct1082);
            ruleStruct();

            state._fsp--;

             after(grammarAccess.getStructRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStruct1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStruct"


    // $ANTLR start "ruleStruct"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:545:1: ruleStruct : ( ( rule__Struct__Group__0 ) ) ;
    public final void ruleStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:549:2: ( ( ( rule__Struct__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:550:1: ( ( rule__Struct__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:550:1: ( ( rule__Struct__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:551:1: ( rule__Struct__Group__0 )
            {
             before(grammarAccess.getStructAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:552:1: ( rule__Struct__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:552:2: rule__Struct__Group__0
            {
            pushFollow(FOLLOW_rule__Struct__Group__0_in_ruleStruct1115);
            rule__Struct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStruct"


    // $ANTLR start "entryRuleProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:564:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:565:1: ( ruleProperty EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:566:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1142);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:573:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:577:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:578:1: ( ( rule__Property__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:578:1: ( ( rule__Property__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:579:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:580:1: ( rule__Property__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:580:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1175);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRulePropertyValue"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:592:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:593:1: ( rulePropertyValue EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:594:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_rulePropertyValue_in_entryRulePropertyValue1202);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValue1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:601:1: rulePropertyValue : ( ( rule__PropertyValue__NameAssignment ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:605:2: ( ( ( rule__PropertyValue__NameAssignment ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:606:1: ( ( rule__PropertyValue__NameAssignment ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:606:1: ( ( rule__PropertyValue__NameAssignment ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:607:1: ( rule__PropertyValue__NameAssignment )
            {
             before(grammarAccess.getPropertyValueAccess().getNameAssignment()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:608:1: ( rule__PropertyValue__NameAssignment )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:608:2: rule__PropertyValue__NameAssignment
            {
            pushFollow(FOLLOW_rule__PropertyValue__NameAssignment_in_rulePropertyValue1235);
            rule__PropertyValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleService"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:620:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:621:1: ( ruleService EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:622:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService1262);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:629:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:633:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:634:1: ( ( rule__Service__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:634:1: ( ( rule__Service__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:635:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:636:1: ( rule__Service__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:636:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService1295);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceMethod"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:648:1: entryRuleServiceMethod : ruleServiceMethod EOF ;
    public final void entryRuleServiceMethod() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:649:1: ( ruleServiceMethod EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:650:1: ruleServiceMethod EOF
            {
             before(grammarAccess.getServiceMethodRule()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod1322);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethod1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceMethod"


    // $ANTLR start "ruleServiceMethod"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:657:1: ruleServiceMethod : ( ( rule__ServiceMethod__Group__0 ) ) ;
    public final void ruleServiceMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:661:2: ( ( ( rule__ServiceMethod__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:662:1: ( ( rule__ServiceMethod__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:662:1: ( ( rule__ServiceMethod__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:663:1: ( rule__ServiceMethod__Group__0 )
            {
             before(grammarAccess.getServiceMethodAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:664:1: ( rule__ServiceMethod__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:664:2: rule__ServiceMethod__Group__0
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__0_in_ruleServiceMethod1355);
            rule__ServiceMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceMethod"


    // $ANTLR start "entryRuleServiceProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:676:1: entryRuleServiceProperty : ruleServiceProperty EOF ;
    public final void entryRuleServiceProperty() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:677:1: ( ruleServiceProperty EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:678:1: ruleServiceProperty EOF
            {
             before(grammarAccess.getServicePropertyRule()); 
            pushFollow(FOLLOW_ruleServiceProperty_in_entryRuleServiceProperty1382);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getServicePropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceProperty1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceProperty"


    // $ANTLR start "ruleServiceProperty"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:685:1: ruleServiceProperty : ( ( rule__ServiceProperty__NameAssignment ) ) ;
    public final void ruleServiceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:689:2: ( ( ( rule__ServiceProperty__NameAssignment ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:690:1: ( ( rule__ServiceProperty__NameAssignment ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:690:1: ( ( rule__ServiceProperty__NameAssignment ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:691:1: ( rule__ServiceProperty__NameAssignment )
            {
             before(grammarAccess.getServicePropertyAccess().getNameAssignment()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:692:1: ( rule__ServiceProperty__NameAssignment )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:692:2: rule__ServiceProperty__NameAssignment
            {
            pushFollow(FOLLOW_rule__ServiceProperty__NameAssignment_in_ruleServiceProperty1415);
            rule__ServiceProperty__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getServicePropertyAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceProperty"


    // $ANTLR start "entryRuleServiceMethodReturnType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:704:1: entryRuleServiceMethodReturnType : ruleServiceMethodReturnType EOF ;
    public final void entryRuleServiceMethodReturnType() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:705:1: ( ruleServiceMethodReturnType EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:706:1: ruleServiceMethodReturnType EOF
            {
             before(grammarAccess.getServiceMethodReturnTypeRule()); 
            pushFollow(FOLLOW_ruleServiceMethodReturnType_in_entryRuleServiceMethodReturnType1442);
            ruleServiceMethodReturnType();

            state._fsp--;

             after(grammarAccess.getServiceMethodReturnTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleServiceMethodReturnType1449); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceMethodReturnType"


    // $ANTLR start "ruleServiceMethodReturnType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:713:1: ruleServiceMethodReturnType : ( ( rule__ServiceMethodReturnType__Alternatives ) ) ;
    public final void ruleServiceMethodReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:717:2: ( ( ( rule__ServiceMethodReturnType__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:718:1: ( ( rule__ServiceMethodReturnType__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:718:1: ( ( rule__ServiceMethodReturnType__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:719:1: ( rule__ServiceMethodReturnType__Alternatives )
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:720:1: ( rule__ServiceMethodReturnType__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:720:2: rule__ServiceMethodReturnType__Alternatives
            {
            pushFollow(FOLLOW_rule__ServiceMethodReturnType__Alternatives_in_ruleServiceMethodReturnType1475);
            rule__ServiceMethodReturnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodReturnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceMethodReturnType"


    // $ANTLR start "entryRuleDataTypeReference"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:732:1: entryRuleDataTypeReference : ruleDataTypeReference EOF ;
    public final void entryRuleDataTypeReference() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:733:1: ( ruleDataTypeReference EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:734:1: ruleDataTypeReference EOF
            {
             before(grammarAccess.getDataTypeReferenceRule()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_entryRuleDataTypeReference1502);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataTypeReference1509); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeReference"


    // $ANTLR start "ruleDataTypeReference"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:741:1: ruleDataTypeReference : ( ( rule__DataTypeReference__Alternatives ) ) ;
    public final void ruleDataTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:745:2: ( ( ( rule__DataTypeReference__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:746:1: ( ( rule__DataTypeReference__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:746:1: ( ( rule__DataTypeReference__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:747:1: ( rule__DataTypeReference__Alternatives )
            {
             before(grammarAccess.getDataTypeReferenceAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:748:1: ( rule__DataTypeReference__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:748:2: rule__DataTypeReference__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypeReference__Alternatives_in_ruleDataTypeReference1535);
            rule__DataTypeReference__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeReferenceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeReference"


    // $ANTLR start "entryRuleListType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:762:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:763:1: ( ruleListType EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:764:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_ruleListType_in_entryRuleListType1564);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListType1571); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:771:1: ruleListType : ( ( rule__ListType__Group__0 ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:775:2: ( ( ( rule__ListType__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:776:1: ( ( rule__ListType__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:776:1: ( ( rule__ListType__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:777:1: ( rule__ListType__Group__0 )
            {
             before(grammarAccess.getListTypeAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:778:1: ( rule__ListType__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:778:2: rule__ListType__Group__0
            {
            pushFollow(FOLLOW_rule__ListType__Group__0_in_ruleListType1597);
            rule__ListType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleMapType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:790:1: entryRuleMapType : ruleMapType EOF ;
    public final void entryRuleMapType() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:791:1: ( ruleMapType EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:792:1: ruleMapType EOF
            {
             before(grammarAccess.getMapTypeRule()); 
            pushFollow(FOLLOW_ruleMapType_in_entryRuleMapType1624);
            ruleMapType();

            state._fsp--;

             after(grammarAccess.getMapTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapType1631); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapType"


    // $ANTLR start "ruleMapType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:799:1: ruleMapType : ( ( rule__MapType__Group__0 ) ) ;
    public final void ruleMapType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:803:2: ( ( ( rule__MapType__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:804:1: ( ( rule__MapType__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:804:1: ( ( rule__MapType__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:805:1: ( rule__MapType__Group__0 )
            {
             before(grammarAccess.getMapTypeAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:806:1: ( rule__MapType__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:806:2: rule__MapType__Group__0
            {
            pushFollow(FOLLOW_rule__MapType__Group__0_in_ruleMapType1657);
            rule__MapType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapType"


    // $ANTLR start "entryRuleCommentType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:818:1: entryRuleCommentType : ruleCommentType EOF ;
    public final void entryRuleCommentType() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:819:1: ( ruleCommentType EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:820:1: ruleCommentType EOF
            {
             before(grammarAccess.getCommentTypeRule()); 
            pushFollow(FOLLOW_ruleCommentType_in_entryRuleCommentType1684);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getCommentTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentType1691); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentType"


    // $ANTLR start "ruleCommentType"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:827:1: ruleCommentType : ( ( rule__CommentType__Alternatives ) ) ;
    public final void ruleCommentType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:831:2: ( ( ( rule__CommentType__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:832:1: ( ( rule__CommentType__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:832:1: ( ( rule__CommentType__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:833:1: ( rule__CommentType__Alternatives )
            {
             before(grammarAccess.getCommentTypeAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:834:1: ( rule__CommentType__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:834:2: rule__CommentType__Alternatives
            {
            pushFollow(FOLLOW_rule__CommentType__Alternatives_in_ruleCommentType1717);
            rule__CommentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentType"


    // $ANTLR start "entryRuleAttribute"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:846:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:847:1: ( ruleAttribute EOF )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:848:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1744);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1751); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:855:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:859:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:860:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:860:1: ( ( rule__Attribute__Group__0 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:861:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:862:1: ( rule__Attribute__Group__0 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:862:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1777);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleDataTypeEnum"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:875:1: ruleDataTypeEnum : ( ( rule__DataTypeEnum__Alternatives ) ) ;
    public final void ruleDataTypeEnum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:879:1: ( ( ( rule__DataTypeEnum__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:880:1: ( ( rule__DataTypeEnum__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:880:1: ( ( rule__DataTypeEnum__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:881:1: ( rule__DataTypeEnum__Alternatives )
            {
             before(grammarAccess.getDataTypeEnumAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:882:1: ( rule__DataTypeEnum__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:882:2: rule__DataTypeEnum__Alternatives
            {
            pushFollow(FOLLOW_rule__DataTypeEnum__Alternatives_in_ruleDataTypeEnum1814);
            rule__DataTypeEnum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeEnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeEnum"


    // $ANTLR start "ruleSupportedLangs"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:894:1: ruleSupportedLangs : ( ( rule__SupportedLangs__Alternatives ) ) ;
    public final void ruleSupportedLangs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:898:1: ( ( ( rule__SupportedLangs__Alternatives ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:899:1: ( ( rule__SupportedLangs__Alternatives ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:899:1: ( ( rule__SupportedLangs__Alternatives ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:900:1: ( rule__SupportedLangs__Alternatives )
            {
             before(grammarAccess.getSupportedLangsAccess().getAlternatives()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:901:1: ( rule__SupportedLangs__Alternatives )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:901:2: rule__SupportedLangs__Alternatives
            {
            pushFollow(FOLLOW_rule__SupportedLangs__Alternatives_in_ruleSupportedLangs1850);
            rule__SupportedLangs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSupportedLangsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupportedLangs"


    // $ANTLR start "rule__BabelDefinition__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:912:1: rule__BabelDefinition__Alternatives : ( ( ruleEnum ) | ( ruleStruct ) | ( ruleConst ) | ( ruleService ) );
    public final void rule__BabelDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:916:1: ( ( ruleEnum ) | ( ruleStruct ) | ( ruleConst ) | ( ruleService ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:917:1: ( ruleEnum )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:917:1: ( ruleEnum )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:918:1: ruleEnum
                    {
                     before(grammarAccess.getBabelDefinitionAccess().getEnumParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEnum_in_rule__BabelDefinition__Alternatives1885);
                    ruleEnum();

                    state._fsp--;

                     after(grammarAccess.getBabelDefinitionAccess().getEnumParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:923:6: ( ruleStruct )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:923:6: ( ruleStruct )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:924:1: ruleStruct
                    {
                     before(grammarAccess.getBabelDefinitionAccess().getStructParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStruct_in_rule__BabelDefinition__Alternatives1902);
                    ruleStruct();

                    state._fsp--;

                     after(grammarAccess.getBabelDefinitionAccess().getStructParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:929:6: ( ruleConst )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:929:6: ( ruleConst )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:930:1: ruleConst
                    {
                     before(grammarAccess.getBabelDefinitionAccess().getConstParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleConst_in_rule__BabelDefinition__Alternatives1919);
                    ruleConst();

                    state._fsp--;

                     after(grammarAccess.getBabelDefinitionAccess().getConstParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:935:6: ( ruleService )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:935:6: ( ruleService )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:936:1: ruleService
                    {
                     before(grammarAccess.getBabelDefinitionAccess().getServiceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleService_in_rule__BabelDefinition__Alternatives1936);
                    ruleService();

                    state._fsp--;

                     after(grammarAccess.getBabelDefinitionAccess().getServiceParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelDefinition__Alternatives"


    // $ANTLR start "rule__LineTerm__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:946:1: rule__LineTerm__Alternatives : ( ( ',' ) | ( ';' ) );
    public final void rule__LineTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:950:1: ( ( ',' ) | ( ';' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:951:1: ( ',' )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:951:1: ( ',' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:952:1: ','
                    {
                     before(grammarAccess.getLineTermAccess().getCommaKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__LineTerm__Alternatives1969); 
                     after(grammarAccess.getLineTermAccess().getCommaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:959:6: ( ';' )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:959:6: ( ';' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:960:1: ';'
                    {
                     before(grammarAccess.getLineTermAccess().getSemicolonKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__LineTerm__Alternatives1989); 
                     after(grammarAccess.getLineTermAccess().getSemicolonKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LineTerm__Alternatives"


    // $ANTLR start "rule__ConstValueType__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:972:1: rule__ConstValueType__Alternatives : ( ( ( rule__ConstValueType__StringValAssignment_0 ) ) | ( ( rule__ConstValueType__BoolValAssignment_1 ) ) | ( ( rule__ConstValueType__NumValAssignment_2 ) ) );
    public final void rule__ConstValueType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:976:1: ( ( ( rule__ConstValueType__StringValAssignment_0 ) ) | ( ( rule__ConstValueType__BoolValAssignment_1 ) ) | ( ( rule__ConstValueType__NumValAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_BOOL:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
            case 43:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:977:1: ( ( rule__ConstValueType__StringValAssignment_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:977:1: ( ( rule__ConstValueType__StringValAssignment_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:978:1: ( rule__ConstValueType__StringValAssignment_0 )
                    {
                     before(grammarAccess.getConstValueTypeAccess().getStringValAssignment_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:979:1: ( rule__ConstValueType__StringValAssignment_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:979:2: rule__ConstValueType__StringValAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ConstValueType__StringValAssignment_0_in_rule__ConstValueType__Alternatives2023);
                    rule__ConstValueType__StringValAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstValueTypeAccess().getStringValAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:983:6: ( ( rule__ConstValueType__BoolValAssignment_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:983:6: ( ( rule__ConstValueType__BoolValAssignment_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:984:1: ( rule__ConstValueType__BoolValAssignment_1 )
                    {
                     before(grammarAccess.getConstValueTypeAccess().getBoolValAssignment_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:985:1: ( rule__ConstValueType__BoolValAssignment_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:985:2: rule__ConstValueType__BoolValAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ConstValueType__BoolValAssignment_1_in_rule__ConstValueType__Alternatives2041);
                    rule__ConstValueType__BoolValAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstValueTypeAccess().getBoolValAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:989:6: ( ( rule__ConstValueType__NumValAssignment_2 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:989:6: ( ( rule__ConstValueType__NumValAssignment_2 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:990:1: ( rule__ConstValueType__NumValAssignment_2 )
                    {
                     before(grammarAccess.getConstValueTypeAccess().getNumValAssignment_2()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:991:1: ( rule__ConstValueType__NumValAssignment_2 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:991:2: rule__ConstValueType__NumValAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ConstValueType__NumValAssignment_2_in_rule__ConstValueType__Alternatives2059);
                    rule__ConstValueType__NumValAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstValueTypeAccess().getNumValAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstValueType__Alternatives"


    // $ANTLR start "rule__Property__Alternatives_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1000:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__DateTypeAssignment_2_0 ) ) | ( ( rule__Property__ElementTypeAssignment_2_1 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1004:1: ( ( ( rule__Property__DateTypeAssignment_2_0 ) ) | ( ( rule__Property__ElementTypeAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=30)||LA5_0==50||LA5_0==53) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1005:1: ( ( rule__Property__DateTypeAssignment_2_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1005:1: ( ( rule__Property__DateTypeAssignment_2_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1006:1: ( rule__Property__DateTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getDateTypeAssignment_2_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1007:1: ( rule__Property__DateTypeAssignment_2_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1007:2: rule__Property__DateTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Property__DateTypeAssignment_2_0_in_rule__Property__Alternatives_22092);
                    rule__Property__DateTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getDateTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1011:6: ( ( rule__Property__ElementTypeAssignment_2_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1011:6: ( ( rule__Property__ElementTypeAssignment_2_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1012:1: ( rule__Property__ElementTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getElementTypeAssignment_2_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1013:1: ( rule__Property__ElementTypeAssignment_2_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1013:2: rule__Property__ElementTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Property__ElementTypeAssignment_2_1_in_rule__Property__Alternatives_22110);
                    rule__Property__ElementTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getElementTypeAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives_2"


    // $ANTLR start "rule__ServiceMethodReturnType__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1022:1: rule__ServiceMethodReturnType__Alternatives : ( ( ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 ) ) | ( ( rule__ServiceMethodReturnType__DataTypeAssignment_1 ) ) | ( ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 ) ) );
    public final void rule__ServiceMethodReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1026:1: ( ( ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 ) ) | ( ( rule__ServiceMethodReturnType__DataTypeAssignment_1 ) ) | ( ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt6=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 50:
            case 53:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1027:1: ( ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1027:1: ( ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1028:1: ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 )
                    {
                     before(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeAssignment_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1029:1: ( rule__ServiceMethodReturnType__VoidTypeAssignment_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1029:2: rule__ServiceMethodReturnType__VoidTypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ServiceMethodReturnType__VoidTypeAssignment_0_in_rule__ServiceMethodReturnType__Alternatives2143);
                    rule__ServiceMethodReturnType__VoidTypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1033:6: ( ( rule__ServiceMethodReturnType__DataTypeAssignment_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1033:6: ( ( rule__ServiceMethodReturnType__DataTypeAssignment_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1034:1: ( rule__ServiceMethodReturnType__DataTypeAssignment_1 )
                    {
                     before(grammarAccess.getServiceMethodReturnTypeAccess().getDataTypeAssignment_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1035:1: ( rule__ServiceMethodReturnType__DataTypeAssignment_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1035:2: rule__ServiceMethodReturnType__DataTypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ServiceMethodReturnType__DataTypeAssignment_1_in_rule__ServiceMethodReturnType__Alternatives2161);
                    rule__ServiceMethodReturnType__DataTypeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceMethodReturnTypeAccess().getDataTypeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1039:6: ( ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1039:6: ( ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1040:1: ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 )
                    {
                     before(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeAssignment_2()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1041:1: ( rule__ServiceMethodReturnType__ElementTypeAssignment_2 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1041:2: rule__ServiceMethodReturnType__ElementTypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ServiceMethodReturnType__ElementTypeAssignment_2_in_rule__ServiceMethodReturnType__Alternatives2179);
                    rule__ServiceMethodReturnType__ElementTypeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethodReturnType__Alternatives"


    // $ANTLR start "rule__DataTypeReference__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1050:1: rule__DataTypeReference__Alternatives : ( ( ( rule__DataTypeReference__TypeAssignment_0 ) ) | ( ruleListType ) | ( ruleMapType ) );
    public final void rule__DataTypeReference__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1054:1: ( ( ( rule__DataTypeReference__TypeAssignment_0 ) ) | ( ruleListType ) | ( ruleMapType ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt7=1;
                }
                break;
            case 50:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1055:1: ( ( rule__DataTypeReference__TypeAssignment_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1055:1: ( ( rule__DataTypeReference__TypeAssignment_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1056:1: ( rule__DataTypeReference__TypeAssignment_0 )
                    {
                     before(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1057:1: ( rule__DataTypeReference__TypeAssignment_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1057:2: rule__DataTypeReference__TypeAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DataTypeReference__TypeAssignment_0_in_rule__DataTypeReference__Alternatives2212);
                    rule__DataTypeReference__TypeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeReferenceAccess().getTypeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1061:6: ( ruleListType )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1061:6: ( ruleListType )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1062:1: ruleListType
                    {
                     before(grammarAccess.getDataTypeReferenceAccess().getListTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListType_in_rule__DataTypeReference__Alternatives2230);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeReferenceAccess().getListTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1067:6: ( ruleMapType )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1067:6: ( ruleMapType )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1068:1: ruleMapType
                    {
                     before(grammarAccess.getDataTypeReferenceAccess().getMapTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleMapType_in_rule__DataTypeReference__Alternatives2247);
                    ruleMapType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeReferenceAccess().getMapTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeReference__Alternatives"


    // $ANTLR start "rule__ListType__Alternatives_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1079:1: rule__ListType__Alternatives_2 : ( ( ( rule__ListType__DateTypeAssignment_2_0 ) ) | ( ( rule__ListType__ElementTypeAssignment_2_1 ) ) );
    public final void rule__ListType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1083:1: ( ( ( rule__ListType__DateTypeAssignment_2_0 ) ) | ( ( rule__ListType__ElementTypeAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=15 && LA8_0<=30)||LA8_0==50||LA8_0==53) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1084:1: ( ( rule__ListType__DateTypeAssignment_2_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1084:1: ( ( rule__ListType__DateTypeAssignment_2_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1085:1: ( rule__ListType__DateTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getListTypeAccess().getDateTypeAssignment_2_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1086:1: ( rule__ListType__DateTypeAssignment_2_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1086:2: rule__ListType__DateTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ListType__DateTypeAssignment_2_0_in_rule__ListType__Alternatives_22280);
                    rule__ListType__DateTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListTypeAccess().getDateTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1090:6: ( ( rule__ListType__ElementTypeAssignment_2_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1090:6: ( ( rule__ListType__ElementTypeAssignment_2_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1091:1: ( rule__ListType__ElementTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getListTypeAccess().getElementTypeAssignment_2_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1092:1: ( rule__ListType__ElementTypeAssignment_2_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1092:2: rule__ListType__ElementTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ListType__ElementTypeAssignment_2_1_in_rule__ListType__Alternatives_22298);
                    rule__ListType__ElementTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListTypeAccess().getElementTypeAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Alternatives_2"


    // $ANTLR start "rule__MapType__Alternatives_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1101:1: rule__MapType__Alternatives_2 : ( ( ( rule__MapType__KeyDataTypeAssignment_2_0 ) ) | ( ( rule__MapType__KeyElementTypeAssignment_2_1 ) ) );
    public final void rule__MapType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1105:1: ( ( ( rule__MapType__KeyDataTypeAssignment_2_0 ) ) | ( ( rule__MapType__KeyElementTypeAssignment_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=15 && LA9_0<=30)||LA9_0==50||LA9_0==53) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1106:1: ( ( rule__MapType__KeyDataTypeAssignment_2_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1106:1: ( ( rule__MapType__KeyDataTypeAssignment_2_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1107:1: ( rule__MapType__KeyDataTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getKeyDataTypeAssignment_2_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1108:1: ( rule__MapType__KeyDataTypeAssignment_2_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1108:2: rule__MapType__KeyDataTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__MapType__KeyDataTypeAssignment_2_0_in_rule__MapType__Alternatives_22331);
                    rule__MapType__KeyDataTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getKeyDataTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1112:6: ( ( rule__MapType__KeyElementTypeAssignment_2_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1112:6: ( ( rule__MapType__KeyElementTypeAssignment_2_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1113:1: ( rule__MapType__KeyElementTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getKeyElementTypeAssignment_2_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1114:1: ( rule__MapType__KeyElementTypeAssignment_2_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1114:2: rule__MapType__KeyElementTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__MapType__KeyElementTypeAssignment_2_1_in_rule__MapType__Alternatives_22349);
                    rule__MapType__KeyElementTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getKeyElementTypeAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Alternatives_2"


    // $ANTLR start "rule__MapType__Alternatives_4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1123:1: rule__MapType__Alternatives_4 : ( ( ( rule__MapType__ValDataTypeAssignment_4_0 ) ) | ( ( rule__MapType__ValElementTypeAssignment_4_1 ) ) );
    public final void rule__MapType__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1127:1: ( ( ( rule__MapType__ValDataTypeAssignment_4_0 ) ) | ( ( rule__MapType__ValElementTypeAssignment_4_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=15 && LA10_0<=30)||LA10_0==50||LA10_0==53) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1128:1: ( ( rule__MapType__ValDataTypeAssignment_4_0 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1128:1: ( ( rule__MapType__ValDataTypeAssignment_4_0 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1129:1: ( rule__MapType__ValDataTypeAssignment_4_0 )
                    {
                     before(grammarAccess.getMapTypeAccess().getValDataTypeAssignment_4_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1130:1: ( rule__MapType__ValDataTypeAssignment_4_0 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1130:2: rule__MapType__ValDataTypeAssignment_4_0
                    {
                    pushFollow(FOLLOW_rule__MapType__ValDataTypeAssignment_4_0_in_rule__MapType__Alternatives_42382);
                    rule__MapType__ValDataTypeAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getValDataTypeAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1134:6: ( ( rule__MapType__ValElementTypeAssignment_4_1 ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1134:6: ( ( rule__MapType__ValElementTypeAssignment_4_1 ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1135:1: ( rule__MapType__ValElementTypeAssignment_4_1 )
                    {
                     before(grammarAccess.getMapTypeAccess().getValElementTypeAssignment_4_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1136:1: ( rule__MapType__ValElementTypeAssignment_4_1 )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1136:2: rule__MapType__ValElementTypeAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__MapType__ValElementTypeAssignment_4_1_in_rule__MapType__Alternatives_42400);
                    rule__MapType__ValElementTypeAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapTypeAccess().getValElementTypeAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Alternatives_4"


    // $ANTLR start "rule__CommentType__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1145:1: rule__CommentType__Alternatives : ( ( RULE_SL_COMMENT ) | ( RULE_ML_COMMENT ) );
    public final void rule__CommentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1149:1: ( ( RULE_SL_COMMENT ) | ( RULE_ML_COMMENT ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_SL_COMMENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ML_COMMENT) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1150:1: ( RULE_SL_COMMENT )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1150:1: ( RULE_SL_COMMENT )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1151:1: RULE_SL_COMMENT
                    {
                     before(grammarAccess.getCommentTypeAccess().getSL_COMMENTTerminalRuleCall_0()); 
                    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__CommentType__Alternatives2433); 
                     after(grammarAccess.getCommentTypeAccess().getSL_COMMENTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1156:6: ( RULE_ML_COMMENT )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1156:6: ( RULE_ML_COMMENT )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1157:1: RULE_ML_COMMENT
                    {
                     before(grammarAccess.getCommentTypeAccess().getML_COMMENTTerminalRuleCall_1()); 
                    match(input,RULE_ML_COMMENT,FOLLOW_RULE_ML_COMMENT_in_rule__CommentType__Alternatives2450); 
                     after(grammarAccess.getCommentTypeAccess().getML_COMMENTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentType__Alternatives"


    // $ANTLR start "rule__DataTypeEnum__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1167:1: rule__DataTypeEnum__Alternatives : ( ( ( 'bool' ) ) | ( ( 'byte' ) ) | ( ( 'uint16' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sbyte' ) ) | ( ( 'int16' ) ) | ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'float32' ) ) | ( ( 'float64' ) ) | ( ( 'string' ) ) | ( ( 'datetime' ) ) | ( ( 'decimal' ) ) | ( ( 'char' ) ) | ( ( 'binary' ) ) );
    public final void rule__DataTypeEnum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1171:1: ( ( ( 'bool' ) ) | ( ( 'byte' ) ) | ( ( 'uint16' ) ) | ( ( 'uint32' ) ) | ( ( 'uint64' ) ) | ( ( 'sbyte' ) ) | ( ( 'int16' ) ) | ( ( 'int32' ) ) | ( ( 'int64' ) ) | ( ( 'float32' ) ) | ( ( 'float64' ) ) | ( ( 'string' ) ) | ( ( 'datetime' ) ) | ( ( 'decimal' ) ) | ( ( 'char' ) ) | ( ( 'binary' ) ) )
            int alt12=16;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            case 18:
                {
                alt12=4;
                }
                break;
            case 19:
                {
                alt12=5;
                }
                break;
            case 20:
                {
                alt12=6;
                }
                break;
            case 21:
                {
                alt12=7;
                }
                break;
            case 22:
                {
                alt12=8;
                }
                break;
            case 23:
                {
                alt12=9;
                }
                break;
            case 24:
                {
                alt12=10;
                }
                break;
            case 25:
                {
                alt12=11;
                }
                break;
            case 26:
                {
                alt12=12;
                }
                break;
            case 27:
                {
                alt12=13;
                }
                break;
            case 28:
                {
                alt12=14;
                }
                break;
            case 29:
                {
                alt12=15;
                }
                break;
            case 30:
                {
                alt12=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1172:1: ( ( 'bool' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1172:1: ( ( 'bool' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1173:1: ( 'bool' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getBOOLEnumLiteralDeclaration_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1174:1: ( 'bool' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1174:3: 'bool'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataTypeEnum__Alternatives2483); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getBOOLEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1179:6: ( ( 'byte' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1179:6: ( ( 'byte' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1180:1: ( 'byte' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1181:1: ( 'byte' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1181:3: 'byte'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataTypeEnum__Alternatives2504); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getBYTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1186:6: ( ( 'uint16' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1186:6: ( ( 'uint16' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1187:1: ( 'uint16' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getUNIT16EnumLiteralDeclaration_2()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1188:1: ( 'uint16' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1188:3: 'uint16'
                    {
                    match(input,17,FOLLOW_17_in_rule__DataTypeEnum__Alternatives2525); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getUNIT16EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1193:6: ( ( 'uint32' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1193:6: ( ( 'uint32' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1194:1: ( 'uint32' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getUINT32EnumLiteralDeclaration_3()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1195:1: ( 'uint32' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1195:3: 'uint32'
                    {
                    match(input,18,FOLLOW_18_in_rule__DataTypeEnum__Alternatives2546); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getUINT32EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1200:6: ( ( 'uint64' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1200:6: ( ( 'uint64' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1201:1: ( 'uint64' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getUNIT64EnumLiteralDeclaration_4()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1202:1: ( 'uint64' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1202:3: 'uint64'
                    {
                    match(input,19,FOLLOW_19_in_rule__DataTypeEnum__Alternatives2567); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getUNIT64EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1207:6: ( ( 'sbyte' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1207:6: ( ( 'sbyte' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1208:1: ( 'sbyte' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getSBYTEEnumLiteralDeclaration_5()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1209:1: ( 'sbyte' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1209:3: 'sbyte'
                    {
                    match(input,20,FOLLOW_20_in_rule__DataTypeEnum__Alternatives2588); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getSBYTEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1214:6: ( ( 'int16' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1214:6: ( ( 'int16' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1215:1: ( 'int16' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getINT16EnumLiteralDeclaration_6()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1216:1: ( 'int16' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1216:3: 'int16'
                    {
                    match(input,21,FOLLOW_21_in_rule__DataTypeEnum__Alternatives2609); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getINT16EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1221:6: ( ( 'int32' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1221:6: ( ( 'int32' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1222:1: ( 'int32' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getINT32EnumLiteralDeclaration_7()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1223:1: ( 'int32' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1223:3: 'int32'
                    {
                    match(input,22,FOLLOW_22_in_rule__DataTypeEnum__Alternatives2630); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getINT32EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1228:6: ( ( 'int64' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1228:6: ( ( 'int64' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1229:1: ( 'int64' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getINT64EnumLiteralDeclaration_8()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1230:1: ( 'int64' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1230:3: 'int64'
                    {
                    match(input,23,FOLLOW_23_in_rule__DataTypeEnum__Alternatives2651); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getINT64EnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1235:6: ( ( 'float32' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1235:6: ( ( 'float32' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1236:1: ( 'float32' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getFLOAT32EnumLiteralDeclaration_9()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1237:1: ( 'float32' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1237:3: 'float32'
                    {
                    match(input,24,FOLLOW_24_in_rule__DataTypeEnum__Alternatives2672); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getFLOAT32EnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1242:6: ( ( 'float64' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1242:6: ( ( 'float64' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1243:1: ( 'float64' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getFLOAT64EnumLiteralDeclaration_10()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1244:1: ( 'float64' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1244:3: 'float64'
                    {
                    match(input,25,FOLLOW_25_in_rule__DataTypeEnum__Alternatives2693); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getFLOAT64EnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1249:6: ( ( 'string' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1249:6: ( ( 'string' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1250:1: ( 'string' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_11()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1251:1: ( 'string' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1251:3: 'string'
                    {
                    match(input,26,FOLLOW_26_in_rule__DataTypeEnum__Alternatives2714); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getSTRINGEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1256:6: ( ( 'datetime' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1256:6: ( ( 'datetime' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1257:1: ( 'datetime' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getDATETIMEEnumLiteralDeclaration_12()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1258:1: ( 'datetime' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1258:3: 'datetime'
                    {
                    match(input,27,FOLLOW_27_in_rule__DataTypeEnum__Alternatives2735); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getDATETIMEEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1263:6: ( ( 'decimal' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1263:6: ( ( 'decimal' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1264:1: ( 'decimal' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getDECIMALEnumLiteralDeclaration_13()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1265:1: ( 'decimal' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1265:3: 'decimal'
                    {
                    match(input,28,FOLLOW_28_in_rule__DataTypeEnum__Alternatives2756); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getDECIMALEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1270:6: ( ( 'char' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1270:6: ( ( 'char' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1271:1: ( 'char' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_14()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1272:1: ( 'char' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1272:3: 'char'
                    {
                    match(input,29,FOLLOW_29_in_rule__DataTypeEnum__Alternatives2777); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getCHAREnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1277:6: ( ( 'binary' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1277:6: ( ( 'binary' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1278:1: ( 'binary' )
                    {
                     before(grammarAccess.getDataTypeEnumAccess().getBINARYEnumLiteralDeclaration_15()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1279:1: ( 'binary' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1279:3: 'binary'
                    {
                    match(input,30,FOLLOW_30_in_rule__DataTypeEnum__Alternatives2798); 

                    }

                     after(grammarAccess.getDataTypeEnumAccess().getBINARYEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeEnum__Alternatives"


    // $ANTLR start "rule__SupportedLangs__Alternatives"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1289:1: rule__SupportedLangs__Alternatives : ( ( ( 'java' ) ) | ( ( 'csharp' ) ) | ( ( 'asp' ) ) );
    public final void rule__SupportedLangs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1293:1: ( ( ( 'java' ) ) | ( ( 'csharp' ) ) | ( ( 'asp' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt13=1;
                }
                break;
            case 32:
                {
                alt13=2;
                }
                break;
            case 33:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1294:1: ( ( 'java' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1294:1: ( ( 'java' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1295:1: ( 'java' )
                    {
                     before(grammarAccess.getSupportedLangsAccess().getJAVAEnumLiteralDeclaration_0()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1296:1: ( 'java' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1296:3: 'java'
                    {
                    match(input,31,FOLLOW_31_in_rule__SupportedLangs__Alternatives2834); 

                    }

                     after(grammarAccess.getSupportedLangsAccess().getJAVAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1301:6: ( ( 'csharp' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1301:6: ( ( 'csharp' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1302:1: ( 'csharp' )
                    {
                     before(grammarAccess.getSupportedLangsAccess().getCSHARPEnumLiteralDeclaration_1()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1303:1: ( 'csharp' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1303:3: 'csharp'
                    {
                    match(input,32,FOLLOW_32_in_rule__SupportedLangs__Alternatives2855); 

                    }

                     after(grammarAccess.getSupportedLangsAccess().getCSHARPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1308:6: ( ( 'asp' ) )
                    {
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1308:6: ( ( 'asp' ) )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1309:1: ( 'asp' )
                    {
                     before(grammarAccess.getSupportedLangsAccess().getASPEnumLiteralDeclaration_2()); 
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1310:1: ( 'asp' )
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1310:3: 'asp'
                    {
                    match(input,33,FOLLOW_33_in_rule__SupportedLangs__Alternatives2876); 

                    }

                     after(grammarAccess.getSupportedLangsAccess().getASPEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedLangs__Alternatives"


    // $ANTLR start "rule__BabelIdl__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1322:1: rule__BabelIdl__Group__0 : rule__BabelIdl__Group__0__Impl rule__BabelIdl__Group__1 ;
    public final void rule__BabelIdl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1326:1: ( rule__BabelIdl__Group__0__Impl rule__BabelIdl__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1327:2: rule__BabelIdl__Group__0__Impl rule__BabelIdl__Group__1
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__0__Impl_in_rule__BabelIdl__Group__02909);
            rule__BabelIdl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BabelIdl__Group__1_in_rule__BabelIdl__Group__02912);
            rule__BabelIdl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__0"


    // $ANTLR start "rule__BabelIdl__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1334:1: rule__BabelIdl__Group__0__Impl : ( ( rule__BabelIdl__CommentAssignment_0 )* ) ;
    public final void rule__BabelIdl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1338:1: ( ( ( rule__BabelIdl__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1339:1: ( ( rule__BabelIdl__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1339:1: ( ( rule__BabelIdl__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1340:1: ( rule__BabelIdl__CommentAssignment_0 )*
            {
             before(grammarAccess.getBabelIdlAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1341:1: ( rule__BabelIdl__CommentAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_SL_COMMENT && LA14_0<=RULE_ML_COMMENT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1341:2: rule__BabelIdl__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__BabelIdl__CommentAssignment_0_in_rule__BabelIdl__Group__0__Impl2939);
            	    rule__BabelIdl__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBabelIdlAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__0__Impl"


    // $ANTLR start "rule__BabelIdl__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1351:1: rule__BabelIdl__Group__1 : rule__BabelIdl__Group__1__Impl rule__BabelIdl__Group__2 ;
    public final void rule__BabelIdl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1355:1: ( rule__BabelIdl__Group__1__Impl rule__BabelIdl__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1356:2: rule__BabelIdl__Group__1__Impl rule__BabelIdl__Group__2
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__1__Impl_in_rule__BabelIdl__Group__12970);
            rule__BabelIdl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BabelIdl__Group__2_in_rule__BabelIdl__Group__12973);
            rule__BabelIdl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__1"


    // $ANTLR start "rule__BabelIdl__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1363:1: rule__BabelIdl__Group__1__Impl : ( ( rule__BabelIdl__ImportsAssignment_1 )* ) ;
    public final void rule__BabelIdl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1367:1: ( ( ( rule__BabelIdl__ImportsAssignment_1 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1368:1: ( ( rule__BabelIdl__ImportsAssignment_1 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1368:1: ( ( rule__BabelIdl__ImportsAssignment_1 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1369:1: ( rule__BabelIdl__ImportsAssignment_1 )*
            {
             before(grammarAccess.getBabelIdlAccess().getImportsAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1370:1: ( rule__BabelIdl__ImportsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1370:2: rule__BabelIdl__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__BabelIdl__ImportsAssignment_1_in_rule__BabelIdl__Group__1__Impl3000);
            	    rule__BabelIdl__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getBabelIdlAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__1__Impl"


    // $ANTLR start "rule__BabelIdl__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1380:1: rule__BabelIdl__Group__2 : rule__BabelIdl__Group__2__Impl rule__BabelIdl__Group__3 ;
    public final void rule__BabelIdl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1384:1: ( rule__BabelIdl__Group__2__Impl rule__BabelIdl__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1385:2: rule__BabelIdl__Group__2__Impl rule__BabelIdl__Group__3
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__2__Impl_in_rule__BabelIdl__Group__23031);
            rule__BabelIdl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BabelIdl__Group__3_in_rule__BabelIdl__Group__23034);
            rule__BabelIdl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__2"


    // $ANTLR start "rule__BabelIdl__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1392:1: rule__BabelIdl__Group__2__Impl : ( ( rule__BabelIdl__DefaultNamespaceAssignment_2 ) ) ;
    public final void rule__BabelIdl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1396:1: ( ( ( rule__BabelIdl__DefaultNamespaceAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1397:1: ( ( rule__BabelIdl__DefaultNamespaceAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1397:1: ( ( rule__BabelIdl__DefaultNamespaceAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1398:1: ( rule__BabelIdl__DefaultNamespaceAssignment_2 )
            {
             before(grammarAccess.getBabelIdlAccess().getDefaultNamespaceAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1399:1: ( rule__BabelIdl__DefaultNamespaceAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1399:2: rule__BabelIdl__DefaultNamespaceAssignment_2
            {
            pushFollow(FOLLOW_rule__BabelIdl__DefaultNamespaceAssignment_2_in_rule__BabelIdl__Group__2__Impl3061);
            rule__BabelIdl__DefaultNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBabelIdlAccess().getDefaultNamespaceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__2__Impl"


    // $ANTLR start "rule__BabelIdl__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1409:1: rule__BabelIdl__Group__3 : rule__BabelIdl__Group__3__Impl rule__BabelIdl__Group__4 ;
    public final void rule__BabelIdl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1413:1: ( rule__BabelIdl__Group__3__Impl rule__BabelIdl__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1414:2: rule__BabelIdl__Group__3__Impl rule__BabelIdl__Group__4
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__3__Impl_in_rule__BabelIdl__Group__33091);
            rule__BabelIdl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BabelIdl__Group__4_in_rule__BabelIdl__Group__33094);
            rule__BabelIdl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__3"


    // $ANTLR start "rule__BabelIdl__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1421:1: rule__BabelIdl__Group__3__Impl : ( ( rule__BabelIdl__NamespacesAssignment_3 )* ) ;
    public final void rule__BabelIdl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1425:1: ( ( ( rule__BabelIdl__NamespacesAssignment_3 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1426:1: ( ( rule__BabelIdl__NamespacesAssignment_3 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1426:1: ( ( rule__BabelIdl__NamespacesAssignment_3 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1427:1: ( rule__BabelIdl__NamespacesAssignment_3 )*
            {
             before(grammarAccess.getBabelIdlAccess().getNamespacesAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1428:1: ( rule__BabelIdl__NamespacesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1428:2: rule__BabelIdl__NamespacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BabelIdl__NamespacesAssignment_3_in_rule__BabelIdl__Group__3__Impl3121);
            	    rule__BabelIdl__NamespacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getBabelIdlAccess().getNamespacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__3__Impl"


    // $ANTLR start "rule__BabelIdl__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1438:1: rule__BabelIdl__Group__4 : rule__BabelIdl__Group__4__Impl ;
    public final void rule__BabelIdl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1442:1: ( rule__BabelIdl__Group__4__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1443:2: rule__BabelIdl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__BabelIdl__Group__4__Impl_in_rule__BabelIdl__Group__43152);
            rule__BabelIdl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__4"


    // $ANTLR start "rule__BabelIdl__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1449:1: rule__BabelIdl__Group__4__Impl : ( ( rule__BabelIdl__DefinitionsAssignment_4 )* ) ;
    public final void rule__BabelIdl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1453:1: ( ( ( rule__BabelIdl__DefinitionsAssignment_4 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1454:1: ( ( rule__BabelIdl__DefinitionsAssignment_4 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1454:1: ( ( rule__BabelIdl__DefinitionsAssignment_4 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1455:1: ( rule__BabelIdl__DefinitionsAssignment_4 )*
            {
             before(grammarAccess.getBabelIdlAccess().getDefinitionsAssignment_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1456:1: ( rule__BabelIdl__DefinitionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_SL_COMMENT && LA17_0<=RULE_ML_COMMENT)||LA17_0==RULE_ATTR||LA17_0==38||LA17_0==42||LA17_0==44||LA17_0==47||LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1456:2: rule__BabelIdl__DefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__BabelIdl__DefinitionsAssignment_4_in_rule__BabelIdl__Group__4__Impl3179);
            	    rule__BabelIdl__DefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBabelIdlAccess().getDefinitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__Group__4__Impl"


    // $ANTLR start "rule__Namespace__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1476:1: rule__Namespace__Group__0 : rule__Namespace__Group__0__Impl rule__Namespace__Group__1 ;
    public final void rule__Namespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1480:1: ( rule__Namespace__Group__0__Impl rule__Namespace__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1481:2: rule__Namespace__Group__0__Impl rule__Namespace__Group__1
            {
            pushFollow(FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03220);
            rule__Namespace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03223);
            rule__Namespace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0"


    // $ANTLR start "rule__Namespace__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1488:1: rule__Namespace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__Namespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1492:1: ( ( 'namespace' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1493:1: ( 'namespace' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1493:1: ( 'namespace' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1494:1: 'namespace'
            {
             before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Namespace__Group__0__Impl3251); 
             after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__0__Impl"


    // $ANTLR start "rule__Namespace__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1507:1: rule__Namespace__Group__1 : rule__Namespace__Group__1__Impl rule__Namespace__Group__2 ;
    public final void rule__Namespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1511:1: ( rule__Namespace__Group__1__Impl rule__Namespace__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1512:2: rule__Namespace__Group__1__Impl rule__Namespace__Group__2
            {
            pushFollow(FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13282);
            rule__Namespace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__13285);
            rule__Namespace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1"


    // $ANTLR start "rule__Namespace__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1519:1: rule__Namespace__Group__1__Impl : ( ( rule__Namespace__LangAssignment_1 ) ) ;
    public final void rule__Namespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1523:1: ( ( ( rule__Namespace__LangAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1524:1: ( ( rule__Namespace__LangAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1524:1: ( ( rule__Namespace__LangAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1525:1: ( rule__Namespace__LangAssignment_1 )
            {
             before(grammarAccess.getNamespaceAccess().getLangAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1526:1: ( rule__Namespace__LangAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1526:2: rule__Namespace__LangAssignment_1
            {
            pushFollow(FOLLOW_rule__Namespace__LangAssignment_1_in_rule__Namespace__Group__1__Impl3312);
            rule__Namespace__LangAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getLangAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__1__Impl"


    // $ANTLR start "rule__Namespace__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1536:1: rule__Namespace__Group__2 : rule__Namespace__Group__2__Impl ;
    public final void rule__Namespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1540:1: ( rule__Namespace__Group__2__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1541:2: rule__Namespace__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__23342);
            rule__Namespace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2"


    // $ANTLR start "rule__Namespace__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1547:1: rule__Namespace__Group__2__Impl : ( ( rule__Namespace__NsAssignment_2 ) ) ;
    public final void rule__Namespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1551:1: ( ( ( rule__Namespace__NsAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1552:1: ( ( rule__Namespace__NsAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1552:1: ( ( rule__Namespace__NsAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1553:1: ( rule__Namespace__NsAssignment_2 )
            {
             before(grammarAccess.getNamespaceAccess().getNsAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1554:1: ( rule__Namespace__NsAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1554:2: rule__Namespace__NsAssignment_2
            {
            pushFollow(FOLLOW_rule__Namespace__NsAssignment_2_in_rule__Namespace__Group__2__Impl3369);
            rule__Namespace__NsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNamespaceAccess().getNsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__Group__2__Impl"


    // $ANTLR start "rule__DefaultNameSpace__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1570:1: rule__DefaultNameSpace__Group__0 : rule__DefaultNameSpace__Group__0__Impl rule__DefaultNameSpace__Group__1 ;
    public final void rule__DefaultNameSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1574:1: ( rule__DefaultNameSpace__Group__0__Impl rule__DefaultNameSpace__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1575:2: rule__DefaultNameSpace__Group__0__Impl rule__DefaultNameSpace__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__0__Impl_in_rule__DefaultNameSpace__Group__03405);
            rule__DefaultNameSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__1_in_rule__DefaultNameSpace__Group__03408);
            rule__DefaultNameSpace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__0"


    // $ANTLR start "rule__DefaultNameSpace__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1582:1: rule__DefaultNameSpace__Group__0__Impl : ( 'namespace' ) ;
    public final void rule__DefaultNameSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1586:1: ( ( 'namespace' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1587:1: ( 'namespace' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1587:1: ( 'namespace' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1588:1: 'namespace'
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getNamespaceKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__DefaultNameSpace__Group__0__Impl3436); 
             after(grammarAccess.getDefaultNameSpaceAccess().getNamespaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__0__Impl"


    // $ANTLR start "rule__DefaultNameSpace__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1601:1: rule__DefaultNameSpace__Group__1 : rule__DefaultNameSpace__Group__1__Impl rule__DefaultNameSpace__Group__2 ;
    public final void rule__DefaultNameSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1605:1: ( rule__DefaultNameSpace__Group__1__Impl rule__DefaultNameSpace__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1606:2: rule__DefaultNameSpace__Group__1__Impl rule__DefaultNameSpace__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__1__Impl_in_rule__DefaultNameSpace__Group__13467);
            rule__DefaultNameSpace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__2_in_rule__DefaultNameSpace__Group__13470);
            rule__DefaultNameSpace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__1"


    // $ANTLR start "rule__DefaultNameSpace__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1613:1: rule__DefaultNameSpace__Group__1__Impl : ( ( rule__DefaultNameSpace__DefAssignment_1 ) ) ;
    public final void rule__DefaultNameSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1617:1: ( ( ( rule__DefaultNameSpace__DefAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1618:1: ( ( rule__DefaultNameSpace__DefAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1618:1: ( ( rule__DefaultNameSpace__DefAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1619:1: ( rule__DefaultNameSpace__DefAssignment_1 )
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getDefAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1620:1: ( rule__DefaultNameSpace__DefAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1620:2: rule__DefaultNameSpace__DefAssignment_1
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__DefAssignment_1_in_rule__DefaultNameSpace__Group__1__Impl3497);
            rule__DefaultNameSpace__DefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultNameSpaceAccess().getDefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__1__Impl"


    // $ANTLR start "rule__DefaultNameSpace__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1630:1: rule__DefaultNameSpace__Group__2 : rule__DefaultNameSpace__Group__2__Impl ;
    public final void rule__DefaultNameSpace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1634:1: ( rule__DefaultNameSpace__Group__2__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1635:2: rule__DefaultNameSpace__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__Group__2__Impl_in_rule__DefaultNameSpace__Group__23527);
            rule__DefaultNameSpace__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__2"


    // $ANTLR start "rule__DefaultNameSpace__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1641:1: rule__DefaultNameSpace__Group__2__Impl : ( ( rule__DefaultNameSpace__NsAssignment_2 ) ) ;
    public final void rule__DefaultNameSpace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1645:1: ( ( ( rule__DefaultNameSpace__NsAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1646:1: ( ( rule__DefaultNameSpace__NsAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1646:1: ( ( rule__DefaultNameSpace__NsAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1647:1: ( rule__DefaultNameSpace__NsAssignment_2 )
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getNsAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1648:1: ( rule__DefaultNameSpace__NsAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1648:2: rule__DefaultNameSpace__NsAssignment_2
            {
            pushFollow(FOLLOW_rule__DefaultNameSpace__NsAssignment_2_in_rule__DefaultNameSpace__Group__2__Impl3554);
            rule__DefaultNameSpace__NsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDefaultNameSpaceAccess().getNsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__Group__2__Impl"


    // $ANTLR start "rule__DefaultQualifier__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1664:1: rule__DefaultQualifier__Group__0 : rule__DefaultQualifier__Group__0__Impl rule__DefaultQualifier__Group__1 ;
    public final void rule__DefaultQualifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1668:1: ( rule__DefaultQualifier__Group__0__Impl rule__DefaultQualifier__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1669:2: rule__DefaultQualifier__Group__0__Impl rule__DefaultQualifier__Group__1
            {
            pushFollow(FOLLOW_rule__DefaultQualifier__Group__0__Impl_in_rule__DefaultQualifier__Group__03590);
            rule__DefaultQualifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultQualifier__Group__1_in_rule__DefaultQualifier__Group__03593);
            rule__DefaultQualifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__0"


    // $ANTLR start "rule__DefaultQualifier__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1676:1: rule__DefaultQualifier__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DefaultQualifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1680:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1681:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1681:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1682:1: RULE_ID
            {
             before(grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultQualifier__Group__0__Impl3620); 
             after(grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__0__Impl"


    // $ANTLR start "rule__DefaultQualifier__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1693:1: rule__DefaultQualifier__Group__1 : rule__DefaultQualifier__Group__1__Impl rule__DefaultQualifier__Group__2 ;
    public final void rule__DefaultQualifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1697:1: ( rule__DefaultQualifier__Group__1__Impl rule__DefaultQualifier__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1698:2: rule__DefaultQualifier__Group__1__Impl rule__DefaultQualifier__Group__2
            {
            pushFollow(FOLLOW_rule__DefaultQualifier__Group__1__Impl_in_rule__DefaultQualifier__Group__13649);
            rule__DefaultQualifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DefaultQualifier__Group__2_in_rule__DefaultQualifier__Group__13652);
            rule__DefaultQualifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__1"


    // $ANTLR start "rule__DefaultQualifier__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1705:1: rule__DefaultQualifier__Group__1__Impl : ( '.' ) ;
    public final void rule__DefaultQualifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1709:1: ( ( '.' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1710:1: ( '.' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1710:1: ( '.' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1711:1: '.'
            {
             before(grammarAccess.getDefaultQualifierAccess().getFullStopKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__DefaultQualifier__Group__1__Impl3680); 
             after(grammarAccess.getDefaultQualifierAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__1__Impl"


    // $ANTLR start "rule__DefaultQualifier__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1724:1: rule__DefaultQualifier__Group__2 : rule__DefaultQualifier__Group__2__Impl ;
    public final void rule__DefaultQualifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1728:1: ( rule__DefaultQualifier__Group__2__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1729:2: rule__DefaultQualifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefaultQualifier__Group__2__Impl_in_rule__DefaultQualifier__Group__23711);
            rule__DefaultQualifier__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__2"


    // $ANTLR start "rule__DefaultQualifier__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1735:1: rule__DefaultQualifier__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__DefaultQualifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1739:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1740:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1740:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1741:1: RULE_ID
            {
             before(grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefaultQualifier__Group__2__Impl3738); 
             after(grammarAccess.getDefaultQualifierAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultQualifier__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1758:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1762:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1763:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03773);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03776);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1770:1: rule__QualifiedName__Group__0__Impl : ( '/' ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1774:1: ( ( '/' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1775:1: ( '/' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1775:1: ( '/' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1776:1: '/'
            {
             before(grammarAccess.getQualifiedNameAccess().getSolidusKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__QualifiedName__Group__0__Impl3804); 
             after(grammarAccess.getQualifiedNameAccess().getSolidusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1789:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1793:1: ( rule__QualifiedName__Group__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1794:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13835);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1800:1: rule__QualifiedName__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1804:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1805:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1805:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1806:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__1__Impl3862); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__ImportStatement__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1821:1: rule__ImportStatement__Group__0 : rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 ;
    public final void rule__ImportStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1825:1: ( rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1826:2: rule__ImportStatement__Group__0__Impl rule__ImportStatement__Group__1
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__0__Impl_in_rule__ImportStatement__Group__03895);
            rule__ImportStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportStatement__Group__1_in_rule__ImportStatement__Group__03898);
            rule__ImportStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__0"


    // $ANTLR start "rule__ImportStatement__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1833:1: rule__ImportStatement__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1837:1: ( ( 'import' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1838:1: ( 'import' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1838:1: ( 'import' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1839:1: 'import'
            {
             before(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__ImportStatement__Group__0__Impl3926); 
             after(grammarAccess.getImportStatementAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__0__Impl"


    // $ANTLR start "rule__ImportStatement__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1852:1: rule__ImportStatement__Group__1 : rule__ImportStatement__Group__1__Impl ;
    public final void rule__ImportStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1856:1: ( rule__ImportStatement__Group__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1857:2: rule__ImportStatement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportStatement__Group__1__Impl_in_rule__ImportStatement__Group__13957);
            rule__ImportStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__1"


    // $ANTLR start "rule__ImportStatement__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1863:1: rule__ImportStatement__Group__1__Impl : ( ( rule__ImportStatement__ImportURIAssignment_1 ) ) ;
    public final void rule__ImportStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1867:1: ( ( ( rule__ImportStatement__ImportURIAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1868:1: ( ( rule__ImportStatement__ImportURIAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1868:1: ( ( rule__ImportStatement__ImportURIAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1869:1: ( rule__ImportStatement__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportStatementAccess().getImportURIAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1870:1: ( rule__ImportStatement__ImportURIAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1870:2: rule__ImportStatement__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportStatement__ImportURIAssignment_1_in_rule__ImportStatement__Group__1__Impl3984);
            rule__ImportStatement__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportStatementAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1884:1: rule__Enum__Group__0 : rule__Enum__Group__0__Impl rule__Enum__Group__1 ;
    public final void rule__Enum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1888:1: ( rule__Enum__Group__0__Impl rule__Enum__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1889:2: rule__Enum__Group__0__Impl rule__Enum__Group__1
            {
            pushFollow(FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04018);
            rule__Enum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04021);
            rule__Enum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0"


    // $ANTLR start "rule__Enum__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1896:1: rule__Enum__Group__0__Impl : ( ( rule__Enum__CommentAssignment_0 )* ) ;
    public final void rule__Enum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1900:1: ( ( ( rule__Enum__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1901:1: ( ( rule__Enum__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1901:1: ( ( rule__Enum__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1902:1: ( rule__Enum__CommentAssignment_0 )*
            {
             before(grammarAccess.getEnumAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1903:1: ( rule__Enum__CommentAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_SL_COMMENT && LA18_0<=RULE_ML_COMMENT)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1903:2: rule__Enum__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Enum__CommentAssignment_0_in_rule__Enum__Group__0__Impl4048);
            	    rule__Enum__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__0__Impl"


    // $ANTLR start "rule__Enum__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1913:1: rule__Enum__Group__1 : rule__Enum__Group__1__Impl rule__Enum__Group__2 ;
    public final void rule__Enum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1917:1: ( rule__Enum__Group__1__Impl rule__Enum__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1918:2: rule__Enum__Group__1__Impl rule__Enum__Group__2
            {
            pushFollow(FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14079);
            rule__Enum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14082);
            rule__Enum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1"


    // $ANTLR start "rule__Enum__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1925:1: rule__Enum__Group__1__Impl : ( 'enum' ) ;
    public final void rule__Enum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1929:1: ( ( 'enum' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1930:1: ( 'enum' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1930:1: ( 'enum' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1931:1: 'enum'
            {
             before(grammarAccess.getEnumAccess().getEnumKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__Enum__Group__1__Impl4110); 
             after(grammarAccess.getEnumAccess().getEnumKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__1__Impl"


    // $ANTLR start "rule__Enum__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1944:1: rule__Enum__Group__2 : rule__Enum__Group__2__Impl rule__Enum__Group__3 ;
    public final void rule__Enum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1948:1: ( rule__Enum__Group__2__Impl rule__Enum__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1949:2: rule__Enum__Group__2__Impl rule__Enum__Group__3
            {
            pushFollow(FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24141);
            rule__Enum__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24144);
            rule__Enum__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2"


    // $ANTLR start "rule__Enum__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1956:1: rule__Enum__Group__2__Impl : ( ( rule__Enum__NameAssignment_2 ) ) ;
    public final void rule__Enum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1960:1: ( ( ( rule__Enum__NameAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1961:1: ( ( rule__Enum__NameAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1961:1: ( ( rule__Enum__NameAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1962:1: ( rule__Enum__NameAssignment_2 )
            {
             before(grammarAccess.getEnumAccess().getNameAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1963:1: ( rule__Enum__NameAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1963:2: rule__Enum__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4171);
            rule__Enum__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__2__Impl"


    // $ANTLR start "rule__Enum__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1973:1: rule__Enum__Group__3 : rule__Enum__Group__3__Impl rule__Enum__Group__4 ;
    public final void rule__Enum__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1977:1: ( rule__Enum__Group__3__Impl rule__Enum__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1978:2: rule__Enum__Group__3__Impl rule__Enum__Group__4
            {
            pushFollow(FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34201);
            rule__Enum__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34204);
            rule__Enum__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3"


    // $ANTLR start "rule__Enum__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1985:1: rule__Enum__Group__3__Impl : ( '{' ) ;
    public final void rule__Enum__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1989:1: ( ( '{' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1990:1: ( '{' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1990:1: ( '{' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:1991:1: '{'
            {
             before(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Enum__Group__3__Impl4232); 
             after(grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__3__Impl"


    // $ANTLR start "rule__Enum__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2004:1: rule__Enum__Group__4 : rule__Enum__Group__4__Impl rule__Enum__Group__5 ;
    public final void rule__Enum__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2008:1: ( rule__Enum__Group__4__Impl rule__Enum__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2009:2: rule__Enum__Group__4__Impl rule__Enum__Group__5
            {
            pushFollow(FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44263);
            rule__Enum__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__44266);
            rule__Enum__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4"


    // $ANTLR start "rule__Enum__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2016:1: rule__Enum__Group__4__Impl : ( ( rule__Enum__PropertiesAssignment_4 )* ) ;
    public final void rule__Enum__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2020:1: ( ( ( rule__Enum__PropertiesAssignment_4 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2021:1: ( ( rule__Enum__PropertiesAssignment_4 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2021:1: ( ( rule__Enum__PropertiesAssignment_4 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2022:1: ( rule__Enum__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getEnumAccess().getPropertiesAssignment_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2023:1: ( rule__Enum__PropertiesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_SL_COMMENT && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2023:2: rule__Enum__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Enum__PropertiesAssignment_4_in_rule__Enum__Group__4__Impl4293);
            	    rule__Enum__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEnumAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__4__Impl"


    // $ANTLR start "rule__Enum__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2033:1: rule__Enum__Group__5 : rule__Enum__Group__5__Impl ;
    public final void rule__Enum__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2037:1: ( rule__Enum__Group__5__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2038:2: rule__Enum__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__54324);
            rule__Enum__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5"


    // $ANTLR start "rule__Enum__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2044:1: rule__Enum__Group__5__Impl : ( '}' ) ;
    public final void rule__Enum__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2048:1: ( ( '}' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2049:1: ( '}' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2049:1: ( '}' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2050:1: '}'
            {
             before(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FOLLOW_40_in_rule__Enum__Group__5__Impl4352); 
             after(grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__Group__5__Impl"


    // $ANTLR start "rule__EnumProperty__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2075:1: rule__EnumProperty__Group__0 : rule__EnumProperty__Group__0__Impl rule__EnumProperty__Group__1 ;
    public final void rule__EnumProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2079:1: ( rule__EnumProperty__Group__0__Impl rule__EnumProperty__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2080:2: rule__EnumProperty__Group__0__Impl rule__EnumProperty__Group__1
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__0__Impl_in_rule__EnumProperty__Group__04395);
            rule__EnumProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumProperty__Group__1_in_rule__EnumProperty__Group__04398);
            rule__EnumProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__0"


    // $ANTLR start "rule__EnumProperty__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2087:1: rule__EnumProperty__Group__0__Impl : ( ( rule__EnumProperty__CommentAssignment_0 )* ) ;
    public final void rule__EnumProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2091:1: ( ( ( rule__EnumProperty__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2092:1: ( ( rule__EnumProperty__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2092:1: ( ( rule__EnumProperty__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2093:1: ( rule__EnumProperty__CommentAssignment_0 )*
            {
             before(grammarAccess.getEnumPropertyAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2094:1: ( rule__EnumProperty__CommentAssignment_0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_SL_COMMENT && LA20_0<=RULE_ML_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2094:2: rule__EnumProperty__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__EnumProperty__CommentAssignment_0_in_rule__EnumProperty__Group__0__Impl4425);
            	    rule__EnumProperty__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEnumPropertyAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__0__Impl"


    // $ANTLR start "rule__EnumProperty__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2104:1: rule__EnumProperty__Group__1 : rule__EnumProperty__Group__1__Impl rule__EnumProperty__Group__2 ;
    public final void rule__EnumProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2108:1: ( rule__EnumProperty__Group__1__Impl rule__EnumProperty__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2109:2: rule__EnumProperty__Group__1__Impl rule__EnumProperty__Group__2
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__1__Impl_in_rule__EnumProperty__Group__14456);
            rule__EnumProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumProperty__Group__2_in_rule__EnumProperty__Group__14459);
            rule__EnumProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__1"


    // $ANTLR start "rule__EnumProperty__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2116:1: rule__EnumProperty__Group__1__Impl : ( ( rule__EnumProperty__NameAssignment_1 ) ) ;
    public final void rule__EnumProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2120:1: ( ( ( rule__EnumProperty__NameAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2121:1: ( ( rule__EnumProperty__NameAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2121:1: ( ( rule__EnumProperty__NameAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2122:1: ( rule__EnumProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEnumPropertyAccess().getNameAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2123:1: ( rule__EnumProperty__NameAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2123:2: rule__EnumProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__EnumProperty__NameAssignment_1_in_rule__EnumProperty__Group__1__Impl4486);
            rule__EnumProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__1__Impl"


    // $ANTLR start "rule__EnumProperty__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2133:1: rule__EnumProperty__Group__2 : rule__EnumProperty__Group__2__Impl rule__EnumProperty__Group__3 ;
    public final void rule__EnumProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2137:1: ( rule__EnumProperty__Group__2__Impl rule__EnumProperty__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2138:2: rule__EnumProperty__Group__2__Impl rule__EnumProperty__Group__3
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__2__Impl_in_rule__EnumProperty__Group__24516);
            rule__EnumProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumProperty__Group__3_in_rule__EnumProperty__Group__24519);
            rule__EnumProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__2"


    // $ANTLR start "rule__EnumProperty__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2145:1: rule__EnumProperty__Group__2__Impl : ( '=' ) ;
    public final void rule__EnumProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2149:1: ( ( '=' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2150:1: ( '=' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2150:1: ( '=' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2151:1: '='
            {
             before(grammarAccess.getEnumPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__EnumProperty__Group__2__Impl4547); 
             after(grammarAccess.getEnumPropertyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__2__Impl"


    // $ANTLR start "rule__EnumProperty__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2164:1: rule__EnumProperty__Group__3 : rule__EnumProperty__Group__3__Impl rule__EnumProperty__Group__4 ;
    public final void rule__EnumProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2168:1: ( rule__EnumProperty__Group__3__Impl rule__EnumProperty__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2169:2: rule__EnumProperty__Group__3__Impl rule__EnumProperty__Group__4
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__3__Impl_in_rule__EnumProperty__Group__34578);
            rule__EnumProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnumProperty__Group__4_in_rule__EnumProperty__Group__34581);
            rule__EnumProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__3"


    // $ANTLR start "rule__EnumProperty__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2176:1: rule__EnumProperty__Group__3__Impl : ( ( rule__EnumProperty__TypeAssignment_3 ) ) ;
    public final void rule__EnumProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2180:1: ( ( ( rule__EnumProperty__TypeAssignment_3 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2181:1: ( ( rule__EnumProperty__TypeAssignment_3 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2181:1: ( ( rule__EnumProperty__TypeAssignment_3 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2182:1: ( rule__EnumProperty__TypeAssignment_3 )
            {
             before(grammarAccess.getEnumPropertyAccess().getTypeAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2183:1: ( rule__EnumProperty__TypeAssignment_3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2183:2: rule__EnumProperty__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__EnumProperty__TypeAssignment_3_in_rule__EnumProperty__Group__3__Impl4608);
            rule__EnumProperty__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumPropertyAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__3__Impl"


    // $ANTLR start "rule__EnumProperty__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2193:1: rule__EnumProperty__Group__4 : rule__EnumProperty__Group__4__Impl ;
    public final void rule__EnumProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2197:1: ( rule__EnumProperty__Group__4__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2198:2: rule__EnumProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__EnumProperty__Group__4__Impl_in_rule__EnumProperty__Group__44638);
            rule__EnumProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__4"


    // $ANTLR start "rule__EnumProperty__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2204:1: rule__EnumProperty__Group__4__Impl : ( ( ruleLineTerm )? ) ;
    public final void rule__EnumProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2208:1: ( ( ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2209:1: ( ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2209:1: ( ( ruleLineTerm )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2210:1: ( ruleLineTerm )?
            {
             before(grammarAccess.getEnumPropertyAccess().getLineTermParserRuleCall_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2211:1: ( ruleLineTerm )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=13 && LA21_0<=14)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2211:3: ruleLineTerm
                    {
                    pushFollow(FOLLOW_ruleLineTerm_in_rule__EnumProperty__Group__4__Impl4666);
                    ruleLineTerm();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumPropertyAccess().getLineTermParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__Group__4__Impl"


    // $ANTLR start "rule__Const__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2231:1: rule__Const__Group__0 : rule__Const__Group__0__Impl rule__Const__Group__1 ;
    public final void rule__Const__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2235:1: ( rule__Const__Group__0__Impl rule__Const__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2236:2: rule__Const__Group__0__Impl rule__Const__Group__1
            {
            pushFollow(FOLLOW_rule__Const__Group__0__Impl_in_rule__Const__Group__04707);
            rule__Const__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Const__Group__1_in_rule__Const__Group__04710);
            rule__Const__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__0"


    // $ANTLR start "rule__Const__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2243:1: rule__Const__Group__0__Impl : ( ( rule__Const__CommentAssignment_0 )* ) ;
    public final void rule__Const__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2247:1: ( ( ( rule__Const__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2248:1: ( ( rule__Const__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2248:1: ( ( rule__Const__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2249:1: ( rule__Const__CommentAssignment_0 )*
            {
             before(grammarAccess.getConstAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2250:1: ( rule__Const__CommentAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_SL_COMMENT && LA22_0<=RULE_ML_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2250:2: rule__Const__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Const__CommentAssignment_0_in_rule__Const__Group__0__Impl4737);
            	    rule__Const__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConstAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__0__Impl"


    // $ANTLR start "rule__Const__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2260:1: rule__Const__Group__1 : rule__Const__Group__1__Impl rule__Const__Group__2 ;
    public final void rule__Const__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2264:1: ( rule__Const__Group__1__Impl rule__Const__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2265:2: rule__Const__Group__1__Impl rule__Const__Group__2
            {
            pushFollow(FOLLOW_rule__Const__Group__1__Impl_in_rule__Const__Group__14768);
            rule__Const__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Const__Group__2_in_rule__Const__Group__14771);
            rule__Const__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__1"


    // $ANTLR start "rule__Const__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2272:1: rule__Const__Group__1__Impl : ( 'const' ) ;
    public final void rule__Const__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2276:1: ( ( 'const' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2277:1: ( 'const' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2277:1: ( 'const' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2278:1: 'const'
            {
             before(grammarAccess.getConstAccess().getConstKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__Const__Group__1__Impl4799); 
             after(grammarAccess.getConstAccess().getConstKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__1__Impl"


    // $ANTLR start "rule__Const__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2291:1: rule__Const__Group__2 : rule__Const__Group__2__Impl rule__Const__Group__3 ;
    public final void rule__Const__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2295:1: ( rule__Const__Group__2__Impl rule__Const__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2296:2: rule__Const__Group__2__Impl rule__Const__Group__3
            {
            pushFollow(FOLLOW_rule__Const__Group__2__Impl_in_rule__Const__Group__24830);
            rule__Const__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Const__Group__3_in_rule__Const__Group__24833);
            rule__Const__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__2"


    // $ANTLR start "rule__Const__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2303:1: rule__Const__Group__2__Impl : ( ( rule__Const__NameAssignment_2 ) ) ;
    public final void rule__Const__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2307:1: ( ( ( rule__Const__NameAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2308:1: ( ( rule__Const__NameAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2308:1: ( ( rule__Const__NameAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2309:1: ( rule__Const__NameAssignment_2 )
            {
             before(grammarAccess.getConstAccess().getNameAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2310:1: ( rule__Const__NameAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2310:2: rule__Const__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Const__NameAssignment_2_in_rule__Const__Group__2__Impl4860);
            rule__Const__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__2__Impl"


    // $ANTLR start "rule__Const__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2320:1: rule__Const__Group__3 : rule__Const__Group__3__Impl rule__Const__Group__4 ;
    public final void rule__Const__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2324:1: ( rule__Const__Group__3__Impl rule__Const__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2325:2: rule__Const__Group__3__Impl rule__Const__Group__4
            {
            pushFollow(FOLLOW_rule__Const__Group__3__Impl_in_rule__Const__Group__34890);
            rule__Const__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Const__Group__4_in_rule__Const__Group__34893);
            rule__Const__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__3"


    // $ANTLR start "rule__Const__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2332:1: rule__Const__Group__3__Impl : ( '{' ) ;
    public final void rule__Const__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2336:1: ( ( '{' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2337:1: ( '{' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2337:1: ( '{' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2338:1: '{'
            {
             before(grammarAccess.getConstAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__Const__Group__3__Impl4921); 
             after(grammarAccess.getConstAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__3__Impl"


    // $ANTLR start "rule__Const__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2351:1: rule__Const__Group__4 : rule__Const__Group__4__Impl rule__Const__Group__5 ;
    public final void rule__Const__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2355:1: ( rule__Const__Group__4__Impl rule__Const__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2356:2: rule__Const__Group__4__Impl rule__Const__Group__5
            {
            pushFollow(FOLLOW_rule__Const__Group__4__Impl_in_rule__Const__Group__44952);
            rule__Const__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Const__Group__5_in_rule__Const__Group__44955);
            rule__Const__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__4"


    // $ANTLR start "rule__Const__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2363:1: rule__Const__Group__4__Impl : ( ( rule__Const__PropertiesAssignment_4 )* ) ;
    public final void rule__Const__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2367:1: ( ( ( rule__Const__PropertiesAssignment_4 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2368:1: ( ( rule__Const__PropertiesAssignment_4 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2368:1: ( ( rule__Const__PropertiesAssignment_4 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2369:1: ( rule__Const__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getConstAccess().getPropertiesAssignment_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2370:1: ( rule__Const__PropertiesAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_SL_COMMENT && LA23_0<=RULE_ID)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2370:2: rule__Const__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Const__PropertiesAssignment_4_in_rule__Const__Group__4__Impl4982);
            	    rule__Const__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getConstAccess().getPropertiesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__4__Impl"


    // $ANTLR start "rule__Const__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2380:1: rule__Const__Group__5 : rule__Const__Group__5__Impl ;
    public final void rule__Const__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2384:1: ( rule__Const__Group__5__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2385:2: rule__Const__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Const__Group__5__Impl_in_rule__Const__Group__55013);
            rule__Const__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__5"


    // $ANTLR start "rule__Const__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2391:1: rule__Const__Group__5__Impl : ( '}' ) ;
    public final void rule__Const__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2395:1: ( ( '}' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2396:1: ( '}' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2396:1: ( '}' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2397:1: '}'
            {
             before(grammarAccess.getConstAccess().getRightCurlyBracketKeyword_5()); 
            match(input,40,FOLLOW_40_in_rule__Const__Group__5__Impl5041); 
             after(grammarAccess.getConstAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__Group__5__Impl"


    // $ANTLR start "rule__ConstProperty__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2422:1: rule__ConstProperty__Group__0 : rule__ConstProperty__Group__0__Impl rule__ConstProperty__Group__1 ;
    public final void rule__ConstProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2426:1: ( rule__ConstProperty__Group__0__Impl rule__ConstProperty__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2427:2: rule__ConstProperty__Group__0__Impl rule__ConstProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__0__Impl_in_rule__ConstProperty__Group__05084);
            rule__ConstProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstProperty__Group__1_in_rule__ConstProperty__Group__05087);
            rule__ConstProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__0"


    // $ANTLR start "rule__ConstProperty__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2434:1: rule__ConstProperty__Group__0__Impl : ( ( rule__ConstProperty__CommentAssignment_0 )* ) ;
    public final void rule__ConstProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2438:1: ( ( ( rule__ConstProperty__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2439:1: ( ( rule__ConstProperty__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2439:1: ( ( rule__ConstProperty__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2440:1: ( rule__ConstProperty__CommentAssignment_0 )*
            {
             before(grammarAccess.getConstPropertyAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2441:1: ( rule__ConstProperty__CommentAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_SL_COMMENT && LA24_0<=RULE_ML_COMMENT)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2441:2: rule__ConstProperty__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ConstProperty__CommentAssignment_0_in_rule__ConstProperty__Group__0__Impl5114);
            	    rule__ConstProperty__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getConstPropertyAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__0__Impl"


    // $ANTLR start "rule__ConstProperty__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2451:1: rule__ConstProperty__Group__1 : rule__ConstProperty__Group__1__Impl rule__ConstProperty__Group__2 ;
    public final void rule__ConstProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2455:1: ( rule__ConstProperty__Group__1__Impl rule__ConstProperty__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2456:2: rule__ConstProperty__Group__1__Impl rule__ConstProperty__Group__2
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__1__Impl_in_rule__ConstProperty__Group__15145);
            rule__ConstProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstProperty__Group__2_in_rule__ConstProperty__Group__15148);
            rule__ConstProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__1"


    // $ANTLR start "rule__ConstProperty__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2463:1: rule__ConstProperty__Group__1__Impl : ( ( rule__ConstProperty__NameAssignment_1 ) ) ;
    public final void rule__ConstProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2467:1: ( ( ( rule__ConstProperty__NameAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2468:1: ( ( rule__ConstProperty__NameAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2468:1: ( ( rule__ConstProperty__NameAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2469:1: ( rule__ConstProperty__NameAssignment_1 )
            {
             before(grammarAccess.getConstPropertyAccess().getNameAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2470:1: ( rule__ConstProperty__NameAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2470:2: rule__ConstProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ConstProperty__NameAssignment_1_in_rule__ConstProperty__Group__1__Impl5175);
            rule__ConstProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__1__Impl"


    // $ANTLR start "rule__ConstProperty__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2480:1: rule__ConstProperty__Group__2 : rule__ConstProperty__Group__2__Impl rule__ConstProperty__Group__3 ;
    public final void rule__ConstProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2484:1: ( rule__ConstProperty__Group__2__Impl rule__ConstProperty__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2485:2: rule__ConstProperty__Group__2__Impl rule__ConstProperty__Group__3
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__2__Impl_in_rule__ConstProperty__Group__25205);
            rule__ConstProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstProperty__Group__3_in_rule__ConstProperty__Group__25208);
            rule__ConstProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__2"


    // $ANTLR start "rule__ConstProperty__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2492:1: rule__ConstProperty__Group__2__Impl : ( '=' ) ;
    public final void rule__ConstProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2496:1: ( ( '=' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2497:1: ( '=' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2497:1: ( '=' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2498:1: '='
            {
             before(grammarAccess.getConstPropertyAccess().getEqualsSignKeyword_2()); 
            match(input,41,FOLLOW_41_in_rule__ConstProperty__Group__2__Impl5236); 
             after(grammarAccess.getConstPropertyAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__2__Impl"


    // $ANTLR start "rule__ConstProperty__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2511:1: rule__ConstProperty__Group__3 : rule__ConstProperty__Group__3__Impl rule__ConstProperty__Group__4 ;
    public final void rule__ConstProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2515:1: ( rule__ConstProperty__Group__3__Impl rule__ConstProperty__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2516:2: rule__ConstProperty__Group__3__Impl rule__ConstProperty__Group__4
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__3__Impl_in_rule__ConstProperty__Group__35267);
            rule__ConstProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstProperty__Group__4_in_rule__ConstProperty__Group__35270);
            rule__ConstProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__3"


    // $ANTLR start "rule__ConstProperty__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2523:1: rule__ConstProperty__Group__3__Impl : ( ( rule__ConstProperty__ValAssignment_3 ) ) ;
    public final void rule__ConstProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2527:1: ( ( ( rule__ConstProperty__ValAssignment_3 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2528:1: ( ( rule__ConstProperty__ValAssignment_3 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2528:1: ( ( rule__ConstProperty__ValAssignment_3 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2529:1: ( rule__ConstProperty__ValAssignment_3 )
            {
             before(grammarAccess.getConstPropertyAccess().getValAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2530:1: ( rule__ConstProperty__ValAssignment_3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2530:2: rule__ConstProperty__ValAssignment_3
            {
            pushFollow(FOLLOW_rule__ConstProperty__ValAssignment_3_in_rule__ConstProperty__Group__3__Impl5297);
            rule__ConstProperty__ValAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstPropertyAccess().getValAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__3__Impl"


    // $ANTLR start "rule__ConstProperty__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2540:1: rule__ConstProperty__Group__4 : rule__ConstProperty__Group__4__Impl ;
    public final void rule__ConstProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2544:1: ( rule__ConstProperty__Group__4__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2545:2: rule__ConstProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ConstProperty__Group__4__Impl_in_rule__ConstProperty__Group__45327);
            rule__ConstProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__4"


    // $ANTLR start "rule__ConstProperty__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2551:1: rule__ConstProperty__Group__4__Impl : ( ( ruleLineTerm )? ) ;
    public final void rule__ConstProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2555:1: ( ( ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2556:1: ( ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2556:1: ( ( ruleLineTerm )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2557:1: ( ruleLineTerm )?
            {
             before(grammarAccess.getConstPropertyAccess().getLineTermParserRuleCall_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2558:1: ( ruleLineTerm )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=14)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2558:3: ruleLineTerm
                    {
                    pushFollow(FOLLOW_ruleLineTerm_in_rule__ConstProperty__Group__4__Impl5355);
                    ruleLineTerm();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstPropertyAccess().getLineTermParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__Group__4__Impl"


    // $ANTLR start "rule__ConstNumValue__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2578:1: rule__ConstNumValue__Group__0 : rule__ConstNumValue__Group__0__Impl rule__ConstNumValue__Group__1 ;
    public final void rule__ConstNumValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2582:1: ( rule__ConstNumValue__Group__0__Impl rule__ConstNumValue__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2583:2: rule__ConstNumValue__Group__0__Impl rule__ConstNumValue__Group__1
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group__0__Impl_in_rule__ConstNumValue__Group__05396);
            rule__ConstNumValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstNumValue__Group__1_in_rule__ConstNumValue__Group__05399);
            rule__ConstNumValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__0"


    // $ANTLR start "rule__ConstNumValue__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2590:1: rule__ConstNumValue__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__ConstNumValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2594:1: ( ( ( '-' )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2595:1: ( ( '-' )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2595:1: ( ( '-' )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2596:1: ( '-' )?
            {
             before(grammarAccess.getConstNumValueAccess().getHyphenMinusKeyword_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2597:1: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2598:2: '-'
                    {
                    match(input,43,FOLLOW_43_in_rule__ConstNumValue__Group__0__Impl5428); 

                    }
                    break;

            }

             after(grammarAccess.getConstNumValueAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__0__Impl"


    // $ANTLR start "rule__ConstNumValue__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2609:1: rule__ConstNumValue__Group__1 : rule__ConstNumValue__Group__1__Impl rule__ConstNumValue__Group__2 ;
    public final void rule__ConstNumValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2613:1: ( rule__ConstNumValue__Group__1__Impl rule__ConstNumValue__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2614:2: rule__ConstNumValue__Group__1__Impl rule__ConstNumValue__Group__2
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group__1__Impl_in_rule__ConstNumValue__Group__15461);
            rule__ConstNumValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstNumValue__Group__2_in_rule__ConstNumValue__Group__15464);
            rule__ConstNumValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__1"


    // $ANTLR start "rule__ConstNumValue__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2621:1: rule__ConstNumValue__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__ConstNumValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2625:1: ( ( RULE_INT ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2626:1: ( RULE_INT )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2626:1: ( RULE_INT )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2627:1: RULE_INT
            {
             before(grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConstNumValue__Group__1__Impl5491); 
             after(grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__1__Impl"


    // $ANTLR start "rule__ConstNumValue__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2638:1: rule__ConstNumValue__Group__2 : rule__ConstNumValue__Group__2__Impl ;
    public final void rule__ConstNumValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2642:1: ( rule__ConstNumValue__Group__2__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2643:2: rule__ConstNumValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group__2__Impl_in_rule__ConstNumValue__Group__25520);
            rule__ConstNumValue__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__2"


    // $ANTLR start "rule__ConstNumValue__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2649:1: rule__ConstNumValue__Group__2__Impl : ( ( rule__ConstNumValue__Group_2__0 )? ) ;
    public final void rule__ConstNumValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2653:1: ( ( ( rule__ConstNumValue__Group_2__0 )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2654:1: ( ( rule__ConstNumValue__Group_2__0 )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2654:1: ( ( rule__ConstNumValue__Group_2__0 )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2655:1: ( rule__ConstNumValue__Group_2__0 )?
            {
             before(grammarAccess.getConstNumValueAccess().getGroup_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2656:1: ( rule__ConstNumValue__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2656:2: rule__ConstNumValue__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ConstNumValue__Group_2__0_in_rule__ConstNumValue__Group__2__Impl5547);
                    rule__ConstNumValue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstNumValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group__2__Impl"


    // $ANTLR start "rule__ConstNumValue__Group_2__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2672:1: rule__ConstNumValue__Group_2__0 : rule__ConstNumValue__Group_2__0__Impl rule__ConstNumValue__Group_2__1 ;
    public final void rule__ConstNumValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2676:1: ( rule__ConstNumValue__Group_2__0__Impl rule__ConstNumValue__Group_2__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2677:2: rule__ConstNumValue__Group_2__0__Impl rule__ConstNumValue__Group_2__1
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group_2__0__Impl_in_rule__ConstNumValue__Group_2__05584);
            rule__ConstNumValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConstNumValue__Group_2__1_in_rule__ConstNumValue__Group_2__05587);
            rule__ConstNumValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group_2__0"


    // $ANTLR start "rule__ConstNumValue__Group_2__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2684:1: rule__ConstNumValue__Group_2__0__Impl : ( '.' ) ;
    public final void rule__ConstNumValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2688:1: ( ( '.' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2689:1: ( '.' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2689:1: ( '.' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2690:1: '.'
            {
             before(grammarAccess.getConstNumValueAccess().getFullStopKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__ConstNumValue__Group_2__0__Impl5615); 
             after(grammarAccess.getConstNumValueAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group_2__0__Impl"


    // $ANTLR start "rule__ConstNumValue__Group_2__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2703:1: rule__ConstNumValue__Group_2__1 : rule__ConstNumValue__Group_2__1__Impl ;
    public final void rule__ConstNumValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2707:1: ( rule__ConstNumValue__Group_2__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2708:2: rule__ConstNumValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConstNumValue__Group_2__1__Impl_in_rule__ConstNumValue__Group_2__15646);
            rule__ConstNumValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group_2__1"


    // $ANTLR start "rule__ConstNumValue__Group_2__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2714:1: rule__ConstNumValue__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__ConstNumValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2718:1: ( ( RULE_INT ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2719:1: ( RULE_INT )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2719:1: ( RULE_INT )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2720:1: RULE_INT
            {
             before(grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConstNumValue__Group_2__1__Impl5673); 
             after(grammarAccess.getConstNumValueAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstNumValue__Group_2__1__Impl"


    // $ANTLR start "rule__Struct__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2735:1: rule__Struct__Group__0 : rule__Struct__Group__0__Impl rule__Struct__Group__1 ;
    public final void rule__Struct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2739:1: ( rule__Struct__Group__0__Impl rule__Struct__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2740:2: rule__Struct__Group__0__Impl rule__Struct__Group__1
            {
            pushFollow(FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__05706);
            rule__Struct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__05709);
            rule__Struct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__0"


    // $ANTLR start "rule__Struct__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2747:1: rule__Struct__Group__0__Impl : ( ( rule__Struct__CommentAssignment_0 )* ) ;
    public final void rule__Struct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2751:1: ( ( ( rule__Struct__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2752:1: ( ( rule__Struct__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2752:1: ( ( rule__Struct__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2753:1: ( rule__Struct__CommentAssignment_0 )*
            {
             before(grammarAccess.getStructAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2754:1: ( rule__Struct__CommentAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_SL_COMMENT && LA28_0<=RULE_ML_COMMENT)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2754:2: rule__Struct__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Struct__CommentAssignment_0_in_rule__Struct__Group__0__Impl5736);
            	    rule__Struct__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__0__Impl"


    // $ANTLR start "rule__Struct__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2764:1: rule__Struct__Group__1 : rule__Struct__Group__1__Impl rule__Struct__Group__2 ;
    public final void rule__Struct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2768:1: ( rule__Struct__Group__1__Impl rule__Struct__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2769:2: rule__Struct__Group__1__Impl rule__Struct__Group__2
            {
            pushFollow(FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__15767);
            rule__Struct__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__15770);
            rule__Struct__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__1"


    // $ANTLR start "rule__Struct__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2776:1: rule__Struct__Group__1__Impl : ( ( rule__Struct__AttributesAssignment_1 )* ) ;
    public final void rule__Struct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2780:1: ( ( ( rule__Struct__AttributesAssignment_1 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2781:1: ( ( rule__Struct__AttributesAssignment_1 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2781:1: ( ( rule__Struct__AttributesAssignment_1 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2782:1: ( rule__Struct__AttributesAssignment_1 )*
            {
             before(grammarAccess.getStructAccess().getAttributesAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2783:1: ( rule__Struct__AttributesAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ATTR||LA29_0==54) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2783:2: rule__Struct__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Struct__AttributesAssignment_1_in_rule__Struct__Group__1__Impl5797);
            	    rule__Struct__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__1__Impl"


    // $ANTLR start "rule__Struct__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2793:1: rule__Struct__Group__2 : rule__Struct__Group__2__Impl rule__Struct__Group__3 ;
    public final void rule__Struct__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2797:1: ( rule__Struct__Group__2__Impl rule__Struct__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2798:2: rule__Struct__Group__2__Impl rule__Struct__Group__3
            {
            pushFollow(FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__25828);
            rule__Struct__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__25831);
            rule__Struct__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__2"


    // $ANTLR start "rule__Struct__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2805:1: rule__Struct__Group__2__Impl : ( 'struct' ) ;
    public final void rule__Struct__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2809:1: ( ( 'struct' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2810:1: ( 'struct' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2810:1: ( 'struct' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2811:1: 'struct'
            {
             before(grammarAccess.getStructAccess().getStructKeyword_2()); 
            match(input,44,FOLLOW_44_in_rule__Struct__Group__2__Impl5859); 
             after(grammarAccess.getStructAccess().getStructKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__2__Impl"


    // $ANTLR start "rule__Struct__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2824:1: rule__Struct__Group__3 : rule__Struct__Group__3__Impl rule__Struct__Group__4 ;
    public final void rule__Struct__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2828:1: ( rule__Struct__Group__3__Impl rule__Struct__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2829:2: rule__Struct__Group__3__Impl rule__Struct__Group__4
            {
            pushFollow(FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__35890);
            rule__Struct__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__35893);
            rule__Struct__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__3"


    // $ANTLR start "rule__Struct__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2836:1: rule__Struct__Group__3__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Struct__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2840:1: ( ( ( 'abstract' )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2841:1: ( ( 'abstract' )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2841:1: ( ( 'abstract' )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2842:1: ( 'abstract' )?
            {
             before(grammarAccess.getStructAccess().getAbstractKeyword_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2843:1: ( 'abstract' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==45) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2844:2: 'abstract'
                    {
                    match(input,45,FOLLOW_45_in_rule__Struct__Group__3__Impl5922); 

                    }
                    break;

            }

             after(grammarAccess.getStructAccess().getAbstractKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__3__Impl"


    // $ANTLR start "rule__Struct__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2855:1: rule__Struct__Group__4 : rule__Struct__Group__4__Impl rule__Struct__Group__5 ;
    public final void rule__Struct__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2859:1: ( rule__Struct__Group__4__Impl rule__Struct__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2860:2: rule__Struct__Group__4__Impl rule__Struct__Group__5
            {
            pushFollow(FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__45955);
            rule__Struct__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__45958);
            rule__Struct__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__4"


    // $ANTLR start "rule__Struct__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2867:1: rule__Struct__Group__4__Impl : ( ( rule__Struct__NameAssignment_4 ) ) ;
    public final void rule__Struct__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2871:1: ( ( ( rule__Struct__NameAssignment_4 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2872:1: ( ( rule__Struct__NameAssignment_4 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2872:1: ( ( rule__Struct__NameAssignment_4 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2873:1: ( rule__Struct__NameAssignment_4 )
            {
             before(grammarAccess.getStructAccess().getNameAssignment_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2874:1: ( rule__Struct__NameAssignment_4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2874:2: rule__Struct__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Struct__NameAssignment_4_in_rule__Struct__Group__4__Impl5985);
            rule__Struct__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__4__Impl"


    // $ANTLR start "rule__Struct__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2884:1: rule__Struct__Group__5 : rule__Struct__Group__5__Impl rule__Struct__Group__6 ;
    public final void rule__Struct__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2888:1: ( rule__Struct__Group__5__Impl rule__Struct__Group__6 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2889:2: rule__Struct__Group__5__Impl rule__Struct__Group__6
            {
            pushFollow(FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__56015);
            rule__Struct__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__6_in_rule__Struct__Group__56018);
            rule__Struct__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__5"


    // $ANTLR start "rule__Struct__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2896:1: rule__Struct__Group__5__Impl : ( ( rule__Struct__Group_5__0 )? ) ;
    public final void rule__Struct__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2900:1: ( ( ( rule__Struct__Group_5__0 )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2901:1: ( ( rule__Struct__Group_5__0 )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2901:1: ( ( rule__Struct__Group_5__0 )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2902:1: ( rule__Struct__Group_5__0 )?
            {
             before(grammarAccess.getStructAccess().getGroup_5()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2903:1: ( rule__Struct__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2903:2: rule__Struct__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Struct__Group_5__0_in_rule__Struct__Group__5__Impl6045);
                    rule__Struct__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__5__Impl"


    // $ANTLR start "rule__Struct__Group__6"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2913:1: rule__Struct__Group__6 : rule__Struct__Group__6__Impl rule__Struct__Group__7 ;
    public final void rule__Struct__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2917:1: ( rule__Struct__Group__6__Impl rule__Struct__Group__7 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2918:2: rule__Struct__Group__6__Impl rule__Struct__Group__7
            {
            pushFollow(FOLLOW_rule__Struct__Group__6__Impl_in_rule__Struct__Group__66076);
            rule__Struct__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__7_in_rule__Struct__Group__66079);
            rule__Struct__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__6"


    // $ANTLR start "rule__Struct__Group__6__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2925:1: rule__Struct__Group__6__Impl : ( '{' ) ;
    public final void rule__Struct__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2929:1: ( ( '{' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2930:1: ( '{' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2930:1: ( '{' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2931:1: '{'
            {
             before(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,39,FOLLOW_39_in_rule__Struct__Group__6__Impl6107); 
             after(grammarAccess.getStructAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__6__Impl"


    // $ANTLR start "rule__Struct__Group__7"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2944:1: rule__Struct__Group__7 : rule__Struct__Group__7__Impl rule__Struct__Group__8 ;
    public final void rule__Struct__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2948:1: ( rule__Struct__Group__7__Impl rule__Struct__Group__8 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2949:2: rule__Struct__Group__7__Impl rule__Struct__Group__8
            {
            pushFollow(FOLLOW_rule__Struct__Group__7__Impl_in_rule__Struct__Group__76138);
            rule__Struct__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group__8_in_rule__Struct__Group__76141);
            rule__Struct__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__7"


    // $ANTLR start "rule__Struct__Group__7__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2956:1: rule__Struct__Group__7__Impl : ( ( rule__Struct__PropertiesAssignment_7 )* ) ;
    public final void rule__Struct__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2960:1: ( ( ( rule__Struct__PropertiesAssignment_7 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2961:1: ( ( rule__Struct__PropertiesAssignment_7 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2961:1: ( ( rule__Struct__PropertiesAssignment_7 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2962:1: ( rule__Struct__PropertiesAssignment_7 )*
            {
             before(grammarAccess.getStructAccess().getPropertiesAssignment_7()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2963:1: ( rule__Struct__PropertiesAssignment_7 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_SL_COMMENT && LA32_0<=RULE_ID)||LA32_0==RULE_ATTR||(LA32_0>=15 && LA32_0<=30)||LA32_0==50||(LA32_0>=53 && LA32_0<=54)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2963:2: rule__Struct__PropertiesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Struct__PropertiesAssignment_7_in_rule__Struct__Group__7__Impl6168);
            	    rule__Struct__PropertiesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStructAccess().getPropertiesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__7__Impl"


    // $ANTLR start "rule__Struct__Group__8"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2973:1: rule__Struct__Group__8 : rule__Struct__Group__8__Impl ;
    public final void rule__Struct__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2977:1: ( rule__Struct__Group__8__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2978:2: rule__Struct__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Struct__Group__8__Impl_in_rule__Struct__Group__86199);
            rule__Struct__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__8"


    // $ANTLR start "rule__Struct__Group__8__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2984:1: rule__Struct__Group__8__Impl : ( '}' ) ;
    public final void rule__Struct__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2988:1: ( ( '}' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2989:1: ( '}' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2989:1: ( '}' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:2990:1: '}'
            {
             before(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_8()); 
            match(input,40,FOLLOW_40_in_rule__Struct__Group__8__Impl6227); 
             after(grammarAccess.getStructAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group__8__Impl"


    // $ANTLR start "rule__Struct__Group_5__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3021:1: rule__Struct__Group_5__0 : rule__Struct__Group_5__0__Impl rule__Struct__Group_5__1 ;
    public final void rule__Struct__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3025:1: ( rule__Struct__Group_5__0__Impl rule__Struct__Group_5__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3026:2: rule__Struct__Group_5__0__Impl rule__Struct__Group_5__1
            {
            pushFollow(FOLLOW_rule__Struct__Group_5__0__Impl_in_rule__Struct__Group_5__06276);
            rule__Struct__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Struct__Group_5__1_in_rule__Struct__Group_5__06279);
            rule__Struct__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_5__0"


    // $ANTLR start "rule__Struct__Group_5__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3033:1: rule__Struct__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__Struct__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3037:1: ( ( 'extends' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3038:1: ( 'extends' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3038:1: ( 'extends' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3039:1: 'extends'
            {
             before(grammarAccess.getStructAccess().getExtendsKeyword_5_0()); 
            match(input,46,FOLLOW_46_in_rule__Struct__Group_5__0__Impl6307); 
             after(grammarAccess.getStructAccess().getExtendsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_5__0__Impl"


    // $ANTLR start "rule__Struct__Group_5__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3052:1: rule__Struct__Group_5__1 : rule__Struct__Group_5__1__Impl ;
    public final void rule__Struct__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3056:1: ( rule__Struct__Group_5__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3057:2: rule__Struct__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Struct__Group_5__1__Impl_in_rule__Struct__Group_5__16338);
            rule__Struct__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_5__1"


    // $ANTLR start "rule__Struct__Group_5__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3063:1: rule__Struct__Group_5__1__Impl : ( ( rule__Struct__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__Struct__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3067:1: ( ( ( rule__Struct__SuperTypeAssignment_5_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3068:1: ( ( rule__Struct__SuperTypeAssignment_5_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3068:1: ( ( rule__Struct__SuperTypeAssignment_5_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3069:1: ( rule__Struct__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getStructAccess().getSuperTypeAssignment_5_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3070:1: ( rule__Struct__SuperTypeAssignment_5_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3070:2: rule__Struct__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Struct__SuperTypeAssignment_5_1_in_rule__Struct__Group_5__1__Impl6365);
            rule__Struct__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStructAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__Group_5__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3084:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3088:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3089:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06399);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06402);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3096:1: rule__Property__Group__0__Impl : ( ( rule__Property__CommentAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3100:1: ( ( ( rule__Property__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3101:1: ( ( rule__Property__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3101:1: ( ( rule__Property__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3102:1: ( rule__Property__CommentAssignment_0 )*
            {
             before(grammarAccess.getPropertyAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3103:1: ( rule__Property__CommentAssignment_0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_SL_COMMENT && LA33_0<=RULE_ML_COMMENT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3103:2: rule__Property__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Property__CommentAssignment_0_in_rule__Property__Group__0__Impl6429);
            	    rule__Property__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3113:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3117:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3118:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16460);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16463);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3125:1: rule__Property__Group__1__Impl : ( ( rule__Property__AttributesAssignment_1 )* ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3129:1: ( ( ( rule__Property__AttributesAssignment_1 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3130:1: ( ( rule__Property__AttributesAssignment_1 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3130:1: ( ( rule__Property__AttributesAssignment_1 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3131:1: ( rule__Property__AttributesAssignment_1 )*
            {
             before(grammarAccess.getPropertyAccess().getAttributesAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3132:1: ( rule__Property__AttributesAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ATTR||LA34_0==54) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3132:2: rule__Property__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Property__AttributesAssignment_1_in_rule__Property__Group__1__Impl6490);
            	    rule__Property__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPropertyAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3142:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3146:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3147:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__26521);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26524);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3154:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3158:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3159:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3159:1: ( ( rule__Property__Alternatives_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3160:1: ( rule__Property__Alternatives_2 )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3161:1: ( rule__Property__Alternatives_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3161:2: rule__Property__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl6551);
            rule__Property__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3171:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3175:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3176:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__36581);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36584);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3183:1: rule__Property__Group__3__Impl : ( ( rule__Property__NameAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3187:1: ( ( ( rule__Property__NameAssignment_3 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3188:1: ( ( rule__Property__NameAssignment_3 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3188:1: ( ( rule__Property__NameAssignment_3 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3189:1: ( rule__Property__NameAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3190:1: ( rule__Property__NameAssignment_3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3190:2: rule__Property__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Property__NameAssignment_3_in_rule__Property__Group__3__Impl6611);
            rule__Property__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3200:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3204:1: ( rule__Property__Group__4__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3205:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__46641);
            rule__Property__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3211:1: rule__Property__Group__4__Impl : ( ( ruleLineTerm )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3215:1: ( ( ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3216:1: ( ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3216:1: ( ( ruleLineTerm )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3217:1: ( ruleLineTerm )?
            {
             before(grammarAccess.getPropertyAccess().getLineTermParserRuleCall_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3218:1: ( ruleLineTerm )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=13 && LA35_0<=14)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3218:3: ruleLineTerm
                    {
                    pushFollow(FOLLOW_ruleLineTerm_in_rule__Property__Group__4__Impl6669);
                    ruleLineTerm();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getLineTermParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3238:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3242:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3243:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06710);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06713);
            rule__Service__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3250:1: rule__Service__Group__0__Impl : ( ( rule__Service__CommentAssignment_0 )* ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3254:1: ( ( ( rule__Service__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3255:1: ( ( rule__Service__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3255:1: ( ( rule__Service__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3256:1: ( rule__Service__CommentAssignment_0 )*
            {
             before(grammarAccess.getServiceAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3257:1: ( rule__Service__CommentAssignment_0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_SL_COMMENT && LA36_0<=RULE_ML_COMMENT)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3257:2: rule__Service__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Service__CommentAssignment_0_in_rule__Service__Group__0__Impl6740);
            	    rule__Service__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3267:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3271:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3272:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16771);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16774);
            rule__Service__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3279:1: rule__Service__Group__1__Impl : ( ( rule__Service__AttributesAssignment_1 )* ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3283:1: ( ( ( rule__Service__AttributesAssignment_1 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3284:1: ( ( rule__Service__AttributesAssignment_1 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3284:1: ( ( rule__Service__AttributesAssignment_1 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3285:1: ( rule__Service__AttributesAssignment_1 )*
            {
             before(grammarAccess.getServiceAccess().getAttributesAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3286:1: ( rule__Service__AttributesAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ATTR||LA37_0==54) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3286:2: rule__Service__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Service__AttributesAssignment_1_in_rule__Service__Group__1__Impl6801);
            	    rule__Service__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3296:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3300:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3301:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26832);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26835);
            rule__Service__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3308:1: rule__Service__Group__2__Impl : ( 'service' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3312:1: ( ( 'service' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3313:1: ( 'service' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3313:1: ( 'service' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3314:1: 'service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_2()); 
            match(input,47,FOLLOW_47_in_rule__Service__Group__2__Impl6863); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3327:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3331:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3332:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36894);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36897);
            rule__Service__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3339:1: rule__Service__Group__3__Impl : ( ( rule__Service__NameAssignment_3 ) ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3343:1: ( ( ( rule__Service__NameAssignment_3 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3344:1: ( ( rule__Service__NameAssignment_3 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3344:1: ( ( rule__Service__NameAssignment_3 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3345:1: ( rule__Service__NameAssignment_3 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3346:1: ( rule__Service__NameAssignment_3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3346:2: rule__Service__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_3_in_rule__Service__Group__3__Impl6924);
            rule__Service__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3356:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3360:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3361:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46954);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46957);
            rule__Service__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3368:1: rule__Service__Group__4__Impl : ( '{' ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3372:1: ( ( '{' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3373:1: ( '{' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3373:1: ( '{' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3374:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,39,FOLLOW_39_in_rule__Service__Group__4__Impl6985); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3387:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3391:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3392:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__57016);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__6_in_rule__Service__Group__57019);
            rule__Service__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3399:1: rule__Service__Group__5__Impl : ( ( rule__Service__ServiceMethodsAssignment_5 )* ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3403:1: ( ( ( rule__Service__ServiceMethodsAssignment_5 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3404:1: ( ( rule__Service__ServiceMethodsAssignment_5 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3404:1: ( ( rule__Service__ServiceMethodsAssignment_5 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3405:1: ( rule__Service__ServiceMethodsAssignment_5 )*
            {
             before(grammarAccess.getServiceAccess().getServiceMethodsAssignment_5()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3406:1: ( rule__Service__ServiceMethodsAssignment_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_SL_COMMENT && LA38_0<=RULE_ID)||LA38_0==RULE_ATTR||(LA38_0>=15 && LA38_0<=30)||LA38_0==50||(LA38_0>=53 && LA38_0<=55)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3406:2: rule__Service__ServiceMethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Service__ServiceMethodsAssignment_5_in_rule__Service__Group__5__Impl7046);
            	    rule__Service__ServiceMethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getServiceAccess().getServiceMethodsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3416:1: rule__Service__Group__6 : rule__Service__Group__6__Impl ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3420:1: ( rule__Service__Group__6__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3421:2: rule__Service__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__67077);
            rule__Service__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3427:1: rule__Service__Group__6__Impl : ( '}' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3431:1: ( ( '}' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3432:1: ( '}' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3432:1: ( '}' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3433:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,40,FOLLOW_40_in_rule__Service__Group__6__Impl7105); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3460:1: rule__ServiceMethod__Group__0 : rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 ;
    public final void rule__ServiceMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3464:1: ( rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3465:2: rule__ServiceMethod__Group__0__Impl rule__ServiceMethod__Group__1
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__0__Impl_in_rule__ServiceMethod__Group__07150);
            rule__ServiceMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__1_in_rule__ServiceMethod__Group__07153);
            rule__ServiceMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__0"


    // $ANTLR start "rule__ServiceMethod__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3472:1: rule__ServiceMethod__Group__0__Impl : ( ( rule__ServiceMethod__CommentAssignment_0 )* ) ;
    public final void rule__ServiceMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3476:1: ( ( ( rule__ServiceMethod__CommentAssignment_0 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3477:1: ( ( rule__ServiceMethod__CommentAssignment_0 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3477:1: ( ( rule__ServiceMethod__CommentAssignment_0 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3478:1: ( rule__ServiceMethod__CommentAssignment_0 )*
            {
             before(grammarAccess.getServiceMethodAccess().getCommentAssignment_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3479:1: ( rule__ServiceMethod__CommentAssignment_0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_SL_COMMENT && LA39_0<=RULE_ML_COMMENT)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3479:2: rule__ServiceMethod__CommentAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__ServiceMethod__CommentAssignment_0_in_rule__ServiceMethod__Group__0__Impl7180);
            	    rule__ServiceMethod__CommentAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getServiceMethodAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__0__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3489:1: rule__ServiceMethod__Group__1 : rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2 ;
    public final void rule__ServiceMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3493:1: ( rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3494:2: rule__ServiceMethod__Group__1__Impl rule__ServiceMethod__Group__2
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__1__Impl_in_rule__ServiceMethod__Group__17211);
            rule__ServiceMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__2_in_rule__ServiceMethod__Group__17214);
            rule__ServiceMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__1"


    // $ANTLR start "rule__ServiceMethod__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3501:1: rule__ServiceMethod__Group__1__Impl : ( ( rule__ServiceMethod__AttributesAssignment_1 )* ) ;
    public final void rule__ServiceMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3505:1: ( ( ( rule__ServiceMethod__AttributesAssignment_1 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3506:1: ( ( rule__ServiceMethod__AttributesAssignment_1 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3506:1: ( ( rule__ServiceMethod__AttributesAssignment_1 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3507:1: ( rule__ServiceMethod__AttributesAssignment_1 )*
            {
             before(grammarAccess.getServiceMethodAccess().getAttributesAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3508:1: ( rule__ServiceMethod__AttributesAssignment_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ATTR||LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3508:2: rule__ServiceMethod__AttributesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ServiceMethod__AttributesAssignment_1_in_rule__ServiceMethod__Group__1__Impl7241);
            	    rule__ServiceMethod__AttributesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getServiceMethodAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__1__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3518:1: rule__ServiceMethod__Group__2 : rule__ServiceMethod__Group__2__Impl rule__ServiceMethod__Group__3 ;
    public final void rule__ServiceMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3522:1: ( rule__ServiceMethod__Group__2__Impl rule__ServiceMethod__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3523:2: rule__ServiceMethod__Group__2__Impl rule__ServiceMethod__Group__3
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__2__Impl_in_rule__ServiceMethod__Group__27272);
            rule__ServiceMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__3_in_rule__ServiceMethod__Group__27275);
            rule__ServiceMethod__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__2"


    // $ANTLR start "rule__ServiceMethod__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3530:1: rule__ServiceMethod__Group__2__Impl : ( ( rule__ServiceMethod__ReturnAssignment_2 ) ) ;
    public final void rule__ServiceMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3534:1: ( ( ( rule__ServiceMethod__ReturnAssignment_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3535:1: ( ( rule__ServiceMethod__ReturnAssignment_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3535:1: ( ( rule__ServiceMethod__ReturnAssignment_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3536:1: ( rule__ServiceMethod__ReturnAssignment_2 )
            {
             before(grammarAccess.getServiceMethodAccess().getReturnAssignment_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3537:1: ( rule__ServiceMethod__ReturnAssignment_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3537:2: rule__ServiceMethod__ReturnAssignment_2
            {
            pushFollow(FOLLOW_rule__ServiceMethod__ReturnAssignment_2_in_rule__ServiceMethod__Group__2__Impl7302);
            rule__ServiceMethod__ReturnAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getReturnAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__2__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3547:1: rule__ServiceMethod__Group__3 : rule__ServiceMethod__Group__3__Impl rule__ServiceMethod__Group__4 ;
    public final void rule__ServiceMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3551:1: ( rule__ServiceMethod__Group__3__Impl rule__ServiceMethod__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3552:2: rule__ServiceMethod__Group__3__Impl rule__ServiceMethod__Group__4
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__3__Impl_in_rule__ServiceMethod__Group__37332);
            rule__ServiceMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__4_in_rule__ServiceMethod__Group__37335);
            rule__ServiceMethod__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__3"


    // $ANTLR start "rule__ServiceMethod__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3559:1: rule__ServiceMethod__Group__3__Impl : ( ( rule__ServiceMethod__NameAssignment_3 ) ) ;
    public final void rule__ServiceMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3563:1: ( ( ( rule__ServiceMethod__NameAssignment_3 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3564:1: ( ( rule__ServiceMethod__NameAssignment_3 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3564:1: ( ( rule__ServiceMethod__NameAssignment_3 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3565:1: ( rule__ServiceMethod__NameAssignment_3 )
            {
             before(grammarAccess.getServiceMethodAccess().getNameAssignment_3()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3566:1: ( rule__ServiceMethod__NameAssignment_3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3566:2: rule__ServiceMethod__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__ServiceMethod__NameAssignment_3_in_rule__ServiceMethod__Group__3__Impl7362);
            rule__ServiceMethod__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getServiceMethodAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__3__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3576:1: rule__ServiceMethod__Group__4 : rule__ServiceMethod__Group__4__Impl rule__ServiceMethod__Group__5 ;
    public final void rule__ServiceMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3580:1: ( rule__ServiceMethod__Group__4__Impl rule__ServiceMethod__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3581:2: rule__ServiceMethod__Group__4__Impl rule__ServiceMethod__Group__5
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__4__Impl_in_rule__ServiceMethod__Group__47392);
            rule__ServiceMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__5_in_rule__ServiceMethod__Group__47395);
            rule__ServiceMethod__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__4"


    // $ANTLR start "rule__ServiceMethod__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3588:1: rule__ServiceMethod__Group__4__Impl : ( '(' ) ;
    public final void rule__ServiceMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3592:1: ( ( '(' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3593:1: ( '(' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3593:1: ( '(' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3594:1: '('
            {
             before(grammarAccess.getServiceMethodAccess().getLeftParenthesisKeyword_4()); 
            match(input,48,FOLLOW_48_in_rule__ServiceMethod__Group__4__Impl7423); 
             after(grammarAccess.getServiceMethodAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__4__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3607:1: rule__ServiceMethod__Group__5 : rule__ServiceMethod__Group__5__Impl rule__ServiceMethod__Group__6 ;
    public final void rule__ServiceMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3611:1: ( rule__ServiceMethod__Group__5__Impl rule__ServiceMethod__Group__6 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3612:2: rule__ServiceMethod__Group__5__Impl rule__ServiceMethod__Group__6
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__5__Impl_in_rule__ServiceMethod__Group__57454);
            rule__ServiceMethod__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__6_in_rule__ServiceMethod__Group__57457);
            rule__ServiceMethod__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__5"


    // $ANTLR start "rule__ServiceMethod__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3619:1: rule__ServiceMethod__Group__5__Impl : ( ( rule__ServiceMethod__PropertiesAssignment_5 )* ) ;
    public final void rule__ServiceMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3623:1: ( ( ( rule__ServiceMethod__PropertiesAssignment_5 )* ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3624:1: ( ( rule__ServiceMethod__PropertiesAssignment_5 )* )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3624:1: ( ( rule__ServiceMethod__PropertiesAssignment_5 )* )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3625:1: ( rule__ServiceMethod__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getServiceMethodAccess().getPropertiesAssignment_5()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3626:1: ( rule__ServiceMethod__PropertiesAssignment_5 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=RULE_SL_COMMENT && LA41_0<=RULE_ID)||LA41_0==RULE_ATTR||(LA41_0>=15 && LA41_0<=30)||LA41_0==50||(LA41_0>=53 && LA41_0<=54)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3626:2: rule__ServiceMethod__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__ServiceMethod__PropertiesAssignment_5_in_rule__ServiceMethod__Group__5__Impl7484);
            	    rule__ServiceMethod__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getServiceMethodAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__5__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__6"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3636:1: rule__ServiceMethod__Group__6 : rule__ServiceMethod__Group__6__Impl rule__ServiceMethod__Group__7 ;
    public final void rule__ServiceMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3640:1: ( rule__ServiceMethod__Group__6__Impl rule__ServiceMethod__Group__7 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3641:2: rule__ServiceMethod__Group__6__Impl rule__ServiceMethod__Group__7
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__6__Impl_in_rule__ServiceMethod__Group__67515);
            rule__ServiceMethod__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ServiceMethod__Group__7_in_rule__ServiceMethod__Group__67518);
            rule__ServiceMethod__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__6"


    // $ANTLR start "rule__ServiceMethod__Group__6__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3648:1: rule__ServiceMethod__Group__6__Impl : ( ')' ) ;
    public final void rule__ServiceMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3652:1: ( ( ')' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3653:1: ( ')' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3653:1: ( ')' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3654:1: ')'
            {
             before(grammarAccess.getServiceMethodAccess().getRightParenthesisKeyword_6()); 
            match(input,49,FOLLOW_49_in_rule__ServiceMethod__Group__6__Impl7546); 
             after(grammarAccess.getServiceMethodAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__6__Impl"


    // $ANTLR start "rule__ServiceMethod__Group__7"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3667:1: rule__ServiceMethod__Group__7 : rule__ServiceMethod__Group__7__Impl ;
    public final void rule__ServiceMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3671:1: ( rule__ServiceMethod__Group__7__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3672:2: rule__ServiceMethod__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ServiceMethod__Group__7__Impl_in_rule__ServiceMethod__Group__77577);
            rule__ServiceMethod__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__7"


    // $ANTLR start "rule__ServiceMethod__Group__7__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3678:1: rule__ServiceMethod__Group__7__Impl : ( ( ruleLineTerm )? ) ;
    public final void rule__ServiceMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3682:1: ( ( ( ruleLineTerm )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3683:1: ( ( ruleLineTerm )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3683:1: ( ( ruleLineTerm )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3684:1: ( ruleLineTerm )?
            {
             before(grammarAccess.getServiceMethodAccess().getLineTermParserRuleCall_7()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3685:1: ( ruleLineTerm )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=13 && LA42_0<=14)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3685:3: ruleLineTerm
                    {
                    pushFollow(FOLLOW_ruleLineTerm_in_rule__ServiceMethod__Group__7__Impl7605);
                    ruleLineTerm();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceMethodAccess().getLineTermParserRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__Group__7__Impl"


    // $ANTLR start "rule__ListType__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3711:1: rule__ListType__Group__0 : rule__ListType__Group__0__Impl rule__ListType__Group__1 ;
    public final void rule__ListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3715:1: ( rule__ListType__Group__0__Impl rule__ListType__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3716:2: rule__ListType__Group__0__Impl rule__ListType__Group__1
            {
            pushFollow(FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__07652);
            rule__ListType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__07655);
            rule__ListType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0"


    // $ANTLR start "rule__ListType__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3723:1: rule__ListType__Group__0__Impl : ( 'list' ) ;
    public final void rule__ListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3727:1: ( ( 'list' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3728:1: ( 'list' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3728:1: ( 'list' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3729:1: 'list'
            {
             before(grammarAccess.getListTypeAccess().getListKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__ListType__Group__0__Impl7683); 
             after(grammarAccess.getListTypeAccess().getListKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__0__Impl"


    // $ANTLR start "rule__ListType__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3742:1: rule__ListType__Group__1 : rule__ListType__Group__1__Impl rule__ListType__Group__2 ;
    public final void rule__ListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3746:1: ( rule__ListType__Group__1__Impl rule__ListType__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3747:2: rule__ListType__Group__1__Impl rule__ListType__Group__2
            {
            pushFollow(FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__17714);
            rule__ListType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__17717);
            rule__ListType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1"


    // $ANTLR start "rule__ListType__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3754:1: rule__ListType__Group__1__Impl : ( '<' ) ;
    public final void rule__ListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3758:1: ( ( '<' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3759:1: ( '<' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3759:1: ( '<' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3760:1: '<'
            {
             before(grammarAccess.getListTypeAccess().getLessThanSignKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__ListType__Group__1__Impl7745); 
             after(grammarAccess.getListTypeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__1__Impl"


    // $ANTLR start "rule__ListType__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3773:1: rule__ListType__Group__2 : rule__ListType__Group__2__Impl rule__ListType__Group__3 ;
    public final void rule__ListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3777:1: ( rule__ListType__Group__2__Impl rule__ListType__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3778:2: rule__ListType__Group__2__Impl rule__ListType__Group__3
            {
            pushFollow(FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__27776);
            rule__ListType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__27779);
            rule__ListType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2"


    // $ANTLR start "rule__ListType__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3785:1: rule__ListType__Group__2__Impl : ( ( rule__ListType__Alternatives_2 ) ) ;
    public final void rule__ListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3789:1: ( ( ( rule__ListType__Alternatives_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3790:1: ( ( rule__ListType__Alternatives_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3790:1: ( ( rule__ListType__Alternatives_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3791:1: ( rule__ListType__Alternatives_2 )
            {
             before(grammarAccess.getListTypeAccess().getAlternatives_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3792:1: ( rule__ListType__Alternatives_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3792:2: rule__ListType__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ListType__Alternatives_2_in_rule__ListType__Group__2__Impl7806);
            rule__ListType__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__2__Impl"


    // $ANTLR start "rule__ListType__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3802:1: rule__ListType__Group__3 : rule__ListType__Group__3__Impl ;
    public final void rule__ListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3806:1: ( rule__ListType__Group__3__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3807:2: rule__ListType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__37836);
            rule__ListType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3"


    // $ANTLR start "rule__ListType__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3813:1: rule__ListType__Group__3__Impl : ( '>' ) ;
    public final void rule__ListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3817:1: ( ( '>' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3818:1: ( '>' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3818:1: ( '>' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3819:1: '>'
            {
             before(grammarAccess.getListTypeAccess().getGreaterThanSignKeyword_3()); 
            match(input,52,FOLLOW_52_in_rule__ListType__Group__3__Impl7864); 
             after(grammarAccess.getListTypeAccess().getGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3840:1: rule__MapType__Group__0 : rule__MapType__Group__0__Impl rule__MapType__Group__1 ;
    public final void rule__MapType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3844:1: ( rule__MapType__Group__0__Impl rule__MapType__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3845:2: rule__MapType__Group__0__Impl rule__MapType__Group__1
            {
            pushFollow(FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__07903);
            rule__MapType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__07906);
            rule__MapType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0"


    // $ANTLR start "rule__MapType__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3852:1: rule__MapType__Group__0__Impl : ( 'map' ) ;
    public final void rule__MapType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3856:1: ( ( 'map' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3857:1: ( 'map' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3857:1: ( 'map' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3858:1: 'map'
            {
             before(grammarAccess.getMapTypeAccess().getMapKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__MapType__Group__0__Impl7934); 
             after(grammarAccess.getMapTypeAccess().getMapKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__0__Impl"


    // $ANTLR start "rule__MapType__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3871:1: rule__MapType__Group__1 : rule__MapType__Group__1__Impl rule__MapType__Group__2 ;
    public final void rule__MapType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3875:1: ( rule__MapType__Group__1__Impl rule__MapType__Group__2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3876:2: rule__MapType__Group__1__Impl rule__MapType__Group__2
            {
            pushFollow(FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__17965);
            rule__MapType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__17968);
            rule__MapType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1"


    // $ANTLR start "rule__MapType__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3883:1: rule__MapType__Group__1__Impl : ( '<' ) ;
    public final void rule__MapType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3887:1: ( ( '<' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3888:1: ( '<' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3888:1: ( '<' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3889:1: '<'
            {
             before(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__MapType__Group__1__Impl7996); 
             after(grammarAccess.getMapTypeAccess().getLessThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__1__Impl"


    // $ANTLR start "rule__MapType__Group__2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3902:1: rule__MapType__Group__2 : rule__MapType__Group__2__Impl rule__MapType__Group__3 ;
    public final void rule__MapType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3906:1: ( rule__MapType__Group__2__Impl rule__MapType__Group__3 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3907:2: rule__MapType__Group__2__Impl rule__MapType__Group__3
            {
            pushFollow(FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__28027);
            rule__MapType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__28030);
            rule__MapType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2"


    // $ANTLR start "rule__MapType__Group__2__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3914:1: rule__MapType__Group__2__Impl : ( ( rule__MapType__Alternatives_2 ) ) ;
    public final void rule__MapType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3918:1: ( ( ( rule__MapType__Alternatives_2 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3919:1: ( ( rule__MapType__Alternatives_2 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3919:1: ( ( rule__MapType__Alternatives_2 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3920:1: ( rule__MapType__Alternatives_2 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_2()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3921:1: ( rule__MapType__Alternatives_2 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3921:2: rule__MapType__Alternatives_2
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_2_in_rule__MapType__Group__2__Impl8057);
            rule__MapType__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__2__Impl"


    // $ANTLR start "rule__MapType__Group__3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3931:1: rule__MapType__Group__3 : rule__MapType__Group__3__Impl rule__MapType__Group__4 ;
    public final void rule__MapType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3935:1: ( rule__MapType__Group__3__Impl rule__MapType__Group__4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3936:2: rule__MapType__Group__3__Impl rule__MapType__Group__4
            {
            pushFollow(FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__38087);
            rule__MapType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__38090);
            rule__MapType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3"


    // $ANTLR start "rule__MapType__Group__3__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3943:1: rule__MapType__Group__3__Impl : ( ',' ) ;
    public final void rule__MapType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3947:1: ( ( ',' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3948:1: ( ',' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3948:1: ( ',' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3949:1: ','
            {
             before(grammarAccess.getMapTypeAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__MapType__Group__3__Impl8118); 
             after(grammarAccess.getMapTypeAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__3__Impl"


    // $ANTLR start "rule__MapType__Group__4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3962:1: rule__MapType__Group__4 : rule__MapType__Group__4__Impl rule__MapType__Group__5 ;
    public final void rule__MapType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3966:1: ( rule__MapType__Group__4__Impl rule__MapType__Group__5 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3967:2: rule__MapType__Group__4__Impl rule__MapType__Group__5
            {
            pushFollow(FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__48149);
            rule__MapType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__48152);
            rule__MapType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4"


    // $ANTLR start "rule__MapType__Group__4__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3974:1: rule__MapType__Group__4__Impl : ( ( rule__MapType__Alternatives_4 ) ) ;
    public final void rule__MapType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3978:1: ( ( ( rule__MapType__Alternatives_4 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3979:1: ( ( rule__MapType__Alternatives_4 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3979:1: ( ( rule__MapType__Alternatives_4 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3980:1: ( rule__MapType__Alternatives_4 )
            {
             before(grammarAccess.getMapTypeAccess().getAlternatives_4()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3981:1: ( rule__MapType__Alternatives_4 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3981:2: rule__MapType__Alternatives_4
            {
            pushFollow(FOLLOW_rule__MapType__Alternatives_4_in_rule__MapType__Group__4__Impl8179);
            rule__MapType__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getMapTypeAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__4__Impl"


    // $ANTLR start "rule__MapType__Group__5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3991:1: rule__MapType__Group__5 : rule__MapType__Group__5__Impl ;
    public final void rule__MapType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3995:1: ( rule__MapType__Group__5__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:3996:2: rule__MapType__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__58209);
            rule__MapType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5"


    // $ANTLR start "rule__MapType__Group__5__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4002:1: rule__MapType__Group__5__Impl : ( '>' ) ;
    public final void rule__MapType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4006:1: ( ( '>' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4007:1: ( '>' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4007:1: ( '>' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4008:1: '>'
            {
             before(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_5()); 
            match(input,52,FOLLOW_52_in_rule__MapType__Group__5__Impl8237); 
             after(grammarAccess.getMapTypeAccess().getGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4033:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4037:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4038:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__08280);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08283);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4045:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__Group_0__0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4049:1: ( ( ( rule__Attribute__Group_0__0 )? ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4050:1: ( ( rule__Attribute__Group_0__0 )? )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4050:1: ( ( rule__Attribute__Group_0__0 )? )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4051:1: ( rule__Attribute__Group_0__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4052:1: ( rule__Attribute__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4052:2: rule__Attribute__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_0__0_in_rule__Attribute__Group__0__Impl8310);
                    rule__Attribute__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4062:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4066:1: ( rule__Attribute__Group__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4067:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__18341);
            rule__Attribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4073:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__AttrAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4077:1: ( ( ( rule__Attribute__AttrAssignment_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4078:1: ( ( rule__Attribute__AttrAssignment_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4078:1: ( ( rule__Attribute__AttrAssignment_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4079:1: ( rule__Attribute__AttrAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttrAssignment_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4080:1: ( rule__Attribute__AttrAssignment_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4080:2: rule__Attribute__AttrAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttrAssignment_1_in_rule__Attribute__Group__1__Impl8368);
            rule__Attribute__AttrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group_0__0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4094:1: rule__Attribute__Group_0__0 : rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 ;
    public final void rule__Attribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4098:1: ( rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4099:2: rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_0__0__Impl_in_rule__Attribute__Group_0__08402);
            rule__Attribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_0__1_in_rule__Attribute__Group_0__08405);
            rule__Attribute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__0"


    // $ANTLR start "rule__Attribute__Group_0__0__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4106:1: rule__Attribute__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4110:1: ( ( '@' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4111:1: ( '@' )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4111:1: ( '@' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4112:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0_0()); 
            match(input,54,FOLLOW_54_in_rule__Attribute__Group_0__0__Impl8433); 
             after(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_0__1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4125:1: rule__Attribute__Group_0__1 : rule__Attribute__Group_0__1__Impl ;
    public final void rule__Attribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4129:1: ( rule__Attribute__Group_0__1__Impl )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4130:2: rule__Attribute__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_0__1__Impl_in_rule__Attribute__Group_0__18464);
            rule__Attribute__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__1"


    // $ANTLR start "rule__Attribute__Group_0__1__Impl"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4136:1: rule__Attribute__Group_0__1__Impl : ( ( rule__Attribute__ScopeAssignment_0_1 ) ) ;
    public final void rule__Attribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4140:1: ( ( ( rule__Attribute__ScopeAssignment_0_1 ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4141:1: ( ( rule__Attribute__ScopeAssignment_0_1 ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4141:1: ( ( rule__Attribute__ScopeAssignment_0_1 ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4142:1: ( rule__Attribute__ScopeAssignment_0_1 )
            {
             before(grammarAccess.getAttributeAccess().getScopeAssignment_0_1()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4143:1: ( rule__Attribute__ScopeAssignment_0_1 )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4143:2: rule__Attribute__ScopeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Attribute__ScopeAssignment_0_1_in_rule__Attribute__Group_0__1__Impl8491);
            rule__Attribute__ScopeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getScopeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_0__1__Impl"


    // $ANTLR start "rule__BabelIdl__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4158:1: rule__BabelIdl__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__BabelIdl__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4162:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4163:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4163:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4164:1: ruleCommentType
            {
             before(grammarAccess.getBabelIdlAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__BabelIdl__CommentAssignment_08530);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getBabelIdlAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__CommentAssignment_0"


    // $ANTLR start "rule__BabelIdl__ImportsAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4173:1: rule__BabelIdl__ImportsAssignment_1 : ( ruleImportStatement ) ;
    public final void rule__BabelIdl__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4177:1: ( ( ruleImportStatement ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4178:1: ( ruleImportStatement )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4178:1: ( ruleImportStatement )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4179:1: ruleImportStatement
            {
             before(grammarAccess.getBabelIdlAccess().getImportsImportStatementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImportStatement_in_rule__BabelIdl__ImportsAssignment_18561);
            ruleImportStatement();

            state._fsp--;

             after(grammarAccess.getBabelIdlAccess().getImportsImportStatementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__ImportsAssignment_1"


    // $ANTLR start "rule__BabelIdl__DefaultNamespaceAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4188:1: rule__BabelIdl__DefaultNamespaceAssignment_2 : ( ruleDefaultNameSpace ) ;
    public final void rule__BabelIdl__DefaultNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4192:1: ( ( ruleDefaultNameSpace ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4193:1: ( ruleDefaultNameSpace )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4193:1: ( ruleDefaultNameSpace )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4194:1: ruleDefaultNameSpace
            {
             before(grammarAccess.getBabelIdlAccess().getDefaultNamespaceDefaultNameSpaceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDefaultNameSpace_in_rule__BabelIdl__DefaultNamespaceAssignment_28592);
            ruleDefaultNameSpace();

            state._fsp--;

             after(grammarAccess.getBabelIdlAccess().getDefaultNamespaceDefaultNameSpaceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__DefaultNamespaceAssignment_2"


    // $ANTLR start "rule__BabelIdl__NamespacesAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4203:1: rule__BabelIdl__NamespacesAssignment_3 : ( ruleNamespace ) ;
    public final void rule__BabelIdl__NamespacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4207:1: ( ( ruleNamespace ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4208:1: ( ruleNamespace )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4208:1: ( ruleNamespace )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4209:1: ruleNamespace
            {
             before(grammarAccess.getBabelIdlAccess().getNamespacesNamespaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNamespace_in_rule__BabelIdl__NamespacesAssignment_38623);
            ruleNamespace();

            state._fsp--;

             after(grammarAccess.getBabelIdlAccess().getNamespacesNamespaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__NamespacesAssignment_3"


    // $ANTLR start "rule__BabelIdl__DefinitionsAssignment_4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4218:1: rule__BabelIdl__DefinitionsAssignment_4 : ( ruleBabelDefinition ) ;
    public final void rule__BabelIdl__DefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4222:1: ( ( ruleBabelDefinition ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4223:1: ( ruleBabelDefinition )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4223:1: ( ruleBabelDefinition )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4224:1: ruleBabelDefinition
            {
             before(grammarAccess.getBabelIdlAccess().getDefinitionsBabelDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleBabelDefinition_in_rule__BabelIdl__DefinitionsAssignment_48654);
            ruleBabelDefinition();

            state._fsp--;

             after(grammarAccess.getBabelIdlAccess().getDefinitionsBabelDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BabelIdl__DefinitionsAssignment_4"


    // $ANTLR start "rule__Namespace__LangAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4233:1: rule__Namespace__LangAssignment_1 : ( ruleSupportedLangs ) ;
    public final void rule__Namespace__LangAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4237:1: ( ( ruleSupportedLangs ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4238:1: ( ruleSupportedLangs )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4238:1: ( ruleSupportedLangs )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4239:1: ruleSupportedLangs
            {
             before(grammarAccess.getNamespaceAccess().getLangSupportedLangsEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSupportedLangs_in_rule__Namespace__LangAssignment_18685);
            ruleSupportedLangs();

            state._fsp--;

             after(grammarAccess.getNamespaceAccess().getLangSupportedLangsEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__LangAssignment_1"


    // $ANTLR start "rule__Namespace__NsAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4248:1: rule__Namespace__NsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Namespace__NsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4252:1: ( ( RULE_STRING ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4253:1: ( RULE_STRING )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4253:1: ( RULE_STRING )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4254:1: RULE_STRING
            {
             before(grammarAccess.getNamespaceAccess().getNsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Namespace__NsAssignment_28716); 
             after(grammarAccess.getNamespaceAccess().getNsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Namespace__NsAssignment_2"


    // $ANTLR start "rule__DefaultNameSpace__DefAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4263:1: rule__DefaultNameSpace__DefAssignment_1 : ( ruleDefaultQualifier ) ;
    public final void rule__DefaultNameSpace__DefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4267:1: ( ( ruleDefaultQualifier ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4268:1: ( ruleDefaultQualifier )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4268:1: ( ruleDefaultQualifier )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4269:1: ruleDefaultQualifier
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getDefDefaultQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefaultQualifier_in_rule__DefaultNameSpace__DefAssignment_18747);
            ruleDefaultQualifier();

            state._fsp--;

             after(grammarAccess.getDefaultNameSpaceAccess().getDefDefaultQualifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__DefAssignment_1"


    // $ANTLR start "rule__DefaultNameSpace__NsAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4278:1: rule__DefaultNameSpace__NsAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__DefaultNameSpace__NsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4282:1: ( ( ruleQualifiedName ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4283:1: ( ruleQualifiedName )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4283:1: ( ruleQualifiedName )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4284:1: ruleQualifiedName
            {
             before(grammarAccess.getDefaultNameSpaceAccess().getNsQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__DefaultNameSpace__NsAssignment_28778);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDefaultNameSpaceAccess().getNsQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultNameSpace__NsAssignment_2"


    // $ANTLR start "rule__ImportStatement__ImportURIAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4293:1: rule__ImportStatement__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ImportStatement__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4297:1: ( ( RULE_STRING ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4298:1: ( RULE_STRING )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4298:1: ( RULE_STRING )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4299:1: RULE_STRING
            {
             before(grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ImportStatement__ImportURIAssignment_18809); 
             after(grammarAccess.getImportStatementAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportStatement__ImportURIAssignment_1"


    // $ANTLR start "rule__Enum__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4308:1: rule__Enum__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__Enum__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4312:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4313:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4313:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4314:1: ruleCommentType
            {
             before(grammarAccess.getEnumAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__Enum__CommentAssignment_08840);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__CommentAssignment_0"


    // $ANTLR start "rule__Enum__NameAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4323:1: rule__Enum__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enum__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4327:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4328:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4328:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4329:1: RULE_ID
            {
             before(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_28871); 
             after(grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__NameAssignment_2"


    // $ANTLR start "rule__Enum__PropertiesAssignment_4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4338:1: rule__Enum__PropertiesAssignment_4 : ( ruleEnumProperty ) ;
    public final void rule__Enum__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4342:1: ( ( ruleEnumProperty ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4343:1: ( ruleEnumProperty )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4343:1: ( ruleEnumProperty )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4344:1: ruleEnumProperty
            {
             before(grammarAccess.getEnumAccess().getPropertiesEnumPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEnumProperty_in_rule__Enum__PropertiesAssignment_48902);
            ruleEnumProperty();

            state._fsp--;

             after(grammarAccess.getEnumAccess().getPropertiesEnumPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enum__PropertiesAssignment_4"


    // $ANTLR start "rule__EnumProperty__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4353:1: rule__EnumProperty__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__EnumProperty__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4357:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4358:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4358:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4359:1: ruleCommentType
            {
             before(grammarAccess.getEnumPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__EnumProperty__CommentAssignment_08933);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getEnumPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__CommentAssignment_0"


    // $ANTLR start "rule__EnumProperty__NameAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4368:1: rule__EnumProperty__NameAssignment_1 : ( ruleEnumPropertyId ) ;
    public final void rule__EnumProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4372:1: ( ( ruleEnumPropertyId ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4373:1: ( ruleEnumPropertyId )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4373:1: ( ruleEnumPropertyId )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4374:1: ruleEnumPropertyId
            {
             before(grammarAccess.getEnumPropertyAccess().getNameEnumPropertyIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEnumPropertyId_in_rule__EnumProperty__NameAssignment_18964);
            ruleEnumPropertyId();

            state._fsp--;

             after(grammarAccess.getEnumPropertyAccess().getNameEnumPropertyIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__NameAssignment_1"


    // $ANTLR start "rule__EnumProperty__TypeAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4383:1: rule__EnumProperty__TypeAssignment_3 : ( ruleEnumOrdinal ) ;
    public final void rule__EnumProperty__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4387:1: ( ( ruleEnumOrdinal ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4388:1: ( ruleEnumOrdinal )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4388:1: ( ruleEnumOrdinal )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4389:1: ruleEnumOrdinal
            {
             before(grammarAccess.getEnumPropertyAccess().getTypeEnumOrdinalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnumOrdinal_in_rule__EnumProperty__TypeAssignment_38995);
            ruleEnumOrdinal();

            state._fsp--;

             after(grammarAccess.getEnumPropertyAccess().getTypeEnumOrdinalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumProperty__TypeAssignment_3"


    // $ANTLR start "rule__EnumOrdinal__TypeAssignment"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4398:1: rule__EnumOrdinal__TypeAssignment : ( RULE_INT ) ;
    public final void rule__EnumOrdinal__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4402:1: ( ( RULE_INT ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4403:1: ( RULE_INT )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4403:1: ( RULE_INT )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4404:1: RULE_INT
            {
             before(grammarAccess.getEnumOrdinalAccess().getTypeINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__EnumOrdinal__TypeAssignment9026); 
             after(grammarAccess.getEnumOrdinalAccess().getTypeINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumOrdinal__TypeAssignment"


    // $ANTLR start "rule__EnumPropertyId__NameAssignment"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4413:1: rule__EnumPropertyId__NameAssignment : ( RULE_ID ) ;
    public final void rule__EnumPropertyId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4417:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4418:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4418:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4419:1: RULE_ID
            {
             before(grammarAccess.getEnumPropertyIdAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EnumPropertyId__NameAssignment9057); 
             after(grammarAccess.getEnumPropertyIdAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumPropertyId__NameAssignment"


    // $ANTLR start "rule__Const__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4428:1: rule__Const__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__Const__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4432:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4433:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4433:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4434:1: ruleCommentType
            {
             before(grammarAccess.getConstAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__Const__CommentAssignment_09088);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getConstAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__CommentAssignment_0"


    // $ANTLR start "rule__Const__NameAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4443:1: rule__Const__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Const__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4447:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4448:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4448:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4449:1: RULE_ID
            {
             before(grammarAccess.getConstAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Const__NameAssignment_29119); 
             after(grammarAccess.getConstAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__NameAssignment_2"


    // $ANTLR start "rule__Const__PropertiesAssignment_4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4458:1: rule__Const__PropertiesAssignment_4 : ( ruleConstProperty ) ;
    public final void rule__Const__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4462:1: ( ( ruleConstProperty ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4463:1: ( ruleConstProperty )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4463:1: ( ruleConstProperty )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4464:1: ruleConstProperty
            {
             before(grammarAccess.getConstAccess().getPropertiesConstPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConstProperty_in_rule__Const__PropertiesAssignment_49150);
            ruleConstProperty();

            state._fsp--;

             after(grammarAccess.getConstAccess().getPropertiesConstPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Const__PropertiesAssignment_4"


    // $ANTLR start "rule__ConstProperty__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4473:1: rule__ConstProperty__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__ConstProperty__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4477:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4478:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4478:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4479:1: ruleCommentType
            {
             before(grammarAccess.getConstPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__ConstProperty__CommentAssignment_09181);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getConstPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__CommentAssignment_0"


    // $ANTLR start "rule__ConstProperty__NameAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4488:1: rule__ConstProperty__NameAssignment_1 : ( ruleConstPropertyId ) ;
    public final void rule__ConstProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4492:1: ( ( ruleConstPropertyId ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4493:1: ( ruleConstPropertyId )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4493:1: ( ruleConstPropertyId )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4494:1: ruleConstPropertyId
            {
             before(grammarAccess.getConstPropertyAccess().getNameConstPropertyIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleConstPropertyId_in_rule__ConstProperty__NameAssignment_19212);
            ruleConstPropertyId();

            state._fsp--;

             after(grammarAccess.getConstPropertyAccess().getNameConstPropertyIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__NameAssignment_1"


    // $ANTLR start "rule__ConstProperty__ValAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4503:1: rule__ConstProperty__ValAssignment_3 : ( ruleConstValueType ) ;
    public final void rule__ConstProperty__ValAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4507:1: ( ( ruleConstValueType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4508:1: ( ruleConstValueType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4508:1: ( ruleConstValueType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4509:1: ruleConstValueType
            {
             before(grammarAccess.getConstPropertyAccess().getValConstValueTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstValueType_in_rule__ConstProperty__ValAssignment_39243);
            ruleConstValueType();

            state._fsp--;

             after(grammarAccess.getConstPropertyAccess().getValConstValueTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstProperty__ValAssignment_3"


    // $ANTLR start "rule__ConstValueType__StringValAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4518:1: rule__ConstValueType__StringValAssignment_0 : ( RULE_STRING ) ;
    public final void rule__ConstValueType__StringValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4522:1: ( ( RULE_STRING ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4523:1: ( RULE_STRING )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4523:1: ( RULE_STRING )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4524:1: RULE_STRING
            {
             before(grammarAccess.getConstValueTypeAccess().getStringValSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ConstValueType__StringValAssignment_09274); 
             after(grammarAccess.getConstValueTypeAccess().getStringValSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstValueType__StringValAssignment_0"


    // $ANTLR start "rule__ConstValueType__BoolValAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4533:1: rule__ConstValueType__BoolValAssignment_1 : ( RULE_BOOL ) ;
    public final void rule__ConstValueType__BoolValAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4537:1: ( ( RULE_BOOL ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4538:1: ( RULE_BOOL )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4538:1: ( RULE_BOOL )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4539:1: RULE_BOOL
            {
             before(grammarAccess.getConstValueTypeAccess().getBoolValBOOLTerminalRuleCall_1_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__ConstValueType__BoolValAssignment_19305); 
             after(grammarAccess.getConstValueTypeAccess().getBoolValBOOLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstValueType__BoolValAssignment_1"


    // $ANTLR start "rule__ConstValueType__NumValAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4548:1: rule__ConstValueType__NumValAssignment_2 : ( ruleConstNumValue ) ;
    public final void rule__ConstValueType__NumValAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4552:1: ( ( ruleConstNumValue ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4553:1: ( ruleConstNumValue )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4553:1: ( ruleConstNumValue )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4554:1: ruleConstNumValue
            {
             before(grammarAccess.getConstValueTypeAccess().getNumValConstNumValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleConstNumValue_in_rule__ConstValueType__NumValAssignment_29336);
            ruleConstNumValue();

            state._fsp--;

             after(grammarAccess.getConstValueTypeAccess().getNumValConstNumValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstValueType__NumValAssignment_2"


    // $ANTLR start "rule__ConstPropertyId__NameAssignment"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4563:1: rule__ConstPropertyId__NameAssignment : ( RULE_ID ) ;
    public final void rule__ConstPropertyId__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4567:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4568:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4568:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4569:1: RULE_ID
            {
             before(grammarAccess.getConstPropertyIdAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConstPropertyId__NameAssignment9367); 
             after(grammarAccess.getConstPropertyIdAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstPropertyId__NameAssignment"


    // $ANTLR start "rule__Struct__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4578:1: rule__Struct__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__Struct__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4582:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4583:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4583:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4584:1: ruleCommentType
            {
             before(grammarAccess.getStructAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__Struct__CommentAssignment_09398);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getStructAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__CommentAssignment_0"


    // $ANTLR start "rule__Struct__AttributesAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4593:1: rule__Struct__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Struct__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4597:1: ( ( ruleAttribute ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4598:1: ( ruleAttribute )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4598:1: ( ruleAttribute )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4599:1: ruleAttribute
            {
             before(grammarAccess.getStructAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Struct__AttributesAssignment_19429);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStructAccess().getAttributesAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__AttributesAssignment_1"


    // $ANTLR start "rule__Struct__NameAssignment_4"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4608:1: rule__Struct__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Struct__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4612:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4613:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4613:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4614:1: RULE_ID
            {
             before(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_49460); 
             after(grammarAccess.getStructAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__NameAssignment_4"


    // $ANTLR start "rule__Struct__SuperTypeAssignment_5_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4623:1: rule__Struct__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Struct__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4627:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4628:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4628:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4629:1: ( RULE_ID )
            {
             before(grammarAccess.getStructAccess().getSuperTypeStructCrossReference_5_1_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4630:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4631:1: RULE_ID
            {
             before(grammarAccess.getStructAccess().getSuperTypeStructIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Struct__SuperTypeAssignment_5_19495); 
             after(grammarAccess.getStructAccess().getSuperTypeStructIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStructAccess().getSuperTypeStructCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__Struct__PropertiesAssignment_7"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4642:1: rule__Struct__PropertiesAssignment_7 : ( ruleProperty ) ;
    public final void rule__Struct__PropertiesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4646:1: ( ( ruleProperty ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4647:1: ( ruleProperty )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4647:1: ( ruleProperty )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4648:1: ruleProperty
            {
             before(grammarAccess.getStructAccess().getPropertiesPropertyParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__Struct__PropertiesAssignment_79530);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getStructAccess().getPropertiesPropertyParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Struct__PropertiesAssignment_7"


    // $ANTLR start "rule__Property__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4657:1: rule__Property__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__Property__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4661:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4662:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4662:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4663:1: ruleCommentType
            {
             before(grammarAccess.getPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__Property__CommentAssignment_09561);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__CommentAssignment_0"


    // $ANTLR start "rule__Property__AttributesAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4672:1: rule__Property__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Property__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4676:1: ( ( ruleAttribute ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4677:1: ( ruleAttribute )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4677:1: ( ruleAttribute )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4678:1: ruleAttribute
            {
             before(grammarAccess.getPropertyAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Property__AttributesAssignment_19592);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getAttributesAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__AttributesAssignment_1"


    // $ANTLR start "rule__Property__DateTypeAssignment_2_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4687:1: rule__Property__DateTypeAssignment_2_0 : ( ruleDataTypeReference ) ;
    public final void rule__Property__DateTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4691:1: ( ( ruleDataTypeReference ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4692:1: ( ruleDataTypeReference )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4692:1: ( ruleDataTypeReference )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4693:1: ruleDataTypeReference
            {
             before(grammarAccess.getPropertyAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_rule__Property__DateTypeAssignment_2_09623);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DateTypeAssignment_2_0"


    // $ANTLR start "rule__Property__ElementTypeAssignment_2_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4702:1: rule__Property__ElementTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ElementTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4706:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4707:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4707:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4708:1: ( RULE_ID )
            {
             before(grammarAccess.getPropertyAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4709:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4710:1: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Property__ElementTypeAssignment_2_19658); 
             after(grammarAccess.getPropertyAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getPropertyAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ElementTypeAssignment_2_1"


    // $ANTLR start "rule__Property__NameAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4721:1: rule__Property__NameAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__Property__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4725:1: ( ( rulePropertyValue ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4726:1: ( rulePropertyValue )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4726:1: ( rulePropertyValue )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4727:1: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getNamePropertyValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePropertyValue_in_rule__Property__NameAssignment_39693);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getNamePropertyValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_3"


    // $ANTLR start "rule__PropertyValue__NameAssignment"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4736:1: rule__PropertyValue__NameAssignment : ( RULE_ID ) ;
    public final void rule__PropertyValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4740:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4741:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4741:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4742:1: RULE_ID
            {
             before(grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyValue__NameAssignment9724); 
             after(grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__NameAssignment"


    // $ANTLR start "rule__Service__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4751:1: rule__Service__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__Service__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4755:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4756:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4756:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4757:1: ruleCommentType
            {
             before(grammarAccess.getServiceAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__Service__CommentAssignment_09755);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__CommentAssignment_0"


    // $ANTLR start "rule__Service__AttributesAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4766:1: rule__Service__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Service__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4770:1: ( ( ruleAttribute ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4771:1: ( ruleAttribute )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4771:1: ( ruleAttribute )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4772:1: ruleAttribute
            {
             before(grammarAccess.getServiceAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Service__AttributesAssignment_19786);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getAttributesAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__AttributesAssignment_1"


    // $ANTLR start "rule__Service__NameAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4781:1: rule__Service__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4785:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4786:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4786:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4787:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_39817); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__NameAssignment_3"


    // $ANTLR start "rule__Service__ServiceMethodsAssignment_5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4796:1: rule__Service__ServiceMethodsAssignment_5 : ( ruleServiceMethod ) ;
    public final void rule__Service__ServiceMethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4800:1: ( ( ruleServiceMethod ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4801:1: ( ruleServiceMethod )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4801:1: ( ruleServiceMethod )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4802:1: ruleServiceMethod
            {
             before(grammarAccess.getServiceAccess().getServiceMethodsServiceMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleServiceMethod_in_rule__Service__ServiceMethodsAssignment_59848);
            ruleServiceMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getServiceMethodsServiceMethodParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Service__ServiceMethodsAssignment_5"


    // $ANTLR start "rule__ServiceMethod__CommentAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4811:1: rule__ServiceMethod__CommentAssignment_0 : ( ruleCommentType ) ;
    public final void rule__ServiceMethod__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4815:1: ( ( ruleCommentType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4816:1: ( ruleCommentType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4816:1: ( ruleCommentType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4817:1: ruleCommentType
            {
             before(grammarAccess.getServiceMethodAccess().getCommentCommentTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentType_in_rule__ServiceMethod__CommentAssignment_09879);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getServiceMethodAccess().getCommentCommentTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__CommentAssignment_0"


    // $ANTLR start "rule__ServiceMethod__AttributesAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4826:1: rule__ServiceMethod__AttributesAssignment_1 : ( ruleAttribute ) ;
    public final void rule__ServiceMethod__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4830:1: ( ( ruleAttribute ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4831:1: ( ruleAttribute )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4831:1: ( ruleAttribute )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4832:1: ruleAttribute
            {
             before(grammarAccess.getServiceMethodAccess().getAttributesAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__ServiceMethod__AttributesAssignment_19910);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServiceMethodAccess().getAttributesAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__AttributesAssignment_1"


    // $ANTLR start "rule__ServiceMethod__ReturnAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4841:1: rule__ServiceMethod__ReturnAssignment_2 : ( ruleServiceMethodReturnType ) ;
    public final void rule__ServiceMethod__ReturnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4845:1: ( ( ruleServiceMethodReturnType ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4846:1: ( ruleServiceMethodReturnType )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4846:1: ( ruleServiceMethodReturnType )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4847:1: ruleServiceMethodReturnType
            {
             before(grammarAccess.getServiceMethodAccess().getReturnServiceMethodReturnTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleServiceMethodReturnType_in_rule__ServiceMethod__ReturnAssignment_29941);
            ruleServiceMethodReturnType();

            state._fsp--;

             after(grammarAccess.getServiceMethodAccess().getReturnServiceMethodReturnTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__ReturnAssignment_2"


    // $ANTLR start "rule__ServiceMethod__NameAssignment_3"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4856:1: rule__ServiceMethod__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ServiceMethod__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4860:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4861:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4861:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4862:1: RULE_ID
            {
             before(grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceMethod__NameAssignment_39972); 
             after(grammarAccess.getServiceMethodAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__NameAssignment_3"


    // $ANTLR start "rule__ServiceMethod__PropertiesAssignment_5"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4871:1: rule__ServiceMethod__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__ServiceMethod__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4875:1: ( ( ruleServiceProperty ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4876:1: ( ruleServiceProperty )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4876:1: ( ruleServiceProperty )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4877:1: ruleServiceProperty
            {
             before(grammarAccess.getServiceMethodAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleServiceProperty_in_rule__ServiceMethod__PropertiesAssignment_510003);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getServiceMethodAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethod__PropertiesAssignment_5"


    // $ANTLR start "rule__ServiceProperty__NameAssignment"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4886:1: rule__ServiceProperty__NameAssignment : ( ruleProperty ) ;
    public final void rule__ServiceProperty__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4890:1: ( ( ruleProperty ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4891:1: ( ruleProperty )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4891:1: ( ruleProperty )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4892:1: ruleProperty
            {
             before(grammarAccess.getServicePropertyAccess().getNamePropertyParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleProperty_in_rule__ServiceProperty__NameAssignment10034);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getServicePropertyAccess().getNamePropertyParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__NameAssignment"


    // $ANTLR start "rule__ServiceMethodReturnType__VoidTypeAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4901:1: rule__ServiceMethodReturnType__VoidTypeAssignment_0 : ( ( 'void' ) ) ;
    public final void rule__ServiceMethodReturnType__VoidTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4905:1: ( ( ( 'void' ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4906:1: ( ( 'void' ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4906:1: ( ( 'void' ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4907:1: ( 'void' )
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeVoidKeyword_0_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4908:1: ( 'void' )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4909:1: 'void'
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeVoidKeyword_0_0()); 
            match(input,55,FOLLOW_55_in_rule__ServiceMethodReturnType__VoidTypeAssignment_010070); 
             after(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeVoidKeyword_0_0()); 

            }

             after(grammarAccess.getServiceMethodReturnTypeAccess().getVoidTypeVoidKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethodReturnType__VoidTypeAssignment_0"


    // $ANTLR start "rule__ServiceMethodReturnType__DataTypeAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4924:1: rule__ServiceMethodReturnType__DataTypeAssignment_1 : ( ruleDataTypeReference ) ;
    public final void rule__ServiceMethodReturnType__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4928:1: ( ( ruleDataTypeReference ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4929:1: ( ruleDataTypeReference )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4929:1: ( ruleDataTypeReference )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4930:1: ruleDataTypeReference
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getDataTypeDataTypeReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_rule__ServiceMethodReturnType__DataTypeAssignment_110109);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getServiceMethodReturnTypeAccess().getDataTypeDataTypeReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethodReturnType__DataTypeAssignment_1"


    // $ANTLR start "rule__ServiceMethodReturnType__ElementTypeAssignment_2"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4939:1: rule__ServiceMethodReturnType__ElementTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ServiceMethodReturnType__ElementTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4943:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4944:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4944:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4945:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4946:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4947:1: RULE_ID
            {
             before(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ServiceMethodReturnType__ElementTypeAssignment_210144); 
             after(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getServiceMethodReturnTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceMethodReturnType__ElementTypeAssignment_2"


    // $ANTLR start "rule__DataTypeReference__TypeAssignment_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4958:1: rule__DataTypeReference__TypeAssignment_0 : ( ruleDataTypeEnum ) ;
    public final void rule__DataTypeReference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4962:1: ( ( ruleDataTypeEnum ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4963:1: ( ruleDataTypeEnum )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4963:1: ( ruleDataTypeEnum )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4964:1: ruleDataTypeEnum
            {
             before(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDataTypeEnum_in_rule__DataTypeReference__TypeAssignment_010179);
            ruleDataTypeEnum();

            state._fsp--;

             after(grammarAccess.getDataTypeReferenceAccess().getTypeDataTypeEnumEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeReference__TypeAssignment_0"


    // $ANTLR start "rule__ListType__DateTypeAssignment_2_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4973:1: rule__ListType__DateTypeAssignment_2_0 : ( ruleDataTypeReference ) ;
    public final void rule__ListType__DateTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4977:1: ( ( ruleDataTypeReference ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4978:1: ( ruleDataTypeReference )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4978:1: ( ruleDataTypeReference )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4979:1: ruleDataTypeReference
            {
             before(grammarAccess.getListTypeAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_rule__ListType__DateTypeAssignment_2_010210);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getDateTypeDataTypeReferenceParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__DateTypeAssignment_2_0"


    // $ANTLR start "rule__ListType__ElementTypeAssignment_2_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4988:1: rule__ListType__ElementTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ListType__ElementTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4992:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4993:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4993:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4994:1: ( RULE_ID )
            {
             before(grammarAccess.getListTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4995:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:4996:1: RULE_ID
            {
             before(grammarAccess.getListTypeAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ListType__ElementTypeAssignment_2_110245); 
             after(grammarAccess.getListTypeAccess().getElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getListTypeAccess().getElementTypeElementTypeReferenceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__ElementTypeAssignment_2_1"


    // $ANTLR start "rule__MapType__KeyDataTypeAssignment_2_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5007:1: rule__MapType__KeyDataTypeAssignment_2_0 : ( ruleDataTypeReference ) ;
    public final void rule__MapType__KeyDataTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5011:1: ( ( ruleDataTypeReference ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5012:1: ( ruleDataTypeReference )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5012:1: ( ruleDataTypeReference )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5013:1: ruleDataTypeReference
            {
             before(grammarAccess.getMapTypeAccess().getKeyDataTypeDataTypeReferenceParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_rule__MapType__KeyDataTypeAssignment_2_010280);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getKeyDataTypeDataTypeReferenceParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__KeyDataTypeAssignment_2_0"


    // $ANTLR start "rule__MapType__KeyElementTypeAssignment_2_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5022:1: rule__MapType__KeyElementTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__KeyElementTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5026:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5027:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5027:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5028:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getKeyElementTypeElementTypeReferenceCrossReference_2_1_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5029:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5030:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getKeyElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__KeyElementTypeAssignment_2_110315); 
             after(grammarAccess.getMapTypeAccess().getKeyElementTypeElementTypeReferenceIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getKeyElementTypeElementTypeReferenceCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__KeyElementTypeAssignment_2_1"


    // $ANTLR start "rule__MapType__ValDataTypeAssignment_4_0"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5041:1: rule__MapType__ValDataTypeAssignment_4_0 : ( ruleDataTypeReference ) ;
    public final void rule__MapType__ValDataTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5045:1: ( ( ruleDataTypeReference ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5046:1: ( ruleDataTypeReference )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5046:1: ( ruleDataTypeReference )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5047:1: ruleDataTypeReference
            {
             before(grammarAccess.getMapTypeAccess().getValDataTypeDataTypeReferenceParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleDataTypeReference_in_rule__MapType__ValDataTypeAssignment_4_010350);
            ruleDataTypeReference();

            state._fsp--;

             after(grammarAccess.getMapTypeAccess().getValDataTypeDataTypeReferenceParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__ValDataTypeAssignment_4_0"


    // $ANTLR start "rule__MapType__ValElementTypeAssignment_4_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5056:1: rule__MapType__ValElementTypeAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MapType__ValElementTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5060:1: ( ( ( RULE_ID ) ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5061:1: ( ( RULE_ID ) )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5061:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5062:1: ( RULE_ID )
            {
             before(grammarAccess.getMapTypeAccess().getValElementTypeElementTypeReferenceCrossReference_4_1_0()); 
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5063:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5064:1: RULE_ID
            {
             before(grammarAccess.getMapTypeAccess().getValElementTypeElementTypeReferenceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapType__ValElementTypeAssignment_4_110385); 
             after(grammarAccess.getMapTypeAccess().getValElementTypeElementTypeReferenceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMapTypeAccess().getValElementTypeElementTypeReferenceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapType__ValElementTypeAssignment_4_1"


    // $ANTLR start "rule__Attribute__ScopeAssignment_0_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5075:1: rule__Attribute__ScopeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Attribute__ScopeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5079:1: ( ( RULE_ID ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5080:1: ( RULE_ID )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5080:1: ( RULE_ID )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5081:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getScopeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__ScopeAssignment_0_110420); 
             after(grammarAccess.getAttributeAccess().getScopeIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ScopeAssignment_0_1"


    // $ANTLR start "rule__Attribute__AttrAssignment_1"
    // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5090:1: rule__Attribute__AttrAssignment_1 : ( RULE_ATTR ) ;
    public final void rule__Attribute__AttrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5094:1: ( ( RULE_ATTR ) )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5095:1: ( RULE_ATTR )
            {
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5095:1: ( RULE_ATTR )
            // ../com.concur.babel.idl.ui/src-gen/com/concur/babel/ui/contentassist/antlr/internal/InternalBabelIdl.g:5096:1: RULE_ATTR
            {
             before(grammarAccess.getAttributeAccess().getAttrATTRTerminalRuleCall_1_0()); 
            match(input,RULE_ATTR,FOLLOW_RULE_ATTR_in_rule__Attribute__AttrAssignment_110451); 
             after(grammarAccess.getAttributeAccess().getAttrATTRTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AttrAssignment_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\3\4\1\uffff\1\6\1\12\3\uffff\1\12";
    static final String DFA2_maxS =
        "\3\66\1\uffff\1\6\1\66\3\uffff\1\12";
    static final String DFA2_acceptS =
        "\3\uffff\1\1\2\uffff\1\2\1\3\1\4\1\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\1\2\4\uffff\1\5\33\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2"+
            "\uffff\1\10\6\uffff\1\4",
            "\1\1\1\2\4\uffff\1\5\33\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2"+
            "\uffff\1\10\6\uffff\1\4",
            "\1\1\1\2\4\uffff\1\5\33\uffff\1\3\3\uffff\1\7\1\uffff\1\6\2"+
            "\uffff\1\10\6\uffff\1\4",
            "",
            "\1\11",
            "\1\5\41\uffff\1\6\2\uffff\1\10\6\uffff\1\4",
            "",
            "",
            "",
            "\1\5"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "912:1: rule__BabelDefinition__Alternatives : ( ( ruleEnum ) | ( ruleStruct ) | ( ruleConst ) | ( ruleService ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleBabelIdl_in_entryRuleBabelIdl61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBabelIdl68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__0_in_ruleBabelIdl94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBabelDefinition_in_entryRuleBabelDefinition121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBabelDefinition128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelDefinition__Alternatives_in_ruleBabelDefinition154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_entryRuleLineTerm181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLineTerm188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LineTerm__Alternatives_in_ruleLineTerm214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_entryRuleNamespace241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespace248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0_in_ruleNamespace274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultNameSpace_in_entryRuleDefaultNameSpace301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultNameSpace308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__0_in_ruleDefaultNameSpace334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultQualifier_in_entryRuleDefaultQualifier361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefaultQualifier368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__0_in_ruleDefaultQualifier394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName454 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_entryRuleImportStatement482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportStatement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__0_in_ruleImportStatement515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0_in_ruleEnum575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumProperty_in_entryRuleEnumProperty602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumProperty609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__0_in_ruleEnumProperty635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOrdinal_in_entryRuleEnumOrdinal662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumOrdinal669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumOrdinal__TypeAssignment_in_ruleEnumOrdinal695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyId_in_entryRuleEnumPropertyId722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumPropertyId729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumPropertyId__NameAssignment_in_ruleEnumPropertyId755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_entryRuleConst782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__Group__0_in_ruleConst815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstProperty_in_entryRuleConstProperty842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstProperty849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__0_in_ruleConstProperty875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstValueType_in_entryRuleConstValueType902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstValueType909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstValueType__Alternatives_in_ruleConstValueType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstNumValue_in_entryRuleConstNumValue962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstNumValue969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__0_in_ruleConstNumValue995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstPropertyId_in_entryRuleConstPropertyId1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstPropertyId1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstPropertyId__NameAssignment_in_ruleConstPropertyId1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_entryRuleStruct1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStruct1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__0_in_ruleStruct1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0_in_ruleProperty1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyValue__NameAssignment_in_rulePropertyValue1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_entryRuleServiceMethod1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethod1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__0_in_ruleServiceMethod1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProperty_in_entryRuleServiceProperty1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceProperty1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceProperty__NameAssignment_in_ruleServiceProperty1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethodReturnType_in_entryRuleServiceMethodReturnType1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleServiceMethodReturnType1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethodReturnType__Alternatives_in_ruleServiceMethodReturnType1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_entryRuleDataTypeReference1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataTypeReference1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeReference__Alternatives_in_ruleDataTypeReference1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_entryRuleListType1564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListType1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0_in_ruleListType1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_entryRuleMapType1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapType1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0_in_ruleMapType1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_entryRuleCommentType1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentType1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentType__Alternatives_in_ruleCommentType1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeEnum__Alternatives_in_ruleDataTypeEnum1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SupportedLangs__Alternatives_in_ruleSupportedLangs1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_rule__BabelDefinition__Alternatives1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStruct_in_rule__BabelDefinition__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_in_rule__BabelDefinition__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__BabelDefinition__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__LineTerm__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__LineTerm__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstValueType__StringValAssignment_0_in_rule__ConstValueType__Alternatives2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstValueType__BoolValAssignment_1_in_rule__ConstValueType__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstValueType__NumValAssignment_2_in_rule__ConstValueType__Alternatives2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__DateTypeAssignment_2_0_in_rule__Property__Alternatives_22092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__ElementTypeAssignment_2_1_in_rule__Property__Alternatives_22110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethodReturnType__VoidTypeAssignment_0_in_rule__ServiceMethodReturnType__Alternatives2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethodReturnType__DataTypeAssignment_1_in_rule__ServiceMethodReturnType__Alternatives2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethodReturnType__ElementTypeAssignment_2_in_rule__ServiceMethodReturnType__Alternatives2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataTypeReference__TypeAssignment_0_in_rule__DataTypeReference__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListType_in_rule__DataTypeReference__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapType_in_rule__DataTypeReference__Alternatives2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__DateTypeAssignment_2_0_in_rule__ListType__Alternatives_22280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__ElementTypeAssignment_2_1_in_rule__ListType__Alternatives_22298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__KeyDataTypeAssignment_2_0_in_rule__MapType__Alternatives_22331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__KeyElementTypeAssignment_2_1_in_rule__MapType__Alternatives_22349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__ValDataTypeAssignment_4_0_in_rule__MapType__Alternatives_42382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__ValElementTypeAssignment_4_1_in_rule__MapType__Alternatives_42400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__CommentType__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ML_COMMENT_in_rule__CommentType__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataTypeEnum__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataTypeEnum__Alternatives2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataTypeEnum__Alternatives2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataTypeEnum__Alternatives2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataTypeEnum__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataTypeEnum__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataTypeEnum__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataTypeEnum__Alternatives2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataTypeEnum__Alternatives2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataTypeEnum__Alternatives2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataTypeEnum__Alternatives2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataTypeEnum__Alternatives2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DataTypeEnum__Alternatives2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DataTypeEnum__Alternatives2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataTypeEnum__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataTypeEnum__Alternatives2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SupportedLangs__Alternatives2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SupportedLangs__Alternatives2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SupportedLangs__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__0__Impl_in_rule__BabelIdl__Group__02909 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__1_in_rule__BabelIdl__Group__02912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__CommentAssignment_0_in_rule__BabelIdl__Group__0__Impl2939 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__1__Impl_in_rule__BabelIdl__Group__12970 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__2_in_rule__BabelIdl__Group__12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__ImportsAssignment_1_in_rule__BabelIdl__Group__1__Impl3000 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__2__Impl_in_rule__BabelIdl__Group__23031 = new BitSet(new long[]{0x0040944400000430L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__3_in_rule__BabelIdl__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__DefaultNamespaceAssignment_2_in_rule__BabelIdl__Group__2__Impl3061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__3__Impl_in_rule__BabelIdl__Group__33091 = new BitSet(new long[]{0x0040944400000430L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__4_in_rule__BabelIdl__Group__33094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__NamespacesAssignment_3_in_rule__BabelIdl__Group__3__Impl3121 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__Group__4__Impl_in_rule__BabelIdl__Group__43152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BabelIdl__DefinitionsAssignment_4_in_rule__BabelIdl__Group__4__Impl3179 = new BitSet(new long[]{0x0040944000000432L});
    public static final BitSet FOLLOW_rule__Namespace__Group__0__Impl_in_rule__Namespace__Group__03220 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1_in_rule__Namespace__Group__03223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Namespace__Group__0__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__1__Impl_in_rule__Namespace__Group__13282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2_in_rule__Namespace__Group__13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__LangAssignment_1_in_rule__Namespace__Group__1__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__Group__2__Impl_in_rule__Namespace__Group__23342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Namespace__NsAssignment_2_in_rule__Namespace__Group__2__Impl3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__0__Impl_in_rule__DefaultNameSpace__Group__03405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__1_in_rule__DefaultNameSpace__Group__03408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DefaultNameSpace__Group__0__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__1__Impl_in_rule__DefaultNameSpace__Group__13467 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__2_in_rule__DefaultNameSpace__Group__13470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__DefAssignment_1_in_rule__DefaultNameSpace__Group__1__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__Group__2__Impl_in_rule__DefaultNameSpace__Group__23527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultNameSpace__NsAssignment_2_in_rule__DefaultNameSpace__Group__2__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__0__Impl_in_rule__DefaultQualifier__Group__03590 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__1_in_rule__DefaultQualifier__Group__03593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultQualifier__Group__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__1__Impl_in_rule__DefaultQualifier__Group__13649 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__2_in_rule__DefaultQualifier__Group__13652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DefaultQualifier__Group__1__Impl3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefaultQualifier__Group__2__Impl_in_rule__DefaultQualifier__Group__23711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefaultQualifier__Group__2__Impl3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03773 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__QualifiedName__Group__0__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__1__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__0__Impl_in_rule__ImportStatement__Group__03895 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__1_in_rule__ImportStatement__Group__03898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ImportStatement__Group__0__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__Group__1__Impl_in_rule__ImportStatement__Group__13957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportStatement__ImportURIAssignment_1_in_rule__ImportStatement__Group__1__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__0__Impl_in_rule__Enum__Group__04018 = new BitSet(new long[]{0x0000004000000030L});
    public static final BitSet FOLLOW_rule__Enum__Group__1_in_rule__Enum__Group__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__CommentAssignment_0_in_rule__Enum__Group__0__Impl4048 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Enum__Group__1__Impl_in_rule__Enum__Group__14079 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Enum__Group__2_in_rule__Enum__Group__14082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Enum__Group__1__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__2__Impl_in_rule__Enum__Group__24141 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Enum__Group__3_in_rule__Enum__Group__24144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__NameAssignment_2_in_rule__Enum__Group__2__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__3__Impl_in_rule__Enum__Group__34201 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_rule__Enum__Group__4_in_rule__Enum__Group__34204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Enum__Group__3__Impl4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__Group__4__Impl_in_rule__Enum__Group__44263 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_rule__Enum__Group__5_in_rule__Enum__Group__44266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Enum__PropertiesAssignment_4_in_rule__Enum__Group__4__Impl4293 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__Enum__Group__5__Impl_in_rule__Enum__Group__54324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Enum__Group__5__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__0__Impl_in_rule__EnumProperty__Group__04395 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__1_in_rule__EnumProperty__Group__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__CommentAssignment_0_in_rule__EnumProperty__Group__0__Impl4425 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__1__Impl_in_rule__EnumProperty__Group__14456 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__2_in_rule__EnumProperty__Group__14459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__NameAssignment_1_in_rule__EnumProperty__Group__1__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__2__Impl_in_rule__EnumProperty__Group__24516 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__3_in_rule__EnumProperty__Group__24519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__EnumProperty__Group__2__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__3__Impl_in_rule__EnumProperty__Group__34578 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__4_in_rule__EnumProperty__Group__34581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__TypeAssignment_3_in_rule__EnumProperty__Group__3__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnumProperty__Group__4__Impl_in_rule__EnumProperty__Group__44638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_rule__EnumProperty__Group__4__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__Group__0__Impl_in_rule__Const__Group__04707 = new BitSet(new long[]{0x0000040000000030L});
    public static final BitSet FOLLOW_rule__Const__Group__1_in_rule__Const__Group__04710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__CommentAssignment_0_in_rule__Const__Group__0__Impl4737 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Const__Group__1__Impl_in_rule__Const__Group__14768 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Const__Group__2_in_rule__Const__Group__14771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Const__Group__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__Group__2__Impl_in_rule__Const__Group__24830 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Const__Group__3_in_rule__Const__Group__24833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__NameAssignment_2_in_rule__Const__Group__2__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__Group__3__Impl_in_rule__Const__Group__34890 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_rule__Const__Group__4_in_rule__Const__Group__34893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Const__Group__3__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__Group__4__Impl_in_rule__Const__Group__44952 = new BitSet(new long[]{0x0000010000000070L});
    public static final BitSet FOLLOW_rule__Const__Group__5_in_rule__Const__Group__44955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const__PropertiesAssignment_4_in_rule__Const__Group__4__Impl4982 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_rule__Const__Group__5__Impl_in_rule__Const__Group__55013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Const__Group__5__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__0__Impl_in_rule__ConstProperty__Group__05084 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__1_in_rule__ConstProperty__Group__05087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__CommentAssignment_0_in_rule__ConstProperty__Group__0__Impl5114 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__1__Impl_in_rule__ConstProperty__Group__15145 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__2_in_rule__ConstProperty__Group__15148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__NameAssignment_1_in_rule__ConstProperty__Group__1__Impl5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__2__Impl_in_rule__ConstProperty__Group__25205 = new BitSet(new long[]{0x0000080000000380L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__3_in_rule__ConstProperty__Group__25208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConstProperty__Group__2__Impl5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__3__Impl_in_rule__ConstProperty__Group__35267 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__4_in_rule__ConstProperty__Group__35270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__ValAssignment_3_in_rule__ConstProperty__Group__3__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstProperty__Group__4__Impl_in_rule__ConstProperty__Group__45327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_rule__ConstProperty__Group__4__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__0__Impl_in_rule__ConstNumValue__Group__05396 = new BitSet(new long[]{0x0000080000000380L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__1_in_rule__ConstNumValue__Group__05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConstNumValue__Group__0__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__1__Impl_in_rule__ConstNumValue__Group__15461 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__2_in_rule__ConstNumValue__Group__15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConstNumValue__Group__1__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group__2__Impl_in_rule__ConstNumValue__Group__25520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group_2__0_in_rule__ConstNumValue__Group__2__Impl5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group_2__0__Impl_in_rule__ConstNumValue__Group_2__05584 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group_2__1_in_rule__ConstNumValue__Group_2__05587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ConstNumValue__Group_2__0__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstNumValue__Group_2__1__Impl_in_rule__ConstNumValue__Group_2__15646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConstNumValue__Group_2__1__Impl5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__0__Impl_in_rule__Struct__Group__05706 = new BitSet(new long[]{0x0040100000000430L});
    public static final BitSet FOLLOW_rule__Struct__Group__1_in_rule__Struct__Group__05709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__CommentAssignment_0_in_rule__Struct__Group__0__Impl5736 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Struct__Group__1__Impl_in_rule__Struct__Group__15767 = new BitSet(new long[]{0x0040100000000430L});
    public static final BitSet FOLLOW_rule__Struct__Group__2_in_rule__Struct__Group__15770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__AttributesAssignment_1_in_rule__Struct__Group__1__Impl5797 = new BitSet(new long[]{0x0040000000000402L});
    public static final BitSet FOLLOW_rule__Struct__Group__2__Impl_in_rule__Struct__Group__25828 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_rule__Struct__Group__3_in_rule__Struct__Group__25831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Struct__Group__2__Impl5859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__3__Impl_in_rule__Struct__Group__35890 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_rule__Struct__Group__4_in_rule__Struct__Group__35893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Struct__Group__3__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__4__Impl_in_rule__Struct__Group__45955 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__5_in_rule__Struct__Group__45958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__NameAssignment_4_in_rule__Struct__Group__4__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__5__Impl_in_rule__Struct__Group__56015 = new BitSet(new long[]{0x0000408000000000L});
    public static final BitSet FOLLOW_rule__Struct__Group__6_in_rule__Struct__Group__56018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group_5__0_in_rule__Struct__Group__5__Impl6045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__6__Impl_in_rule__Struct__Group__66076 = new BitSet(new long[]{0x006401007FFF8470L});
    public static final BitSet FOLLOW_rule__Struct__Group__7_in_rule__Struct__Group__66079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Struct__Group__6__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group__7__Impl_in_rule__Struct__Group__76138 = new BitSet(new long[]{0x006401007FFF8470L});
    public static final BitSet FOLLOW_rule__Struct__Group__8_in_rule__Struct__Group__76141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__PropertiesAssignment_7_in_rule__Struct__Group__7__Impl6168 = new BitSet(new long[]{0x006400007FFF8472L});
    public static final BitSet FOLLOW_rule__Struct__Group__8__Impl_in_rule__Struct__Group__86199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Struct__Group__8__Impl6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group_5__0__Impl_in_rule__Struct__Group_5__06276 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Struct__Group_5__1_in_rule__Struct__Group_5__06279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Struct__Group_5__0__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__Group_5__1__Impl_in_rule__Struct__Group_5__16338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Struct__SuperTypeAssignment_5_1_in_rule__Struct__Group_5__1__Impl6365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__0__Impl_in_rule__Property__Group__06399 = new BitSet(new long[]{0x006400007FFF8470L});
    public static final BitSet FOLLOW_rule__Property__Group__1_in_rule__Property__Group__06402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__CommentAssignment_0_in_rule__Property__Group__0__Impl6429 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Property__Group__1__Impl_in_rule__Property__Group__16460 = new BitSet(new long[]{0x006400007FFF8470L});
    public static final BitSet FOLLOW_rule__Property__Group__2_in_rule__Property__Group__16463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__AttributesAssignment_1_in_rule__Property__Group__1__Impl6490 = new BitSet(new long[]{0x0040000000000402L});
    public static final BitSet FOLLOW_rule__Property__Group__2__Impl_in_rule__Property__Group__26521 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Property__Group__3_in_rule__Property__Group__26524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Alternatives_2_in_rule__Property__Group__2__Impl6551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__3__Impl_in_rule__Property__Group__36581 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Property__Group__4_in_rule__Property__Group__36584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__NameAssignment_3_in_rule__Property__Group__3__Impl6611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Property__Group__4__Impl_in_rule__Property__Group__46641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_rule__Property__Group__4__Impl6669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06710 = new BitSet(new long[]{0x0040944000000430L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__CommentAssignment_0_in_rule__Service__Group__0__Impl6740 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16771 = new BitSet(new long[]{0x0040944000000430L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__AttributesAssignment_1_in_rule__Service__Group__1__Impl6801 = new BitSet(new long[]{0x0040000000000402L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26832 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Service__Group__2__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36894 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_3_in_rule__Service__Group__3__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46954 = new BitSet(new long[]{0x00E401007FFF8470L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Service__Group__4__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__57016 = new BitSet(new long[]{0x00E401007FFF8470L});
    public static final BitSet FOLLOW_rule__Service__Group__6_in_rule__Service__Group__57019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__ServiceMethodsAssignment_5_in_rule__Service__Group__5__Impl7046 = new BitSet(new long[]{0x00E400007FFF8472L});
    public static final BitSet FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__67077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Service__Group__6__Impl7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__0__Impl_in_rule__ServiceMethod__Group__07150 = new BitSet(new long[]{0x00E400007FFF8470L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__1_in_rule__ServiceMethod__Group__07153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__CommentAssignment_0_in_rule__ServiceMethod__Group__0__Impl7180 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__1__Impl_in_rule__ServiceMethod__Group__17211 = new BitSet(new long[]{0x00E400007FFF8470L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__2_in_rule__ServiceMethod__Group__17214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__AttributesAssignment_1_in_rule__ServiceMethod__Group__1__Impl7241 = new BitSet(new long[]{0x0040000000000402L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__2__Impl_in_rule__ServiceMethod__Group__27272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__3_in_rule__ServiceMethod__Group__27275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__ReturnAssignment_2_in_rule__ServiceMethod__Group__2__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__3__Impl_in_rule__ServiceMethod__Group__37332 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__4_in_rule__ServiceMethod__Group__37335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__NameAssignment_3_in_rule__ServiceMethod__Group__3__Impl7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__4__Impl_in_rule__ServiceMethod__Group__47392 = new BitSet(new long[]{0x006600007FFF8470L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__5_in_rule__ServiceMethod__Group__47395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ServiceMethod__Group__4__Impl7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__5__Impl_in_rule__ServiceMethod__Group__57454 = new BitSet(new long[]{0x006600007FFF8470L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__6_in_rule__ServiceMethod__Group__57457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__PropertiesAssignment_5_in_rule__ServiceMethod__Group__5__Impl7484 = new BitSet(new long[]{0x006400007FFF8472L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__6__Impl_in_rule__ServiceMethod__Group__67515 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__7_in_rule__ServiceMethod__Group__67518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ServiceMethod__Group__6__Impl7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ServiceMethod__Group__7__Impl_in_rule__ServiceMethod__Group__77577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLineTerm_in_rule__ServiceMethod__Group__7__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__0__Impl_in_rule__ListType__Group__07652 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__1_in_rule__ListType__Group__07655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ListType__Group__0__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__1__Impl_in_rule__ListType__Group__17714 = new BitSet(new long[]{0x002400007FFF8040L});
    public static final BitSet FOLLOW_rule__ListType__Group__2_in_rule__ListType__Group__17717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ListType__Group__1__Impl7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__2__Impl_in_rule__ListType__Group__27776 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ListType__Group__3_in_rule__ListType__Group__27779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Alternatives_2_in_rule__ListType__Group__2__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListType__Group__3__Impl_in_rule__ListType__Group__37836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ListType__Group__3__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__0__Impl_in_rule__MapType__Group__07903 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__1_in_rule__MapType__Group__07906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__MapType__Group__0__Impl7934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__1__Impl_in_rule__MapType__Group__17965 = new BitSet(new long[]{0x002400007FFF8040L});
    public static final BitSet FOLLOW_rule__MapType__Group__2_in_rule__MapType__Group__17968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__MapType__Group__1__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__2__Impl_in_rule__MapType__Group__28027 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__MapType__Group__3_in_rule__MapType__Group__28030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_2_in_rule__MapType__Group__2__Impl8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__3__Impl_in_rule__MapType__Group__38087 = new BitSet(new long[]{0x002400007FFF8040L});
    public static final BitSet FOLLOW_rule__MapType__Group__4_in_rule__MapType__Group__38090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__MapType__Group__3__Impl8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__4__Impl_in_rule__MapType__Group__48149 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__MapType__Group__5_in_rule__MapType__Group__48152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Alternatives_4_in_rule__MapType__Group__4__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapType__Group__5__Impl_in_rule__MapType__Group__58209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MapType__Group__5__Impl8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__08280 = new BitSet(new long[]{0x0040000000000400L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__08283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__0_in_rule__Attribute__Group__0__Impl8310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__18341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttrAssignment_1_in_rule__Attribute__Group__1__Impl8368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__0__Impl_in_rule__Attribute__Group_0__08402 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__1_in_rule__Attribute__Group_0__08405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Attribute__Group_0__0__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__1__Impl_in_rule__Attribute__Group_0__18464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ScopeAssignment_0_1_in_rule__Attribute__Group_0__1__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__BabelIdl__CommentAssignment_08530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportStatement_in_rule__BabelIdl__ImportsAssignment_18561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultNameSpace_in_rule__BabelIdl__DefaultNamespaceAssignment_28592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespace_in_rule__BabelIdl__NamespacesAssignment_38623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBabelDefinition_in_rule__BabelIdl__DefinitionsAssignment_48654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLangs_in_rule__Namespace__LangAssignment_18685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Namespace__NsAssignment_28716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefaultQualifier_in_rule__DefaultNameSpace__DefAssignment_18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DefaultNameSpace__NsAssignment_28778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ImportStatement__ImportURIAssignment_18809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__Enum__CommentAssignment_08840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Enum__NameAssignment_28871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumProperty_in_rule__Enum__PropertiesAssignment_48902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__EnumProperty__CommentAssignment_08933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumPropertyId_in_rule__EnumProperty__NameAssignment_18964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumOrdinal_in_rule__EnumProperty__TypeAssignment_38995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__EnumOrdinal__TypeAssignment9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EnumPropertyId__NameAssignment9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__Const__CommentAssignment_09088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Const__NameAssignment_29119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstProperty_in_rule__Const__PropertiesAssignment_49150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__ConstProperty__CommentAssignment_09181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstPropertyId_in_rule__ConstProperty__NameAssignment_19212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstValueType_in_rule__ConstProperty__ValAssignment_39243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ConstValueType__StringValAssignment_09274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__ConstValueType__BoolValAssignment_19305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstNumValue_in_rule__ConstValueType__NumValAssignment_29336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConstPropertyId__NameAssignment9367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__Struct__CommentAssignment_09398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Struct__AttributesAssignment_19429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct__NameAssignment_49460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Struct__SuperTypeAssignment_5_19495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__Struct__PropertiesAssignment_79530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__Property__CommentAssignment_09561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Property__AttributesAssignment_19592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_rule__Property__DateTypeAssignment_2_09623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Property__ElementTypeAssignment_2_19658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValue_in_rule__Property__NameAssignment_39693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyValue__NameAssignment9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__Service__CommentAssignment_09755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Service__AttributesAssignment_19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_39817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethod_in_rule__Service__ServiceMethodsAssignment_59848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentType_in_rule__ServiceMethod__CommentAssignment_09879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__ServiceMethod__AttributesAssignment_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceMethodReturnType_in_rule__ServiceMethod__ReturnAssignment_29941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceMethod__NameAssignment_39972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleServiceProperty_in_rule__ServiceMethod__PropertiesAssignment_510003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_rule__ServiceProperty__NameAssignment10034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ServiceMethodReturnType__VoidTypeAssignment_010070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_rule__ServiceMethodReturnType__DataTypeAssignment_110109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ServiceMethodReturnType__ElementTypeAssignment_210144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeEnum_in_rule__DataTypeReference__TypeAssignment_010179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_rule__ListType__DateTypeAssignment_2_010210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ListType__ElementTypeAssignment_2_110245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_rule__MapType__KeyDataTypeAssignment_2_010280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__KeyElementTypeAssignment_2_110315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataTypeReference_in_rule__MapType__ValDataTypeAssignment_4_010350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapType__ValElementTypeAssignment_4_110385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__ScopeAssignment_0_110420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATTR_in_rule__Attribute__AttrAssignment_110451 = new BitSet(new long[]{0x0000000000000002L});

}