// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1PropertyResponse;
import java.util.List;
import java.util.Objects;


/**
 * Message for compatibility with legacy Edge specification for Java Properties object in JSON.
 * 
 */
public final class GoogleCloudApigeeV1PropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1PropertiesResponse Empty = new GoogleCloudApigeeV1PropertiesResponse();

    /**
     * List of all properties in the object
     * 
     */
    @Import(name="property", required=true)
      private final List<GoogleCloudApigeeV1PropertyResponse> property;

    public List<GoogleCloudApigeeV1PropertyResponse> getProperty() {
        return this.property;
    }

    public GoogleCloudApigeeV1PropertiesResponse(List<GoogleCloudApigeeV1PropertyResponse> property) {
        this.property = Objects.requireNonNull(property, "expected parameter 'property' to be non-null");
    }

    private GoogleCloudApigeeV1PropertiesResponse() {
        this.property = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudApigeeV1PropertyResponse> property;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1PropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.property = defaults.property;
        }

        public Builder property(List<GoogleCloudApigeeV1PropertyResponse> property) {
            this.property = Objects.requireNonNull(property);
            return this;
        }
        public Builder property(GoogleCloudApigeeV1PropertyResponse... property) {
            return property(List.of(property));
        }        public GoogleCloudApigeeV1PropertiesResponse build() {
            return new GoogleCloudApigeeV1PropertiesResponse(property);
        }
    }
}
