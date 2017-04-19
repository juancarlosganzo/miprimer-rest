package mx.com.laboratorio.miprimerrest.mimodulo;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import mx.com.laboratorio.miprimerrest.percistence.entity.Contribuyente;
import mx.com.laboratorio.miprimerrest.percistence.query.ContribuyenteQuery;
import mx.com.laboratorio.miprimerrest.util.ValidacionUtil;

@Stateless
public class ContribuyenteEJB {

	@Inject
	ContribuyenteQuery contribuyenteQuery;

	public String CrearNuevoContribuyente(ContribuyenteDTO contribuyenteDTO) {

		if (ValidacionUtil.validarRfc(contribuyenteDTO.getRfc())) {
			return "Error con el formato del RFC";
		}

		Contribuyente contribuyenteEntity = new Contribuyente();
		contribuyenteEntity.setIdContribuyente(contribuyenteDTO.getIdContribuyente());
		contribuyenteEntity.setNombre(contribuyenteDTO.getNombre());
		contribuyenteEntity.setApellido1(contribuyenteDTO.getApellido1());
		contribuyenteEntity.setApellido2(contribuyenteDTO.getApellido2());
		contribuyenteEntity.setRfc(contribuyenteDTO.getRfc());
		contribuyenteQuery.Crear(contribuyenteEntity);
		return "Se creo el contribuyente";
	}

	public ContribuyenteDTO buscarContribuyentePorId(Integer idContribuyente) {
		ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO();
		Contribuyente contribuyenteEntity = contribuyenteQuery.ContribuyentePorId(idContribuyente);
		contribuyenteDTO.setApellido1(contribuyenteEntity.getApellido1());
		contribuyenteDTO.setApellido2(contribuyenteEntity.getApellido2());
		contribuyenteDTO.setIdContribuyente(contribuyenteEntity.getIdContribuyente());
		contribuyenteDTO.setNombre(contribuyenteEntity.getNombre());
		contribuyenteDTO.setRfc(contribuyenteEntity.getRfc());
		return contribuyenteDTO;
	}

	public List<ContribuyenteDTO> buscarContribuyentePorRFC(String RFC) {

		List<ContribuyenteDTO> listadoContribuyenteDTO = new ArrayList<ContribuyenteDTO>();

		List<Contribuyente> listadoContribuyenteEntity = contribuyenteQuery.ContribuyentesPorRFC(RFC);

		for (Contribuyente contribuyenteEntity : listadoContribuyenteEntity) {
			ContribuyenteDTO contribuyenteDTO = new ContribuyenteDTO();
			contribuyenteDTO.setApellido1(contribuyenteEntity.getApellido1());
			contribuyenteDTO.setApellido2(contribuyenteEntity.getApellido2());
			contribuyenteDTO.setNombre(contribuyenteEntity.getNombre());
			contribuyenteDTO.setRfc(contribuyenteEntity.getRfc());
			contribuyenteDTO.setIdContribuyente(contribuyenteEntity.getIdContribuyente());
			listadoContribuyenteDTO.add(contribuyenteDTO);
		}

		return listadoContribuyenteDTO;

	}

}
