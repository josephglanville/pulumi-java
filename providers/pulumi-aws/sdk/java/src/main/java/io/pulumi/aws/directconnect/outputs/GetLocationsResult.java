// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLocationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The code for the locations.
     * 
     */
    private final List<String> locationCodes;

    @CustomType.Constructor
    private GetLocationsResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("locationCodes") List<String> locationCodes) {
        this.id = id;
        this.locationCodes = locationCodes;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The code for the locations.
     * 
    */
    public List<String> getLocationCodes() {
        return this.locationCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocationsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<String> locationCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocationsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locationCodes = defaults.locationCodes;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder locationCodes(List<String> locationCodes) {
            this.locationCodes = Objects.requireNonNull(locationCodes);
            return this;
        }
        public Builder locationCodes(String... locationCodes) {
            return locationCodes(List.of(locationCodes));
        }        public GetLocationsResult build() {
            return new GetLocationsResult(id, locationCodes);
        }
    }
}