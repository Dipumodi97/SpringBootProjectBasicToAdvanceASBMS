//package com.dipu.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import com.dipu.entity.Student;
//
//public interface StudentCrudRepository extends CrudRepository<Student, Integer> {
//	
//	// Custom Query
//	// // It's using for SQL
//	@Query(value = "select * from STUDENT_DETAILS", nativeQuery = true)
//	public List<Student> getAllStudents();
//	
//	// It's using for HQL
//	@Query(value = "from STUDENT_DETAILS")
//	public List<Student> getStudents();
//
//	//JPA Query providing internally Spring Data JPA
//	/*
//	 * // select * from student_details where student_gender = :gender public
//	 * List<Student> findByGender(String gender);
//	 * 
//	 * // select * from student_details where student_gender IS NULL public
//	 * List<Student> findByGenderIsNull();
//	 * 
//	 * // select * from student_details where student_rank >= :rank public
//	 * List<Student> findByRankGreaterThanEqual(Long rank);
//	 * 
//	 * // select * from student_details where student_rank <= :rank public
//	 * List<Student> findByRankLessThanEqual(Long rank);
//	 * 
//	 * // male students who are having rank >=100 ; // select * from student_details
//	 * where student_gender =? and student_rank >= // :rank public List<Student>
//	 * findByGenderAndRankGreaterThanEqual(String gender, Long rank);
//	 */
//}
