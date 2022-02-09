// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final OsDiskResponse Empty = new OsDiskResponse();

    @InputImport(name="diskSizeGB")
    private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="osType")
    private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    public OsDiskResponse(
        @Nullable Integer diskSizeGB,
        @Nullable String name,
        @Nullable String osType) {
        this.diskSizeGB = diskSizeGB;
        this.name = name;
        this.osType = osType;
    }

    private OsDiskResponse() {
        this.diskSizeGB = null;
        this.name = null;
        this.osType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer diskSizeGB;
        private @Nullable String name;
        private @Nullable String osType;

        public Builder() {
    	      // Empty
        }

        public Builder(OsDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
        }

        public Builder setDiskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public OsDiskResponse build() {
            return new OsDiskResponse(diskSizeGB, name, osType);
        }
    }
}
