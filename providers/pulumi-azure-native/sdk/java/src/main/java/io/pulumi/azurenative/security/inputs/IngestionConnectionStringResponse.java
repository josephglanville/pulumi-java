// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Connection string for ingesting security data and logs
 * 
 */
public final class IngestionConnectionStringResponse extends io.pulumi.resources.InvokeArgs {

    public static final IngestionConnectionStringResponse Empty = new IngestionConnectionStringResponse();

    /**
     * The region where ingested logs and data resides
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * Connection string value
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public IngestionConnectionStringResponse(
        String location,
        String value) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private IngestionConnectionStringResponse() {
        this.location = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngestionConnectionStringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(IngestionConnectionStringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.value = defaults.value;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public IngestionConnectionStringResponse build() {
            return new IngestionConnectionStringResponse(location, value);
        }
    }
}
