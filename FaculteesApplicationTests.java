package com.chahinez.facultees;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.chahinez.facultees.entities.Diplome;
import com.chahinez.facultees.entities.Facultee;
import com.chahinez.facultees.repos.DiplomeRepository;




@SpringBootTest
class FaculteesApplicationTests {
	
	@Autowired
	private DiplomeRepository diplomeRepository;


	@Test
	 public void testCreateDiplome() {
		Diplome prod = new Diplome("ahmed","benahmed","lience");
		diplomeRepository.save(prod);

	}
	
	@Test
	public void testFindDiplome()
	{
	Diplome p = diplomeRepository.findById(1L).get(); 
	System.out.println(p);
	}
	
	
	@Test
	public void testUpdateDiplome()
	{
	Diplome p = diplomeRepository.findById(1L).get();
	p.setTypeDiplome("lisence");
	diplomeRepository.save(p);
	}
	
	@Test
	public void testDeleteDiplome()
	{
	diplomeRepository.deleteById(1L);;
	}
	
	@Test
	public void testListerTousDiplomes()
	{
	List<Diplome> prods = diplomeRepository.findAll();
	for (Diplome p : prods)
	{
	System.out.println(p);
	}
	}
	
	
	 @Test
	 public void testFindByNomDiplome()
	 {
	 List<Diplome> prods = diplomeRepository.findByNomDiplome("chahinez");
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void testFindByNomDiplomeContains()
	 {
	 List<Diplome> prods=diplomeRepository.findByNomDiplomeContains("d");
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 } 
	 }
	 
	 @Test
	 public void testfindByNomType()
	 {
	 List<Diplome> prods = diplomeRepository.findByNomType("chahinez","master");
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	 }


	 @Test
	 public void testfindByFacultee()
	 {
	 Facultee cat = new Facultee();
	 cat.setIdFaculte(1L);
	 List<Diplome> prods = diplomeRepository.findByFacultee(cat);
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	
	 
	 @Test
	 public void findByFaculteeIdFaculte()
	 {
	 List<Diplome> prods = diplomeRepository.findByFaculteeIdFaculte(1L);
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	  }


	 @Test
	 public void testfindByOrderByNomDiplomeAsc()
	 {
	 List<Diplome> prods = diplomeRepository.findByOrderByNomDiplomeAsc();
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	 }

	 
	 @Test
	 public void testTrierDiplomesNomsType()
	 {
	 List<Diplome> prods = diplomeRepository.trierDiplomesNomsType();
	 for (Diplome p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 

}
