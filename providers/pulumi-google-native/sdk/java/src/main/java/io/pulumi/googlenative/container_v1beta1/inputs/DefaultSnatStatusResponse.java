// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * DefaultSnatStatus contains the desired state of whether default sNAT should be disabled on the cluster.
 * 
 */
public final class DefaultSnatStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final DefaultSnatStatusResponse Empty = new DefaultSnatStatusResponse();

    /**
     * Disables cluster default sNAT rules.
     * 
     */
    @Import(name="disabled", required=true)
      private final Boolean disabled;

    public Boolean getDisabled() {
        return this.disabled;
    }

    public DefaultSnatStatusResponse(Boolean disabled) {
        this.disabled = Objects.requireNonNull(disabled, "expected parameter 'disabled' to be non-null");
    }

    private DefaultSnatStatusResponse() {
        this.disabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSnatStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSnatStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }        public DefaultSnatStatusResponse build() {
            return new DefaultSnatStatusResponse(disabled);
        }
    }
}
