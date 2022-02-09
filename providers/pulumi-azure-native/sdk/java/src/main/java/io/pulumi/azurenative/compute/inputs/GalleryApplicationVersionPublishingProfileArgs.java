// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.StorageAccountType;
import io.pulumi.azurenative.compute.inputs.TargetRegionArgs;
import io.pulumi.azurenative.compute.inputs.UserArtifactManageArgs;
import io.pulumi.azurenative.compute.inputs.UserArtifactSourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GalleryApplicationVersionPublishingProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryApplicationVersionPublishingProfileArgs Empty = new GalleryApplicationVersionPublishingProfileArgs();

    @InputImport(name="enableHealthCheck")
    private final @Nullable Input<Boolean> enableHealthCheck;

    public Input<Boolean> getEnableHealthCheck() {
        return this.enableHealthCheck == null ? Input.empty() : this.enableHealthCheck;
    }

    @InputImport(name="endOfLifeDate")
    private final @Nullable Input<String> endOfLifeDate;

    public Input<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Input.empty() : this.endOfLifeDate;
    }

    @InputImport(name="excludeFromLatest")
    private final @Nullable Input<Boolean> excludeFromLatest;

    public Input<Boolean> getExcludeFromLatest() {
        return this.excludeFromLatest == null ? Input.empty() : this.excludeFromLatest;
    }

    @InputImport(name="manageActions")
    private final @Nullable Input<UserArtifactManageArgs> manageActions;

    public Input<UserArtifactManageArgs> getManageActions() {
        return this.manageActions == null ? Input.empty() : this.manageActions;
    }

    @InputImport(name="replicaCount")
    private final @Nullable Input<Integer> replicaCount;

    public Input<Integer> getReplicaCount() {
        return this.replicaCount == null ? Input.empty() : this.replicaCount;
    }

    @InputImport(name="source", required=true)
    private final Input<UserArtifactSourceArgs> source;

    public Input<UserArtifactSourceArgs> getSource() {
        return this.source;
    }

    @InputImport(name="storageAccountType")
    private final @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

    public Input<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    @InputImport(name="targetRegions")
    private final @Nullable Input<List<TargetRegionArgs>> targetRegions;

    public Input<List<TargetRegionArgs>> getTargetRegions() {
        return this.targetRegions == null ? Input.empty() : this.targetRegions;
    }

    public GalleryApplicationVersionPublishingProfileArgs(
        @Nullable Input<Boolean> enableHealthCheck,
        @Nullable Input<String> endOfLifeDate,
        @Nullable Input<Boolean> excludeFromLatest,
        @Nullable Input<UserArtifactManageArgs> manageActions,
        @Nullable Input<Integer> replicaCount,
        Input<UserArtifactSourceArgs> source,
        @Nullable Input<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Input<List<TargetRegionArgs>> targetRegions) {
        this.enableHealthCheck = enableHealthCheck;
        this.endOfLifeDate = endOfLifeDate;
        this.excludeFromLatest = excludeFromLatest;
        this.manageActions = manageActions;
        this.replicaCount = replicaCount;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.storageAccountType = storageAccountType;
        this.targetRegions = targetRegions;
    }

    private GalleryApplicationVersionPublishingProfileArgs() {
        this.enableHealthCheck = Input.empty();
        this.endOfLifeDate = Input.empty();
        this.excludeFromLatest = Input.empty();
        this.manageActions = Input.empty();
        this.replicaCount = Input.empty();
        this.source = Input.empty();
        this.storageAccountType = Input.empty();
        this.targetRegions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationVersionPublishingProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableHealthCheck;
        private @Nullable Input<String> endOfLifeDate;
        private @Nullable Input<Boolean> excludeFromLatest;
        private @Nullable Input<UserArtifactManageArgs> manageActions;
        private @Nullable Input<Integer> replicaCount;
        private Input<UserArtifactSourceArgs> source;
        private @Nullable Input<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Input<List<TargetRegionArgs>> targetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryApplicationVersionPublishingProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHealthCheck = defaults.enableHealthCheck;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.excludeFromLatest = defaults.excludeFromLatest;
    	      this.manageActions = defaults.manageActions;
    	      this.replicaCount = defaults.replicaCount;
    	      this.source = defaults.source;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.targetRegions = defaults.targetRegions;
        }

        public Builder setEnableHealthCheck(@Nullable Input<Boolean> enableHealthCheck) {
            this.enableHealthCheck = enableHealthCheck;
            return this;
        }

        public Builder setEnableHealthCheck(@Nullable Boolean enableHealthCheck) {
            this.enableHealthCheck = Input.ofNullable(enableHealthCheck);
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable Input<String> endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = Input.ofNullable(endOfLifeDate);
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Input<Boolean> excludeFromLatest) {
            this.excludeFromLatest = excludeFromLatest;
            return this;
        }

        public Builder setExcludeFromLatest(@Nullable Boolean excludeFromLatest) {
            this.excludeFromLatest = Input.ofNullable(excludeFromLatest);
            return this;
        }

        public Builder setManageActions(@Nullable Input<UserArtifactManageArgs> manageActions) {
            this.manageActions = manageActions;
            return this;
        }

        public Builder setManageActions(@Nullable UserArtifactManageArgs manageActions) {
            this.manageActions = Input.ofNullable(manageActions);
            return this;
        }

        public Builder setReplicaCount(@Nullable Input<Integer> replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = Input.ofNullable(replicaCount);
            return this;
        }

        public Builder setSource(Input<UserArtifactSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(UserArtifactSourceArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public Builder setTargetRegions(@Nullable Input<List<TargetRegionArgs>> targetRegions) {
            this.targetRegions = targetRegions;
            return this;
        }

        public Builder setTargetRegions(@Nullable List<TargetRegionArgs> targetRegions) {
            this.targetRegions = Input.ofNullable(targetRegions);
            return this;
        }

        public GalleryApplicationVersionPublishingProfileArgs build() {
            return new GalleryApplicationVersionPublishingProfileArgs(enableHealthCheck, endOfLifeDate, excludeFromLatest, manageActions, replicaCount, source, storageAccountType, targetRegions);
        }
    }
}
