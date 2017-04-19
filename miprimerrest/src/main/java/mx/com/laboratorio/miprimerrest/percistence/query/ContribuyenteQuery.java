package mx.com.laboratorio.miprimerrest.percistence.query;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.com.laboratorio.miprimerrest.config.Configuracion;
import mx.com.laboratorio.miprimerrest.percistence.entity.Contribuyente;

@Stateless
public class ContribuyenteQuery {

	@PersistenceContext(name = Configuracion.UNIDAD_PERSISTENCIA)
	protected EntityManager em;

	public void Crear(Contribuyente contribuyenteEntity) {

		em.persist(contribuyenteEntity);
	}

	public void Actualizar(Contribuyente contribuyenteEntity) {

		em.merge(contribuyenteEntity);
	}

	public void Eliminar(Contribuyente contribuyenteEntity) {
		em.remove(contribuyenteEntity);
	}

	public Contribuyente ContribuyentePorId(Integer idContribuyente) {
		return em.find(Contribuyente.class, idContribuyente);
	}

	public List<Contribuyente> ContribuyentesPorRFC(String rfc) {

		return em.createQuery("from Contribuyente c where c.rfc like :rfc",Contribuyente.class).setParameter("rfc", "%" + rfc + "%")
				.getResultList();

	}

}
