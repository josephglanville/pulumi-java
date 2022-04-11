// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enables activity metrics.
 * 
 */
public final class StorageLensActivityMetricsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageLensActivityMetricsArgs Empty = new StorageLensActivityMetricsArgs();

    /**
     * Specifies whether activity metrics are enabled or disabled.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    public StorageLensActivityMetricsArgs(@Nullable Output<Boolean> isEnabled) {
        this.isEnabled = isEnabled;
    }

    private StorageLensActivityMetricsArgs() {
        this.isEnabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensActivityMetricsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensActivityMetricsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
            return this;
        }        public StorageLensActivityMetricsArgs build() {
            return new StorageLensActivityMetricsArgs(isEnabled);
        }
    }
}
