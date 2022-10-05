package board;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class boardDAO {
		// 게시물 등록
		// INSERT INTO board () VALUES ()
		public static boolean writeContent(boardDTO bd) {
			Connection con = null;
			PreparedStatement pstmt = null;
			boolean result = false;
			
			System.out.println(bd);
			
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into board ( ) values (?,?,?,?)")
			
			
		}

		// 게시물 조회
		// SELECT * FROM board WHERE bNum=?
		// UPDATE board SET readnum=? where num=?
		public static Object getAllContents() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		// 게시물 수정
		// UPDATE board SET pTitle=?, pContent=?, pDate=?
		
		// 게시물 삭제
		// DELETE board WHERE pNum=? and ?
		
}
