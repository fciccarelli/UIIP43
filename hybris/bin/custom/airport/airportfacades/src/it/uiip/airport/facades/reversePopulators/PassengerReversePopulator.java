package it.uiip.airport.facades.reversePopulators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import it.uiip.airport.core.model.PassengerModel;
import it.uiip.airport.facades.data.PassengerData;

public class PassengerReversePopulator implements Populator<PassengerData, PassengerModel> {

    @Override
    public void populate(PassengerData passengerData, PassengerModel passengerModel) throws ConversionException {
        passengerModel.setUid(passengerData.getUid());
        passengerModel.setName(passengerData.getName());
        passengerModel.setSurname(passengerData.getSurname());
        passengerModel.setPassport(passengerData.getPassport());
    }
}
