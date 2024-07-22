package springframework.springrestmvcapi.model.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import springframework.springrestmvcapi.model.BeerOrderDTO;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {

    private BeerOrderDTO beerOrderDTO;
}
