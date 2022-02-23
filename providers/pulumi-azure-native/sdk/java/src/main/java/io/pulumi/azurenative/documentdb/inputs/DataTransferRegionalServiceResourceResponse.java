// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Resource for a regional service location.
 * 
 */
public final class DataTransferRegionalServiceResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataTransferRegionalServiceResourceResponse Empty = new DataTransferRegionalServiceResourceResponse();

    /**
     * The location name.
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * The regional service name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Describes the status of a service.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public DataTransferRegionalServiceResourceResponse(
        String location,
        String name,
        String status) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private DataTransferRegionalServiceResourceResponse() {
        this.location = null;
        this.name = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataTransferRegionalServiceResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String name;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(DataTransferRegionalServiceResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public DataTransferRegionalServiceResourceResponse build() {
            return new DataTransferRegionalServiceResourceResponse(location, name, status);
        }
    }
}
