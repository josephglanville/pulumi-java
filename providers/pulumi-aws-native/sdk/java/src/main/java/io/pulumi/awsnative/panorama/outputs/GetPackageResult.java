// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.awsnative.panorama.outputs.PackageStorageLocation;
import io.pulumi.awsnative.panorama.outputs.PackageTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPackageResult {
    private final @Nullable String arn;
    private final @Nullable Integer createdTime;
    private final @Nullable String packageId;
    private final @Nullable PackageStorageLocation storageLocation;
    private final @Nullable List<PackageTag> tags;

    @CustomType.Constructor
    private GetPackageResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable Integer createdTime,
        @CustomType.Parameter("packageId") @Nullable String packageId,
        @CustomType.Parameter("storageLocation") @Nullable PackageStorageLocation storageLocation,
        @CustomType.Parameter("tags") @Nullable List<PackageTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.packageId = packageId;
        this.storageLocation = storageLocation;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<Integer> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    public Optional<String> getPackageId() {
        return Optional.ofNullable(this.packageId);
    }
    public Optional<PackageStorageLocation> getStorageLocation() {
        return Optional.ofNullable(this.storageLocation);
    }
    public List<PackageTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable Integer createdTime;
        private @Nullable String packageId;
        private @Nullable PackageStorageLocation storageLocation;
        private @Nullable List<PackageTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.packageId = defaults.packageId;
    	      this.storageLocation = defaults.storageLocation;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder createdTime(@Nullable Integer createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder packageId(@Nullable String packageId) {
            this.packageId = packageId;
            return this;
        }
        public Builder storageLocation(@Nullable PackageStorageLocation storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public Builder tags(@Nullable List<PackageTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(PackageTag... tags) {
            return tags(List.of(tags));
        }        public GetPackageResult build() {
            return new GetPackageResult(arn, createdTime, packageId, storageLocation, tags);
        }
    }
}
