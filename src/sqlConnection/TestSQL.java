package sqlConnection;



public class TestSQL{

	public static void main(String[] args) {
		
		SQLUtility select = new SQLUtility();


		String str = "SELECT category_name FROM gamecategory";
		
		
		
		String Bla =  (String) select.Select(str);
		
		System.out.println(Bla);
		
		

	}

}
