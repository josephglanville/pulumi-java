// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.inputs;

import io.pulumi.awsnative.apprunner.enums.ServiceSourceCodeVersionType;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Source Code Version
 * 
 */
public final class ServiceSourceCodeVersion extends io.pulumi.resources.InvokeArgs {

    public static final ServiceSourceCodeVersion Empty = new ServiceSourceCodeVersion();

    /**
     * Source Code Version Type
     * 
     */
    @InputImport(name="type", required=true)
      private final ServiceSourceCodeVersionType type;

    public ServiceSourceCodeVersionType getType() {
        return this.type;
    }

    /**
     * Source Code Version Value
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public ServiceSourceCodeVersion(
        ServiceSourceCodeVersionType type,
        String value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ServiceSourceCodeVersion() {
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceSourceCodeVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceSourceCodeVersionType type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceSourceCodeVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(ServiceSourceCodeVersionType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ServiceSourceCodeVersion build() {
            return new ServiceSourceCodeVersion(type, value);
        }
    }
}
