package buyer.repository;

import buyer.domain.Buyer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Api(value = "/buyers", tags = { "" })
public interface BuyerRepository extends CrudRepository<Buyer, Long> {

	@ApiOperation(nickname = "findByCnp", value = "Find by cnp", notes = "", response = Buyer.class, httpMethod = "GET")
	Buyer findByCnp(@Param("cnp") String cnp);
}
