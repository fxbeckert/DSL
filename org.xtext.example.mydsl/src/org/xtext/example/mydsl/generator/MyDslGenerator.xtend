/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.ut2j.m1ice.fsm.FSM
import fr.ut2j.m1ice.fsm.Initial
import fr.ut2j.m1ice.fsm.Final

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var fsm = resource.contents.get(0) as FSM;
		fsa.generateFile("FSM.java", generateFSM(fsm))
		fsa.generateFile("STATE.java", generateSTATE())
		fsa.generateFile("ABSTRACTSTATE.java", generateAbstractSTATE())
		fsa.generateFile("TRANSITION.java", generateTRANSITION())
		
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def String generateTRANSITION() {
		return ''' public class TRANSITION {
						private ABSTRACTSTATE STATEStart;
						private ABSTRACTSTATE STATEEnd;
						private String trigger;
						
						public TRANSITION(ABSTRACTSTATE src, ABSTRACTSTATE target, String trigger) {
							this.STATEStart = src;
							this.STATEEnd = target;
							this.trigger = trigger;
						}
						
						public ABSTRACTSTATE getSTATEStart() { return this.STATEStart; }
						public ABSTRACTSTATE getSTATEEnd() { return this.STATEEnd; }
						public String getTrigger() { return this.trigger; }
					} '''
	}
	
	def String generateFSM(FSM fsm) {
		var initSTATE = fsm.state.filter[STATE | STATE instanceof Initial].get(0);
		var finalSTATE = fsm.state.filter[STATE | STATE instanceof Final].get(0);
		return ''' 
		import java.util.Scanner;
		import java.util.List;
		import java.util.ArrayList;
		public class FSM {
			public void execute() {					
				List<TRANSITION> TRANSITIONs = new ArrayList<>();
				�FOR tr: fsm.transition �
				TRANSITIONs.add(new TRANSITION(new STATE("�tr.state1.name�"), new STATE("�tr.state2.name�"), "�tr.name�"));
				�ENDFOR�
				Scanner sc = new Scanner(System.in);	
				ABSTRACTSTATE current = new STATE("�initSTATE.name�");
				ABSTRACTSTATE finalSTATE = new STATE("�finalSTATE.name�");
				while(!current.equals(finalSTATE)) {
					System.out.println("COURANT : " + current.getSTATE());
					final ABSTRACTSTATE currentSTATE = current;
					System.out.println("TRANSITION : ");
					String trigger = sc.nextLine(); 
					TRANSITION TRANSITION = TRANSITIONs.stream()
						.filter(tr -> tr.getSTATEStart().equals(currentSTATE) && tr.getTrigger().equals(trigger)).findFirst().orElse(null);
					if (TRANSITION != null) {
						current = TRANSITION.getSTATEEnd();
					} else {
					}
					System.out.println("STATE : " + current.getSTATE());
				}
				System.out.println("FIN");
			}
			public static void main(String[] args) {
				FSM fsm = new FSM();
				fsm.execute();
			}
		}'''
	}
	
	def String generateAbstractSTATE() {
				return ''' 
		import java.util.Objects;
		
		public abstract class ABSTRACTSTATE {
					private String STATE;
					
					public ABSTRACTSTATE(String st){
						this.STATE = st;}
						
					public String getSTATE() {return this.STATE;}
					
					public void setSTATE( String newSt) {this.STATE = newSt;}
					
					@Override
						public boolean equals(Object o) {
							if (this == o) return true;
							if (o == null || getClass() != o.getClass()) return false;
							ABSTRACTSTATE that = (ABSTRACTSTATE) o;
							return Objects.equals(STATE, that.STATE);
						}
					
		}'''
	}
	
	def String generateSTATE() {
		return '''public class STATE extends ABSTRACTSTATE {
					public STATE(String name) {
						super(name);
					}
				}'''
	}
	
}