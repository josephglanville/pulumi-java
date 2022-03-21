// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetDomainNodeToNodeEncryption extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainNodeToNodeEncryption Empty = new GetDomainNodeToNodeEncryption();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetDomainNodeToNodeEncryption(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetDomainNodeToNodeEncryption() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainNodeToNodeEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainNodeToNodeEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public GetDomainNodeToNodeEncryption build() {
            return new GetDomainNodeToNodeEncryption(enabled);
        }
    }
}
