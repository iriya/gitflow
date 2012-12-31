import com.alibaba.fastjson.*;

/* 
 * parse gitlab api: 'projects/:id/members', find members who fits given property=value, return member id.
 * Usage: $0 [json-str] [property] [value]
 * return: id1 id2 id3...
 */
public class MemberId {
	public static void main(String[] args) {
		JSONArray array = JSONArray.parseArray(args[0]);
		for(int i=0;i<array.size();i++) {
			JSONObject member = array.getJSONObject(i);
			if(member.get(args[1]).toString().equals(args[2])) {
				System.out.print(member.getIntValue("id"));
				System.out.print(" ");
			}
		}
	}
}
