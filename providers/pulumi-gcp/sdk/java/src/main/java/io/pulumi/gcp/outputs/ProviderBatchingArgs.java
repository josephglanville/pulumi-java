// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.outputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderBatchingArgs {
    private final @Nullable Output<Boolean> enableBatching;
    private final @Nullable Output<String> sendAfter;

    @OutputCustomType.Constructor
    private ProviderBatchingArgs(
        @OutputCustomType.Parameter("enableBatching") @Nullable Output<Boolean> enableBatching,
        @OutputCustomType.Parameter("sendAfter") @Nullable Output<String> sendAfter) {
        this.enableBatching = enableBatching;
        this.sendAfter = sendAfter;
    }

    public @Nullable Output<Boolean> getEnableBatching() {
        return this.enableBatching;
    }
    public @Nullable Output<String> getSendAfter() {
        return this.sendAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderBatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableBatching;
        private @Nullable Output<String> sendAfter;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderBatchingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableBatching = defaults.enableBatching;
    	      this.sendAfter = defaults.sendAfter;
        }

        public Builder enableBatching(@Nullable Output<Boolean> enableBatching) {
            this.enableBatching = enableBatching;
            return this;
        }

        public Builder sendAfter(@Nullable Output<String> sendAfter) {
            this.sendAfter = sendAfter;
            return this;
        }
        public ProviderBatchingArgs build() {
            return new ProviderBatchingArgs(enableBatching, sendAfter);
        }
    }
}
