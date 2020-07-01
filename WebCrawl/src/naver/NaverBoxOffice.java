package naver;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverBoxOffice {
	public static void main(String[] args) throws IOException {
		String url = "https://movie.naver.com/movie/running/current.nhn";

		Document doc = Jsoup.connect(url).get();
		// System.out.println(doc);
		Elements moivelist = doc.select("div.lst_wrap > ul.lst_detail_t1 > li");
		
		String title = "";           // 영화 제목
		String score = "";           // 영화 평점
		String bookRate = "";        // 영화 예매율
		String type = "";            // 영화 장르
		String moiveTime = "";       // 영화 상영시간
		String openDt = "";          // 영화 개봉일
		String director = "";        // 영화 감독
		String sctor = "";           // 영화 출연진
		String naverCode = "";       // 네이버 영화 코드

		for (Element moive : moivelist) {
			title = moive.select("dt.tit > a").text();
			bookRate = "0";
			director = "";
			sctor = "";
			if (moive.select("span.num").size() == 2) {
				bookRate = moive.select("span.num").get(1).text();
			}
			score = moive.select("span.num").get(0).text();
			type = moive.select("dd > span.link_txt").get(0).text();

			String temp = moive.select("dl.info_txt1 > dd").get(0).text();

			int beginTimeIndex = temp.indexOf("|");
			int endTimeIndex = temp.lastIndexOf("|");
			if (beginTimeIndex == endTimeIndex) {
				moiveTime = temp.substring(0, endTimeIndex);
			} else {
				moiveTime = temp.substring(beginTimeIndex + 2, endTimeIndex);
			}
			
			// 0: 없음, 1: 있음
			int dCode = 0; // 감독 유무 확인
			int aCode = 0; // 출연진 유무 확인
			if (!moive.select("dt.tit_t2").text().equals("")) {
				dCode = 1; // 감독 있음!
			}
			if (!moive.select("dt.tit_t3").text().equals("")) {
				aCode = 1; // 출연진 있음!
			}
			
			if (dCode == 1 && aCode == 0) {
				director = moive.select("dd > span.link_txt").get(1).text();
			} else if (dCode == 0 && aCode == 1) {
				sctor = moive.select("dd > span.link_txt").get(1).text();
			} else if (dCode == 1 && aCode == 1) {
				director = moive.select("dd > span.link_txt").get(1).text();
				sctor = moive.select("dd > span.link_txt").get(2).text();
			}
			
			String naverHref = moive.select("dt.tit > a").attr("href");
			
			naverCode = naverHref.substring(naverHref.lastIndexOf("=")+1);
			
			int openDtTxtIndex = temp.lastIndexOf("개봉");
			openDt = temp.substring(endTimeIndex + 2, openDtTxtIndex);
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■■ 영화제목: " + title);
			System.out.println("■■ 영화평점: " + score + "점");
			System.out.println("■■ 예매율: " + bookRate + "%");
			System.out.println("■■ 장르: " + type);
			System.out.println("■■ 상영시간: " + moiveTime);
			System.out.println("■■ 개봉일: " + openDt);
			System.out.println("■■ 감독: " + director);
			System.out.println("■■ 감독: " + sctor);
			System.out.println("■■ 무비코드: " + naverCode);
		}
	}
}
