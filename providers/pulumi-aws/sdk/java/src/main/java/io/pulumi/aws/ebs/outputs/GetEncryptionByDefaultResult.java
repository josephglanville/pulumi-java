// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEncryptionByDefaultResult {
    /**
     * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
     * 
     */
    private final Boolean enabled;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetEncryptionByDefaultResult(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("id") String id) {
        this.enabled = enabled;
        this.id = id;
    }

    /**
     * Whether or not default EBS encryption is enabled. Returns as `true` or `false`.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEncryptionByDefaultResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEncryptionByDefaultResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetEncryptionByDefaultResult build() {
            return new GetEncryptionByDefaultResult(enabled, id);
        }
    }
}
