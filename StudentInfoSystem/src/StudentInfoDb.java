
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfoDb extends StudentInfoSystem{
	
	String db_id ;
	String db_name;
	String db_depart;
	String db_pnum ;
	
	
	public StudentInfoDb(String id, String name, String depart, String pnum){
		db_id = id;
		db_name = name;
		db_depart = depart;
		db_pnum = pnum;
	}
	
	public boolean info_add(){
		
		// �й��� �����Ѱ� �ְų� , �����Է�ĭ�� �ϳ��� �Է����� �ʴ� ��� ����x 
		
		try {
			state.executeUpdate("insert into student_info(Id, Name, Department, Phone_num) values('"+db_id+"','"+db_name+"','"+db_depart+"','"+db_pnum+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//if(db_id == null || db_id.length() == 0)
			//return;
		return true;	
	}
	
	public boolean info_update(String new_pnum){
		
		//�Է�ĭ�� �й��� �Է����� �ʴ� ��� 
		
		try {
			state.executeUpdate("update student_info set Phone_num = '"+new_pnum+"' where Id= '"+db_id+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;

	}

}
