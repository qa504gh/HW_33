package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class PrimeNumChk_DryRunTest {
	private PrimeNumberChecker pn;
@Before
	public void initialize() {
		pn = new PrimeNumberChecker();	
	                         }
	@Parameter(value = 0)
	public Integer inputNumber;

	@Parameter(value = 1)
	public Boolean expectedResult;

	@Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")

	public static Collection<Object[]> primeNumbers() {
		Object[][] data = new Object[][] {
			{2, true},
			{3, true},
			{4, true},
			{5, true},
			{6, false},
			{7, true},
			{8, false},
			{9, false},
			{10, false},
			{11, true},
			{12, false},
			{13, true},
			{14, false},
			{15, false},
			{16, false},
			{17, true},
			{18, false},
			{19, true},
			{20, false},
			{21, false},
			{22, false},
			{23, true},
			{24, false},
			{25, false},
			{26, false},
			{27, false},
			{28, false},
			{29, true},
			{30, false},
			{31, true},
			{32, false},
			{33, false},
			{34, false},
			{35, false},
			{36, false},
			{37, true},
			{38, false},
			{39, false},
			{40, false},
			{41, true},
			{42, false},
			{43, true},
			{44, false},
			{45, false},
			{46, false},
			{47, true},
			{48, false},
			{49, false},
			{50, false},
			{51, false},
			{52, false},
			{53, true},
			{54, false},
			{55, false},
			{56, false},
			{57, false},
			{58, false},
			{59, true},
			{60, false},
			{61, true},
			{62, false},
			{63, false},
			{64, false},
			{65, false},
			{66, false},
			{67, true},
			{68, false},
			{69, false},
			{70, false},
			{71, true},
			{72, false},
			{73, true},
			{74, false},
			{75, false},
			{76, false},
			{77, false},
			{78, false},
			{79, true},
			{80, false},
			{81, false},
			{82, false},
			{83, true},
			{84, false},
			{85, false},
			{86, false},
			{87, false},
			{88, false},
			{89, true},
			{90, false},
			{91, false},
			{92, false},
			{93, false},
			{94, false},
			{95, false},
			{96, false},
			{97, true},
			{98, false},
			{99, false},
			{100, false},
			{101, true},
			{102, false},
			{103, true},
			{104, false},
			{105, false},
			{106, false},
			{107, true},
			{108, false},
			{109, true},
			{110, false},
			{111, false},
			{112, false},
			{113, true},
			{114, false},
			{115, false},
			{116, false},
			{117, false},
			{118, false},
			{119, false},
			{120, false},
			{121, false},
			{122, false},
			{123, false},
			{124, false},
			{125, false},
			{126, false},
			{127, true},
			{128, false},
			{129, false},
			{130, false},
			{131, true},
			{132, false},
			{133, false},
			{134, false},
			{135, false},
			{136, false},
			{137, true},
			{138, false},
			{139, true},
			{140, false},
			{141, false},
			{142, false},
			{143, false},
			{144, false},
			{145, false},
			{146, false},
			{147, false},
			{148, false},
			{149, true},
			{150, false},
			{151, true},
			{152, false},
			{153, false},
			{154, false},
			{155, false},
			{156, false},
			{157, true},
			{158, false},
			{159, false},
			{160, false},
			{161, false},
			{162, false},
			{163, true},
			{164, false},
			{165, false},
			{166, false},
			{167, true},
			{168, false},
			{169, false},
			{170, false},
			{171, false},
			{172, false},
			{173, true},
			{174, false},
			{175, false},
			{176, false},
			{177, false},
			{178, false},
			{179, true},
			{180, false},
			{181, true},
			{182, false},
			{183, false},
			{184, false},
			{185, false},
			{186, false},
			{187, false},
			{188, false},
			{189, false},
			{190, false},
			{191, true},
			{192, false},
			{193, true},
			{194, false},
			{195, false},
			{196, false},
			{197, true},
			{198, false},
			{199, true},
			{200, false},
			{201, false},
			{202, false},
			{203, false},
			{204, false},
			{205, false},
			{206, false},
			{207, false},
			{208, false},
			{209, false},
			{210, false},
			{211, true},
			{212, false},
			{213, false},
			{214, false},
			{215, false},
			{216, false},
			{217, false},
			{218, false},
			{219, false},
			{220, false},
			{221, false},
			{222, false},
			{223, true},
			{224, false},
			{225, false},
			{226, false},
			{227, true},
			{228, false},
			{229, true},
			{230, false},
			{231, false},
			{232, false},
			{233, true},
			{234, false},
			{235, false},
			{236, false},
			{237, false},
			{238, false},
			{239, true},
			{240, false},
			{241, true},
			{242, false},
			{243, false},
			{244, false},
			{245, false},
			{246, false},
			{247, false},
			{248, false},
			{249, false},
			{250, false},
			{251, true},
			{252, false},
			{253, false},
			{254, false},
			{255, false},
			{256, false},
			{257, true},
			{258, false},
			{259, false},
			{260, false},
			{261, false},
			{262, false},
			{263, true},
			{264, false},
			{265, false},
			{266, false},
			{267, false},
			{268, false},
			{269, true},
			{270, false},
			{271, true},
			{272, false},
			{273, false},
			{274, false},
			{275, false},
			{276, false},
			{277, true},
			{278, false},
			{279, false},
			{280, false},
			{281, true},
			{282, false},
			{283, true},
			{284, false},
			{285, false},
			{286, false},
			{287, false},
			{288, false},
			{289, false},
			{290, false},
			{291, false},
			{292, false},
			{293, true},
			{294, false},
			{295, false},
			{296, false},
			{297, false},
			{298, false},
			{299, false},
			{300, false},
			{301, false},
			{302, false},
			{303, false},
			{304, false},
			{305, false},
			{306, false},
			{307, true},
			{308, false},
			{309, false},
			{310, false},
			{311, true},
			{312, false},
			{313, true},
			{314, false},
			{315, false},
			{316, false},
			{317, true},
			{318, false},
			{319, false},
			{320, false},
			{321, false},
			{322, false},
			{323, false},
			{324, false},
			{325, false},
			{326, false},
			{327, false},
			{328, false},
			{329, false},
			{330, false},
			{331, true},
			{332, false},
			{333, false},
			{334, false},
			{335, false},
			{336, false},
			{337, true},
			{338, false},
			{339, false},
			{340, false},
			{341, false},
			{342, false},
			{343, false},
			{344, false},
			{345, false},
			{346, false},
			{347, true},
			{348, false},
			{349, true},
			{350, false},
			{351, false},
			{352, false},
			{353, true},
			{354, false},
			{355, false},
			{356, false},
			{357, false},
			{358, false},
			{359, true},
			{360, false},
			{361, false},
			{362, false},
			{363, false},
			{364, false},
			{365, false},
			{366, false},
			{367, true},
			{368, false},
			{369, false},
			{370, false},
			{371, false},
			{372, false},
			{373, true},
			{374, false},
			{375, false},
			{376, false},
			{377, false},
			{378, false},
			{379, true},
			{380, false},
			{381, false},
			{382, false},
			{383, true},
			{384, false},
			{385, false},
			{386, false},
			{387, false},
			{388, false},
			{389, true},
			{390, false},
			{391, false},
			{392, false},
			{393, false},
			{394, false},
			{395, false},
			{396, false},
			{397, true},
			{398, false},
			{399, false},
			{400, false},
			{401, true},
			{402, false},
			{403, false},
			{404, false},
			{405, false},
			{406, false},
			{407, false},
			{408, false},
			{409, true},
			{410, false},
			{411, false},
			{412, false},
			{413, false},
			{414, false},
			{415, false},
			{416, false},
			{417, false},
			{418, false},
			{419, true},
			{420, false},
			{421, true},
			{422, false},
			{423, false},
			{424, false},
			{425, false},
			{426, false},
			{427, false},
			{428, false},
			{429, false},
			{430, false},
			{431, true},
			{432, false},
			{433, true},
			{434, false},
			{435, false},
			{436, false},
			{437, false},
			{438, false},
			{439, true},
			{440, false},
			{441, false},
			{442, false},
			{443, true},
			{444, false},
			{445, false},
			{446, false},
			{447, false},
			{448, false},
			{449, true},
			{450, false},
			{451, false},
			{452, false},
			{453, false},
			{454, false},
			{455, false},
			{456, false},
			{457, true},
			{458, false},
			{459, false},
			{460, false},
			{461, true},
			{462, false},
			{463, true},
			{464, false},
			{465, false},
			{466, false},
			{467, true},
			{468, false},
			{469, false},
			{470, false},
			{471, false},
			{472, false},
			{473, false},
			{474, false},
			{475, false},
			{476, false},
			{477, false},
			{478, false},
			{479, true},
			{480, false},
			{481, false},
			{482, false},
			{483, false},
			{484, false},
			{485, false},
			{486, false},
			{487, true},
			{488, false},
			{489, false},
			{490, false},
			{491, true},
			{492, false},
			{493, false},
			{494, false},
			{495, false},
			{496, false},
			{497, false},
			{498, false},
			{499, true},
			{500, false}};
		
			return Arrays.asList(data);
	}

@Test
	public void testPrimeNumberChecker() {
System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
	assertEquals(expectedResult, pn.validate(inputNumber));
	}
}