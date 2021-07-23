package com.example.livraison.Colis;

import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.livraison.Colis.Colis;
import com.example.livraison.Colis.ColisRepository;
import com.example.livraison.Colis.ColisRepository.HistoStateOnly;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;


@Service
public class ColisService {

	
	@Autowired
	private final ColisRepository colisRepository ;
	
	
	@Autowired  
	public ColisService (ColisRepository colisRepository)
	{ this.colisRepository = colisRepository ; }
	
	
	
	//save
	public Colis saveColis(Colis colis )
	{
		return colisRepository.save(colis);
    }
	

	
	//update
	public Colis updateColis(Colis colis )
	{
	  return colisRepository.save(colis) ;
	}
	
	
	
	//lister les colis 
	public List<Colis> findAllColis()
	{
		return colisRepository.findAll();	
	}
	
	// liste des audits 
	
	public List<HistoStateOnly> getColisAud(Long reference)
	{
		 	
		return colisRepository.getColisAud(reference);
	
	
	}
	//supprimer un colis 
	public void deleteColis(Long reference)
	{
	colisRepository.deleteById(reference) ;
	}
	
	
	
	//findColisCreé
	public List<Colis> search(String etat)
	{
		List<Colis> list =  (List<Colis>) colisRepository.search(etat); 
		return list;
     }
	
	//findColis by id 
		public Optional<Colis> findById(Long referene)
		
		{
				return colisRepository.findById(referene);
		}
		
		
		public String generateColisBarCode (Long reference)
		{
			Colis colisBarCode = findById(reference).orElse(new Colis());
			String text = colisBarCode.toColisBarCode(); 
			String path = "C:\\Users\\Imen\\Desktop\\my stuff\\Cours\\2020-2021\\Stage Ah-Co\\stage2021\\src\\main\\java\\img\\colis"
					+ text+".jpg";
			try {
					Code128Writer writer = new Code128Writer(); 
					BitMatrix matrix = writer.encode(text, BarcodeFormat.CODE_128, 400, 90);
					MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
					System.out.println ("Barcode created");
			} catch (Exception e ) 
					{
						System.out.println ("Error while creating barcode");
					}
					
			return text;
		}
		

}