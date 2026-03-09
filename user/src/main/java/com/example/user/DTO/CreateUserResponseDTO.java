package com.example.user.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponseDTO {

    private List<String> schemas;

    private String externalId;
    private String userName;
    private Boolean active;

    private NameResponseDTO name;

    private List<EmailResponseDTO> emails;
    private List<PhoneNumberResponseDTO> phoneNumbers;
    private List<AddressResponseDTO> addresses;
    private List<EntitlementResponseDTO> entitlements;

    private String id;

    private MetaResponseDTO meta;

    private String preferredLanguage;
    private String timezone;

}