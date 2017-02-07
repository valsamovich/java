/*package org.samovich.cs6310.assignment4.tmp;

import edu.gatech.sadclass.coursemangement.model.*;
import org.samovich.cs6310.assignment4.Course;
import org.samovich.cs6310.assignment4.Instructor;
import org.samovich.cs6310.assignment4.Student;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class ApplicationDAO {
	private List<Student> students = new ArrayList<Student>();
	private List<Instructor> instructors = new ArrayList<Instructor>();
	private List<Record> records = new ArrayList<Record>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Semester> semesters = new ArrayList<Semester>();
	private Map<Long, List<Long>> prereqs = new HashMap<Long, List<Long>>();
	private List<Assignment> assignments = new ArrayList<Assignment>();
	private List<Request> requests = new ArrayList<Request>();
	private final String basePath = "./";
	private final String COURSES_FILE = "courses.csv";
	private final String INSTRUCTORS_FILE = "instructors.csv";
	private final String RECORDS_FILE = "records.csv";
	private final String STUDENTS_FILE = "students.csv";
	private final String PREREQS_FILE = "prereqs.csv";
	private final String ASSIGNMENTS_FILE = "assignments.csv";
	private final String REQUESTS_FILE = "requests.csv";

	public ApplicationDAO() {
		//loadFiles();
	}

	public void loadFiles() {
		loadStudents(STUDENTS_FILE, students);
		loadInstructors(INSTRUCTORS_FILE, instructors);
		loadCourses(COURSES_FILE, courses);
		loadRecords(RECORDS_FILE, records);
		loadSemesters(semesters);
		loadPrereqs(PREREQS_FILE, prereqs);
		loadAssignments(ASSIGNMENTS_FILE, assignments);
		loadRequests(REQUESTS_FILE, requests);
	}

	public int getStudentsCount() {
		return students.size();
	}

	public int getRecordsCount() {
		return records.size();
	}

	public int getInstructorsCount() {
		return instructors.size();
	}

	public int getCoursesCount() {
		return courses.size();
	}

	public int getRequestsCount() {
		return requests.size();
	}

	public List<Request> getRequests() {
		return requests;
	}

	public int getStudentsWithNoClasses() {
		Set<Long> studentsWithRecords = new HashSet<Long>();
		int studentsCount = students.size();
		for (Record record : records) {
			if (studentsWithRecords.size() == studentsCount) {
				break;
			}
			studentsWithRecords.add(record.getStudentID());
		}
		return studentsCount - studentsWithRecords.size();
	}

	public int getInstructorsWithNoClasses() {
		Set<Long> instructorsWithRecords = new HashSet<Long>();
		int instructorsCount = instructors.size();
		for (Record record : records) {
			if (instructorsWithRecords.size() == instructorsCount) {
				break;
			}
			instructorsWithRecords.add(record.getInstructorID());
		}
		return instructorsCount - instructorsWithRecords.size();
	}

	public int getCoursesNeverTaken() {
		Set<Long> coursesTaken = new HashSet<Long>();
		int coursesCount = courses.size();
		for (Record record : records) {
			if (coursesTaken.size() == coursesCount) {
				break;
			}
			coursesTaken.add(record.getCourseID());
		}
		return coursesCount - coursesTaken.size();
	}

	public int getClassCountForSemester(String semester) {
		int count = 0;
		for (Course course : courses) {
			if (course.isOfferedDuring(semester)) {
				count++;
			}
		}
		return count;
	}

	private void loadStudents(String filename, List<Student> list) {
		try {
			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Student user = new Student();
				user.setId(Long.valueOf(array[0]));
				user.setName(array[1]);
				user.setAddress(array[2]);
				user.setPhoneNumber(array[3]);
				list.add(user);
			}
		} catch (Exception e) {
		}
	}

	private void loadInstructors(String filename, List<Instructor> list) {
		try {
			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Instructor user = new Instructor();
				user.setId(Long.valueOf(array[0]));
				user.setName(array[1]);
				user.setAddress(array[2]);
				user.setPhoneNumber(array[3]);
				list.add(user);
			}
		} catch (Exception e) {
		}
	}

	private void loadRecords(String filename, List<Record> list) {
		try {

			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Record record = new Record();
				record.setStudentID(Long.valueOf(array[0]));
				record.setCourseID(Long.valueOf(array[1]));
				record.setInstructorID(Long.valueOf(array[2]));
				record.setComment(array[3]);
				record.setLetterGrade(array[4].charAt(0));
				list.add(record);
			}
		} catch (Exception e) {
		}
	}

	private void loadCourses(String filename, List<Course> list) {
		try {

			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Course course = new Course();
				course.setId(Long.valueOf(array[0]));
				course.setShortName(array[1]);
				try {
					course.addSemester(new Semester(array[2]));
					course.addSemester(new Semester(array[3]));
					course.addSemester(new Semester(array[4]));
				} catch (Exception e) {
				}
				list.add(course);
			}
		} catch (Exception e) {
		}
	}

	private void loadSemesters(List<Semester> semesters) {
		semesters.add(new Semester("Spring"));
		semesters.add(new Semester("Fall"));
		semesters.add(new Semester("Summer"));
	}

	private void loadPrereqs(String filename, Map<Long, List<Long>> list) {
		try {
			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Long courseId = Long.valueOf(array[0]);
				Long prereqId = Long.valueOf(array[1]);
				if (!list.containsKey(courseId)) {
					list.put(courseId, new ArrayList<Long>());
				}
				list.get(courseId).add(prereqId);
			}
		} catch (Exception e) {
		}
	}

	private void loadAssignments(String filename, List<Assignment> list) {
		try {
			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Long instructorId = Long.valueOf(array[0]);
				Long courseId = Long.valueOf(array[1]);
				int capacity = Integer.valueOf(array[2]);
				Assignment assignment = new Assignment();
				assignment.setInstructorId(instructorId);
				assignment.setCourseId(courseId);
				assignment.setCapacity(capacity);
				list.add(assignment);
				getCourse(courseId).addSeats(capacity);
			}
		} catch (Exception e) {
		}
	}

	private void loadRequests(String filename, List<Request> list) {
		try {
			FileInputStream fis = new FileInputStream(basePath + filename);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			String line;
			while ((line = in.readLine()) != null) {
				String[] array = line.split(",");
				Long studentId = Long.valueOf(array[0]);
				Long courseId = Long.valueOf(array[1]);
				Request request = new Request();
				request.setStudentId(studentId);
				request.setCourseId(courseId);
				list.add(request);
			}
		} catch (Exception e) {
		}
	}

	public Course getCourse(long courseId) {
		for (Course course : courses) {
			if (course.getId() == courseId) {
				return course;
			}
		}
		return null;
	}

	public List<Long> getPrerequisites(long id) {
		List<Long> result = new ArrayList<Long>();
		for (long mainCourseId : prereqs.keySet()) {
			if (mainCourseId == id) {
				result = prereqs.get(id);
				break;
			}
		}
		return result;
	}

	public Record getRecord(long studentId, long courseId) {
		for (Record record : records) {
			if (record.getStudentID() == studentId && record.getCourseID() == courseId) {
				return record;
			}
		}
		return null;
	}

	public Student getStudent(long studentId) {
		for (Student student : students) {
			if (student.getId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void addRecord(Record newRecord) {
		records.add(newRecord);
	}

	public Request getRequest(long studentId, long courseId) {
		for (Request request : requests) {
			if (request.getStudentId() == studentId && request.getCourseId() == courseId) {
				return request;
			}
		}
		return null;
	}

	public void addRequest(Request request) {
		requests.add(request);
	}
}*/
