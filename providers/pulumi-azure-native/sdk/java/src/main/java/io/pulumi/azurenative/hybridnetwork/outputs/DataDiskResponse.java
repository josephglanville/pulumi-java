// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataDiskResponse {
    private final @Nullable String createOption;
    private final @Nullable Integer diskSizeGB;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"createOption","diskSizeGB","name"})
    private DataDiskResponse(
        @Nullable String createOption,
        @Nullable Integer diskSizeGB,
        @Nullable String name) {
        this.createOption = createOption;
        this.diskSizeGB = diskSizeGB;
        this.name = name;
    }

    public Optional<String> getCreateOption() {
        return Optional.ofNullable(this.createOption);
    }
    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createOption;
        private @Nullable Integer diskSizeGB;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createOption = defaults.createOption;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
        }

        public Builder setCreateOption(@Nullable String createOption) {
            this.createOption = createOption;
            return this;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public DataDiskResponse build() {
            return new DataDiskResponse(createOption, diskSizeGB, name);
        }
    }
}
