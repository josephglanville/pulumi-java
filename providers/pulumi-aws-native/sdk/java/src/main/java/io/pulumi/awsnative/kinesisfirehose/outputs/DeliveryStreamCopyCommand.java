// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamCopyCommand {
    private final @Nullable String copyOptions;
    private final @Nullable String dataTableColumns;
    private final String dataTableName;

    @CustomType.Constructor
    private DeliveryStreamCopyCommand(
        @CustomType.Parameter("copyOptions") @Nullable String copyOptions,
        @CustomType.Parameter("dataTableColumns") @Nullable String dataTableColumns,
        @CustomType.Parameter("dataTableName") String dataTableName) {
        this.copyOptions = copyOptions;
        this.dataTableColumns = dataTableColumns;
        this.dataTableName = dataTableName;
    }

    public Optional<String> getCopyOptions() {
        return Optional.ofNullable(this.copyOptions);
    }
    public Optional<String> getDataTableColumns() {
        return Optional.ofNullable(this.dataTableColumns);
    }
    public String getDataTableName() {
        return this.dataTableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamCopyCommand defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String copyOptions;
        private @Nullable String dataTableColumns;
        private String dataTableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamCopyCommand defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyOptions = defaults.copyOptions;
    	      this.dataTableColumns = defaults.dataTableColumns;
    	      this.dataTableName = defaults.dataTableName;
        }

        public Builder copyOptions(@Nullable String copyOptions) {
            this.copyOptions = copyOptions;
            return this;
        }
        public Builder dataTableColumns(@Nullable String dataTableColumns) {
            this.dataTableColumns = dataTableColumns;
            return this;
        }
        public Builder dataTableName(String dataTableName) {
            this.dataTableName = Objects.requireNonNull(dataTableName);
            return this;
        }        public DeliveryStreamCopyCommand build() {
            return new DeliveryStreamCopyCommand(copyOptions, dataTableColumns, dataTableName);
        }
    }
}
