// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SapHanaPartitionSettingsResponse {
    private final @Nullable Object partitionColumnName;

    @OutputCustomType.Constructor({"partitionColumnName"})
    private SapHanaPartitionSettingsResponse(@Nullable Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
    }

    public Optional<Object> getPartitionColumnName() {
        return Optional.ofNullable(this.partitionColumnName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapHanaPartitionSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object partitionColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(SapHanaPartitionSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public SapHanaPartitionSettingsResponse build() {
            return new SapHanaPartitionSettingsResponse(partitionColumnName);
        }
    }
}