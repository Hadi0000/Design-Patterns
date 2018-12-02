package FileConvertion;

import java.util.HashMap;

public class MillFactory {
		
		Transform tf = new TransformToCSV();
		//Transform tf = new TransformToCSV();
		HashMap<String,Transform> hmap = new HashMap<String,Transform>();
		
		public void fillHashMap() {
				hmap.put("CSV", tf);
		}
		
		public Transform getObject(String what) {
			Transform temp = hmap.get(what);
			return temp;
			
		}
}
