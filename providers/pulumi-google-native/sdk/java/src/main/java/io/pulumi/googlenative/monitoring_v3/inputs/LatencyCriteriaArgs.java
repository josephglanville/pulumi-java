// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters for a latency threshold SLI.
 * 
 */
public final class LatencyCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final LatencyCriteriaArgs Empty = new LatencyCriteriaArgs();

    /**
     * Good service is defined to be the count of requests made to this service that return in no more than threshold.
     * 
     */
    @Import(name="threshold")
      private final @Nullable Output<String> threshold;

    public Output<String> getThreshold() {
        return this.threshold == null ? Codegen.empty() : this.threshold;
    }

    public LatencyCriteriaArgs(@Nullable Output<String> threshold) {
        this.threshold = threshold;
    }

    private LatencyCriteriaArgs() {
        this.threshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LatencyCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LatencyCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        public Builder threshold(@Nullable Output<String> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable String threshold) {
            this.threshold = Codegen.ofNullable(threshold);
            return this;
        }        public LatencyCriteriaArgs build() {
            return new LatencyCriteriaArgs(threshold);
        }
    }
}
