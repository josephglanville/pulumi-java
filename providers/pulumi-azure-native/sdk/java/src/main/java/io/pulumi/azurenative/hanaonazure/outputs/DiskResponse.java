// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiskResponse {
    private final @Nullable Integer diskSizeGB;
    private final Integer lun;
    private final @Nullable String name;

    @OutputCustomType.Constructor({"diskSizeGB","lun","name"})
    private DiskResponse(
        @Nullable Integer diskSizeGB,
        Integer lun,
        @Nullable String name) {
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun);
        this.name = name;
    }

    public Optional<Integer> getDiskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    public Integer getLun() {
        return this.lun;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.name = defaults.name;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public DiskResponse build() {
            return new DiskResponse(diskSizeGB, lun, name);
        }
    }
}
