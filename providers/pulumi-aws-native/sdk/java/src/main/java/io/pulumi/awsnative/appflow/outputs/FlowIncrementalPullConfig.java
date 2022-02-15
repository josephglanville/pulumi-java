// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowIncrementalPullConfig {
    private final @Nullable String datetimeTypeFieldName;

    @OutputCustomType.Constructor({"datetimeTypeFieldName"})
    private FlowIncrementalPullConfig(@Nullable String datetimeTypeFieldName) {
        this.datetimeTypeFieldName = datetimeTypeFieldName;
    }

    public Optional<String> getDatetimeTypeFieldName() {
        return Optional.ofNullable(this.datetimeTypeFieldName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowIncrementalPullConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datetimeTypeFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowIncrementalPullConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datetimeTypeFieldName = defaults.datetimeTypeFieldName;
        }

        public Builder setDatetimeTypeFieldName(@Nullable String datetimeTypeFieldName) {
            this.datetimeTypeFieldName = datetimeTypeFieldName;
            return this;
        }

        public FlowIncrementalPullConfig build() {
            return new FlowIncrementalPullConfig(datetimeTypeFieldName);
        }
    }
}