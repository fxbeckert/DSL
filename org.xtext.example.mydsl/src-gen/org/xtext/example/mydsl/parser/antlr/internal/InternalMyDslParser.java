package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'{'", "'initial'", "'final'", "'state'", "','", "'}'", "'Transition'", "'->'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_transition_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )* otherlv_12= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )* otherlv_12= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )* otherlv_12= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'FSM' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( (lv_state_4_0= ruleInitial ) ) otherlv_5= 'final' ( (lv_state_6_0= ruleFinal ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFSMAccess().getFSMKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:85:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFSMAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFSMAccess().getInitialKeyword_3());
            		
            // InternalMyDsl.g:110:3: ( (lv_state_4_0= ruleInitial ) )
            // InternalMyDsl.g:111:4: (lv_state_4_0= ruleInitial )
            {
            // InternalMyDsl.g:111:4: (lv_state_4_0= ruleInitial )
            // InternalMyDsl.g:112:5: lv_state_4_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateInitialParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_4_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.example.mydsl.MyDsl.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getFSMAccess().getFinalKeyword_5());
            		
            // InternalMyDsl.g:133:3: ( (lv_state_6_0= ruleFinal ) )
            // InternalMyDsl.g:134:4: (lv_state_6_0= ruleFinal )
            {
            // InternalMyDsl.g:134:4: (lv_state_6_0= ruleFinal )
            // InternalMyDsl.g:135:5: lv_state_6_0= ruleFinal
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_state_6_0=ruleFinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_6_0,
            						"org.xtext.example.mydsl.MyDsl.Final");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:152:3: ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | ( (lv_transition_11_0= ruleTransition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }
                else if ( (LA2_0==18) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:153:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:153:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:154:5: otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getFSMAccess().getStateKeyword_7_0_0());
            	    				
            	    // InternalMyDsl.g:158:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalMyDsl.g:159:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalMyDsl.g:159:6: (lv_state_8_0= ruleState )
            	    // InternalMyDsl.g:160:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_1_0());
            	    						
            	    pushFollow(FOLLOW_8);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:177:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==16) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:178:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,16,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getFSMAccess().getCommaKeyword_7_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:182:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalMyDsl.g:183:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:183:7: (lv_state_10_0= ruleState )
            	    	    // InternalMyDsl.g:184:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_7_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_8);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:204:4: ( (lv_transition_11_0= ruleTransition ) )
            	    {
            	    // InternalMyDsl.g:204:4: ( (lv_transition_11_0= ruleTransition ) )
            	    // InternalMyDsl.g:205:5: (lv_transition_11_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:205:5: (lv_transition_11_0= ruleTransition )
            	    // InternalMyDsl.g:206:6: lv_transition_11_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_transition_11_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFSMAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:232:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:232:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:233:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:239:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:245:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:246:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:247:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:255:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:266:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:266:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:267:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:273:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:280:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:280:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:281:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:281:3: ()
            // InternalMyDsl.g:282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:288:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:289:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:289:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:290:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:311:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:311:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:312:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:318:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:324:2: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )? ) )
            // InternalMyDsl.g:325:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )? )
            {
            // InternalMyDsl.g:325:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )? )
            // InternalMyDsl.g:326:3: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )?
            {
            // InternalMyDsl.g:326:3: ()
            // InternalMyDsl.g:327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalMyDsl.g:337:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:338:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:338:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:339:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:356:3: ( ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:357:4: ( ( ruleEString ) ) otherlv_4= '->' ( ( ruleEString ) )
                    {
                    // InternalMyDsl.g:357:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:358:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:358:5: ( ruleEString )
                    // InternalMyDsl.g:359:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getState1StateCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3_1());
                    			
                    // InternalMyDsl.g:377:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:378:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:378:5: ( ruleEString )
                    // InternalMyDsl.g:379:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getState2StateCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:398:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:398:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:399:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:405:1: ruleInitial returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:412:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:412:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:413:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:413:3: ()
            // InternalMyDsl.g:414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialAccess().getInitialAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:420:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:421:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:421:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:422:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleFinal"
    // InternalMyDsl.g:443:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalMyDsl.g:443:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalMyDsl.g:444:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalMyDsl.g:450:1: ruleFinal returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:456:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:457:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:457:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:458:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:458:3: ()
            // InternalMyDsl.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalAccess().getFinalAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:465:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:466:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:466:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:467:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
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
    // $ANTLR end "ruleFinal"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});

}