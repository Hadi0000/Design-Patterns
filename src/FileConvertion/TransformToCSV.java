package FileConvertion;

public class TransformToCSV implements Transform{

	@Override
	public String transformToAnotherFile(String texts) {
			// TODO Auto-generated method stub
			String[] arr;
			String output = null; 
			arr = texts.split(" ");
			for ( String ss : arr) {
					output = output + ss+",";
			       
			 }
			int size = output.length();
			StringBuilder sb = new StringBuilder(output);
			sb = sb.deleteCharAt(size-1);
			String result = sb.toString();
				return result;
					
	}

}
