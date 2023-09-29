package br.com.fiap.domain.resource;

import br.com.fiap.domain.entity.Equipamento;
import br.com.fiap.domain.repository.EquipamentoRepository;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.glassfish.jersey.server.Uri;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Consumes(MediaType.APPLICATION_JSON)
public class EquipamentoResource {
    @Context
    UriInfo uriInfo;
    private  EquipamentoRepository repo = EquipamentoRepository.build();

    @GET
    public Response findAll() {
        List<Equipamento> equipamentos = new ArrayList<>();
        equipamentos = new repo.findAll();
        return Response.ok(equipamentos).build();
    }
    public Response findById(@PathParam("id") Long id ){
        Equipamento equipamento = repo.findById(id);
        if (Objects.isNull(equipamento)) return Response.status(404).build();
        return Response.ok(equipamento).build();
    }
    @POST
    public Response persist(Equipamento c ){
        Equipamento equipamento = repo.persist(c);
        UriBuilder ub = uriInfo.getAbsolutePathBuilder();
        URI uri = ub.path(String.valueOf(equipamento.getId())).build();
        return Response.created(uri).entity(equipamento).build();
    }
}
