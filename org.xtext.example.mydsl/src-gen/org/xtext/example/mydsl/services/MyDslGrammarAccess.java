/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FSM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFSMKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cInitialKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStateInitialParserRuleCall_4_0 = (RuleCall)cStateAssignment_4.eContents().get(0);
		private final Keyword cFinalKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cStateAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cStateFinalParserRuleCall_6_0 = (RuleCall)cStateAssignment_6.eContents().get(0);
		private final Alternatives cAlternatives_7 = (Alternatives)cGroup.eContents().get(7);
		private final Group cGroup_7_0 = (Group)cAlternatives_7.eContents().get(0);
		private final Keyword cStateKeyword_7_0_0 = (Keyword)cGroup_7_0.eContents().get(0);
		private final Assignment cStateAssignment_7_0_1 = (Assignment)cGroup_7_0.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_7_0_1_0 = (RuleCall)cStateAssignment_7_0_1.eContents().get(0);
		private final Group cGroup_7_0_2 = (Group)cGroup_7_0.eContents().get(2);
		private final Keyword cCommaKeyword_7_0_2_0 = (Keyword)cGroup_7_0_2.eContents().get(0);
		private final Assignment cStateAssignment_7_0_2_1 = (Assignment)cGroup_7_0_2.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_7_0_2_1_0 = (RuleCall)cStateAssignment_7_0_2_1.eContents().get(0);
		private final Assignment cTransitionAssignment_7_1 = (Assignment)cAlternatives_7.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_7_1_0 = (RuleCall)cTransitionAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//FSM:
		//	'FSM'
		//	name=EString
		//	'{'
		//	'initial' state+=Initial
		//	'final' state+=Final ('state' state+=State ("," state+=State)* | transition+=Transition)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'FSM' name=EString '{' 'initial' state+=Initial 'final' state+=Final ('state' state+=State ("," state+=State)* |
		//transition+=Transition)* '}'
		public Group getGroup() { return cGroup; }
		
		//'FSM'
		public Keyword getFSMKeyword_0() { return cFSMKeyword_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'initial'
		public Keyword getInitialKeyword_3() { return cInitialKeyword_3; }
		
		//state+=Initial
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }
		
		//Initial
		public RuleCall getStateInitialParserRuleCall_4_0() { return cStateInitialParserRuleCall_4_0; }
		
		//'final'
		public Keyword getFinalKeyword_5() { return cFinalKeyword_5; }
		
		//state+=Final
		public Assignment getStateAssignment_6() { return cStateAssignment_6; }
		
		//Final
		public RuleCall getStateFinalParserRuleCall_6_0() { return cStateFinalParserRuleCall_6_0; }
		
		//('state' state+=State ("," state+=State)* | transition+=Transition)*
		public Alternatives getAlternatives_7() { return cAlternatives_7; }
		
		//'state' state+=State ("," state+=State)*
		public Group getGroup_7_0() { return cGroup_7_0; }
		
		//'state'
		public Keyword getStateKeyword_7_0_0() { return cStateKeyword_7_0_0; }
		
		//state+=State
		public Assignment getStateAssignment_7_0_1() { return cStateAssignment_7_0_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_7_0_1_0() { return cStateStateParserRuleCall_7_0_1_0; }
		
		//("," state+=State)*
		public Group getGroup_7_0_2() { return cGroup_7_0_2; }
		
		//","
		public Keyword getCommaKeyword_7_0_2_0() { return cCommaKeyword_7_0_2_0; }
		
		//state+=State
		public Assignment getStateAssignment_7_0_2_1() { return cStateAssignment_7_0_2_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_7_0_2_1_0() { return cStateStateParserRuleCall_7_0_2_1_0; }
		
		//transition+=Transition
		public Assignment getTransitionAssignment_7_1() { return cTransitionAssignment_7_1; }
		
		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_7_1_0() { return cTransitionTransitionParserRuleCall_7_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	{State} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State} name=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTransitionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cState1Assignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final CrossReference cState1StateCrossReference_3_0_0 = (CrossReference)cState1Assignment_3_0.eContents().get(0);
		private final RuleCall cState1StateEStringParserRuleCall_3_0_0_1 = (RuleCall)cState1StateCrossReference_3_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cState2Assignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cState2StateCrossReference_3_2_0 = (CrossReference)cState2Assignment_3_2.eContents().get(0);
		private final RuleCall cState2StateEStringParserRuleCall_3_2_0_1 = (RuleCall)cState2StateCrossReference_3_2_0.eContents().get(1);
		
		//Transition:
		//	{Transition}
		//	'Transition'
		//	name=EString (state1=[State|EString] "->" state2=[State|EString])?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition} 'Transition' name=EString (state1=[State|EString] "->" state2=[State|EString])?
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//'Transition'
		public Keyword getTransitionKeyword_1() { return cTransitionKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//(state1=[State|EString] "->" state2=[State|EString])?
		public Group getGroup_3() { return cGroup_3; }
		
		//state1=[State|EString]
		public Assignment getState1Assignment_3_0() { return cState1Assignment_3_0; }
		
		//[State|EString]
		public CrossReference getState1StateCrossReference_3_0_0() { return cState1StateCrossReference_3_0_0; }
		
		//EString
		public RuleCall getState1StateEStringParserRuleCall_3_0_0_1() { return cState1StateEStringParserRuleCall_3_0_0_1; }
		
		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_3_1() { return cHyphenMinusGreaterThanSignKeyword_3_1; }
		
		//state2=[State|EString]
		public Assignment getState2Assignment_3_2() { return cState2Assignment_3_2; }
		
		//[State|EString]
		public CrossReference getState2StateCrossReference_3_2_0() { return cState2StateCrossReference_3_2_0; }
		
		//EString
		public RuleCall getState2StateEStringParserRuleCall_3_2_0_1() { return cState2StateEStringParserRuleCall_3_2_0_1; }
	}
	public class InitialElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Initial");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInitialAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Initial:
		//	{Initial} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Initial} name=EString
		public Group getGroup() { return cGroup; }
		
		//{Initial}
		public Action getInitialAction_0() { return cInitialAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class FinalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Final");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFinalAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Final:
		//	{Final} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Final} name=EString
		public Group getGroup() { return cGroup; }
		
		//{Final}
		public Action getFinalAction_0() { return cFinalAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	
	
	private final FSMElements pFSM;
	private final EStringElements pEString;
	private final StateElements pState;
	private final TransitionElements pTransition;
	private final InitialElements pInitial;
	private final FinalElements pFinal;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFSM = new FSMElements();
		this.pEString = new EStringElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
		this.pInitial = new InitialElements();
		this.pFinal = new FinalElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FSM:
	//	'FSM'
	//	name=EString
	//	'{'
	//	'initial' state+=Initial
	//	'final' state+=Final ('state' state+=State ("," state+=State)* | transition+=Transition)*
	//	'}';
	public FSMElements getFSMAccess() {
		return pFSM;
	}
	
	public ParserRule getFSMRule() {
		return getFSMAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//State:
	//	{State} name=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//	{Transition}
	//	'Transition'
	//	name=EString (state1=[State|EString] "->" state2=[State|EString])?;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//Initial:
	//	{Initial} name=EString;
	public InitialElements getInitialAccess() {
		return pInitial;
	}
	
	public ParserRule getInitialRule() {
		return getInitialAccess().getRule();
	}
	
	//Final:
	//	{Final} name=EString;
	public FinalElements getFinalAccess() {
		return pFinal;
	}
	
	public ParserRule getFinalRule() {
		return getFinalAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
