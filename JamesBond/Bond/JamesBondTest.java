package Bond;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JamesBondTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	JamesBond tester = new JamesBond();
	@Test
	public void testCase0(){
	assertFalse(tester.bondRegex("(()"));
	}
	 
	@Test
	public void testCase1(){
	assertTrue(tester.bondRegex("((007)"));
	}
	 
	@Test
	public void testCase2(){
	assertFalse(tester.bondRegex("((07)"));
	}
	 
	@Test
	public void testCase3(){
	assertFalse(tester.bondRegex("((7)"));
	}
	 
	@Test
	public void testCase4(){
	assertFalse(tester.bondRegex("()"));
	}
	 
	@Test
	public void testCase5(){
	assertFalse(tester.bondRegex("())"));
	}
	 
	@Test
	public void testCase6(){
	assertTrue(tester.bondRegex("()007)"));
	}
	 
	@Test
	public void testCase7(){
	assertFalse(tester.bondRegex("()07)"));
	}
	 
	@Test
	public void testCase8(){
	assertFalse(tester.bondRegex("()7)"));
	}
	 
	@Test
	public void testCase9(){
	assertFalse(tester.bondRegex("(0()"));
	}
	 
	@Test
	public void testCase10(){
	assertTrue(tester.bondRegex("(0(007)"));
	}
	 
	@Test
	public void testCase11(){
	assertFalse(tester.bondRegex("(0(07)"));
	}
	 
	@Test
	public void testCase12(){
	assertFalse(tester.bondRegex("(0(7)"));
	}
	 
	@Test
	public void testCase13(){
	assertFalse(tester.bondRegex("(0)"));
	}
	 
	@Test
	public void testCase14(){
	assertFalse(tester.bondRegex("(0))"));
	}
	 
	@Test
	public void testCase15(){
	assertTrue(tester.bondRegex("(0)007)"));
	}
	 
	@Test
	public void testCase16(){
	assertFalse(tester.bondRegex("(0)07)"));
	}
	 
	@Test
	public void testCase17(){
	assertFalse(tester.bondRegex("(0)7)"));
	}
	 
	@Test
	public void testCase18(){
	assertFalse(tester.bondRegex("(00()"));
	}
	 
	@Test
	public void testCase19(){
	assertTrue(tester.bondRegex("(00(007)"));
	}
	 
	@Test
	public void testCase20(){
	assertFalse(tester.bondRegex("(00(07)"));
	}
	 
	@Test
	public void testCase21(){
	assertFalse(tester.bondRegex("(00(7)"));
	}
	 
	@Test
	public void testCase22(){
	assertFalse(tester.bondRegex("(00)"));
	}
	 
	@Test
	public void testCase23(){
	assertFalse(tester.bondRegex("(00))"));
	}
	 
	@Test
	public void testCase24(){
	assertTrue(tester.bondRegex("(00)007)"));
	}
	 
	@Test
	public void testCase25(){
	assertFalse(tester.bondRegex("(00)07)"));
	}
	 
	@Test
	public void testCase26(){
	assertFalse(tester.bondRegex("(00)7)"));
	}
	 
	@Test
	public void testCase27(){
	assertFalse(tester.bondRegex("(000)"));
	}
	 
	@Test
	public void testCase28(){
	assertTrue(tester.bondRegex("(000007)"));
	}
	 
	@Test
	public void testCase29(){
	assertTrue(tester.bondRegex("(00007)"));
	}
	 
	@Test
	public void testCase30(){
	assertTrue(tester.bondRegex("(0007)"));
	}
	 
	@Test
	public void testCase31(){
	assertFalse(tester.bondRegex("(001)"));
	}
	 
	@Test
	public void testCase32(){
	assertTrue(tester.bondRegex("(001007)"));
	}
	 
	@Test
	public void testCase33(){
	assertFalse(tester.bondRegex("(00107)"));
	}
	 
	@Test
	public void testCase34(){
	assertFalse(tester.bondRegex("(0017)"));
	}
	 
	@Test
	public void testCase35(){
	assertFalse(tester.bondRegex("(002)"));
	}
	 
	@Test
	public void testCase36(){
	assertTrue(tester.bondRegex("(002007)"));
	}
	 
	@Test
	public void testCase37(){
	assertFalse(tester.bondRegex("(00207)"));
	}
	 
	@Test
	public void testCase38(){
	assertFalse(tester.bondRegex("(0027)"));
	}
	 
	@Test
	public void testCase39(){
	assertFalse(tester.bondRegex("(003)"));
	}
	 
	@Test
	public void testCase40(){
	assertTrue(tester.bondRegex("(003007)"));
	}
	 
	@Test
	public void testCase41(){
	assertFalse(tester.bondRegex("(00307)"));
	}
	 
	@Test
	public void testCase42(){
	assertFalse(tester.bondRegex("(0037)"));
	}
	 
	@Test
	public void testCase43(){
	assertFalse(tester.bondRegex("(004)"));
	}
	 
	@Test
	public void testCase44(){
	assertTrue(tester.bondRegex("(004007)"));
	}
	 
	@Test
	public void testCase45(){
	assertFalse(tester.bondRegex("(00407)"));
	}
	 
	@Test
	public void testCase46(){
	assertFalse(tester.bondRegex("(0047)"));
	}
	 
	@Test
	public void testCase47(){
	assertFalse(tester.bondRegex("(005)"));
	}
	 
	@Test
	public void testCase48(){
	assertTrue(tester.bondRegex("(005007)"));
	}
	 
	@Test
	public void testCase49(){
	assertFalse(tester.bondRegex("(00507)"));
	}
	 
	@Test
	public void testCase50(){
	assertFalse(tester.bondRegex("(0057)"));
	}
	 
	@Test
	public void testCase51(){
	assertFalse(tester.bondRegex("(006)"));
	}
	 
	@Test
	public void testCase52(){
	assertTrue(tester.bondRegex("(006007)"));
	}
	 
	@Test
	public void testCase53(){
	assertFalse(tester.bondRegex("(00607)"));
	}
	 
	@Test
	public void testCase54(){
	assertFalse(tester.bondRegex("(0067)"));
	}
	 
	@Test
	public void testCase55(){
	assertTrue(tester.bondRegex("(007()"));
	}
	 
	@Test
	public void testCase56(){
	assertTrue(tester.bondRegex("(007(007)"));
	}
	 
	@Test
	public void testCase57(){
	assertTrue(tester.bondRegex("(007(07)"));
	}
	 
	@Test
	public void testCase58(){
	assertTrue(tester.bondRegex("(007(7)"));
	}
	 
	@Test
	public void testCase59(){
	assertTrue(tester.bondRegex("(007)"));
	}
	 
	@Test
	public void testCase60(){
	assertTrue(tester.bondRegex("(007)()"));
	}
	 
	@Test
	public void testCase61(){
	assertTrue(tester.bondRegex("(007)(007)"));
	}
	 
	@Test
	public void testCase62(){
	assertTrue(tester.bondRegex("(007)(07)"));
	}
	 
	@Test
	public void testCase63(){
	assertTrue(tester.bondRegex("(007)(7)"));
	}
	 
	@Test
	public void testCase64(){
	assertTrue(tester.bondRegex("(007))"));
	}
	 
	@Test
	public void testCase65(){
	assertTrue(tester.bondRegex("(007)))"));
	}
	 
	@Test
	public void testCase66(){
	assertTrue(tester.bondRegex("(007))007)"));
	}
	 
	@Test
	public void testCase67(){
	assertTrue(tester.bondRegex("(007))07)"));
	}
	 
	@Test
	public void testCase68(){
	assertTrue(tester.bondRegex("(007))7)"));
	}
	 
	@Test
	public void testCase69(){
	assertTrue(tester.bondRegex("(007)0)"));
	}
	 
	@Test
	public void testCase70(){
	assertTrue(tester.bondRegex("(007)0007)"));
	}
	 
	@Test
	public void testCase71(){
	assertTrue(tester.bondRegex("(007)007)"));
	}
	 
	@Test
	public void testCase72(){
	assertTrue(tester.bondRegex("(007)07)"));
	}
	 
	@Test
	public void testCase73(){
	assertTrue(tester.bondRegex("(007)1)"));
	}
	 
	@Test
	public void testCase74(){
	assertTrue(tester.bondRegex("(007)1007)"));
	}
	 
	@Test
	public void testCase75(){
	assertTrue(tester.bondRegex("(007)107)"));
	}
	 
	@Test
	public void testCase76(){
	assertTrue(tester.bondRegex("(007)17)"));
	}
	 
	@Test
	public void testCase77(){
	assertTrue(tester.bondRegex("(007)2)"));
	}
	 
	@Test
	public void testCase78(){
	assertTrue(tester.bondRegex("(007)2007)"));
	}
	 
	@Test
	public void testCase79(){
	assertTrue(tester.bondRegex("(007)207)"));
	}
	 
	@Test
	public void testCase80(){
	assertTrue(tester.bondRegex("(007)27)"));
	}
	 
	@Test
	public void testCase81(){
	assertTrue(tester.bondRegex("(007)3)"));
	}
	 
	@Test
	public void testCase82(){
	assertTrue(tester.bondRegex("(007)3007)"));
	}
	 
	@Test
	public void testCase83(){
	assertTrue(tester.bondRegex("(007)307)"));
	}
	 
	@Test
	public void testCase84(){
	assertTrue(tester.bondRegex("(007)37)"));
	}
	 
	@Test
	public void testCase85(){
	assertTrue(tester.bondRegex("(007)4)"));
	}
	 
	@Test
	public void testCase86(){
	assertTrue(tester.bondRegex("(007)4007)"));
	}
	 
	@Test
	public void testCase87(){
	assertTrue(tester.bondRegex("(007)407)"));
	}
	 
	@Test
	public void testCase88(){
	assertTrue(tester.bondRegex("(007)47)"));
	}
	 
	@Test
	public void testCase89(){
	assertTrue(tester.bondRegex("(007)5)"));
	}
	 
	@Test
	public void testCase90(){
	assertTrue(tester.bondRegex("(007)5007)"));
	}
	 
	@Test
	public void testCase91(){
	assertTrue(tester.bondRegex("(007)507)"));
	}
	 
	@Test
	public void testCase92(){
	assertTrue(tester.bondRegex("(007)57)"));
	}
	 
	@Test
	public void testCase93(){
	assertTrue(tester.bondRegex("(007)6)"));
	}
	 
	@Test
	public void testCase94(){
	assertTrue(tester.bondRegex("(007)6007)"));
	}
	 
	@Test
	public void testCase95(){
	assertTrue(tester.bondRegex("(007)607)"));
	}
	 
	@Test
	public void testCase96(){
	assertTrue(tester.bondRegex("(007)67)"));
	}
	 
	@Test
	public void testCase97(){
	assertTrue(tester.bondRegex("(007)7)"));
	}
	 
	@Test
	public void testCase98(){
	assertTrue(tester.bondRegex("(007)7007)"));
	}
	 
	@Test
	public void testCase99(){
	assertTrue(tester.bondRegex("(007)707)"));
	}
	 
	@Test
	public void testCase100(){
	assertTrue(tester.bondRegex("(007)77)"));
	}
	 
	@Test
	public void testCase101(){
	assertTrue(tester.bondRegex("(007)8)"));
	}
	 
	@Test
	public void testCase102(){
	assertTrue(tester.bondRegex("(007)8007)"));
	}
	 
	@Test
	public void testCase103(){
	assertTrue(tester.bondRegex("(007)807)"));
	}
	 
	@Test
	public void testCase104(){
	assertTrue(tester.bondRegex("(007)87)"));
	}
	 
	@Test
	public void testCase105(){
	assertTrue(tester.bondRegex("(007)9)"));
	}
	 
	@Test
	public void testCase106(){
	assertTrue(tester.bondRegex("(007)9007)"));
	}
	 
	@Test
	public void testCase107(){
	assertTrue(tester.bondRegex("(007)907)"));
	}
	 
	@Test
	public void testCase108(){
	assertTrue(tester.bondRegex("(007)97)"));
	}
	 
	@Test
	public void testCase109(){
	assertTrue(tester.bondRegex("(0070)"));
	}
	 
	@Test
	public void testCase110(){
	assertTrue(tester.bondRegex("(0070007)"));
	}
	 
	@Test
	public void testCase111(){
	assertTrue(tester.bondRegex("(007007)"));
	}
	 
	@Test
	public void testCase112(){
	assertTrue(tester.bondRegex("(00707)"));
	}
	 
	@Test
	public void testCase113(){
	assertTrue(tester.bondRegex("(0071)"));
	}
	 
	@Test
	public void testCase114(){
	assertTrue(tester.bondRegex("(0071007)"));
	}
	 
	@Test
	public void testCase115(){
	assertTrue(tester.bondRegex("(007107)"));
	}
	 
	@Test
	public void testCase116(){
	assertTrue(tester.bondRegex("(00717)"));
	}
	 
	@Test
	public void testCase117(){
	assertTrue(tester.bondRegex("(0072)"));
	}
	 
	@Test
	public void testCase118(){
	assertTrue(tester.bondRegex("(0072007)"));
	}
	 
	@Test
	public void testCase119(){
	assertTrue(tester.bondRegex("(007207)"));
	}
	 
	@Test
	public void testCase120(){
	assertTrue(tester.bondRegex("(00727)"));
	}
	 
	@Test
	public void testCase121(){
	assertTrue(tester.bondRegex("(0073)"));
	}
	 
	@Test
	public void testCase122(){
	assertTrue(tester.bondRegex("(0073007)"));
	}
	 
	@Test
	public void testCase123(){
	assertTrue(tester.bondRegex("(007307)"));
	}
	 
	@Test
	public void testCase124(){
	assertTrue(tester.bondRegex("(00737)"));
	}
	 
	@Test
	public void testCase125(){
	assertTrue(tester.bondRegex("(0074)"));
	}
	 
	@Test
	public void testCase126(){
	assertTrue(tester.bondRegex("(0074007)"));
	}
	 
	@Test
	public void testCase127(){
	assertTrue(tester.bondRegex("(007407)"));
	}
	 
	@Test
	public void testCase128(){
	assertTrue(tester.bondRegex("(00747)"));
	}
	 
	@Test
	public void testCase129(){
	assertTrue(tester.bondRegex("(0075)"));
	}
	 
	@Test
	public void testCase130(){
	assertTrue(tester.bondRegex("(0075007)"));
	}
	 
	@Test
	public void testCase131(){
	assertTrue(tester.bondRegex("(007507)"));
	}
	 
	@Test
	public void testCase132(){
	assertTrue(tester.bondRegex("(00757)"));
	}
	 
	@Test
	public void testCase133(){
	assertTrue(tester.bondRegex("(0076)"));
	}
	 
	@Test
	public void testCase134(){
	assertTrue(tester.bondRegex("(0076007)"));
	}
	 
	@Test
	public void testCase135(){
	assertTrue(tester.bondRegex("(007607)"));
	}
	 
	@Test
	public void testCase136(){
	assertTrue(tester.bondRegex("(00767)"));
	}
	 
	@Test
	public void testCase137(){
	assertTrue(tester.bondRegex("(0077)"));
	}
	 
	@Test
	public void testCase138(){
	assertTrue(tester.bondRegex("(0077007)"));
	}
	 
	@Test
	public void testCase139(){
	assertTrue(tester.bondRegex("(007707)"));
	}
	 
	@Test
	public void testCase140(){
	assertTrue(tester.bondRegex("(00777)"));
	}
	 
	@Test
	public void testCase141(){
	assertTrue(tester.bondRegex("(0078)"));
	}
	 
	@Test
	public void testCase142(){
	assertTrue(tester.bondRegex("(0078007)"));
	}
	 
	@Test
	public void testCase143(){
	assertTrue(tester.bondRegex("(007807)"));
	}
	 
	@Test
	public void testCase144(){
	assertTrue(tester.bondRegex("(00787)"));
	}
	 
	@Test
	public void testCase145(){
	assertTrue(tester.bondRegex("(0079)"));
	}
	 
	@Test
	public void testCase146(){
	assertTrue(tester.bondRegex("(0079007)"));
	}
	 
	@Test
	public void testCase147(){
	assertTrue(tester.bondRegex("(007907)"));
	}
	 
	@Test
	public void testCase148(){
	assertTrue(tester.bondRegex("(00797)"));
	}
	 
	@Test
	public void testCase149(){
	assertFalse(tester.bondRegex("(008)"));
	}
	 
	@Test
	public void testCase150(){
	assertTrue(tester.bondRegex("(008007)"));
	}
	 
	@Test
	public void testCase151(){
	assertFalse(tester.bondRegex("(00807)"));
	}
	 
	@Test
	public void testCase152(){
	assertFalse(tester.bondRegex("(0087)"));
	}
	 
	@Test
	public void testCase153(){
	assertFalse(tester.bondRegex("(009)"));
	}
	 
	@Test
	public void testCase154(){
	assertTrue(tester.bondRegex("(009007)"));
	}
	 
	@Test
	public void testCase155(){
	assertFalse(tester.bondRegex("(00907)"));
	}
	 
	@Test
	public void testCase156(){
	assertFalse(tester.bondRegex("(0097)"));
	}
	 
	@Test
	public void testCase157(){
	assertFalse(tester.bondRegex("(01)"));
	}
	 
	@Test
	public void testCase158(){
	assertTrue(tester.bondRegex("(01007)"));
	}
	 
	@Test
	public void testCase159(){
	assertFalse(tester.bondRegex("(0107)"));
	}
	 
	@Test
	public void testCase160(){
	assertFalse(tester.bondRegex("(017)"));
	}
	 
	@Test
	public void testCase161(){
	assertFalse(tester.bondRegex("(02)"));
	}
	 
	@Test
	public void testCase162(){
	assertTrue(tester.bondRegex("(02007)"));
	}
	 
	@Test
	public void testCase163(){
	assertFalse(tester.bondRegex("(0207)"));
	}
	 
	@Test
	public void testCase164(){
	assertFalse(tester.bondRegex("(027)"));
	}
	 
	@Test
	public void testCase165(){
	assertFalse(tester.bondRegex("(03)"));
	}
	 
	@Test
	public void testCase166(){
	assertTrue(tester.bondRegex("(03007)"));
	}
	 
	@Test
	public void testCase167(){
	assertFalse(tester.bondRegex("(0307)"));
	}
	 
	@Test
	public void testCase168(){
	assertFalse(tester.bondRegex("(037)"));
	}
	 
	@Test
	public void testCase169(){
	assertFalse(tester.bondRegex("(04)"));
	}
	 
	@Test
	public void testCase170(){
	assertTrue(tester.bondRegex("(04007)"));
	}
	 
	@Test
	public void testCase171(){
	assertFalse(tester.bondRegex("(0407)"));
	}
	 
	@Test
	public void testCase172(){
	assertFalse(tester.bondRegex("(047)"));
	}
	 
	@Test
	public void testCase173(){
	assertFalse(tester.bondRegex("(05)"));
	}
	 
	@Test
	public void testCase174(){
	assertTrue(tester.bondRegex("(05007)"));
	}
	 
	@Test
	public void testCase175(){
	assertFalse(tester.bondRegex("(0507)"));
	}
	 
	@Test
	public void testCase176(){
	assertFalse(tester.bondRegex("(057)"));
	}
	 
	@Test
	public void testCase177(){
	assertFalse(tester.bondRegex("(06)"));
	}
	 
	@Test
	public void testCase178(){
	assertTrue(tester.bondRegex("(06007)"));
	}
	 
	@Test
	public void testCase179(){
	assertFalse(tester.bondRegex("(0607)"));
	}
	 
	@Test
	public void testCase180(){
	assertFalse(tester.bondRegex("(067)"));
	}
	 
	@Test
	public void testCase181(){
	assertFalse(tester.bondRegex("(07)"));
	}
	 
	@Test
	public void testCase182(){
	assertTrue(tester.bondRegex("(07007)"));
	}
	 
	@Test
	public void testCase183(){
	assertFalse(tester.bondRegex("(0707)"));
	}
	 
	@Test
	public void testCase184(){
	assertFalse(tester.bondRegex("(077)"));
	}
	 
	@Test
	public void testCase185(){
	assertFalse(tester.bondRegex("(08)"));
	}
	 
	@Test
	public void testCase186(){
	assertTrue(tester.bondRegex("(08007)"));
	}
	 
	@Test
	public void testCase187(){
	assertFalse(tester.bondRegex("(0807)"));
	}
	 
	@Test
	public void testCase188(){
	assertFalse(tester.bondRegex("(087)"));
	}
	 
	@Test
	public void testCase189(){
	assertFalse(tester.bondRegex("(09)"));
	}
	 
	@Test
	public void testCase190(){
	assertTrue(tester.bondRegex("(09007)"));
	}
	 
	@Test
	public void testCase191(){
	assertFalse(tester.bondRegex("(0907)"));
	}
	 
	@Test
	public void testCase192(){
	assertFalse(tester.bondRegex("(097)"));
	}
	 
	@Test
	public void testCase193(){
	assertFalse(tester.bondRegex("(1)"));
	}
	 
	@Test
	public void testCase194(){
	assertTrue(tester.bondRegex("(1007)"));
	}
	 
	@Test
	public void testCase195(){
	assertFalse(tester.bondRegex("(107)"));
	}
	 
	@Test
	public void testCase196(){
	assertFalse(tester.bondRegex("(17)"));
	}
	 
	@Test
	public void testCase197(){
	assertFalse(tester.bondRegex("(2)"));
	}
	 
	@Test
	public void testCase198(){
	assertTrue(tester.bondRegex("(2007)"));
	}
	 
	@Test
	public void testCase199(){
	assertFalse(tester.bondRegex("(207)"));
	}
	 
	@Test
	public void testCase200(){
	assertFalse(tester.bondRegex("(27)"));
	}
	 
	@Test
	public void testCase201(){
	assertFalse(tester.bondRegex("(3)"));
	}
	 
	@Test
	public void testCase202(){
	assertTrue(tester.bondRegex("(3007)"));
	}
	 
	@Test
	public void testCase203(){
	assertFalse(tester.bondRegex("(307)"));
	}
	 
	@Test
	public void testCase204(){
	assertFalse(tester.bondRegex("(37)"));
	}
	 
	@Test
	public void testCase205(){
	assertFalse(tester.bondRegex("(4)"));
	}
	 
	@Test
	public void testCase206(){
	assertTrue(tester.bondRegex("(4007)"));
	}
	 
	@Test
	public void testCase207(){
	assertFalse(tester.bondRegex("(407)"));
	}
	 
	@Test
	public void testCase208(){
	assertFalse(tester.bondRegex("(47)"));
	}
	 
	@Test
	public void testCase209(){
	assertFalse(tester.bondRegex("(5)"));
	}
	 
	@Test
	public void testCase210(){
	assertTrue(tester.bondRegex("(5007)"));
	}
	 
	@Test
	public void testCase211(){
	assertFalse(tester.bondRegex("(507)"));
	}
	 
	@Test
	public void testCase212(){
	assertFalse(tester.bondRegex("(57)"));
	}
	 
	@Test
	public void testCase213(){
	assertFalse(tester.bondRegex("(6)"));
	}
	 
	@Test
	public void testCase214(){
	assertTrue(tester.bondRegex("(6007)"));
	}
	 
	@Test
	public void testCase215(){
	assertFalse(tester.bondRegex("(607)"));
	}
	 
	@Test
	public void testCase216(){
	assertFalse(tester.bondRegex("(67)"));
	}
	 
	@Test
	public void testCase217(){
	assertFalse(tester.bondRegex("(7)"));
	}
	 
	@Test
	public void testCase218(){
	assertTrue(tester.bondRegex("(7007)"));
	}
	 
	@Test
	public void testCase219(){
	assertFalse(tester.bondRegex("(707)"));
	}
	 
	@Test
	public void testCase220(){
	assertFalse(tester.bondRegex("(77)"));
	}
	 
	@Test
	public void testCase221(){
	assertFalse(tester.bondRegex("(8)"));
	}
	 
	@Test
	public void testCase222(){
	assertTrue(tester.bondRegex("(8007)"));
	}
	 
	@Test
	public void testCase223(){
	assertFalse(tester.bondRegex("(807)"));
	}
	 
	@Test
	public void testCase224(){
	assertFalse(tester.bondRegex("(87)"));
	}
	 
	@Test
	public void testCase225(){
	assertFalse(tester.bondRegex("(9)"));
	}
	 
	@Test
	public void testCase226(){
	assertTrue(tester.bondRegex("(9007)"));
	}
	 
	@Test
	public void testCase227(){
	assertFalse(tester.bondRegex("(907)"));
	}
	 
	@Test
	public void testCase228(){
	assertFalse(tester.bondRegex("(97)"));
	}
	 
	@Test
	public void testCase229(){
	assertFalse(tester.bondRegex(")"));
	}
	 
	@Test
	public void testCase230(){
	assertFalse(tester.bondRegex("))"));
	}
	 
	@Test
	public void testCase231(){
	assertFalse(tester.bondRegex(")007)"));
	}
	 
	@Test
	public void testCase232(){
	assertFalse(tester.bondRegex(")07)"));
	}
	 
	@Test
	public void testCase233(){
	assertFalse(tester.bondRegex(")7)"));
	}
	 
	@Test
	public void testCase234(){
	assertFalse(tester.bondRegex("0)"));
	}
	 
	@Test
	public void testCase235(){
	assertFalse(tester.bondRegex("0007)"));
	}
	 
	@Test
	public void testCase236(){
	assertFalse(tester.bondRegex("007)"));
	}
	 
	@Test
	public void testCase237(){
	assertFalse(tester.bondRegex("07)"));
	}
	 
	@Test
	public void testCase238(){
	assertFalse(tester.bondRegex("1)"));
	}
	 
	@Test
	public void testCase239(){
	assertFalse(tester.bondRegex("1007)"));
	}
	 
	@Test
	public void testCase240(){
	assertFalse(tester.bondRegex("107)"));
	}
	 
	@Test
	public void testCase241(){
	assertFalse(tester.bondRegex("17)"));
	}
	 
	@Test
	public void testCase242(){
	assertFalse(tester.bondRegex("2)"));
	}
	 
	@Test
	public void testCase243(){
	assertFalse(tester.bondRegex("2007)"));
	}
	 
	@Test
	public void testCase244(){
	assertFalse(tester.bondRegex("207)"));
	}
	 
	@Test
	public void testCase245(){
	assertFalse(tester.bondRegex("27)"));
	}
	 
	@Test
	public void testCase246(){
	assertFalse(tester.bondRegex("3)"));
	}
	 
	@Test
	public void testCase247(){
	assertFalse(tester.bondRegex("3007)"));
	}
	 
	@Test
	public void testCase248(){
	assertFalse(tester.bondRegex("307)"));
	}
	 
	@Test
	public void testCase249(){
	assertFalse(tester.bondRegex("37)"));
	}
	 
	@Test
	public void testCase250(){
	assertFalse(tester.bondRegex("4)"));
	}
	 
	@Test
	public void testCase251(){
	assertFalse(tester.bondRegex("4007)"));
	}
	 
	@Test
	public void testCase252(){
	assertFalse(tester.bondRegex("407)"));
	}
	 
	@Test
	public void testCase253(){
	assertFalse(tester.bondRegex("47)"));
	}
	 
	@Test
	public void testCase254(){
	assertFalse(tester.bondRegex("5)"));
	}
	 
	@Test
	public void testCase255(){
	assertFalse(tester.bondRegex("5007)"));
	}
	 
	@Test
	public void testCase256(){
	assertFalse(tester.bondRegex("507)"));
	}
	 
	@Test
	public void testCase257(){
	assertFalse(tester.bondRegex("57)"));
	}
	 
	@Test
	public void testCase258(){
	assertFalse(tester.bondRegex("6)"));
	}
	 
	@Test
	public void testCase259(){
	assertFalse(tester.bondRegex("6007)"));
	}
	 
	@Test
	public void testCase260(){
	assertFalse(tester.bondRegex("607)"));
	}
	 
	@Test
	public void testCase261(){
	assertFalse(tester.bondRegex("67)"));
	}
	 
	@Test
	public void testCase262(){
	assertFalse(tester.bondRegex("7)"));
	}
	 
	@Test
	public void testCase263(){
	assertFalse(tester.bondRegex("7007)"));
	}
	 
	@Test
	public void testCase264(){
	assertFalse(tester.bondRegex("707)"));
	}
	 
	@Test
	public void testCase265(){
	assertFalse(tester.bondRegex("77)"));
	}
	 
	@Test
	public void testCase266(){
	assertFalse(tester.bondRegex("8)"));
	}
	 
	@Test
	public void testCase267(){
	assertFalse(tester.bondRegex("8007)"));
	}
	 
	@Test
	public void testCase268(){
	assertFalse(tester.bondRegex("807)"));
	}
	 
	@Test
	public void testCase269(){
	assertFalse(tester.bondRegex("87)"));
	}
	 
	@Test
	public void testCase270(){
	assertFalse(tester.bondRegex("9)"));
	}
	 
	@Test
	public void testCase271(){
	assertFalse(tester.bondRegex("9007)"));
	}
	 
	@Test
	public void testCase272(){
	assertFalse(tester.bondRegex("907)"));
	}
	 
	@Test
	public void testCase273(){
	assertFalse(tester.bondRegex("97)"));
	}
}
