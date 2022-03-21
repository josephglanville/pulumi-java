// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The activation properties of the connected registry.
 * 
 */
public final class ActivationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ActivationPropertiesResponse Empty = new ActivationPropertiesResponse();

    /**
     * The activation status of the connected registry.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    public ActivationPropertiesResponse(String status) {
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private ActivationPropertiesResponse() {
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public ActivationPropertiesResponse build() {
            return new ActivationPropertiesResponse(status);
        }
    }
}
