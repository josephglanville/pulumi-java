// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the Monetization add-on.
 * 
 */
public final class GoogleCloudApigeeV1MonetizationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1MonetizationConfigArgs Empty = new GoogleCloudApigeeV1MonetizationConfigArgs();

    /**
     * Flag that specifies whether the Monetization add-on is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public GoogleCloudApigeeV1MonetizationConfigArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private GoogleCloudApigeeV1MonetizationConfigArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudApigeeV1MonetizationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudApigeeV1MonetizationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public GoogleCloudApigeeV1MonetizationConfigArgs build() {
            return new GoogleCloudApigeeV1MonetizationConfigArgs(enabled);
        }
    }
}
