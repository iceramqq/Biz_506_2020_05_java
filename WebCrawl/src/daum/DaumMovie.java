package daum;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DaumMovie {
	public static void main(String[] args) throws IOException {
		int page = 1;
		int cnt =0;
		while (true) {
			String url = "https://movie.daum.net/moviedb/grade?movieId=134684&type=netizen&page="+page;
			
			Document doc = Jsoup.connect(url).get();
			Elements replyList = doc.select("div.review_info");
			
			String writer = "";
			int score = 0;
			String content = "";
			String regDtCut = "";
			String regDt = "";
			for (Element one : replyList) {
				content = one.select("p.desc_review").get(0).text();
				writer = one.select("div.review_info a").get(0).text();
				score = Integer.parseInt(one.select("em.emph_grade").get(0).text());
				regDtCut = one.select("span.info_append").get(0).text();
				regDt = (String) regDtCut.subSequence(0, regDtCut.lastIndexOf(","));
				System.out.println("==========================================================================================");
				System.out.println("내용: " + content);
				System.out.println("평점: " + score);
				System.out.println("작성자: " + writer);
				System.out.println("작성일자: " + regDt);
				cnt += 1;
				
			}
			if(writer.equals("")) {
				break;
			}
			page += 1;
		}
		System.out.println("총"+cnt+"건 수집했습니다");
	}

}
