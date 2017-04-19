package mx.com.laboratorio.miprimerrest.mimodulo;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/contribuyente")
public class ContribuyenteResources {
	@Inject
	ContribuyenteEJB contribuyenteEJB;

	@POST
	@Path("/nuevo")
	@Produces(MediaType.TEXT_HTML)
	public Response agregar(ContribuyenteDTO contribuyenteDTO) {
		return Response.status(200).entity(contribuyenteEJB.CrearNuevoContribuyente(contribuyenteDTO)).build();
	}

	@GET
	@Path("/listado/rfc/{rfc}")
	@Produces("application/json")
	public List<ContribuyenteDTO> listado(@PathParam("rfc") String rfc) {

		return contribuyenteEJB.buscarContribuyentePorRFC(rfc);
	}

	@GET
	@Path("/id/{id_contribuyente}")
	@Produces("application/json")
	public ContribuyenteDTO buscarId(@PathParam("id_contribuyente") Integer id) {

		return contribuyenteEJB.buscarContribuyentePorId(id);
	}

}
