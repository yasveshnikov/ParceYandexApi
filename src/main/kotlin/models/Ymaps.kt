package models

import org.simpleframework.xml.*
import java.net.URL

@Root(name = "ymaps")
class Ymaps {
//    @Text(required = false)
//    var textValue: String? = null

    @field:Element(name = "GeoObjectCollection", required = false)
    var geoObjectCollection: GeoObjectCollection? = null

    @field:Attribute(name = "schemaLocation", required = false)
    var schemaLocation: URL? = null

    class AdministrativeArea {
        @field:Element(name = "AdministrativeAreaName", required = false)
        var administrativeAreaName: String? = null

        @field:Element(name = "Locality", required = false)
        var locality: Locality? = null
    }

    class Thoroughfare {
        @field:Element(name = "Premise", required = false)
        var premise: Premise? = null

        @field:Element(name = "ThoroughfareName", required = false)
        var thoroughfareName: String? = null
    }

    class MetaDataProperty {
        @field:Element(name = "GeocoderResponseMetaData", required = false)
        var geocoderResponseMetaData: GeocoderResponseMetaData? = null

        @field:Element(name = "GeocoderMetaData", required = false)
        var geocoderMetaData: GeocoderMetaData? = null
    }

    class Address {
        @field:Element(name = "country_code", required = false)
        var countryCode: String? = null

        @field:Element(name = "formatted", required = false)
        var formatted: String? = null

        @field:ElementList(name = "Component", required = false, entry = "Component", inline = true)
        var component: List<Component>? = null
    }

    class AddressDetails {
        @field:Element(name = "Country", required = false)
        var country: Country? = null
    }

    class Locality {
        @field:Element(name = "Thoroughfare", required = false)
        var thoroughfare: Thoroughfare? = null

        @field:Element(name = "LocalityName", required = false)
        var localityName: String? = null
    }

    class GeocoderMetaData {
        @field:Element(name = "Address", required = false)
        var address: Address? = null

        @field:Element(name = "AddressDetails", required = false)
        var addressDetails: AddressDetails? = null

        @field:Element(name = "kind", required = false)
        var kind: String? = null

        @field:Element(name = "precision", required = false)
        var precision: String? = null

        @field:Element(name = "text", required = false)
        var text: String? = null
    }

    class BoundedBy {
        @field:Element(name = "Envelope", required = false)
        var envelope: Envelope? = null
    }

    class Description {
        @Text(required = false)
        var textValue: String? = null
    }

    class Point {
        @field:Element(name = "pos", required = false)
        var pos: String? = null
    }

    class Premise {
        @field:Element(name = "PremiseNumber", required = false)
        var premiseNumber: String? = null
    }

    class Envelope {
        @field:Element(name = "lowerCorner", required = false)
        var lowerCorner: String? = null

        @field:Element(name = "upperCorner", required = false)
        var upperCorner: String? = null
    }

    class FeatureMember {
        @field:Element(name = "GeoObject", required = false)
        var geoObject: GeoObject? = null
    }

    class GeoObjectCollection {
        @field:Element(name = "metaDataProperty", required = false)
        var metaDataProperty: MetaDataProperty? = null

        @field:Element(name = "featureMember", required = false)
        var featureMember: FeatureMember? = null
    }

    class GeocoderResponseMetaData {
        @field:Element(name = "request", required = false)
        var request: String? = null

        @field:Element(name = "found", required = false)
        var found: String? = null

        @field:Element(name = "results", required = false)
        var results: String? = null
    }

    class Name {
        @Text(required = false)
        var textValue: String? = null
    }

    class Country {
        @field:Element(name = "AdministrativeArea", required = false)
        var administrativeArea: AdministrativeArea? = null

        @field:Element(name = "CountryName", required = false)
        var countryName: String? = null

        @field:Element(name = "AddressLine", required = false)
        var addressLine: String? = null

        @field:Element(name = "CountryNameCode", required = false)
        var countryNameCode: String? = null
    }

    class GeoObject {
        @field:Element(name = "metaDataProperty", required = false)
        var metaDataProperty: MetaDataProperty? = null

        @field:Element(name = "boundedBy", required = false)
        var boundedBy: BoundedBy? = null

        @field:Element(name = "name", required = false)
        var name: Name? = null

        @field:Element(name = "description", required = false)
        var description: Description? = null

        @Attribute(name = "id", required = false)
        var id: URL? = null

        @field:Element(name = "Point", required = false)
        var point: Point? = null
    }

    class Component {
        @field:Element(name = "kind", required = false)
        var kind: String? = null

        @field:Element(name = "name", required = false)
        var name: String? = null
    }
}