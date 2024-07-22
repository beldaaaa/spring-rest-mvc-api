package springframework.springrestmvcapi.model;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;


@Builder
@Data
public class BeerOrderUpdateDTO {

    @NotNull
    private UUID customerId;
    private String customerRef;

    private Set<BeerOrderLineUpdateDTO> beerOrderLinesUpdateDTO;
    private BeerOrderShipmentUpdateDTO shipmentUpdateDTO;

    private BigDecimal paymentAmount;
}
