package marshaller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setName("Dude");
		student.setMarks(85);
		try {
//			JAXBContext context = JAXBContext.newInstance(Student.class);
//			Marshaller marsh = context.createMarshaller();
//			marsh.setProperty(marsh.JAXB_FORMATTED_OUTPUT, true);
//			marsh.marshal(student, new File("user.xml"));
//			marsh.marshal(student, System.out);
//			JAXBContext context = JAXBContext.newInstance(Student.class);
//			Unmarshaller unmarshaller = context.createUnmarshaller();
//			Student unmarshal = (Student) unmarshaller.unmarshal(new File("user.xml"));
//			System.out.println(unmarshal);
			
			ObjectMapper objectMapper = new ObjectMapper(); 
	//		objectMapper.writeValue(new File("user.json"), student);
			Student readValue = objectMapper.readValue(new File("user.json"),Student.class);
			System.out.println(readValue);
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
